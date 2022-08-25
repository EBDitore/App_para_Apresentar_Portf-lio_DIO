package meu.teste.portfoliopresentation.domain

import kotlinx.coroutines.flow.Flow
import meu.teste.portfoliopresentation.core.UseCase
import meu.teste.portfoliopresentation.data.model.Repo
import meu.teste.portfoliopresentation.data.repositories.RepoRepository

class ListUserRepositoriesUseCase(private val repository: RepoRepository) : UseCase<String, List<Repo>>() {

    override suspend fun execute(param: String): Flow<List<Repo>> {
        return repository.listRepositories(param)
    }

}