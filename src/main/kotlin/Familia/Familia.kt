package Familia

/**
 * Representa a la familia con su ID y la descipción
 *
 * @property id_familia
 * @property descripcion
 * @constructor Create empty Familia
 */
class Familia(val id_familia: Int, val descripcion: String) {
    override fun toString(): String {
        return "Familia(id_familia=$id_familia, descripcion='$descripcion')"
    }
}