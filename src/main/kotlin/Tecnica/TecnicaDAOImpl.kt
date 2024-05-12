package Tecnica

import Base_de_Datos.ConexionBD

class TecnicaDAOImpl: TecnicaDAO {

    private val conexion = ConexionBD()

    override fun buscarTecnica(id_tecnica: Int): Tecnica? {
        conexion.conectar()
        val query = "SELECT * FROM TECNICA WHERE id_tecnica = ?"
        val ps = conexion.getPreparedStatement(query)
        ps?.setInt(1, id_tecnica)
        val rs = ps?.executeQuery()
        var tecnica: Tecnica? = null
        if (rs?.next() == true) {
            tecnica = Tecnica(rs.getInt("ID_TECNICA"), rs.getString("DESCRIPCION"), rs.getInt("ID_METODOLOGIA"))
        }
        ps?.close()
        conexion.desconectar()
        return tecnica
    }



    override fun sacarTecnica(): List<Tecnica> {
        conexion.conectar()
        val query = "SELECT * FROM TECNICA"
        val st = conexion.getStatement()
        val rs = st?.executeQuery(query)
        val tecnicas = mutableListOf<Tecnica>()
        while (rs?.next() == true) {
            val tecnica = Tecnica(rs.getInt("ID_TECNICA"), rs.getString("DESCRIPCION"), rs.getInt("ID_METODOLOGIA"))
            tecnicas.add(tecnica)
        }
        st?.close()
        conexion.desconectar()
        return tecnicas
    }

    override fun insertarTecnica(tecnica: Tecnica): Boolean {
        conexion.conectar()
        val query = "INSERT INTO TECNICA (DESCRIPCION, ID_METODOLOGIA) VALUES (?, ?)"
        val ps = conexion.getPreparedStatement(query)
        //ps?.setInt(1, tecnica.id_tecnica)
        ps?.setString(1, tecnica.descripcion)
        ps?.setInt(2, tecnica.id_metodologia)
        val result = ps?.executeUpdate()
        ps?.close()
        conexion.desconectar()
        return result == 1
    }

    override fun modificarTecnica(tecnica: Tecnica): Boolean {
        conexion.conectar()
        val query = "UPDATE TECNICA SET descripcion, id_metodologia = ? WHERE id_tecnica = ?"
        val ps = conexion.getPreparedStatement(query)
        ps?.setInt(1, tecnica.id_tecnica)
        ps?.setString(2, tecnica.descripcion)
        ps?.setInt(3, tecnica.id_metodologia)
        val result = ps?.executeUpdate()
        ps?.close()
        conexion.desconectar()
        return result == 1
    }

    override fun borrarTecnica(id_tecnica: Int): Boolean {
        conexion.conectar()
        val query = "DELETE FROM TECNICA WHERE id_tecnica = ?"
        val ps = conexion.getPreparedStatement(query)
        ps?.setInt(1, id_tecnica)
        val result = ps?.executeUpdate()
        ps?.close()
        conexion.desconectar()
        return result == 1
    }
}