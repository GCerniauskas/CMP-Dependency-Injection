package br.com.voxsolucoes.cmpdependencyinjection

import androidx.compose.ui.window.ComposeUIViewController
import br.com.voxsolucoes.cmpdependencyinjection.di.initKoin

fun MainViewController() = ComposeUIViewController {
    initKoin()
    App()
}