// Punto 4

val contactoEmergencia: String? = null

// Llamada segura
val longitud: Int? = contactoEmergencia?.length
println("Cantidad de caracteres: $longitud")

// Operador Elvis
val contactoFinal: String = contactoEmergencia ?: "Sin contacto registrado"
println("Contacto de emergencia de Socrates: $contactoFinal")