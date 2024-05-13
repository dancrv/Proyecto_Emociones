package BaseDatos

import java.sql.*

/**
 * ConexionBD Es una clase para crear la base de datos
 *
 * @constructor Create empty Conexion b d
 */
class ConexionBD {
    val url = "jdbc:mysql://localhost/emociones"
    val user = "root"
    val password = ""
    var conn: Connection? = null

    /**
     * La clase conectar, conecta con la base de datos
     *
     */
    fun conectar() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver")
            conn = DriverManager.getConnection(url, user, password)
        } catch (e: SQLException) {
            e.printStackTrace()
        } catch (e: ClassNotFoundException) {
            e.printStackTrace()
        }
    }

    /**
     * La clase desconectae nos desconecta de la base de datos
     *
     */
    fun desconectar() {
        try {
            conn?.close()
        } catch (e: SQLException) {
            e.printStackTrace()
        }
    }

    /**
     * Get statement
     *
     * @return
     */
    fun getStatement(): Statement? {
        return conn?.createStatement()
    }

    /**
     * Get prepared statement
     *
     * @param sql
     * @return
     */
    fun getPreparedStatement(sql: String): PreparedStatement? {
        return conn?.prepareStatement(sql)
    }
}