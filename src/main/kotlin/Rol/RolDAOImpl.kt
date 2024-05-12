package Rol

import Base_de_Datos.ConexionBD

class RolDAOImpl: RolDAO {

    private val conexion = ConexionBD()

    override fun buscarRol(id_rol: Int): Rol? {
        conexion.conectar()
        val query = "SELECT * FROM ROL WHERE id_rol = ?"
        val ps = conexion.getPreparedStatement(query)
        ps?.setInt(1, id_rol)
        val rs = ps?.executeQuery()
        var rol: Rol? = null
        if (rs?.next() == true) {
            rol = Rol(rs.getInt("ID_ROL"), rs.getString("DESCRIPCION"))
        }
        ps?.close()
        conexion.desconectar()
        return rol
    }



    override fun sacarRol(): List<Rol> {
        conexion.conectar()
        val query = "SELECT * FROM ROL"
        val st = conexion.getStatement()
        val rs = st?.executeQuery(query)
        val roles = mutableListOf<Rol>()
        while (rs?.next() == true) {
            val rol = Rol(rs.getInt("ID_ROL"), rs.getString("DESCRIPCION"))
            roles.add(rol)
        }
        st?.close()
        conexion.desconectar()
        return roles
    }

    override fun insertarRol(rol: Rol): Boolean {
        conexion.conectar()
        val query = "INSERT INTO ROL (DESCRIPCION) VALUES (?)"
        val ps = conexion.getPreparedStatement(query)
        //ps?.setInt(1, rol.id_rol)
        ps?.setString(1, rol.descripcion)
        val result = ps?.executeUpdate()
        ps?.close()
        conexion.desconectar()
        return result == 1
    }

    override fun modificarRol(rol: Rol): Boolean {
        var rolBuscado =buscarRol(rol.id_rol)
        conexion.conectar()
        var result:Int? = null
        if (rolBuscado != null){
            val query = "UPDATE ROL SET descripcion = ? WHERE id_rol = ?"
            val ps = conexion.getPreparedStatement(query)
            ps?.setString(1, rol.descripcion)
            ps?.setInt(2, rol.id_rol)
            result = ps?.executeUpdate()
            ps?.close()
        }
        conexion.desconectar()
        return result == 1
    }

    override fun borrarRol(id_rol: Int): Boolean {
        conexion.conectar()
        val query = "DELETE FROM ROL WHERE id_rol = ?"
        val ps = conexion.getPreparedStatement(query)
        ps?.setInt(1, id_rol)
        val result = ps?.executeUpdate()
        ps?.close()
        conexion.desconectar()
        return result == 1
    }
}