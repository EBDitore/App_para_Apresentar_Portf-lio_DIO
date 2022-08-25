package meu.teste.portfoliopresentation.data.repositories

import kotlinx.coroutines.flow.flow
import meu.teste.portfoliopresentation.data.model.Repo
import meu.teste.portfoliopresentation.data.services.GitHubService

class RepoRepositoryImpl(private val service: GitHubService): RepoRepository {

    override suspend fun listRepositories(user: String) = flow {
        val repoList = service.listRepositories(user)
        emit(repoList)
    }
}