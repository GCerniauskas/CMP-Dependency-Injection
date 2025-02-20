package br.com.voxsolucoes.cmpdependencyinjection.di

import br.com.voxsolucoes.cmpdependencyinjection.dependecies.MyRepository
import br.com.voxsolucoes.cmpdependencyinjection.dependecies.MyRepositoryImpl
import org.koin.core.module.Module
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

expect val platformModule: Module

val sharedModule = module {
    singleOf(::MyRepositoryImpl).bind<MyRepository>()
}