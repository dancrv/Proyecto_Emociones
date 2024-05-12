package Metodologia

import Base_de_Datos.ConexionBD

class MetodologiaDAOImpl: MetodologiaDAO {
    private val conexion = ConexionBD()


    override fun buscarMetodologia(id_metodologia: Int): Metodologia? {
        conexion.conectar()
        val query = "SELECT * FROM METODOLOGIA WHERE id_metodologia = ?"
        val ps = conexion.getPreparedStatement(query)
        ps?.setInt(1, id_metodologia)
        val rs = ps?.executeQuery()
        var metodologia: Metodologia? = null
        if (rs?.next() == true) {
            metodologia = Metodologia(rs.getInt("ID_METODOLOGIA"), rs.getString("NOMBRE"))
        }
        ps?.close()
        conexion.desconectar()
        return metodologia
    }



    override fun sacarMetodologia(): List<Metodologia> {
        conexion.conectar()
        val query = "SELECT * FROM METODOLOGIA"
        val st = conexion.getStatement()
        val rs = st?.executeQuery(query)
        val metodologias = mutableListOf<Metodologia>()
        while (rs?.next() == true) {
            val metodologia = Metodologia(rs.getInt("ID_METODOLOGIA"), rs.getString("NOMBRE"))
            metodologias.add(metodologia)
        }
        st?.close()
        conexion.desconectar()
        return metodologias
    }

    override fun insertarMetodologia(metodologia: Metodologia): Boolean {
        conexion.conectar()
        val query = "INSERT INTO METODOLOGIA (NOMBRE) VALUES (?)"
        val ps = conexion.getPreparedStatement(query)
        //ps?.setInt(1, metodologia.id_metodologia)
        ps?.setString(1, metodologia.nombre)
        val result = ps?.executeUpdate()
        ps?.close()
        conexion.desconectar()
        return result == 1
    }

    override fun modificarMetodologia(metodologia: Metodologia): Boolean {
        var metodologiaBuscada =buscarMetodologia(metodologia.id_metodologia)
        conexion.conectar()
        var result:Int? = null
        if (metodologiaBuscada != null){
            val query = "UPDATE METODOLOGIA SET nombre = ? WHERE id_metodologia = ?"
            val ps = conexion.getPreparedStatement(query)
            ps?.setString(1, metodologia.nombre)
            ps?.setInt(2, metodologia.id_metodologia)
            result = ps?.executeUpdate()
            ps?.close()
        }
        conexion.desconectar()
        return result == 1
    }

    override fun borrarMetodologia(id_metodologia: Int): Boolean {
        conexion.conectar()
        val query = "DELETE FROM METODOLOGIA WHERE id_metodologia = ?"
        val ps = conexion.getPreparedStatement(query)
        ps?.setInt(1, id_metodologia)
        val result = ps?.executeUpdate()
        ps?.close()
        conexion.desconectar()
        return result == 1
    }
}