package br.com.voxsolucoes.cmpdependencyinjection

import android.app.Application
import br.com.voxsolucoes.cmpdependencyinjection.di.initKoin
import br.com.voxsolucoes.cmpdependencyinjection.di.sharedModule
import org.koin.android.ext.koin.androidContext

class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        initKoin {
            androidContext(this@MyApplication)
        }
    }
}