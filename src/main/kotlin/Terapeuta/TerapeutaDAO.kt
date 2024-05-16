package Terapeuta

/**
 * Interfaz para acceder a los datos de los terapeutas.
 *
 * @constructor Create empty Terapeuta d a o
 */
interface TerapeutaDAO {
    /**
     *La funcion Buscar Terapeuta busca un terapeuta por su identificador único.
     *
     * @param id_terapeuta es el identificador único del terapeuta a buscar.
     * @return devuelve el terapeuta encontrado, o null si no se encontró ninguno con el ID especificado.
     */
    fun buscarTerapeuta(id_terapeuta: Int): Terapeuta?

    /**
     *La funcion Sacar Terapeuta obtiene una lista de todos los terapeutas almacenados.
     *
     * @return devuelve un Terapeuta.
     */
    fun sacarTerapeuta(): List<Terapeuta>

    /**
     *LA funcion Insertar Terapeuta inserta un nuevo terapeuta en el sistema.
     *
     * @param terapeuta es el terapeuta que se va a insertar.
     * @return devuelve true si la inserción fue exitosa, false en caso contrario.
     */
    fun insertarTerapeuta(terapeuta: Terapeuta): Boolean

    /**
     *La funcion Modificar Terapeuta modifica un terapeuta existente en el sistema.
     *
     * @param terapeuta es el terapeuta con los datos actualizados que se va a modificar.
     * @return devuelve true si la modificación fue exitosa, false en caso contrario.
     */
    fun modificarTerapeuta(terapeuta: Terapeuta): Boolean

    /**
     *La funcion Borrar Terapeuta borra un terapeuta del sistema por su identificador único.
     *
     * @param id_terapeuta es el identificador único del terapeuta que se va a borrar.
     * @return devuelve true si la eliminación fue exitosa, false en caso contrario.
     */
    fun borrarTerapeuta(id_terapeuta: Int): Boolean
}