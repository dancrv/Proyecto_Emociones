package Metodologia

interface MetodologiaDAO {
    fun buscarMetodologia(id_metodologia: Int): Metodologia?
    fun sacarMetodologia(): List<Metodologia>
    fun insertarMetodologia(metodologia: Metodologia): Boolean
    fun modificarMetodologia(metodologia: Metodologia): Boolean
    fun borrarMetodologia(id_metodologia: Int): Boolean
}