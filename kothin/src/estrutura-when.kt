fun main(){
    var cargo:String = "Gerente"
        when(cargo){
            "Presidente" -> println(6000f)
            "Gerente" -> println(4500f)
            "Coordenador" -> println(3000f)
            "Analista" -> println(2600f)
            "Estágiario" -> println(1600f)
            else -> println("Cargo não definido.")
        }
}