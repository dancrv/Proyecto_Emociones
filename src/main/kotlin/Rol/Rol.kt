package Rol

/**
 * La clase Rol representa un rol en el sistema.
 *
 * @constructor Crea un nuevo rol con el ID y la descripción especificados.
 */
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