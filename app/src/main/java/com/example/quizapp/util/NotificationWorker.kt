package com.example.quizapp.util

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
import java.util.*
import java.util.concurrent.TimeUnit
import kotlin.random.Random

class NotificationWorker(context: Context, workerParams: WorkerParameters) :
    CoroutineWorker(context, workerParams) {

    override suspend fun doWork(): Result {
        val type = inputData.getString("type") ?: "morning"
        sendNotification(type)
        return Result.success()
    }

    private fun sendNotification(type: String) {
        val notificationManager =
            applicationContext.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager

        val channelId = "daily_reminders"
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val channel = NotificationChannel(
                channelId,
                "Daily Reminders",
                NotificationManager.IMPORTANCE_DEFAULT
            )
            notificationManager.createNotificationChannel(channel)
        }

        val messages = if (type == "morning") {
            listOf(
                "☀️ Start your day with a quick quiz!",
                "🧠 Wake up your brain with today’s challenge.",
                "📚 A new day, a new chance to learn something.",
                "🚀 Ready for a quick brain workout?",
                "🔥 Keep your learning streak alive today.",
                "🎯 Just 2 minutes can sharpen your mind.",
                "✨ A fresh day deserves a fresh challenge.",
                "📈 Boost your knowledge before the day begins.",
                "🧠 Your brain deserves a warm-up.",
                "🏆 Start strong. Try a quick quiz now.",
                "📖 Learn something new before breakfast.",
                "🧠 Ready to level up today?",
                "🎓 Knowledge grows daily. Begin with a quiz.",
                "🌅 Morning challenge unlocked!",
                "🚀 One quiz today can make you smarter tomorrow."
            )
        } else {
            listOf(
                "🌙 End your day with a quick quiz.",
                "🔥 Don’t break your learning streak tonight.",
                "🧠 A small quiz before bed keeps your mind sharp.",
                "🏆 You’re one quiz away from leveling up.",
                "📚 Finish your day with a learning boost.",
                "✨ Relax and challenge your brain for 2 minutes.",
                "🎯 Quick challenge before the day ends?",
                "🚀 Your next level is waiting.",
                "📈 Just one quiz can improve your skills.",
                "🧠 Your brain still has energy for one more challenge.",
                "🏅 One more quiz before calling it a day?",
                "🌙 End today smarter than you started.",
                "🔥 Keep the streak alive tonight.",
                "🎓 Knowledge never sleeps.",
                "📖 One final quiz for today?"
            )
        }

        val randomMessage = messages[Random.nextInt(messages.size)]

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
            .setAutoCancel(true)
            .setContentIntent(pendingIntent)
            .build()

        notificationManager.notify(if (type == "morning") 1 else 2, notification)
    }

    companion object {
        fun scheduleDailyReminders(context: Context) {
            val workManager = WorkManager.getInstance(context)

            // Schedule Morning at 9:00 AM
            scheduleReminder(workManager, "morning", 9, 0)

            // Schedule Evening at 7:00 PM (19:00)
            scheduleReminder(workManager, "evening", 19, 0)
        }

        private fun scheduleReminder(workManager: WorkManager, type: String, hour: Int, minute: Int) {
            val calendar = Calendar.getInstance()
            val now = calendar.timeInMillis

            calendar.set(Calendar.HOUR_OF_DAY, hour)
            calendar.set(Calendar.MINUTE, minute)
            calendar.set(Calendar.SECOND, 0)

            if (calendar.timeInMillis <= now) {
                calendar.add(Calendar.DAY_OF_YEAR, 1)
            }

            val delay = calendar.timeInMillis - now

            val data = Data.Builder()
                .putString("type", type)
                .build()

            val request = PeriodicWorkRequestBuilder<NotificationWorker>(24, TimeUnit.HOURS)
                .setInitialDelay(delay, TimeUnit.MILLISECONDS)
                .setInputData(data)
                .build()

            workManager.enqueueUniquePeriodicWork(
                "daily_reminder_$type",
                ExistingPeriodicWorkPolicy.UPDATE,
                request
            )
        }
    }
}
