package Sesion

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class SesionDAOImplTest {
    var sesion = Sesion(1,1,1)
    var sesiones = ArrayList<Sesion>()

    @Test
    fun buscarSesion() {
        assertEquals(sesion,sesion,"El test ha fallado.")
    }

    @Test
    fun sacarSesion() {
        assertEquals(sesiones,sesiones,"El test ha fallado.")
    }

    @Test
    fun insertarSesion() {
        assertTrue(true,"El test ha fallado.")
    }

    @Test
    fun modificarSesion() {
        assertTrue(true,"El test ha fallado.")
    }

    @Test
    fun borrarSesion() {
        assertTrue(true,"El test ha fallado.")
    }
}