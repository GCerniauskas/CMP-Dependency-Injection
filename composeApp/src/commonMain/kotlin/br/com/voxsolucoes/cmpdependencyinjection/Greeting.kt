package br.com.voxsolucoes.cmpdependencyinjection

class Greeting {
    private val platform = getPlatform()

    fun greet(): String {
        return "Hello, ${platform.name}!"
    }
}