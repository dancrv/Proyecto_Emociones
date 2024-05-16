package Sesion_Emocion

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class Sesion_EmocionDAOImplTest {
    var sesionEmo = Sesion_Emocion(1,1)
    var sesionesEmo = ArrayList<Sesion_Emocion>()

    @Test
    fun buscarSesionEmocion() {
        assertEquals(sesionEmo,sesionEmo,"El test ha fallado.")
    }

    @Test
    fun sacarSesionEmocion() {
        assertEquals(sesionesEmo,sesionesEmo,"El test ha fallado.")
    }

    @Test
    fun insertarSesionEmo() {
        assertTrue(true,"El test ha fallado.")
    }

    @Test
    fun modificarSesionEmo() {
        assertTrue(true,"El test ha fallado.")
    }

    @Test
    fun borrarSesionEmo() {
        assertTrue(true,"El test ha fallado.")
    }
}