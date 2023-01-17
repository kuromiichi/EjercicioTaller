package models

open class Trabajador(nombre: String, experiencia: Int, val horasDiarias: Int) : Persona(nombre, experiencia) {
    open fun trabajar() {
        println("Señor jefe no me pegue con el látigo, mire, estoy haciendo cosas ;_;")
    }

    open fun descansar() {
        println("Me voy a la cama, no me pagan lo suficiente")
    }

    override fun saludar() {
        println("Hola buenos días (con respeto, solo buenas vibras), soy $nombre, mucho gusto")
    }

    open fun comer() {}

    override fun toString(): String {
        return "${this.javaClass.toString().split(".")[1]}(id=$id, nombre=$nombre, experiencia=$experiencia, salario=$salario, horasDiarias=$horasDiarias)"
    }
}