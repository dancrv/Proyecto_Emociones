package Sesion_Emocion

/**
 *La clase Sesion_emocion representa la relación entre una sesión y una emoción en el sistema.
 *
 *
 * @property id_sesion El ID de la sesión.
 * @property id_emocion El ID de la emoción asociada a la sesión.
 * @constructor Crea una nueva instancia de la clase Sesion_Emocion
 */
class Sesion_Emocion(val id_sesion:Int, val id_emocion:Int) {

    override fun toString(): String {
        return "Sesion_Emocion(id_sesion=$id_sesion, id_emocion=$id_emocion)"
    }
}