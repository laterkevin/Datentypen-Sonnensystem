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
        val mondDTE: Int = 360000
        val erdeDTE: Byte = 0
        val issDTE: Short = 408
        val marsDTE: Int = 55700000
        val jupiterDTE: Int = 588500000
        val saturnDTE: Int = 1195500000
        val uranusDTE: Float = 2518900000f
        val neptunDTE: Float = 4305900000f

        // Erstelle eine veränderbare Liste
        // todo Schreibe hier deinen Code
        val listDTE = mutableListOf<Number>()

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

        // 1 Astronomische Einheit [AE], entspricht der Entfernung von Erde zu Sonne
        val ae = 149597870.7

        // Erstelle eine veränderbare Liste
        // todo Schreibe hier deinen Code
        val listAE = mutableListOf<Float>()



        // Berechne die Entfernungen in AE
        // todo Schreibe hier deinen Code
        val aeMerkur = distances[0].toDouble() / ae
        val aeVenus = distances[1].toDouble() / ae
        val aeMond = distances[2].toDouble() / ae
        val aeErde = distances[3].toDouble() / ae
        val aeIss = distances[4].toDouble() / ae
        val aeMars = distances[5].toDouble() / ae
        val aeJupiter = distances[6].toDouble() / ae
        val aeSaturn = distances[7].toDouble() / ae
        val aeUranus = distances[8].toDouble() / ae
        val aeNeptun = distances[9].toDouble() / ae


        // Runde die Entfernungen auf 2 Nachkommastellen
        // todo Schreibe hier deinen Code
        val aeRoundedMerkur = (aeMerkur * 100).toInt().toFloat()/100
        val aeRoundedVenus = (aeVenus * 100).toInt().toFloat()/100
        val aeRoundedMond = (aeMond * 100).toInt().toFloat()/100
        val aeRoundedErde = (aeErde * 100).toInt().toFloat()/100
        val aeRoundedIss = (aeIss * 100).toInt().toFloat()/100
        val aeRoundedMars = (aeMars * 100).toInt().toFloat()/100
        val aeRoundedJupiter = (aeJupiter * 100).toInt().toFloat()/100
        val aeRoundedSaturn = (aeSaturn * 100).toInt().toFloat()/100
        val aeRoundedUranus = (aeUranus * 100).toInt().toFloat()/100
        val aeRoundedNeptun = (aeNeptun * 100).toInt().toFloat()/100

        // Füge die Entfernungen in die Liste ein
        // todo Schreibe hier deinen Code
        listAE.add(aeRoundedMerkur)
        listAE.add(aeRoundedVenus)
        listAE.add(aeRoundedMond)
        listAE.add(aeRoundedErde)
        listAE.add(aeRoundedIss)
        listAE.add(aeRoundedMars)
        listAE.add(aeRoundedJupiter)
        listAE.add(aeRoundedSaturn)
        listAE.add(aeRoundedUranus)
        listAE.add(aeRoundedNeptun)

        // Liefere die Liste zurück
        return listAE
    }
}
