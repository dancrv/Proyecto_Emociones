package Metodologia

/**
 * La clase Metodologia representa una metodología en el sistema.
 *
 * @constructor crea un objeto Metodologia con ID y nombre.
 */
class Metodologia {

    var id_metodologia:Int = 0
    lateinit var nombre:String

    constructor(id_metodologia: Int, nombre: String) {
        this.id_metodologia = id_metodologia
        this.nombre = nombre
    }

    constructor(nombre: String) {
        this.nombre = nombre
    }


    override fun toString(): String {
        return "Metodologia(id_metodologia=$id_metodologia, nombre='$nombre')"
    }
}