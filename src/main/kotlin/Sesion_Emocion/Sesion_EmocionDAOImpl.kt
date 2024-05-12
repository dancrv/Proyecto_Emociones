package Sesion_Emocion

import Base_de_Datos.ConexionBD

class Sesion_EmocionDAOImpl: Sesion_EmocionDAO {
    private val conexion = ConexionBD()


    override fun buscarSesionEmocion(id_sesion: Int, id_emocion: Int): Sesion_Emocion? {
        conexion.conectar()
        val query = "SELECT * FROM SESION_EMOCION WHERE id_sesion = ? AND id_emocion = ?"
        val ps = conexion.getPreparedStatement(query)
        ps?.setInt(1, id_sesion)
        ps?.setInt(2, id_emocion)
        val rs = ps?.executeQuery()
        var sesionEmo: Sesion_Emocion? = null
        if (rs?.next() == true) {
            sesionEmo = Sesion_Emocion(rs.getInt("ID_SESION"), rs.getInt("ID_EMOCION"))
        }
        ps?.close()
        conexion.desconectar()
        return sesionEmo
    }



    override fun sacarSesionEmocion(): List<Sesion_Emocion> {
        conexion.conectar()
        val query = "SELECT * FROM SESION_EMOCION"
        val st = conexion.getStatement()
        val rs = st?.executeQuery(query)
        val sesionesEmo = mutableListOf<Sesion_Emocion>()
        while (rs?.next() == true) {
            val sesionEmo = Sesion_Emocion(rs.getInt("ID_SESION"), rs.getInt("ID_EMOCION"))
            sesionesEmo.add(sesionEmo)
        }
        st?.close()
        conexion.desconectar()
        return sesionesEmo
    }

    override fun insertarSesionEmo(sesionEmo: Sesion_Emocion): Boolean {
        conexion.conectar()
        val query = "INSERT INTO SESION_EMOCION (ID_SESION, ID_EMOCION) VALUES (?, ?)"
        val ps = conexion.getPreparedStatement(query)
        ps?.setInt(1, sesionEmo.id_sesion)
        ps?.setInt(2, sesionEmo.id_emocion)
        val result = ps?.executeUpdate()
        ps?.close()
        conexion.desconectar()
        return result == 1
    }

    override fun modificarSesionEmo(sesionEmo: Sesion_Emocion): Boolean {
        conexion.conectar()
        val query = "UPDATE SESION_EMOCION SET id_sesion = ?, id_emocion = ? WHERE id_sesion = ? OR id_emocion = ?"
        val ps = conexion.getPreparedStatement(query)
        ps?.setInt(1, sesionEmo.id_sesion)
        ps?.setInt(2, sesionEmo.id_emocion)
        val result = ps?.executeUpdate()
        ps?.close()
        conexion.desconectar()
        return result == 1
    }

    override fun borrarSesionEmo(id_sesion: Int, id_emocion: Int): Boolean {
        conexion.conectar()
        val query = "DELETE FROM SESION_EMOCION WHERE id_familia = ?"
        val ps = conexion.getPreparedStatement(query)
        ps?.setInt(1, id_sesion)
        ps?.setInt(1, id_emocion)
        val result = ps?.executeUpdate()
        ps?.close()
        conexion.desconectar()
        return result == 1
    }
}