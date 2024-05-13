package Terapeuta

class Terapeuta(val id_terapeuta:Int, val nombre:String, val apellido1:String, val apellido2:String, val id_metodologia:Int) {

    override fun toString(): String {
        return "Terapeuta(id_terapeuta=$id_terapeuta, nombre='$nombre', apellido1='$apellido1', apellido2='$apellido2', id_metodologia=$id_metodologia)"
    }
}