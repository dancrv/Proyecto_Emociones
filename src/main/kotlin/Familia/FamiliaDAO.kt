package Familia

/**
 * Interfaz para acceder a los datos de las familias
 *
 * @constructor Create empty Familia d a o
 */
interface FamiliaDAO {
    /**
     * La funcion Buscar familia busca una familia por su identificador único.
     *
     * @param id_familia es el identificador único de la familia a buscar.
     * @return devuelve La familia encontrada, o null si no se encontró ninguna familia con el ID especificado.
     */
    fun buscarFamilia(id_familia: Int): Familia?

    /**
     * La funcion Sacar familia obtiene una lista de todas las familias almacenadas.
     *
     * @return devuelve una lista de familias
     */
    fun sacarFamilia(): List<Familia>

    /**
     * La funcion Insertar familia inserta una nueva familia en el sistema
     *
     * @param familia es la famlia que se va a insertar
     * @return true si la inserción fue exitosa, false en caso contrario
     */
    fun insertarFamilia(familia: Familia): Boolean

    /**
     * La funcion Modificar familia modifica una familia existente en el sistema
     *
     * @param familia es la familia con los datos actualizados que se va a modificar
     * @return true si la modificación fue exitosa, false en caso contrario
     */
    fun modificarFamilia(familia: Familia): Boolean

    /**
     *La funcion Borrar familia borra una familia del sistema por su identificador único
     *
     * @param id_familia es el identificador único de la familia que se va a borrar
     * @return true si la eliminación fue exitosa, false en caso contrario
     */
    fun borrarFamilia(id_familia: Int): Boolean
}