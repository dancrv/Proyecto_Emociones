package Familia

import BaseDatos.ConexionBD

/**
 * Implementación de la interfaz FamiliaDAO para gestionar operaciones relacionadas con familias en la base de datos.
 *
 * @constructor Create empty Familia d a o impl
 */
class FamiliaDAOImpl: FamiliaDAO {
    private val conexion = ConexionBD()

    override fun buscarFamilia(id_familia: Int): Familia? {
        conexion.conectar()
        val query = "SELECT * FROM FAMILIA WHERE id_familia = ?"
        val ps = conexion.getPreparedStatement(query)
        ps?.setInt(1, id_familia)
        val rs = ps?.executeQuery()
        var familia: Familia? = null
        if (rs?.next() == true) {
            familia = Familia(rs.getInt("ID_FAMILIA"), rs.getString("DESCRIPCION"))
        }
        ps?.close()
        conexion.desconectar()
        return familia
    }

    override fun sacarFamilia(): List<Familia> {
        conexion.conectar()
        val query = "SELECT * FROM FAMILIA"
        val st = conexion.getStatement()
        val rs = st?.executeQuery(query)
        val familias = mutableListOf<Familia>()
        while (rs?.next() == true) {
            val familia = Familia(rs.getInt("ID_FAMILIA"), rs.getString("DESCRIPCION"))
            familias.add(familia)
        }
        st?.close()
        conexion.desconectar()
        return familias
    }

    override fun insertarFamilia(familia: Familia): Boolean {
        conexion.conectar()
        val query = "INSERT INTO FAMILIA (ID_FAMILIA, DESCRIPCION) VALUES (?, ?)"
        val ps = conexion.getPreparedStatement(query)
        ps?.setInt(1, familia.id_familia)
        ps?.setString(2, familia.descripcion)
        val result = ps?.executeUpdate()
        ps?.close()
        conexion.desconectar()
        return result == 1
    }

    override fun modificarFamilia(familia: Familia): Boolean {
        conexion.conectar()
        val query = "UPDATE FAMILIA SET descripcion = ? WHERE id_familia = ?"
        val ps = conexion.getPreparedStatement(query)
        ps?.setString(1, familia.descripcion)
        ps?.setInt(2, familia.id_familia)
        val result = ps?.executeUpdate()
        ps?.close()
        conexion.desconectar()
        return result == 1

    }

    override fun borrarFamilia(id_familia: Int): Boolean {
        conexion.conectar()
        val query = "DELETE FROM FAMILIA WHERE id_familia = ?"
        val ps = conexion.getPreparedStatement(query)
        ps?.setInt(1, id_familia)
        val result = ps?.executeUpdate()
        ps?.close()
        conexion.desconectar()
        return result == 1
    }
}