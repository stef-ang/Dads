package com.bael.dads.lib.domain.mapper.data

import com.bael.dads.lib.data.mapper.Mapper
import java.lang.System.currentTimeMillis
import javax.inject.Inject
import com.bael.dads.lib.api.model.DadJoke as DadJokeRemote
import com.bael.dads.lib.database.entity.DadJoke as DadJokeDB

/**
 * Created by ErickSumargo on 01/01/21.
 */

internal class DadJokeRemoteMapper @Inject constructor() : Mapper<DadJokeRemote, DadJokeDB> {

    override fun map(data: DadJokeRemote): DadJokeDB {
        return DadJokeDB(
            jokeId = data.id,
            setup = data.setup,
            punchline = data.punchline,
            favored = false,
            seen = false,
            createdAt = currentTimeMillis(),
            updatedAt = currentTimeMillis()
        )
    }
}
