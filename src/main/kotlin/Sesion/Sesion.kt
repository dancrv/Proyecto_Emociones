package Sesion

/**
 * La clase Sesion representa una sesión en el sistema
 *
 * @property id_sesion El ID de la sesión
 * @property id_grupo El ID del grupo asociado a la sesión
 * @property id_familia El ID de la familia asociada a la sesión
 * @constructor Create empty Sesion
 */
class Sesion(val id_sesion:Int, val id_grupo:Int, val id_familia:Int) {

    override fun toString(): String {
        return "Sesion(id_sesion=$id_sesion, id_grupo=$id_grupo, id_familia=$id_familia)"
    }
}