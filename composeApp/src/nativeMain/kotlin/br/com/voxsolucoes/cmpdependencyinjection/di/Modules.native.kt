package br.com.voxsolucoes.cmpdependencyinjection.di

import br.com.voxsolucoes.cmpdependencyinjection.dependecies.DbClient
import br.com.voxsolucoes.cmpdependencyinjection.dependecies.MyViewModel
import org.koin.compose.viewmodel.dsl.viewModelOf
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module
import platform.MapKit.MKMapRectGetMaxY

actual val platformModule = module {
    singleOf(::DbClient)
    viewModelOf(::MyViewModel)
}