package Grupo_Terapeuta

interface Grupo_TerapeutaDAO {
    fun buscarGrupo(id_grupo:Int): Grupo_Terapeuta?
    fun sacarGrupo(): List<Grupo_Terapeuta>
    fun insertarGrupo(grupo: Grupo_Terapeuta): Boolean
    fun modificarGrupo(grupo: Grupo_Terapeuta): Boolean
    fun borrarGrupo(id_grupo: Int): Boolean
}