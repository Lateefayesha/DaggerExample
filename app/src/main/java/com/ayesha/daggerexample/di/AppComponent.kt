package com.ayesha.daggerexample.di

import com.ayesha.daggerexample.MyApplication
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule

@Component(modules = [AndroidSupportInjectionModule::class
,    ActivityBuildersModule::class])
interface AppComponent : AndroidInjector<MyApplication> {

    @Component.Factory
    interface Factory{
        open fun create(@BindsInstance application: MyApplication):AppComponent
    }
}