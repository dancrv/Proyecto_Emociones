package Tecnica

class Tecnica(val id_tecnica:Int, val descripcion:String, val id_metodologia:Int) {

    override fun toString(): String {
        return "Tecnica(id_tecnica=$id_tecnica, descripcion='$descripcion', id_metodologia=$id_metodologia)"
    }
}