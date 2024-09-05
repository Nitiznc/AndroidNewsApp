package com.loc.newsapp.domain.usecases.app_entry

import com.loc.newsapp.domain.manger.LocalUserManager
import kotlinx.coroutines.flow.Flow

class ReadAppEntry(
    private val localUserManger: LocalUserManager
) {
    operator fun invoke(): Flow<Boolean>{
        return localUserManger.readAppEntry()
    }
}