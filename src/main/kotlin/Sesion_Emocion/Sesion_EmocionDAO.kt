package Sesion_Emocion

interface Sesion_EmocionDAO {
    fun buscarSesionEmocion(id_sesion: Int,id_emocion: Int): Sesion_Emocion?
    fun sacarSesionEmocion(): List<Sesion_Emocion>
    fun insertarSesionEmo(sesionEmo: Sesion_Emocion): Boolean
    fun modificarSesionEmo(sesionEmo: Sesion_Emocion): Boolean
    fun borrarSesionEmo(id_sesion: Int, id_emocion:Int): Boolean
}