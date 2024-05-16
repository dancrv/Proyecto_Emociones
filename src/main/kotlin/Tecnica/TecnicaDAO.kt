package Tecnica

/**
 * Interfaz para acceder a los datos de las técnicas
 *
 * @constructor Create empty Tecnica d a o
 */
interface TecnicaDAO {
    /**
     *La funcion Buscar Tecnica busca una técnica por su identificador único.
     *
     * @param id_tecnica es el identificador único de la técnica a buscar.
     * @return devuelve la técnica encontrada, o null si no se encontró ninguna con el ID especificado.
     */
    fun buscarTecnica(id_tecnica: Int): Tecnica?

    /**
     *La funcion Sacar Tecnica obtiene una lista de todas las técnicas almacenadas.
     *
     * @return devuelve los objetos Tecnica.
     */
    fun sacarTecnica(): List<Tecnica>

    /**
     *La funcion Insertar tecnica inserta una nueva técnica en el sistema.
     *
     * @param tecnica es la técnica que se va a insertar.
     * @return devuelve true si la inserción fue exitosa, false en caso contrario.
     */
    fun insertarTecnica(tecnica: Tecnica): Boolean

    /**
     *La funcion Modificar Tecnica modifica una técnica existente en el sistema.
     *
     * @param tecnica es la tecnica con los datos actualizados que se va a modificar
     * @return devuelve true si la modificacion fue exitosa, false en caso contrario
     */
    fun modificarTecnica(tecnica: Tecnica): Boolean

    /**
     *La funcion Borrar Tecnica borra una técnica del sistema por su identificador único.
     *
     * @param id_tecnica es el identificador único de la técnica que se va a borrar.
     * @return devuelve true si la eliminación fue exitosa, false en caso contrario.
     */
    fun borrarTecnica(id_tecnica: Int): Boolean
}