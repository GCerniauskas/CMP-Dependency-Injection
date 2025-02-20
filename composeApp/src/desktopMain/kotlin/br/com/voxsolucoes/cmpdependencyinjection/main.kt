package br.com.voxsolucoes.cmpdependencyinjection

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import br.com.voxsolucoes.cmpdependencyinjection.di.initKoin

fun main() {
    initKoin()
    application {
        Window(
            onCloseRequest = ::exitApplication,
            title = "CMP-DependencyInjection",
        ) {
            App()
        }
    }
}