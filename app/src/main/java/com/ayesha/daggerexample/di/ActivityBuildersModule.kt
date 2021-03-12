package com.ayesha.daggerexample.di

import com.ayesha.daggerexample.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuildersModule {

    @ContributesAndroidInjector
    abstract fun contributeMyActivity(): MainActivity
}