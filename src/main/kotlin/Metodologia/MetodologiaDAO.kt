package Metodologia

/**
 * Interfaz para acceder a los datos de las metodologías
 *
 * @constructor Create empty Metodologia d a o
 */
interface MetodologiaDAO {
    /**
     *La funcion Buscar metodologia busca una metodología por su identificador único.
     *
     * @param id_metodologia es el identificador único de la metodología a buscar.
     * @return devuelve la metodología encontrada, o null si no se encontró ninguna con el ID especificado.
     */
    fun buscarMetodologia(id_metodologia: Int): Metodologia?

    /**
     * La funcion Sacar metodologia obtiene una lista de todas las metodologías almacenadas.
     *
     * @return devuelve una Metodologia.
     */
    fun sacarMetodologia(): List<Metodologia>

    /**
     *La funcion Insertar metodologia inserta una nueva metodología en el sistema.
     *
     * @param metodologia es la metodología que se va a insertar.
     * @return devuelve true si la inserción fue exitosa, false en caso contrario.
     */
    fun insertarMetodologia(metodologia: Metodologia): Boolean

    /**
     *La funcion Modificar metodologia modifica una metodología existente en el sistema.
     *
     * @param metodologia es la metodología con los datos actualizados que se va a modificar.
     * @return devuelve true si la modificación fue exitosa, false en caso contrario.
     */
    fun modificarMetodologia(metodologia: Metodologia): Boolean

    /**
     *La funcion Borrar metodología borra una metodología del sistema por su identificador único.
     *
     * @param id_metodologia es el identificador único de la metodología que se va a borrar.
     * @return devuelve true si la eliminación fue exitosa, false en caso contrario.
     */
    fun borrarMetodologia(id_metodologia: Int): Boolean
}