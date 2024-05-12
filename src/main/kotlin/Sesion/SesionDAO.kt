package Sesion

interface SesionDAO {
    fun buscarSesion(id_sesion: Int): Sesion?
    fun sacarSesion(): List<Sesion>
    fun insertarSesion(sesion: Sesion): Boolean
    fun modificarSesion(sesion: Sesion): Boolean
    fun borrarSesion(id_sesion: Int): Boolean
}