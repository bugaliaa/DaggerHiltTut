package com.example.daggerhilttut.di

import android.content.Context
import com.example.daggerhilttut.R
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.components.ActivityRetainedComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.android.scopes.ActivityRetainedScoped
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Named

@Module
@InstallIn(ActivityRetainedComponent::class)
object MainModule {

    @ActivityRetainedScoped
    @Provides
    @Named("String2")
    fun provideTestString2(
        @ApplicationContext context: Context,
        @Named("String1") testString1: String
    ) = "${context.getString(R.string.string_to_inject)} - $testString1"
}