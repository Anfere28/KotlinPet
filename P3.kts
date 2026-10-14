// Punto 3

// Lista inmutable con 4 mascotas esperando consulta
val mascotasEnEspera = listOf("Sócrates", "Luna", "Rocky", "Mia")

// Turnos consecutivos con rango exclusivo (until): va de 0 a size - 1
println("Turnos de consulta:")
for (i in 0 until mascotasEnEspera.size) {
    val turno = i + 1
    println("Turno $turno: ${mascotasEnEspera[i]}")
}

// Cuenta regresiva con rango inclusivo (downTo): del 5 al 1
println("Cuenta regresiva para la apertura de la clínica:")
for (minuto in 5 downTo 1) {
    println("Faltan $minuto min para abrir")
}
println("¡Clínica abierta!")

// Minutos restantes con step: avisos cada 2 minutos (10, 8, 6, 4, 2)
println("Avisos de apertura cada 2 minutos:")
for (minuto in 10 downTo 2 step 2) {
    println("Faltan $minuto min para abrir")
}