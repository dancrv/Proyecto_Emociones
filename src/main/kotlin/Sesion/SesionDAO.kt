package Sesion

/**
 * Interfaz para acceder a los datos de las sesiones
 *
 * @constructor Create empty Sesion d a o
 */
interface SesionDAO {
    /**
     *La funcion Buscar sesion busca una sesión por su identificador único.
     *
     * @param id_sesion es el identificador único de la sesión a buscar.
     * @return devuelve la sesión encontrada, o null si no se encontró ninguna con el ID especificado.
     */
    fun buscarSesion(id_sesion: Int): Sesion?

    /**
     *La funcion Sacar sesion obtiene una lista de todas las sesiones almacenadas.
     *
     * @return devuelve una Sesion.
     */
    fun sacarSesion(): List<Sesion>

    /**
     *La funcion Insertar sesion inserta una nueva sesión en el sistema.
     *
     * @param sesion es la sesión que se va a insertar.
     * @return devuelve true si la inserción fue exitosa, false en caso contrario.
     */
    fun insertarSesion(sesion: Sesion): Boolean

    /**
     *La funcion Modificar sesion modifica una sesión existente en el sistema.
     *
     * @param sesion es la sesión con los datos actualizados que se va a modificar.
     * @return devuelve true si la modificación fue exitosa, false en caso contrario.
     */
    fun modificarSesion(sesion: Sesion): Boolean

    /**
    *La funcion Borrar sesion borra una sesión del sistema por su identificador único.
    *
    * @param id_sesion es el identificador único de la sesión que se va a borrar.
    * @return devuelve true si la eliminación fue exitosa, false en caso contrario.
    */
    fun borrarSesion(id_sesion: Int): Boolean
}