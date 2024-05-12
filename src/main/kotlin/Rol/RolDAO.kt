package Rol

interface RolDAO {
    fun buscarRol(id_rol: Int): Rol?
    fun sacarRol(): List<Rol>
    fun insertarRol(rol: Rol): Boolean
    fun modificarRol(rol:Rol): Boolean
    fun borrarRol(id_rol: Int): Boolean
}