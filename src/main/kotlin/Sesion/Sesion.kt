package Sesion

class Sesion(val id_sesion:Int, val id_grupo:Int, val id_familia:Int) {

    override fun toString(): String {
        return "Sesion(id_sesion=$id_sesion, id_grupo=$id_grupo, id_familia=$id_familia)"
    }
}