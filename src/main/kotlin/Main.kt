import models.Persona

fun main() {
    val arrayPersonas = Array(50) { Persona.crearPersonaAleatoria() }
    for (persona in arrayPersonas) {
        println(persona)
    }
}