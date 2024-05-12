package Familia

interface FamiliaDAO {
    fun buscarFamilia(id_familia: Int): Familia?
    fun sacarFamilia(): List<Familia>
    fun insertarFamilia(familia: Familia): Boolean
    fun modificarFamilia(familia: Familia): Boolean
    fun borrarFamilia(id_familia: Int): Boolean
}