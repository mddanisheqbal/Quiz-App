package com.example.quizapp.presentation.screens

import android.app.Activity
import android.util.Log
import android.widget.Toast
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.animation.*
import androidx.compose.animation.core.*
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.scale
import androidx.compose.ui.focus.FocusDirection
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.quizapp.R
import com.example.quizapp.presentation.viewmodel.AuthViewModel
import com.example.quizapp.ui.theme.GradientEnd
import com.example.quizapp.ui.theme.GradientStart
import com.example.quizapp.util.Resource
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.common.api.ApiException
import kotlinx.coroutines.delay

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen(
    onNavigateToSignUp: () -> Unit,
    onNavigateToHome: () -> Unit,
    onNavigateToAdmin: () -> Unit,
    authViewModel: AuthViewModel = hiltViewModel()
) {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var passwordVisible by remember { mutableStateOf(false) }
    var showForgotPasswordDialog by remember { mutableStateOf(false) }
    var resetEmail by remember { mutableStateOf("") }

    val authState by authViewModel.authState.collectAsState()
    val resetPasswordState by authViewModel.resetPasswordState.collectAsState()
    val verificationState by authViewModel.verificationState.collectAsState()
    
    val focusManager = LocalFocusManager.current
    val context = LocalContext.current

    // Animations
    var visible by remember { mutableStateOf(false) }
    LaunchedEffect(Unit) {
        visible = true
    }

    // Google Sign-In Setup
    val googleClient = remember { authViewModel.getGoogleSignInClient(context) }
    val launcher = rememberLauncherForActivityResult(
        ActivityResultContracts.StartActivityForResult()
    ) { result ->
        if (result.resultCode == Activity.RESULT_OK) {
            val task = GoogleSignIn.getSignedInAccountFromIntent(result.data)
            try {
                val account = task.getResult(ApiException::class.java)
                val idToken = account?.idToken
                if (idToken != null) {
                    authViewModel.signInWithGoogle(idToken)
                }
            } catch (e: Exception) {
                Log.e("GOOGLE_LOGIN", "Error: ${e.message}", e)
                Toast.makeText(context, "Google login error", Toast.LENGTH_SHORT).show()
            }
        }
    }

    // Handle auth state
    LaunchedEffect(authState) {
        if (authState is Resource.Success) {
            onNavigateToHome()
            authViewModel.resetAuthState()
        }
    }

    AnimatedVisibility(
        visible = visible,
        enter = fadeIn(animationSpec = tween(1000)) + slideInVertically(initialOffsetY = { 50 })
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    Brush.verticalGradient(
                        colors = listOf(GradientStart, GradientEnd)
                    )
                )
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .verticalScroll(rememberScrollState())
                    .padding(24.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                // Logo + Title
                Image(
                    painter = painterResource(id = R.drawable.quizappicon),
                    contentDescription = "App Logo",
                    modifier = Modifier.size(100.dp)
                )

                Spacer(modifier = Modifier.height(16.dp))

                Text(
                    text = "Quiz Master",
                    fontSize = 32.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )

                Spacer(modifier = Modifier.height(8.dp))

                Text(
                    text = "Sign in to continue",
                    fontSize = 16.sp,
                    color = Color.White.copy(alpha = 0.8f)
                )

                Spacer(modifier = Modifier.height(40.dp))

                // Email + Password Fields
                Card(
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(24.dp),
                    colors = CardDefaults.cardColors(containerColor = Color.White.copy(alpha = 0.15f)),
                ) {
                    Column(modifier = Modifier.padding(24.dp)) {
                        OutlinedTextField(
                            value = email,
                            onValueChange = { email = it },
                            label = { Text("Email", color = Color.White) },
                            leadingIcon = { Icon(Icons.Default.Email, contentDescription = null, tint = Color.White) },
                            colors = OutlinedTextFieldDefaults.colors(
                                focusedBorderColor = Color.White,
                                unfocusedBorderColor = Color.White.copy(alpha = 0.5f),
                                focusedTextColor = Color.White,
                                unfocusedTextColor = Color.White,
                                cursorColor = Color.White,
                                focusedLabelColor = Color.White,
                                unfocusedLabelColor = Color.White.copy(alpha = 0.7f)
                            ),
                            modifier = Modifier.fillMaxWidth(),
                            shape = RoundedCornerShape(12.dp),
                            singleLine = true,
                            keyboardOptions = KeyboardOptions(imeAction = ImeAction.Next),
                            keyboardActions = KeyboardActions(onNext = { focusManager.moveFocus(FocusDirection.Down) })
                        )

                        Spacer(modifier = Modifier.height(16.dp))

                        OutlinedTextField(
                            value = password,
                            onValueChange = { password = it },
                            label = { Text("Password", color = Color.White) },
                            leadingIcon = { Icon(Icons.Default.Lock, contentDescription = null, tint = Color.White) },
                            trailingIcon = {
                                IconButton(onClick = { passwordVisible = !passwordVisible }) {
                                    Icon(
                                        imageVector = if (passwordVisible) Icons.Default.Visibility else Icons.Default.VisibilityOff,
                                        contentDescription = null,
                                        tint = Color.White
                                    )
                                }
                            },
                            visualTransformation = if (passwordVisible) VisualTransformation.None else PasswordVisualTransformation(),
                            colors = OutlinedTextFieldDefaults.colors(
                                focusedBorderColor = Color.White,
                                unfocusedBorderColor = Color.White.copy(alpha = 0.5f),
                                focusedTextColor = Color.White,
                                unfocusedTextColor = Color.White,
                                cursorColor = Color.White,
                                focusedLabelColor = Color.White,
                                unfocusedLabelColor = Color.White.copy(alpha = 0.7f)
                            ),
                            modifier = Modifier.fillMaxWidth(),
                            shape = RoundedCornerShape(12.dp),
                            singleLine = true,
                            keyboardOptions = KeyboardOptions(imeAction = ImeAction.Done),
                            keyboardActions = KeyboardActions(onDone = {
                                focusManager.clearFocus()
                                if (email.isNotBlank() && password.isNotBlank()) {
                                    authViewModel.signIn(email, password)
                                }
                            })
                        )

                        TextButton(
                            onClick = { showForgotPasswordDialog = true },
                            modifier = Modifier.align(Alignment.End)
                        ) {
                            Text("Forgot Password?", color = Color.White, fontSize = 14.sp)
                        }

                        Button(
                            onClick = {
                                if (email.isNotBlank() && password.isNotBlank()) {
                                    authViewModel.signIn(email, password)
                                } else {
                                    Toast.makeText(context, "Please enter email and password", Toast.LENGTH_SHORT).show()
                                }
                            },
                            modifier = Modifier.fillMaxWidth().height(56.dp),
                            shape = RoundedCornerShape(12.dp),
                            colors = ButtonDefaults.buttonColors(containerColor = Color.White),
                            enabled = authState !is Resource.Loading
                        ) {
                            if (authState is Resource.Loading && email.isNotEmpty()) {
                                CircularProgressIndicator(modifier = Modifier.size(24.dp), color = GradientStart)
                            } else {
                                Text("Sign In", color = GradientStart, fontWeight = FontWeight.Bold)
                            }
                        }
                    }
                }

                Spacer(modifier = Modifier.height(24.dp))

                // Divider
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Divider(modifier = Modifier.weight(1f), color = Color.White.copy(alpha = 0.3f))
                    Text(
                        text = " OR ",
                        fontSize = 12.sp,
                        color = Color.White.copy(alpha = 0.6f),
                        modifier = Modifier.padding(horizontal = 8.dp)
                    )
                    Divider(modifier = Modifier.weight(1f), color = Color.White.copy(alpha = 0.3f))
                }

                Spacer(modifier = Modifier.height(24.dp))

                // Google Button
                PremiumGoogleButton(
                    onClick = {
                        // FORCE ACCOUNT PICKER EVERY TIME
                        googleClient.signOut().addOnCompleteListener {
                            launcher.launch(googleClient.signInIntent)
                        }
                    },
                    isLoading = authState is Resource.Loading && email.isEmpty()
                )

                Spacer(modifier = Modifier.height(24.dp))

                // Sign Up link
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text("Don't have an account? ", color = Color.White)
                    Text(
                        "Sign Up",
                        color = Color.White,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.clickable { onNavigateToSignUp() }
                    )
                }

                Spacer(modifier = Modifier.height(16.dp))

                TextButton(onClick = onNavigateToAdmin) {
                    Text("Admin Login", color = Color.White.copy(alpha = 0.7f))
                }
            }
        }
    }

    if (showForgotPasswordDialog) {
        AlertDialog(
            onDismissRequest = { showForgotPasswordDialog = false },
            title = { Text("Reset Password") },
            text = {
                Column {
                    Text("Enter your email address to receive a password reset link.")
                    Spacer(modifier = Modifier.height(12.dp))
                    OutlinedTextField(
                        value = resetEmail,
                        onValueChange = { resetEmail = it },
                        label = { Text("Email") },
                        modifier = Modifier.fillMaxWidth()
                    )
                }
            },
            confirmButton = {
                Button(onClick = {
                    if (resetEmail.isNotBlank()) {
                        authViewModel.sendPasswordResetEmail(resetEmail)
                    }
                }) { Text("Send Link") }
            },
            dismissButton = {
                TextButton(onClick = { showForgotPasswordDialog = false }) { Text("Cancel") }
            }
        )
    }

    // Handle reset password state
    LaunchedEffect(resetPasswordState) {
        if (resetPasswordState is Resource.Success) {
            Toast.makeText(context, "Reset email sent!", Toast.LENGTH_SHORT).show()
            showForgotPasswordDialog = false
            authViewModel.resetPasswordState()
        } else if (resetPasswordState is Resource.Error) {
            Toast.makeText(context, (resetPasswordState as Resource.Error).message, Toast.LENGTH_SHORT).show()
            authViewModel.resetPasswordState()
        }
    }

    // Handle verification state
    LaunchedEffect(verificationState) {
        if (verificationState is Resource.Success) {
            Toast.makeText(context, "Verification email sent!", Toast.LENGTH_SHORT).show()
            authViewModel.resetVerificationState()
        } else if (verificationState is Resource.Error) {
            Toast.makeText(context, (verificationState as Resource.Error).message, Toast.LENGTH_SHORT).show()
            authViewModel.resetVerificationState()
        }
    }
}

@Composable
fun PremiumGoogleButton(onClick: () -> Unit, isLoading: Boolean) {
    var isPressed by remember { mutableStateOf(false) }
    val scale by animateFloatAsState(if (isPressed) 0.95f else 1f, label = "button_scale")

    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .height(56.dp)
            .scale(scale)
            .clickable {
                isPressed = true
                onClick()
            },
        shape = RoundedCornerShape(20.dp),
        color = Color.White,
        shadowElevation = 4.dp
    ) {
        Row(
            modifier = Modifier.fillMaxSize(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            if (isLoading) {
                CircularProgressIndicator(modifier = Modifier.size(24.dp), color = GradientStart)
            } else {
                Image(
                    painter = painterResource(id = R.drawable.ic_google_logo),
                    contentDescription = null,
                    modifier = Modifier.size(24.dp)
                )
                Spacer(modifier = Modifier.width(12.dp))
                Text(
                    text = "Continue with Google",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black
                )
            }
        }
    }

    LaunchedEffect(isPressed) {
        if (isPressed) {
            delay(100)
            isPressed = false
        }
    }
}
