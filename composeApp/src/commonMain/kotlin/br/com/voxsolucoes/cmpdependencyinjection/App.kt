package br.com.voxsolucoes.cmpdependencyinjection

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.com.voxsolucoes.cmpdependencyinjection.dependecies.MyViewModel
import kotlinx.serialization.Serializable
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.koin.compose.KoinContext
import org.koin.compose.viewmodel.koinViewModel
import org.koin.core.annotation.KoinExperimentalAPI

@OptIn(KoinExperimentalAPI::class)
@Composable
@Preview
fun App() {
    MaterialTheme {
        KoinContext {
            val navController = rememberNavController()
            NavHost(navController = navController, startDestination = HomePage) {

                composable<HomePage> {
                    val viewModel = koinViewModel<MyViewModel>()
                    Box(
                        modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center
                    ) {
                        Text(text = viewModel.getHelloWorldString())
                    }
                }
            }
        }
    }
}

@Serializable
object HomePage