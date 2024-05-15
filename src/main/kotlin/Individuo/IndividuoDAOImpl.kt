package Individuo

import Base_de_Datos.ConexionBD

/**
 * Implementación de la interfaz IndividuoDAO para realizar operaciones
 * crear, leer, actualizar y borar en la tabla INDIVIDUO de la base de datos.
 *
 * @constructor Create empty Individuo d a o impl
 */
class IndividuoDAOImpl: IndividuoDAO {

    private val conexion = ConexionBD()
    override fun buscarIndividuo(id_individuo: Int): Individuo? {
        conexion.conectar()
        val query = "SELECT * FROM INDIVIDUO WHERE id_individuo = ?"
        val ps = conexion.getPreparedStatement(query)
        ps?.setInt(1, id_individuo)
        val rs = ps?.executeQuery()
        var individuo: Individuo? = null
        if (rs?.next() == true) {
            individuo = Individuo(rs.getInt("ID_INDIVIDUO"), rs.getString("NOMBRE"), rs.getString("APELLIDO1"), rs.getString("APELLIDO2"), rs.getInt("ID_ROL"), rs.getInt("ID_FAMILIA"))
        }
        ps?.close()
        conexion.desconectar()
        return individuo

    }

    override fun sacarIndividuo(): List<Individuo> {
        conexion.conectar()
        val query = "SELECT * FROM INDIVIDUO"
        val st = conexion.getStatement()
        val rs = st?.executeQuery(query)
        val individuos = mutableListOf<Individuo>()
        while (rs?.next() == true) {
            val individuo = Individuo(rs.getInt("ID_INDIVIDUO"), rs.getString("NOMBRE"), rs.getString("APELLIDO1"), rs.getString("APELLIDO2"), rs.getInt("ID_ROL"), rs.getInt("ID_FAMILIA"))
            individuos.add(individuo)
        }
        st?.close()
        conexion.desconectar()
        return individuos
    }

    override fun insertarIndividuo(individuo: Individuo): Boolean {
        conexion.conectar()
        val query = "INSERT INTO INDIVIDUO (NOMBRE, APELLIDO1, APELLIDO2, ID_ROL, ID_FAMILIA) VALUES (?, ?, ?, ?, ?)"
        val ps = conexion.getPreparedStatement(query)
        ps?.setString(1, individuo.nombre)
        ps?.setString(2, individuo.apellido1)
        ps?.setString(3, individuo.apellido2)
        ps?.setInt(4, individuo.id_rol)
        ps?.setInt(5, individuo.id_familia)
        val result = ps?.executeUpdate()
        ps?.close()
        conexion.desconectar()
        return result == 1
    }

    override fun modificarIndividuo(individuo: Individuo): Boolean {
        var individuoBuscado =buscarIndividuo(individuo.id_individuo)
        conexion.conectar()
        var result:Int? = null
        if (individuoBuscado != null){
            val query = "UPDATE INDIVIDUO SET nombre = ?,apellido1 = ?,apellido2 = ?,id_rol =?, id_familia = ? WHERE id_individuo = ?"
            val ps = conexion.getPreparedStatement(query)
            ps?.setString(1, individuo.nombre)
            ps?.setString(2, individuo.apellido1)
            ps?.setString(3, individuo.apellido2)
            ps?.setInt(4, individuo.id_rol)
            ps?.setInt(5, individuo.id_familia)
            ps?.setInt(6, individuoBuscado.id_individuo)
            result = ps?.executeUpdate()
            ps?.close()
        }
        conexion.desconectar()
        return result == 1
    }

    override fun borrarIndividio(id_individuo: Int): Boolean {
        conexion.conectar()
        val query = "DELETE FROM INDIVIDUO WHERE id_individuo = ?"
        val ps = conexion.getPreparedStatement(query)
        ps?.setInt(1, id_individuo)
        val result = ps?.executeUpdate()
        ps?.close()
        conexion.desconectar()
        return result == 1
    }
}