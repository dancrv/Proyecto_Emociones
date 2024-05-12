package Terapeuta

import Base_de_Datos.ConexionBD

class TerapeutaDAOImpl: TerapeutaDAO {

    private val conexion = ConexionBD()

    override fun buscarTerapeuta(id_terapeuta: Int): Terapeuta? {
        conexion.conectar()
        val query = "SELECT * FROM TERAPEUTA WHERE id_terapeuta = ?"
        val ps = conexion.getPreparedStatement(query)
        ps?.setInt(1, id_terapeuta)
        val rs = ps?.executeQuery()
        var terapeuta: Terapeuta? = null
        if (rs?.next() == true) {
            val terapeuta = Terapeuta(rs.getInt("ID_TERAPEUTA"), rs.getString("NOMBRE"), rs.getString("APELLIDO1"), rs.getString("APELLIDO2"), rs.getInt("ID_METODOLOGIA"))
        }
        ps?.close()
        conexion.desconectar()
        return terapeuta
    }



    override fun sacarTerapeuta(): List<Terapeuta> {
        conexion.conectar()
        val query = "SELECT * FROM TERAPEUTA"
        val st = conexion.getStatement()
        val rs = st?.executeQuery(query)
        val terapeutas = mutableListOf<Terapeuta>()
        while (rs?.next() == true) {
            val terapeuta = Terapeuta(rs.getInt("ID_TERAPEUTA"), rs.getString("NOMBRE"), rs.getString("APELLIDO1"), rs.getString("APELLIDO2"), rs.getInt("ID_METODOLOGIA"))
            terapeutas.add(terapeuta)
        }
        st?.close()
        conexion.desconectar()
        return terapeutas
    }

    override fun insertarTerapeuta(terapeuta: Terapeuta): Boolean {
        conexion.conectar()
        val query = "INSERT INTO TERAPEUTA (NOMBRE, APELLIDO1, APELLIDO2, ID_METODOLOGIA) VALUES (?, ?, ?, ?)"
        val ps = conexion.getPreparedStatement(query)
        //ps?.setInt(1, terapeuta.id_terapeuta)
        ps?.setString(1, terapeuta.nombre)
        ps?.setString(2, terapeuta.apellido1)
        ps?.setString(3, terapeuta.apellido2)
        ps?.setInt(4, terapeuta.id_metodologia)
        val result = ps?.executeUpdate()
        ps?.close()
        conexion.desconectar()
        return result == 1
    }

    override fun modificarTerapeuta(terapeuta: Terapeuta): Boolean {
        conexion.conectar()
        val query = "UPDATE TERAPEUTA SET nombre, apellido1, apellido2, id_metodologia = ? WHERE id_terapeuta = ?"
        val ps = conexion.getPreparedStatement(query)
        ps?.setInt(1, terapeuta.id_terapeuta)
        ps?.setString(2, terapeuta.nombre)
        ps?.setString(3, terapeuta.apellido1)
        ps?.setString(4, terapeuta.apellido2)
        ps?.setInt(5, terapeuta.id_metodologia)
        val result = ps?.executeUpdate()
        ps?.close()
        conexion.desconectar()
        return result == 1

    }

    override fun borrarTerapeuta(id_terapeuta: Int): Boolean {
        conexion.conectar()
        val query = "DELETE FROM TERAPEUTA WHERE id_terapeuta = ?"
        val ps = conexion.getPreparedStatement(query)
        ps?.setInt(1, id_terapeuta)
        val result = ps?.executeUpdate()
        ps?.close()
        conexion.desconectar()
        return result == 1
    }
}