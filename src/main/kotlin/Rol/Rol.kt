package Rol

class Rol {

    var id_rol: Int = 0
    lateinit var descripcion: String

    constructor(id_rol: Int, descripcion: String) {
        this.id_rol = id_rol
        this.descripcion = descripcion
    }

    constructor(descripcion: String) {
        this.descripcion = descripcion
    }


    override fun toString(): String {
        return "Rol (id_rol=$id_rol, descripcion='$descripcion')"
    }


}