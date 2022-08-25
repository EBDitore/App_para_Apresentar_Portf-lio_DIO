package meu.teste.portfoliopresentation.data.repositories

import kotlinx.coroutines.flow.Flow
import meu.teste.portfoliopresentation.data.model.Repo

interface RepoRepository {
    suspend fun listRepositories(user: String): Flow<List<Repo>>
}