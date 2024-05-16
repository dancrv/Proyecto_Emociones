package Rol

/**
 * Interfaz para acceder a los datos de los roles
 *
 * @constructor Create empty Rol d a o
 */
interface RolDAO {
    /**
     *La funcion Buscar rol busca un rol por su identificador único.
     *
     * @param id_rol es el identificador único del rol a buscar.
     * @return devuelve el rol encontrado, o null si no se encontró ninguno con el ID especificado.
     */
    fun buscarRol(id_rol: Int): Rol?

    /**
     *La funcion Sacar rol obtiene una lista de todos los roles almacenados.
     *
     * @return devuelve Un Rol.
     */
    fun sacarRol(): List<Rol>

    /**
     *La funcion Insertar rol inserta un nuevo rol en el sistema.
     *
     * @param rol es el rol que se va a insertar.
     * @return devuelve true si la inserción fue exitosa, false en caso contrario.
     */
    fun insertarRol(rol: Rol): Boolean

    /**
     *La funcion Modificar rol modifica un rol existente en el sistema.
     *
     * @param rol es el rol con los datos actualizados que se va a modificar.
     * @return devuelve true si la modificación fue exitosa, false en caso contrario.
     */
    fun modificarRol(rol:Rol): Boolean

    /**
     *La funcion Borrar rol borra un rol del sistema por su identificador único.
     *
     * @param id_rol es el identificador único del rol que se va a borrar.
     * @return devuelve true si la eliminación fue exitosa, false en caso contrario.
     */
    fun borrarRol(id_rol: Int): Boolean
}