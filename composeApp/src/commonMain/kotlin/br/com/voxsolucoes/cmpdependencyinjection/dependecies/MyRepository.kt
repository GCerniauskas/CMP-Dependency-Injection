package br.com.voxsolucoes.cmpdependencyinjection.dependecies

interface MyRepository {
    fun helloWorld(): String
}

class MyRepositoryImpl(
    private val dbClient: DbClient
): MyRepository {
    override fun helloWorld(): String {
        return "Hello World"
    }
}