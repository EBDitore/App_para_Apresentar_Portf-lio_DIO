package meu.teste.portfoliopresentation.data.model

data class Repo (
    val name: String,
    val id: Long,
    val owner: Owner,
    val stargazersCount: Long,
    val language: String,
    val htmlURL: String,
    val description: String
)
