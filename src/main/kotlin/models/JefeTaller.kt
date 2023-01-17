package models

class JefeTaller(nombre: String, experiencia: Int, val personasACargo: Int) : Persona(nombre, experiencia) {

    fun darLatigazos() {
        println("¡Vagos asquerosos! *chas* ¡Seguid trabajando! *chas* ¡Panda de inútiles, me hacéis perder dinero! *chas* *chas*")
    }

    fun pagar() {
        println("Por desgracia la ley me obliga a daros mi valioso dinero *les paga*")
    }

    override fun saludar() {
        println("Soy $nombre y te saludo de forma chulesca porque soy un jefaso y soy superior a ti")
    }

    override fun toString(): String {
        return "JefeTaller(id=$id, nombre=$nombre, experiencia=$experiencia, salario=$salario, personasACargo=$personasACargo)"
    }
}