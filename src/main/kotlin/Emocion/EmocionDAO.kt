package Emocion

interface EmocionDAO {
    fun buscarEmocion(id_emocion: Int): Emocion?
    fun sacarEmociones(): List<Emocion>
    fun insertarEmocion(emocion: Emocion): Boolean
    fun modificarEmocion(emocion: Emocion): Boolean
    fun borrarEmocion(id_emocion: Int): Boolean
}