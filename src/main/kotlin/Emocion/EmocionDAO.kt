package Emocion

/**
 * Interfaz para acceder a los datos de las emociones.
 *
 * @constructor Create empty Emocion d a o
 */
interface EmocionDAO {
    /**
     * La función emoción busca una emoción por su identificador unico
     *
     * @param id_emocion es el identificador único de la emoción a buscar.
     * @return La emoción encontrada, o null si no se encontró ninguna emoción con el ID especificado
     */
    fun buscarEmocion(id_emocion: Int): Emocion?

    /**
     * La función Sacar emociones Obtiene una lista de todas las emociones almacenadas
     *
     * @return Una lista de objetos Emocion
     */
    fun sacarEmociones(): List<Emocion>

    /**
     * La función Insertar emoción inserta una nueva emoción en la base de datos.
     *
     *@param emocion es la emoción que se va a insertar.
     *@return true si la inserción fue exitosa, false en caso contrario.
     */
    fun insertarEmocion(emocion: Emocion): Boolean

    /**
     * La funcion Modificar emocion modifica una emoción existente en la base de datos.
     *
     * @param emocion es emoción con los datos actualizados que se va a modificar.
     * @return true si la modificación fue exitosa, false en caso contrario.
     */
    fun modificarEmocion(emocion: Emocion): Boolean

    /**
     * La funcion Borrar emocion borra una emoción de la base de datos por su identificador único
     *
     * @param id_emocion es el identificador único de la emoción que se va a borrar.
     * @return true si la eliminación fue exitosa, false en caso contrario.
     */
    fun borrarEmocion(id_emocion: Int): Boolean
}