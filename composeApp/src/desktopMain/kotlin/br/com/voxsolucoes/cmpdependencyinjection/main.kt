package br.com.voxsolucoes.cmpdependencyinjection

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "CMP-DependencyInjection",
    ) {
        App()
    }
}