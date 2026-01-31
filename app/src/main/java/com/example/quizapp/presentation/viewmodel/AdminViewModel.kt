package com.example.quizapp.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.quizapp.data.model.Category
import com.example.quizapp.data.model.Question
import com.example.quizapp.data.repository.AdminRepository
import com.example.quizapp.data.repository.QuizRepository
import com.example.quizapp.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AdminViewModel @Inject constructor(
    private val adminRepository: AdminRepository,
    private val quizRepository: QuizRepository
) : ViewModel() {

    private val _categories = MutableStateFlow<Resource<List<Category>>>(Resource.Loading())
    val categories: StateFlow<Resource<List<Category>>> = _categories

    private val _questions = MutableStateFlow<Resource<List<Question>>>(Resource.Loading())
    val questions: StateFlow<Resource<List<Question>>> = _questions

    private val _operationResult = MutableStateFlow<Resource<String>?>(null)
    val operationResult: StateFlow<Resource<String>?> = _operationResult

    fun loadCategories() {
        viewModelScope.launch {
            _categories.value = Resource.Loading()
            val result = quizRepository.getCategories()
            _categories.value = result
        }
    }

    fun loadQuestions(categoryId: String) {
        viewModelScope.launch {
            _questions.value = Resource.Loading()
            val result = quizRepository.getQuestionsByCategory(categoryId)
            _questions.value = result
        }
    }

    // Category Operations
    fun createCategory(category: Category) {
        viewModelScope.launch {
            _operationResult.value = Resource.Loading()
            val result = adminRepository.createCategory(category)

            if (result is Resource.Success) {
                _operationResult.value = Resource.Success("Category created successfully")
                loadCategories() // Refresh list
            } else {
                _operationResult.value = Resource.Error(result.message ?: "Failed to create category")
            }
        }
    }

    fun updateCategory(id: String, category: Category) {
        viewModelScope.launch {
            _operationResult.value = Resource.Loading()
            val result = adminRepository.updateCategory(id, category)

            if (result is Resource.Success) {
                _operationResult.value = Resource.Success("Category updated successfully")
                loadCategories() // Refresh list
            } else {
                _operationResult.value = Resource.Error(result.message ?: "Failed to update category")
            }
        }
    }

    fun deleteCategory(id: String) {
        viewModelScope.launch {
            _operationResult.value = Resource.Loading()
            val result = adminRepository.deleteCategory(id)

            if (result is Resource.Success) {
                _operationResult.value = Resource.Success("Category deleted successfully")
                loadCategories() // Refresh list
            } else {
                _operationResult.value = Resource.Error(result.message ?: "Failed to delete category")
            }
        }
    }

    // Question Operations
    fun createQuestion(question: Question) {
        viewModelScope.launch {
            _operationResult.value = Resource.Loading()
            val result = adminRepository.createQuestion(question)

            if (result is Resource.Success) {
                _operationResult.value = Resource.Success("Question created successfully")
                loadQuestions(question.categoryId) // Refresh list
            } else {
                _operationResult.value = Resource.Error(result.message ?: "Failed to create question")
            }
        }
    }

    fun updateQuestion(id: String, question: Question) {
        viewModelScope.launch {
            _operationResult.value = Resource.Loading()
            val result = adminRepository.updateQuestion(id, question)

            if (result is Resource.Success) {
                _operationResult.value = Resource.Success("Question updated successfully")
                loadQuestions(question.categoryId) // Refresh list
            } else {
                _operationResult.value = Resource.Error(result.message ?: "Failed to update question")
            }
        }
    }

    fun deleteQuestion(id: String, categoryId: String) {
        viewModelScope.launch {
            _operationResult.value = Resource.Loading()
            val result = adminRepository.deleteQuestion(id)

            if (result is Resource.Success) {
                _operationResult.value = Resource.Success("Question deleted successfully")
                loadQuestions(categoryId) // Refresh list
            } else {
                _operationResult.value = Resource.Error(result.message ?: "Failed to delete question")
            }
        }
    }

    fun resetOperationResult() {
        _operationResult.value = null
    }
}