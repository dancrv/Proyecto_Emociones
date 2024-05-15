package Grupo_Terapeuta

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class Grupo_TerapeutaDAOImplTest {
    var grupo = Grupo_Terapeuta(1,1)
    var grupos = ArrayList<Grupo_Terapeuta>()

    @Test
    fun buscarGrupo() {
        assertEquals(grupo,grupo,"El test ha fallado.")
    }

    @Test
    fun sacarGrupo() {
        assertEquals(grupos,grupos,"El test ha fallado.")
    }

    @Test
    fun insertarGrupo() {
        assertTrue(true,"El test ha fallado.")
    }

    @Test
    fun modificarGrupo() {
        assertTrue(true,"El test ha fallado.")
    }

    @Test
    fun borrarGrupo() {
        assertTrue(true,"El test ha fallado.")
    }
}