package com.example.datentypenuniversum

class Entfernungen {
    /**
     * Diese Funktion liefert die Entfernungen zur Erde in einer Liste
     */
    fun distanceToEarth(): MutableList<Number> {

        // Entfernungen zur Erde in km
        // todo Schreibe hier deinen Code
        val merkurDTE: Int = 77300000
        val venusDTE: Int = 38200000
        val mondDTE: Int = 3600000
        val erdeDTE: Int = 0
        val issDTE: Int = 408
        val marsDTE: Int = 55700000
        val jupiterDTE: Int = 588500000
        val saturnDTE: Int = 1195500000
        val uranusDTE: Long = 2518900000
        val neptunDTE: Long = 4305900000

        // Erstelle eine veränderbare Liste
        // todo Schreibe hier deinen Code
        val listDTE: MutableList<Number> = mutableListOf()

        // Füge die Entfernungen hinzu
        // todo Schreibe hier deinen Code
        listDTE.add(merkurDTE)
        listDTE.add(venusDTE)
        listDTE.add(mondDTE)
        listDTE.add(erdeDTE)
        listDTE.add(issDTE)
        listDTE.add(marsDTE)
        listDTE.add(jupiterDTE)
        listDTE.add(saturnDTE)
        listDTE.add(uranusDTE)
        listDTE.add(neptunDTE)

        // Liefere die Entfernungen zurück
        return listDTE
    }

    /**
     * Diese Funktion liefert die Entfernungen zur Sonne in AE, in einer Liste
     */
    fun distanceToSunAE(distances: MutableList<Number>): MutableList<Float> {

        val merkurDTE: Double = distances[0].toDouble()
        val venusDTE: Double = distances[1].toDouble()
        val mondDTE: Double = distances[2].toDouble()
        val erdeDTE: Double = distances[3].toDouble()
        val issDTE: Double = distances[4].toDouble()
        val marsDTE: Double = distances[5].toDouble()
        val jupiterDTE: Double = distances[6].toDouble()
        val saturnDTE: Double = distances[7].toDouble()
        val uranusDTE: Double = distances[8].toDouble()
        val neptunDTE: Double = distances[9].toDouble()


        // 1 Astronomische Einheit [AE], entspricht der Entfernung von Erde zu Sonne
        val ae = 149597870.7

        // Erstelle eine veränderbare Liste
        // todo Schreibe hier deinen Code
        val listAE: MutableList<Float> = mutableListOf()

        val merkur: Double = ae - merkurDTE
        val venus: Double = ae - venusDTE
        val mond: Double = ae - mondDTE
        val erde: Double = ae - erdeDTE
        val iss: Double = ae - issDTE
        val jupiter: Double = ae - jupiterDTE
        val saturn: Double = ae - saturnDTE
        val uranus: Double = ae - uranusDTE
        val neptun: Double = ae - neptunDTE

        // Berechne die Entfernungen in AE
        // todo Schreibe hier deinen Code

        var merkurAE = (merkurDTE / ae).toFloat()
        var venusAE = (merkurDTE / ae).toFloat()
        var mondAE = (merkurDTE / ae).toFloat()
        var erdeAE = (merkurDTE / ae).toFloat()
        var issAE = (merkurDTE / ae).toFloat()
        var marsAE = (merkurDTE / ae).toFloat()
        var jupiterAE = (merkurDTE / ae).toFloat()
        var saturnAE = (merkurDTE / ae).toFloat()
        var uranusAE = (merkurDTE / ae).toFloat()
        var neptunAE = (merkurDTE / ae).toFloat()

        // Runde die Entfernungen auf 2 Nachkommastellen
        // todo Schreibe hier deinen Code


        // Füge die Entfernungen in die Liste ein
        // todo Schreibe hier deinen Code
        listAE.add(merkurAE)
        listAE.add(venusAE)
        listAE.add(mondAE)
        listAE.add(erdeAE)
        listAE.add(issAE)
        listAE.add(marsAE)
        listAE.add(jupiterAE)
        listAE.add(saturnAE)
        listAE.add(uranusAE)
        listAE.add(neptunAE)

        // Liefere die Liste zurück
        return listAE
    }

    private fun roundToTwo(toRound: Float): Float {
        var result: Float = toRound * 100f
        val resultInt: Int = result.toInt()
        result = resultInt.toFloat()
        result /= 100f
        return result
    }
}
