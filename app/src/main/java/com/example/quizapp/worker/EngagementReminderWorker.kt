package com.example.quizapp.worker

import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.os.Build
import androidx.core.app.NotificationCompat
import androidx.work.*
import com.example.quizapp.MainActivity
import com.example.quizapp.R
import com.example.quizapp.util.UserActivityManager
import java.util.*
import java.util.concurrent.TimeUnit

class EngagementReminderWorker(context: Context, workerParams: WorkerParameters) :
    Worker(context, workerParams) {

    override fun doWork(): Result {
        val activityManager = UserActivityManager(applicationContext)

        // Rule: If user opened the app today -> DO NOT send reminder
        if (activityManager.isUserActiveToday()) {
            return Result.success()
        }

        sendEngagementNotification()
        return Result.success()
    }

    private fun sendEngagementNotification() {
        val notificationManager =
            applicationContext.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager

        val channelId = "quiz_engagement_channel"
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val channel = NotificationChannel(
                channelId,
                "Daily Reminders",
                NotificationManager.IMPORTANCE_DEFAULT
            ).apply {
                description = "Reminders to keep your learning streak alive"
            }
            notificationManager.createNotificationChannel(channel)
        }

        val messages = listOf(
            "🔥 Your learning streak is about to break! Take a quick quiz now.",
            "🧠 Your brain is waiting for today’s challenge.",
            "📚 Just 2 minutes can boost your knowledge today.",
            "🚀 Ready for a quick challenge? Test your skills now.",
            "🏆 You're closer to leveling up than you think.",
            "🎯 One quiz today keeps your learning streak alive.",
            "✨ Small progress today, big results tomorrow.",
            "📈 Improve your coding skills with today’s quiz.",
            "🧠 Challenge your brain before the day ends.",
            "🔥 Don’t break your learning streak.",
            "🎓 Knowledge grows daily. Continue your progress.",
            "📚 Your next level is waiting.",
            "🚀 A quick quiz can sharpen your coding skills.",
            "🏆 You’re one quiz away from leveling up.",
            "✨ Learning never stops. Try today’s quiz."
        )

        val randomMessage = messages.random()

        val intent = Intent(applicationContext, MainActivity::class.java).apply {
            flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
        }
        val pendingIntent = PendingIntent.getActivity(
            applicationContext,
            0,
            intent,
            PendingIntent.FLAG_IMMUTABLE
        )

        val notification = NotificationCompat.Builder(applicationContext, channelId)
            .setSmallIcon(R.drawable.quizappicon)
            .setContentTitle("Quiz Master")
            .setContentText(randomMessage)
            .setPriority(NotificationCompat.PRIORITY_DEFAULT)
            .setAutoCancel(true)
            .setContentIntent(pendingIntent)
            .build()

        notificationManager.notify(Random().nextInt(), notification)
    }

    companion object {
        fun scheduleReminders(context: Context) {
            val workManager = WorkManager.getInstance(context)

            // Morning reminder at 9:00 AM
            scheduleDailyCheck(workManager, "morning_reminder", 9, 0)

            // Evening reminder at 7:00 PM
            scheduleDailyCheck(workManager, "evening_reminder", 19, 0)
        }

        private fun scheduleDailyCheck(workManager: WorkManager, tag: String, hour: Int, minute: Int) {
            val calendar = Calendar.getInstance()
            val now = calendar.timeInMillis

            calendar.set(Calendar.HOUR_OF_DAY, hour)
            calendar.set(Calendar.MINUTE, minute)
            calendar.set(Calendar.SECOND, 0)

            if (calendar.timeInMillis <= now) {
                calendar.add(Calendar.DAY_OF_YEAR, 1)
            }

            val delay = calendar.timeInMillis - now

            val request = PeriodicWorkRequestBuilder<EngagementReminderWorker>(24, TimeUnit.HOURS)
                .setInitialDelay(delay, TimeUnit.MILLISECONDS)
                .addTag(tag)
                .build()

            workManager.enqueueUniquePeriodicWork(
                tag,
                ExistingPeriodicWorkPolicy.KEEP,
                request
            )
        }
    }
}
