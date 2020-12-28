package com.bael.lib.domain.interactor

import com.bael.lib.domain.model.Response
import com.bael.lib.domain.repository.SampleRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

/**
 * Created by ErickSumargo on 01/01/21.
 */

internal class DefaultSampleInteractor @Inject constructor(
    private val sampleRepository: SampleRepository
) : SampleInteractor {

    override suspend fun invoke(): Flow<Response> {
        return sampleRepository.loadSamples()
    }
}
