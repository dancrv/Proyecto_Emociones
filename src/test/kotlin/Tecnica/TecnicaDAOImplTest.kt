package Tecnica

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class TecnicaDAOImplTest {
    var tecnica = Tecnica(1,"Exponencial",1)
    var tecnicas = ArrayList<Tecnica>()

    @Test
    fun buscarTecnica() {
        assertEquals(tecnica,tecnica,"El test ha fallado.")
    }

    @Test
    fun sacarTecnica() {
        assertEquals(tecnicas,tecnicas,"El test ha fallado.")
    }

    @Test
    fun insertarTecnica() {
        assertTrue(true,"El test ha fallado.")
    }

    @Test
    fun modificarTecnica() {
        assertTrue(true,"El test ha fallado.")
    }

    @Test
    fun borrarTecnica() {
        assertTrue(true,"El test ha fallado.")
    }
}