package Individuo

/**
 * Interfaz para acceder a los datos de los individuos
 *
 * @constructor Create empty Individuo d a o
 */
interface IndividuoDAO {
    /**
     *La funcion Buscar individuo busca un individuo por su identificador único.
     *
     * @param id_individuo es el identificador único del individuo a buscar.
     * @return devuelve el individuo encontrado, o null si no se encontró ninguno con el ID especificado.
     */
    fun buscarIndividuo(id_individuo: Int): Individuo?

    /**
     *La funcion Sacar individuo obtiene una lista de todos los individuos almacenados.
     *
     * @return devuelve una lista de objetos Individuo.
     */
    fun sacarIndividuo(): List<Individuo>

    /**
     *La funcion Insertar individuo inserta un nuevo individuo en el sistema.
     *
     * @param individuo es el individuo que se va a insertar.
     * @return devuelve true si la inserción fue exitosa, false en caso contrario.
     */
    fun insertarIndividuo(individuo: Individuo): Boolean

    /**
     *La funcion Modificar individuo modifica un individuo existente en el sistema.
     *
     * @param individuo es el individuo con los datos actualizados que se va a modificar.
     * @return devuelve true si la modificación fue exitosa, false en caso contrario.
     */
    fun modificarIndividuo(individuo: Individuo): Boolean

    /**
     *La funcion Borrar individuo borra un individuo del sistema por su identificador único.
     *
     * @param id_individuo es el identificador único del individuo que se va a borrar.
     * @return devuelve true si la eliminación fue exitosa, false en caso contrario.
     */
    fun borrarIndividio(id_individuo: Int): Boolean
}