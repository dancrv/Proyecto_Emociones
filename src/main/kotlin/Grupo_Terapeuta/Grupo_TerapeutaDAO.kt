package Grupo_Terapeuta

/**
 * Interfaz para acceder a los datos de los grupos de terapeutas
 *
 * @constructor Create empty Grupo_terapeuta d a o
 */
interface Grupo_TerapeutaDAO {
    /**
     *La funcion Buscar Grupo busca un grupo de terapeutas por su identificador único.
     *
     * @param id_grupo es el identificador único del grupo de terapeutas a buscar.
     * @return El grupo de terapeutas encontrado, o null si no se encontró ninguno con el ID especificado.
     */
    fun buscarGrupo(id_grupo:Int): Grupo_Terapeuta?

    /**
     *La funcion Sacar Grupo obtiene una lista de todos los grupos de terapeutas almacenados.
     *
     * @return  devuelve un Grupo_Terapeuta.
     */
    fun sacarGrupo(): List<Grupo_Terapeuta>

    /**
     *La funcion Insertar grupo inserta un nuevo grupo de terapeutas en el sistema.
     *
     * @param grupo es el grupo de terapeutas que se va a insertar.
     * @return true si la inserción fue exitosa, false en caso contrario.
     */
    fun insertarGrupo(grupo: Grupo_Terapeuta): Boolean

    /**
     *La funcion Modificar Grupo modifica un grupo de terapeutas existente en el sistema.
     *
     * @param grupo es el grupo de terapeutas con los datos actualizados que se va a modificar.
     * @return true si la modificación fue exitosa, false en caso contrario.
     */
    fun modificarGrupo(grupo: Grupo_Terapeuta): Boolean

    /**
     *La funcion Borrar grupo borra un grupo de terapeutas del sistema por su identificador único.
     *
     * @param id_grupo es el identificador único del grupo de terapeutas que se va a borrar.
     * @return true si la eliminación fue exitosa, false en caso contrario.
     */
    fun borrarGrupo(id_grupo: Int): Boolean
}