package Terapeuta

/**
 *La clase Terapeuta representa a un terapeuta.
 *
 * @property id_terapeuta El ID del terapeuta.
 * @property nombre El nombre del terapeuta.
 * @property apellido1 El primer apellido del terapeuta.
 * @property apellido2 El segundo apellido del terapeuta.
 * @property id_metodologia El ID de la metodología asociada al terapeuta.
 * @constructor Crea un terapeuta con los datos especificados.
 */
class Terapeuta(val id_terapeuta:Int, val nombre:String, val apellido1:String, val apellido2:String, val id_metodologia:Int) {

    override fun toString(): String {
        var terapeuta: String
        var terapeuta:String
        return "Terapeuta(id_terapeuta=$id_terapeuta, nombre='$nombre', apellido1='$apellido1', apellido2='$apellido2', id_metodologia=$id_metodologia)"
    }
}