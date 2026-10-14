
// Punto 5

// Precios base: consulta, baño y desparasitación
val preciosBase = listOf(50000.0, 30000.0, 40000.0)

// Lambda con 10% de recargo nocturno
val recargoNocturno: (Double) -> Double = { it * 1.10 }

// Recorrer la lista e imprimir los precios
preciosBase.forEach {
    println("Precio original: $${"%.0f".format(it)} -> Precio nocturno: $${"%.0f".format(recargoNocturno(it))}")
}
