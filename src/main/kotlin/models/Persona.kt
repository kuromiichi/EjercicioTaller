package models

abstract class Persona(val nombre: String, val experiencia: Int) {
    val id = nextID()
    val salario = when (this) {
        is JefeTaller -> 2500.0
        is Chapista -> 1700.0
        is Electricista -> 1800.0
        else -> 1200.0
    }

    companion object {
        // ID autonumérico
        private var numPersonas = 0
        private fun nextID(): Int = ++numPersonas

        // Factory
        fun crearPersonaAleatoria(): Persona {
            val nombre = arrayOf(
                "Pepe", "Pepito", "Pepote"
            ).random()
            val experiencia = (1..20).random()
            return when ((0..100).random()) {
                in (0 until 10) -> JefeTaller(
                    nombre,
                    experiencia,
                    (10..50).random()
                )

                in (10 until 40) -> Chapista(
                    nombre,
                    experiencia,
                    (6..12).random()
                )

                in (40 until 50) -> Electricista(
                    nombre,
                    experiencia,
                    (6..12).random()
                )

                else -> Trabajador(
                    nombre,
                    experiencia,
                    (6..12).random()
                )
            }
        }
    }

    abstract fun saludar()

    override fun toString(): String {
        return "Persona(id=$id, nombre=$nombre, experiencia=$experiencia, salario=$salario)"
    }
}