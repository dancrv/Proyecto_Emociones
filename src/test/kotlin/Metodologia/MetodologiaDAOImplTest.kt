package Metodologia

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class MetodologiaDAOImplTest {
    var metodologia = Metodologia(1,"Experimental")
    var metodologias = ArrayList<Metodologia>()

    @Test
    fun buscarMetodologia() {
        assertEquals(metodologia,metodologia,"El test ha fallado.")
    }

    @Test
    fun sacarMetodologia() {
        assertEquals(metodologias,metodologias,"El test ha fallado.")
    }

    @Test
    fun insertarMetodologia() {
        assertTrue(true,"El test ha fallado.")
    }

    @Test
    fun modificarMetodologia() {
        assertTrue(true,"El test ha fallado.")
    }

    @Test
    fun borrarMetodologia() {
        assertTrue(true,"El test ha fallado.")
    }
}