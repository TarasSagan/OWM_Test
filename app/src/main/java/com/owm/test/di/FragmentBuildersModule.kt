package com.owm.test.di

import com.owm.test.ui.fragments.halfmonth.HalfMothFragment
import com.owm.test.ui.fragments.search.SearchFragment
import com.owm.test.ui.fragments.today.TodayFragment
import com.owm.test.ui.fragments.weekly.WeeklyFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentBuildersModule {
    @ContributesAndroidInjector
    abstract fun contributeHalfMothFragment(): HalfMothFragment

    @ContributesAndroidInjector
    abstract fun contributeSearchFragment(): SearchFragment

    @ContributesAndroidInjector
    abstract fun contributeTodayFragment(): TodayFragment

    @ContributesAndroidInjector
    abstract fun contributeWeeklyFragment(): WeeklyFragment
}