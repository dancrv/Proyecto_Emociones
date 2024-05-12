package Sesion

import Base_de_Datos.ConexionBD

class SesionDAOImpl: SesionDAO {

    private val conexion = ConexionBD()

    override fun buscarSesion(id_sesion: Int): Sesion? {
        conexion.conectar()
        val query = "SELECT * FROM SESION WHERE id_sesion = ?"
        val ps = conexion.getPreparedStatement(query)
        ps?.setInt(1, id_sesion)
        val rs = ps?.executeQuery()
        var sesion: Sesion? = null
        if (rs?.next() == true) {
            sesion = Sesion(rs.getInt("ID_SESION"), rs.getInt("ID_GRUPO"), rs.getInt("ID_FAMILIA"))
        }
        ps?.close()
        conexion.desconectar()
        return sesion
    }



    override fun sacarSesion(): List<Sesion> {
        conexion.conectar()
        val query = "SELECT * FROM SESION"
        val st = conexion.getStatement()
        val rs = st?.executeQuery(query)
        val sesiones = mutableListOf<Sesion>()
        while (rs?.next() == true) {
            val sesion = Sesion(rs.getInt("ID_SESION"), rs.getInt("ID_GRUPO"), rs.getInt("ID_FAMILIA"))
            sesiones.add(sesion)
        }
        st?.close()
        conexion.desconectar()
        return sesiones
    }

    override fun insertarSesion(sesion: Sesion): Boolean {
        conexion.conectar()
        val query = "INSERT INTO SESION (ID_GRUPO, ID_FAMILIA) VALUES (?, ?)"
        val ps = conexion.getPreparedStatement(query)
        //ps?.setInt(1, sesion.id_sesion)
        ps?.setInt(1, sesion.id_grupo)
        ps?.setInt(2, sesion.id_familia)
        val result = ps?.executeUpdate()
        ps?.close()
        conexion.desconectar()
        return result == 1
    }

    override fun modificarSesion(sesion: Sesion): Boolean {
        conexion.conectar()
        val query = "UPDATE SESION SET id_grupo, id_familia = ? WHERE id_sesion = ?"
        val ps = conexion.getPreparedStatement(query)
        ps?.setInt(1, sesion.id_sesion)
        ps?.setInt(2, sesion.id_grupo)
        ps?.setInt(3, sesion.id_familia)
        val result = ps?.executeUpdate()
        ps?.close()
        conexion.desconectar()
        return result == 1
    }

    override fun borrarSesion(id_sesion: Int): Boolean {
        conexion.conectar()
        val query = "DELETE FROM SESION WHERE id_sesion = ?"
        val ps = conexion.getPreparedStatement(query)
        ps?.setInt(1, id_sesion)
        val result = ps?.executeUpdate()
        ps?.close()
        conexion.desconectar()
        return result == 1
    }
}