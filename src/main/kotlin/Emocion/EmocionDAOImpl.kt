package Emocion

import Base_de_Datos.ConexionBD

class EmocionDAOImpl: EmocionDAO {
    private val conexion = ConexionBD()
    override fun buscarEmocion(id_emocion: Int): Emocion? {
        conexion.conectar()
        val query = "SELECT * FROM EMOCION WHERE id_emocion = ?"
        val ps = conexion.getPreparedStatement(query)
        ps?.setInt(1, id_emocion)
        val rs = ps?.executeQuery()
        var emocion: Emocion? = null
        if (rs?.next() == true) {
            emocion = Emocion(rs.getInt("ID_EMOCION"), rs.getString("NOMBRE"))
        }
        ps?.close()
        conexion.desconectar()
        return emocion
    }

    override fun sacarEmociones(): List<Emocion> {
        conexion.conectar()
        val query = "SELECT * FROM EMOCION"
        val st = conexion.getStatement()
        val rs = st?.executeQuery(query)
        val emociones = mutableListOf<Emocion>()
        while (rs?.next() == true) {
            val emocion = Emocion(rs.getInt("ID_EMOCION"), rs.getString("NOMBRE"))
            emociones.add(emocion)
        }
        st?.close()
        conexion.desconectar()
        return emociones
    }

    override fun insertarEmocion(emocion: Emocion): Boolean {
        conexion.conectar()
        val query = "INSERT INTO EMOCION (NOMBRE) VALUES (?)"
        val ps = conexion.getPreparedStatement(query)
        ps?.setString(2, emocion.nombre)
        val result = ps?.executeUpdate()
        ps?.close()
        conexion.desconectar()
        return result == 1
    }

    override fun modificarEmocion(emocion: Emocion): Boolean {
        conexion.conectar()
        val query = "UPDATE EMOCION SET nombre = ? WHERE id_emocion = ?"
        val ps = conexion.getPreparedStatement(query)
        ps?.setInt(1, emocion.id_emocion)
        ps?.setString(2, emocion.nombre)
        val result = ps?.executeUpdate()
        ps?.close()
        conexion.desconectar()
        return result == 1
    }

    override fun borrarEmocion(id_emocion: Int): Boolean {
        conexion.conectar()
        val query = "DELETE FROM EMOCION WHERE id_emocion = ?"
        val ps = conexion.getPreparedStatement(query)
        ps?.setInt(1, id_emocion)
        val result = ps?.executeUpdate()
        ps?.close()
        conexion.desconectar()
        return result == 1
    }
}