package models

class Electricista(nombre: String, experiencia: Int, horasDiarias: Int) :
    Trabajador(nombre, experiencia, horasDiarias) {
    fun arreglarElectricidad() {
        println("Arreglando electricidad")
    }

    override fun comer() {
        println("Me comí una salchipapa")
    }
}
