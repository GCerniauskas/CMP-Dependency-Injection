package br.com.voxsolucoes.cmpdependencyinjection

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform