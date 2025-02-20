package br.com.voxsolucoes.cmpdependencyinjection.di

import br.com.voxsolucoes.cmpdependencyinjection.dependecies.DbClient
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

actual val platformModule = module {
    singleOf(::DbClient)
}