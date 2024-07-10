package modelo

import java.sql.Connection
import java.sql.DriverManager

class Conexion {

    fun cadenaConexion(): Connection? {
        try {
            val url = "jdbc:oracle:thin:@172.20.10.2:1521:xe"
            val usuario = "Allan_developer"
            val contrasena = "MIRNAESPINA"

            val connection = DriverManager.getConnection(url, usuario, contrasena)
            return connection
        }catch (e: Exception){
            println("error: $e")
            return null
        }
    }
}