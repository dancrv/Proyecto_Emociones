package Individuo

interface IndividuoDAO {
    fun buscarIndividuo(id_individuo: Int): Individuo?
    fun sacarIndividuo(): List<Individuo>
    fun insertarIndividuo(individuo: Individuo): Boolean
    fun modificarIndividuo(individuo: Individuo): Boolean
    fun borrarIndividio(id_individuo: Int): Boolean
}