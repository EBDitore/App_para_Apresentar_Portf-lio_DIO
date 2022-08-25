package meu.teste.portfoliopresentation.domain.di

import meu.teste.portfoliopresentation.data.di.DataModule
import meu.teste.portfoliopresentation.domain.ListUserRepositoriesUseCase
import org.koin.core.context.loadKoinModules
import org.koin.core.module.Module
import org.koin.dsl.module

object DomainModule {

    fun load() {
        loadKoinModules(useCaseModule())
    }

    private fun useCaseModule() : Module {
        return module {
            factory { ListUserRepositoriesUseCase(get()) } // Single é um singleton e factory renova a instância à cada solicitação
        }
    }

}