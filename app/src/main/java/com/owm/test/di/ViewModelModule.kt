package com.owm.test.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.owm.test.ui.AppViewModelFactory
import com.owm.test.ui.fragments.halfmonth.HalfMothViewModel
import com.owm.test.ui.fragments.search.SearchViewModel
import com.owm.test.ui.fragments.settings.SettingsViewModel
import com.owm.test.ui.fragments.today.TodayViewModel
import com.owm.test.ui.fragments.weekly.WeeklyViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ViewModelModule {
    @Binds
    @IntoMap
    @ViewModelKey(HalfMothViewModel::class)
    abstract fun bindHalfMothViewModel(halfMothViewModel: HalfMothViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(SearchViewModel::class)
    abstract fun bindSearchViewModel(searchViewModel: SearchViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(SettingsViewModel::class)
    abstract fun bindRepoViewModel(settingsViewModel: SettingsViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(TodayViewModel::class)
    abstract fun bindTodayViewModel(todayViewModel: TodayViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(WeeklyViewModel::class)
    abstract fun bindWeeklyViewModel(weeklyViewModel: WeeklyViewModel): ViewModel

    @Binds
    abstract fun bindViewModelFactory(factory: AppViewModelFactory): ViewModelProvider.Factory
}