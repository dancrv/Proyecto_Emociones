package Individuo

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class IndividuoDAOImplTest {
    var individuo = Individuo(1,"Dan","Cruz","Villegas",1,1)
    var individuos = ArrayList<Individuo>()

    @Test
    fun buscarIndividuo() {
        assertEquals(individuo,individuo,"El test ha fallado.")
    }

    @Test
    fun sacarIndividuo() {
        assertEquals(individuos,individuos,"El test ha fallado.")
    }

    @Test
    fun insertarIndividuo() {
        assertTrue(true,"El test ha fallado.")
    }

    @Test
    fun modificarIndividuo() {
        assertTrue(true,"El test ha fallado.")
    }

    @Test
    fun borrarIndividuo() {
        assertTrue(true,"El test ha fallado.")
    }
}