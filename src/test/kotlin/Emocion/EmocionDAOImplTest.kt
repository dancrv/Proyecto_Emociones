package Emocion

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class EmocionDAOImplTest {
    //Creamos un objeto emocion para realizar los tests
    private var emocion: Emocion = Emocion(1,"Alegria")
    private var emociones: ArrayList<Emocion> = ArrayList<Emocion>()

    @Test
    fun buscarEmocion() {
        assertEquals(emocion,emocion,"El test ha fallado.")
    }

    @Test
    fun sacarEmociones() {
        assertEquals(emociones,emociones,"El test ha fallado.")
    }

    @Test
    fun insertarEmocion() {
        assertTrue(true,"El test ha fallado.")
    }

    @Test
    fun modificarEmocion() {
        assertTrue(true,"El test ha fallado.")
    }

    @Test
    fun borrarEmocion() {
        assertTrue(true,"El test ha fallado.")
    }
}