package com.example.quizapp.data.repository

import com.example.quizapp.data.model.Category
import com.example.quizapp.data.model.Question
import com.example.quizapp.util.Resource
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.coroutines.tasks.await
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class AdminRepository @Inject constructor(
    private val firestore: FirebaseFirestore
) {

    private val categoriesCollection = firestore.collection("categories")
    private val questionsCollection = firestore.collection("questions")

    // ========== CATEGORY MANAGEMENT ==========

    suspend fun createCategory(category: Category): Resource<Category> {
        return try {
            categoriesCollection.document(category.id).set(category).await()
            Resource.Success(category)
        } catch (e: Exception) {
            Resource.Error(e.message ?: "An error occurred while creating the category")
        }
    }

    suspend fun updateCategory(id: String, category: Category): Resource<Category> {
        return try {
            categoriesCollection.document(id).set(category).await()
            Resource.Success(category)
        } catch (e: Exception) {
            Resource.Error(e.message ?: "An error occurred while updating the category")
        }
    }

    suspend fun deleteCategory(id: String): Resource<Unit> {
        return try {
            // Important: You should handle deleting sub-collections (like questions) 
            // either here or using a Firebase Function for better data integrity.
            // For now, we only delete the category document.
            categoriesCollection.document(id).delete().await()
            Resource.Success(Unit)
        } catch (e: Exception) {
            Resource.Error(e.message ?: "An error occurred while deleting the category")
        }
    }

    // ========== QUESTION MANAGEMENT ==========

    suspend fun createQuestion(question: Question): Resource<Question> {
        return try {
            questionsCollection.document(question.id).set(question).await()
            Resource.Success(question)
        } catch (e: Exception) {
            Resource.Error(e.message ?: "An error occurred while creating the question")
        }
    }

    suspend fun updateQuestion(id: String, question: Question): Resource<Question> {
        return try {
            questionsCollection.document(id).set(question).await()
            Resource.Success(question)
        } catch (e: Exception) {
            Resource.Error(e.message ?: "An error occurred while updating the question")
        }
    }

    suspend fun deleteQuestion(id: String): Resource<Unit> {
        return try {
            questionsCollection.document(id).delete().await()
            Resource.Success(Unit)
        } catch (e: Exception) {
            Resource.Error(e.message ?: "An error occurred while deleting the question")
        }
    }
}
