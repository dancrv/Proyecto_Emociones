package Menu


import Emocion.Emocion
import Emocion.EmocionDAOImpl
import Familia.Familia
import Familia.FamiliaDAOImpl
import Grupo_Terapeuta.Grupo_Terapeuta
import Grupo_Terapeuta.Grupo_TerapeutaDAOImpl
import Individuo.Individuo
import Individuo.IndividuoDAOImpl
import Metodologia.Metodologia
import Metodologia.MetodologiaDAOImpl
import Rol.Rol
import Rol.RolDAOImpl
import Sesion.Sesion
import Sesion.SesionDAOImpl
import Tecnica.Tecnica
import Tecnica.TecnicaDAOImpl
import Terapeuta.Terapeuta
import Terapeuta.TerapeutaDAOImpl

class Menu {
    val BUSCAR = 1
    val SACAR = 2
    val INSERTAR = 3
    val MODIFICAR = 4
    val BORRAR = 5
    val INDIVIDUO = 1
    val FAMILIA = 2
    val EMOCION = 3
    val TERAPEUTA = 4
    val TECNICA = 5
    val GRUPO = 6
    val METODOLOGIA = 7
    val ROL = 8
    val SESION = 9

    var eleccionTabla:Int = 0
    var accionTabla:Int = 0

    fun imprimirMenuPrincipal(){
        do {
            println("*****¿Que deseas hacer?*****")
            println("1.Buscar informacion \n 2.Sacar información \n 3.Insertar \n 4.Modificar \n 5.Borrar \n 6.Salir")
            this.accionTabla = readln().toInt()
        }while (this.accionTabla >= 6)
    }

    fun imprimirMenuSecundario(){
        do {
            println("¿A que tabla deseas acceder?")
            println("1.Individuo \n 2.Familia \n 3.Emocion \n 4.Terapeuta \n 5.Tecnica \n 6.Grupo \n 7.Metododologia \n 8.Rol \n 9.Sesion \n 10.Sesion_Emocion \n 11.Salir")
            this.eleccionTabla = readln().toInt()
        }while (this.eleccionTabla >= 12)
    }

    fun pedirID():Int{
        println("***Dime el id****")
        var id= readln().toInt()
        return id
    }


    fun accesoTabla() {
        when {
            accionTabla == BUSCAR && eleccionTabla == INDIVIDUO -> println(IndividuoDAOImpl().buscarIndividuo(pedirID()))
            accionTabla == SACAR && eleccionTabla == INDIVIDUO -> println(IndividuoDAOImpl().sacarIndividuo())
            accionTabla == INSERTAR && eleccionTabla == INDIVIDUO -> {
                try {
                    var individuo = Individuo(
                        0,
                        nombre = readln().toString(),
                        apellido1 = readln().toString(),
                        apellido2 = readln().toString(),
                        id_rol = readln().toInt(),
                        id_familia = readln().toInt()
                    )
                    IndividuoDAOImpl().insertarIndividuo(individuo)
                } catch (e: Exception) {
                    println(e)
                    println("Has introducido un dato mal")
                }
            }

            accionTabla == MODIFICAR && eleccionTabla == INDIVIDUO -> {
                try {
                    var individuo = Individuo(
                        id_individuo = readln().toInt(),
                        nombre = readln().toString(),
                        apellido1 = readln().toString(),
                        apellido2 = readln().toString(),
                        id_rol = readln().toInt(),
                        id_familia = readln().toInt()
                    )
                    IndividuoDAOImpl().modificarIndividuo(individuo)
                } catch (e: Exception) {
                    println(e)
                    println("Has introducido un dato mal")
                }
            }

            accionTabla == BORRAR && eleccionTabla == INDIVIDUO -> IndividuoDAOImpl().borrarIndividio(pedirID())
            accionTabla == BUSCAR && eleccionTabla == FAMILIA -> println(FamiliaDAOImpl().buscarFamilia(pedirID()))
            accionTabla == SACAR && eleccionTabla == FAMILIA -> println(FamiliaDAOImpl().sacarFamilia())
            accionTabla == INSERTAR && eleccionTabla == FAMILIA -> {
                try {
                    var familia = Familia(0, descripcion = readln())
                    FamiliaDAOImpl().insertarFamilia(familia)
                } catch (e: Exception) {
                    println("Has introducido un dato mal")
                }
            }

            accionTabla == MODIFICAR && eleccionTabla == FAMILIA -> {
                try {
                    var familia = Familia(id_familia = readln().toInt(), descripcion = readln())
                    FamiliaDAOImpl().modificarFamilia(familia)
                } catch (e: Exception) {
                    println("Has introducido un dato mal")
                }
            }

            accionTabla == BORRAR && eleccionTabla == FAMILIA -> FamiliaDAOImpl().borrarFamilia(pedirID())
            accionTabla == BUSCAR && eleccionTabla == EMOCION -> println(EmocionDAOImpl().buscarEmocion(pedirID()))
            accionTabla == SACAR && eleccionTabla == EMOCION -> print(EmocionDAOImpl().sacarEmociones())
            accionTabla == INSERTAR && eleccionTabla == EMOCION -> {
                try {
                    var emocion = Emocion(0, nombre = readln())
                    EmocionDAOImpl().insertarEmocion(emocion)
                } catch (e: Exception) {
                    println("Has introducido un dato mal")
                }
            }

            accionTabla == MODIFICAR && eleccionTabla == EMOCION -> {
                try {
                    var emocion = Emocion(id_emocion = readln().toInt(), nombre = readln())
                    EmocionDAOImpl().modificarEmocion(emocion)
                } catch (e: Exception) {
                    println("Has introducido un dato mal")
                }
            }

            accionTabla == BORRAR && eleccionTabla == EMOCION -> EmocionDAOImpl().borrarEmocion(pedirID())
            accionTabla == BUSCAR && eleccionTabla == TERAPEUTA -> println(TerapeutaDAOImpl().buscarTerapeuta(pedirID()))
            accionTabla == SACAR && eleccionTabla == TERAPEUTA -> println(TerapeutaDAOImpl().sacarTerapeuta())
            accionTabla == INSERTAR && eleccionTabla == TERAPEUTA -> {
                try {
                    var terapeuta = Terapeuta(
                        0,
                        nombre = readln(),
                        apellido1 = readln(),
                        apellido2 = readln(),
                        id_metodologia = readln().toInt()
                    )
                    TerapeutaDAOImpl().insertarTerapeuta(terapeuta)
                } catch (e: Exception) {
                    println("Has introducido un dato mal")
                }
            }

            accionTabla == MODIFICAR && eleccionTabla == TERAPEUTA -> {
                try {
                    var terapeuta = Terapeuta(
                        id_terapeuta = readln().toInt(),
                        nombre = readln(),
                        apellido1 = readln(),
                        apellido2 = readln(),
                        id_metodologia = readln().toInt()
                    )
                    TerapeutaDAOImpl().modificarTerapeuta(terapeuta)
                } catch (e: Exception) {
                    println("Has introducido un dato mal")
                }
            }

            accionTabla == BORRAR && eleccionTabla == TERAPEUTA -> TerapeutaDAOImpl().borrarTerapeuta(pedirID())
            accionTabla == BUSCAR && eleccionTabla == TECNICA -> println(TecnicaDAOImpl().buscarTecnica(pedirID()))
            accionTabla == SACAR && eleccionTabla == TECNICA -> println(TecnicaDAOImpl().sacarTecnica())
            accionTabla == INSERTAR && eleccionTabla == TECNICA -> {
                try {
                    var tecnica = Tecnica(0, descripcion = readln(), id_metodologia = readln().toInt())
                    TecnicaDAOImpl().insertarTecnica(tecnica)
                } catch (e: Exception) {

                }
            }

            accionTabla == MODIFICAR && eleccionTabla == TECNICA -> {
                try {
                    var tecnica = Tecnica(
                        id_tecnica = readln().toInt(),
                        descripcion = readln(),
                        id_metodologia = readln().toInt()
                    )
                    TecnicaDAOImpl().modificarTecnica(tecnica)
                } catch (e: Exception) {

                }
            }

            accionTabla == BORRAR && eleccionTabla == TECNICA -> TecnicaDAOImpl().borrarTecnica(pedirID())
            accionTabla == BUSCAR && eleccionTabla == GRUPO -> println(Grupo_TerapeutaDAOImpl().buscarGrupo(pedirID()))
            accionTabla == SACAR && eleccionTabla == GRUPO -> println(Grupo_TerapeutaDAOImpl().sacarGrupo())
            accionTabla == INSERTAR && eleccionTabla == GRUPO -> {
                try {
                    var grupo = Grupo_Terapeuta(0, id_terapeuta = readln().toInt())
                    Grupo_TerapeutaDAOImpl().insertarGrupo(grupo)
                } catch (e: Exception) {
                    println("Has introducido un dato mal")
                }
            }

            accionTabla == MODIFICAR && eleccionTabla == GRUPO -> {
                try {
                    var grupo = Grupo_Terapeuta(id_grupo = readln().toInt(), id_terapeuta = readln().toInt())
                    Grupo_TerapeutaDAOImpl().modificarGrupo(grupo)
                } catch (e: Exception) {
                    println("Has introducido un dato mal")
                }
            }

            accionTabla == BORRAR && eleccionTabla == GRUPO -> Grupo_TerapeutaDAOImpl().borrarGrupo(pedirID())
            accionTabla == BUSCAR && eleccionTabla == METODOLOGIA -> println(MetodologiaDAOImpl().buscarMetodologia(pedirID()))
            accionTabla == SACAR && eleccionTabla == METODOLOGIA -> println(MetodologiaDAOImpl().sacarMetodologia())
            accionTabla == INSERTAR && eleccionTabla == METODOLOGIA -> {
                try {
                    var metodologia = Metodologia(0, nombre = readln())
                    MetodologiaDAOImpl().insertarMetodologia(metodologia)
                } catch (e: Exception) {
                    println("Has introducido un dato mal")
                }
            }

            accionTabla == MODIFICAR && eleccionTabla == METODOLOGIA -> {
                try {
                    var metodologia = Metodologia(id_metodologia = readln().toInt(), nombre = readln())
                    MetodologiaDAOImpl().modificarMetodologia(metodologia)
                } catch (e: Exception) {
                    println("Has introducido un dato mal")
                }
            }

            accionTabla == BORRAR && eleccionTabla == METODOLOGIA -> MetodologiaDAOImpl().borrarMetodologia(pedirID())
            accionTabla == BUSCAR && eleccionTabla == ROL -> println(RolDAOImpl().buscarRol(pedirID()))
            accionTabla == SACAR && eleccionTabla == ROL -> println(RolDAOImpl().sacarRol())
            accionTabla == INSERTAR && eleccionTabla == ROL -> {
                try {
                    var rol = Rol(0, descripcion = readln())
                    RolDAOImpl().insertarRol(rol)
                } catch (e: Exception) {
                    println("Has introducido un dato mal")
                }
            }

            accionTabla == MODIFICAR && eleccionTabla == ROL -> {
                try {
                    var rol = Rol(id_rol = readln().toInt(), descripcion = readln().toString())
                    RolDAOImpl().modificarRol(rol)
                } catch (e: Exception) {
                    println(e)
                    println("Has introducido un dato mal")
                }
            }

            accionTabla == BORRAR && eleccionTabla == ROL -> RolDAOImpl().borrarRol(pedirID())
            accionTabla == BUSCAR && eleccionTabla == SESION -> print(SesionDAOImpl().buscarSesion(pedirID()))
            accionTabla == SACAR && eleccionTabla == SESION -> print( SesionDAOImpl().sacarSesion())
            accionTabla == INSERTAR && eleccionTabla == SESION -> {
                try {
                    var sesion = Sesion(0, id_grupo = readln().toInt(), id_familia = readln().toInt())
                    SesionDAOImpl().insertarSesion(sesion)
                } catch (e: Exception) {
                    println("Has introducido un dato mal")
                }
            }

            accionTabla == MODIFICAR && eleccionTabla == SESION -> {
                try {
                    var sesion =
                        Sesion(id_sesion = readln().toInt(), id_grupo = readln().toInt(), id_familia = readln().toInt())
                    SesionDAOImpl().modificarSesion(sesion)
                } catch (e: Exception) {
                    println("Has introducido un dato mal")
                }
            }

            accionTabla == BORRAR && eleccionTabla == SESION -> SesionDAOImpl().borrarSesion(pedirID())
        }
    }
}