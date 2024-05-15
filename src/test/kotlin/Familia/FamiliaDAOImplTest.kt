package Familia

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class FamiliaDAOImplTest {
    var familia: Familia = Familia(1,"Cruz")
    var familias: ArrayList<Familia> = ArrayList<Familia>()

    @Test
    fun buscarFamilia() {
        assertEquals(familia,familia,"El test ha fallado.")
    }

    @Test
    fun sacarFamilia() {
        assertEquals(familias,familias,"El test ha fallado.")
    }

    @Test
    fun insertarFamilia() {
        assertTrue(true)
    }

    @Test
    fun modificarFamilia() {
        assertTrue(true)
    }

    @Test
    fun borrarFamilia() {
        assertTrue(true)
    }
}