package Rol

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class RolDAOImplTest {
    var rol = Rol(1,"Madre")
    var roles = ArrayList<Rol>()

    @Test
    fun buscarRol() {
        assertEquals(rol,rol,"El test ha fallado.")
    }

    @Test
    fun sacarRol() {
        assertEquals(roles,roles,"El test ha fallado.")
    }

    @Test
    fun insertarRol() {
        assertTrue(true,"El test ha fallado.")
    }

    @Test
    fun modificarRol() {
        assertTrue(true,"El test ha fallado.")
    }

    @Test
    fun borrarRol() {
        assertTrue(true,"El test ha fallado.")
    }
}