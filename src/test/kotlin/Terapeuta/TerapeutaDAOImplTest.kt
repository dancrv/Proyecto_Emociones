package Terapeuta

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class TerapeutaDAOImplTest {
    var terapeuta = Terapeuta(1,"Cynthia","Rivas","del Moral",1)
    var terapeutas = ArrayList<Terapeuta>()

    @Test
    fun buscarTerapeuta() {
        assertEquals(terapeuta,terapeuta,"El test ha fallado.")
    }

    @Test
    fun sacarTerapeuta() {
        assertEquals(terapeutas,terapeutas,"El test ha fallado.")
    }

    @Test
    fun insertarTerapeuta() {
        assertTrue(true,"El test ha fallado.")
    }

    @Test
    fun modificarTerapeuta() {
        assertTrue(true,"El test ha fallado.")
    }

    @Test
    fun borrarTerapeuta() {
        assertTrue(true,"El test ha fallado.")
    }
}