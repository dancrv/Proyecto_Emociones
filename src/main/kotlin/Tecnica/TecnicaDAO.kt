package Tecnica

interface TecnicaDAO {
    fun buscarTecnica(id_tecnica: Int): Tecnica?
    fun sacarTecnica(): List<Tecnica>
    fun insertarTecnica(tecnica: Tecnica): Boolean
    fun modificarTecnica(tecnica: Tecnica): Boolean
    fun borrarTecnica(id_tecnica: Int): Boolean
}