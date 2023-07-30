package com.example.data.repo
import com.example.domain.repo.userRepo
class userRepoImpl constructor(
    private val apiServices: ApiServices
) :userRepo {
    override suspend fun getData() {
    }

}