package Individuo

class Individuo{
    var id_individuo:Int = 0
    lateinit var nombre:String
    lateinit var apellido1:String
    lateinit var apellido2:String
    var id_rol:Int = 0
    var id_familia:Int = 0

    constructor(id_individuo: Int, nombre: String, apellido1: String, apellido2: String, id_rol: Int, id_familia: Int) {
        this.id_individuo = id_individuo
        this.nombre = nombre
        this.apellido1 = apellido1
        this.apellido2 = apellido2
        this.id_rol = id_rol
        this.id_familia = id_familia
    }

    constructor(nombre: String, apellido1: String, apellido2: String, id_rol: Int, id_familia: Int) {
        this.nombre = nombre
        this.apellido1 = apellido1
        this.apellido2 = apellido2
        this.id_rol = id_rol
        this.id_familia = id_familia
    }


    override fun toString(): String {
        return "Individuo(id_individuo=$id_individuo, nombre='$nombre', apellido1='$apellido1', apellido2='$apellido2', id_rol=$id_rol, id_familia=$id_familia)"
    }
}