package Grupo_Terapeuta

/**
 * La clase Grupo_Terapeuta representa una asociación entre un grupo y un terapeuta.
 *
 * @property id_grupo
 * @property id_terapeuta
 * @constructor Create empty Grupo_terapeuta
 */
class Grupo_Terapeuta(val id_grupo: Int, val id_terapeuta: Int) {
    override fun toString(): String {
        return "Grupo_Terapeuta(id_grupo=$id_grupo, id_terapeuta=$id_terapeuta)"
    }
}