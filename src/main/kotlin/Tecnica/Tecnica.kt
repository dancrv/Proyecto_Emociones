package Tecnica

/**
 *La clase Tecnica representa una técnica
 *
 * @property id_tecnica El ID único de la técnica.
 * @property descripcion La descripción de la técnica.
 * @property id_metodologia El ID de la metodología asociada a la técnica.
 * @constructor Crea una nueva instancia de la técnica.
 */
class Tecnica(val id_tecnica:Int, val descripcion:String, val id_metodologia:Int) {

    override fun toString(): String {
        return "Tecnica(id_tecnica=$id_tecnica, descripcion='$descripcion', id_metodologia=$id_metodologia)"
    }
}