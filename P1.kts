// Punto 1

val nombre: String = "Socrates"
val sexo: Char = 'M'
// Datos a actualizar
var edad: Int = 2
var peso: Float = 18.4f
var estaVacunado: Boolean = true
println("Ficha inicial -> $nombre, $edad años, $peso kg")
// El paciente cumple un año y sube de peso
edad += 1
peso = 19.1f
println("Paciente: $nombre | Sexo: $sexo | Edad: $edad años | Peso: $peso kg | Vacunado: $estaVacunado")