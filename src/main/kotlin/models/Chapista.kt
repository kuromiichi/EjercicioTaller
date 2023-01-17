package models

class Chapista(nombre: String, experiencia: Int, horasDiarias: Int) : Trabajador(nombre, experiencia, horasDiarias) {
    fun arreglarChapa() {
        println("Arreglando chapa")
    }

    override fun descansar() {
        println("No quiero arreglar más chapa, buenas noches")
    }
}