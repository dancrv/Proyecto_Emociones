package Grupo_Terapeuta

import BaseDatos.ConexionBD

class Grupo_TerapeutaDAOImpl: Grupo_TerapeutaDAO {
    private val conexion = ConexionBD()

    override fun buscarGrupo(id_grupo: Int): Grupo_Terapeuta? {
        conexion.conectar()
        val query = "SELECT * FROM GRUPO_TERAPEUTA WHERE id_grupo = ?"
        val ps = conexion.getPreparedStatement(query)
        ps?.setInt(1, id_grupo)
        val rs = ps?.executeQuery()
        var grupo: Grupo_Terapeuta? = null
        if (rs?.next() == true) {
            grupo = Grupo_Terapeuta(rs.getInt("ID_GRUPO"), rs.getInt("ID_TERAPEUTA"))
        }
        ps?.close()
        conexion.desconectar()
        return grupo
    }

    override fun sacarGrupo(): List<Grupo_Terapeuta> {
        conexion.conectar()
        val query = "SELECT * FROM GRUPO_TERAPEUTA"
        val st = conexion.getStatement()
        val rs = st?.executeQuery(query)
        val grupos = mutableListOf<Grupo_Terapeuta>()
        while (rs?.next() == true) {
            val grupo = Grupo_Terapeuta(rs.getInt("ID_GRUPO"), rs.getInt("ID_TERAPEUTA"))
            grupos.add(grupo)
        }
        st?.close()
        conexion.desconectar()
        return grupos
    }

    override fun insertarGrupo(grupo: Grupo_Terapeuta): Boolean {
        conexion.conectar()
        val query = "INSERT INTO GRUPO_TERAPEUTA (ID_TERAPEUTA) VALUES (?)"
        val ps = conexion.getPreparedStatement(query)
        //ps?.setInt(1, grupo.id_grupo)
        ps?.setInt(1, grupo.id_terapeuta)
        val result = ps?.executeUpdate()
        ps?.close()
        conexion.desconectar()
        return result == 1
    }

    override fun modificarGrupo(grupo: Grupo_Terapeuta): Boolean {
        conexion.conectar()
        val query = "UPDATE GRUPO_TERAPEUTA SET descripcion = ? WHERE id_grupo = ?"
        val ps = conexion.getPreparedStatement(query)
        ps?.setInt(1, grupo.id_grupo)
        ps?.setInt(2, grupo.id_terapeuta)
        val result = ps?.executeUpdate()
        ps?.close()
        conexion.desconectar()
        return result == 1
    }

    override fun borrarGrupo(id_grupo: Int): Boolean {
        conexion.conectar()
        val query = "DELETE FROM GRUPO_TERAPEUTA WHERE id_grupo = ?"
        val ps = conexion.getPreparedStatement(query)
        ps?.setInt(1, id_grupo)
        val result = ps?.executeUpdate()
        ps?.close()
        conexion.desconectar()
        return result == 1
    }
}