package com.ayesha.daggerexample


import com.ayesha.daggerexample.di.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

class MyApplication :DaggerApplication() {
    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
//        return  DaggerAppComponent.factory().create(this)
        return DaggerAppComponent.factory().create(this)

    }
}