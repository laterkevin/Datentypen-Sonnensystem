package com.example.datentypenuniversum

class Entfernungen {
    /**
     * Diese Funktion liefert die Entfernungen zur Erde in einer Liste
     */
    fun distanceToEarth(): MutableList<Number> {

        // Entfernungen zur Erde in km
        // todo Schreibe hier deinen Code
        val Merkur = 77300000
        val Venus= 38200000
        val Mond = 3600000
        val Erde = 0
        val ISS = 408
        val Mars = 55700000
        val Jupiter=  588500000
        val Saturn = 1195500000
        val Uranus = 2518900000
        val Neptun = 4305900000

        // Erstelle eine veränderbare Liste
        // todo Schreibe hier deinen Code
        val listDTE: MutableList<Number> = mutableListOf()

        // Füge die Entfernungen hinzu
        // todo Schreibe hier deinen Code
        listDTE.add(Merkur)
        listDTE.add(Venus)
        listDTE.add(Mond)
        listDTE.add(Erde)
        listDTE.add(ISS)
        listDTE.add(Mars)
        listDTE.add(Jupiter)
        listDTE.add(Saturn)
        listDTE.add(Uranus)
        listDTE.add(Neptun)

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
        val listAE: MutableList<Number> = mutableListOf()

        // Berechne die Entfernungen in AE
        // todo Schreibe hier deinen Code


        // Runde die Entfernungen auf 2 Nachkommastellen
        // todo Schreibe hier deinen Code

        // Füge die Entfernungen in die Liste ein
        // todo Schreibe hier deinen Code

        // Liefere die Liste zurück
        return mutableListOf()
    }
}
