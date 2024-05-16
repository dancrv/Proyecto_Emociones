package Sesion_Emocion

/**
 * Interfaz para acceder a los datos de las sesiones de emociones.
 *
 * @constructor Create empty Sesion_emocion d a o
 */
interface Sesion_EmocionDAO {
    /**
     *La funcion Buscar Sesion Emocion busca una sesión de emoción por los identificadores únicos de sesión y emoción.
     *
     * @param id_sesion es el identificador único de la sesión.
     * @param id_emocion es el identificador único de la emoción.
     * @return devuelve La sesión de emoción encontrada, o null si no se encontró ninguna con los IDs especificados.
     */
    fun buscarSesionEmocion(id_sesion: Int, id_emocion: Int): Sesion_Emocion?

    /**
     *La funcion Sacar Sesion Emocion obtiene una lista de todas las sesiones de emociones almacenadas.
     *
     * @return devuelve una Sesion_Emocion.
     */
    fun sacarSesionEmocion(): List<Sesion_Emocion>

    /**
     *La funcion Insertar Sesion Emo inserta una nueva sesión de emoción en el sistema.
     *
     * @param sesionEmo es la sesión de emoción que se va a insertar.
     * @return devuelve true si la inserción fue exitosa, false en caso contrario.
     */
    fun insertarSesionEmo(sesionEmo: Sesion_Emocion): Boolean

    /**
     *La funcion Modificar Sesion Emo modifica una sesión de emoción existente en el sistema.
     *
     * @param sesionEmo es la sesión de emoción con los datos actualizados que se va a modificar.
     * @return devuelve true si la modificación fue exitosa, false en caso contrario.
     */
    fun modificarSesionEmo(sesionEmo: Sesion_Emocion): Boolean

    /**
     *La funcion Borrar Sesion Emo borra una sesión de emoción del sistema por los identificadores únicos de sesión y emoción.
     *
     * @param id_sesion es el identificador único de la sesión.
     * @param id_emocion es el identificador único de la emoción.
     * @return devuelve true si la eliminación fue exitosa, false en caso contrario.
     */
    fun borrarSesionEmo(id_sesion: Int, id_emocion:Int): Boolean
}