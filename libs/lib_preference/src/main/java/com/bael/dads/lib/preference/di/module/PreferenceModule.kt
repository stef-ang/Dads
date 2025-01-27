package com.bael.dads.lib.preference.di.module

import com.bael.dads.lib.preference.DataStorePreference
import com.bael.dads.lib.preference.Preference
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

/**
 * Created by ErickSumargo on 01/01/21.
 */

@Module
@InstallIn(SingletonComponent::class)
interface PreferenceModule {

    @Binds
    @Singleton
    fun bindPreferenceStore(preference: DataStorePreference): Preference
}
