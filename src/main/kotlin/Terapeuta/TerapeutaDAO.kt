package Terapeuta

interface TerapeutaDAO {
    fun buscarTerapeuta(id_terapeuta: Int): Terapeuta?
    fun sacarTerapeuta(): List<Terapeuta>
    fun insertarTerapeuta(terapeuta: Terapeuta): Boolean
    fun modificarTerapeuta(terapeuta: Terapeuta): Boolean
    fun borrarTerapeuta(id_terapeuta: Int): Boolean
}