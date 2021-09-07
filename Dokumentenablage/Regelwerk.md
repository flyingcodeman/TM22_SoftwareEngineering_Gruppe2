# Rulebook für Schiffe versenken
TM22 Software Engineering Team #2

## Spielaufbau

-2 Spieler Modus
-1 Spieler Modus gegen PC (Optional)
-Spielfeld Rechteckig in Koodinaten unterteilt
-Vertikal mit Zahlen
-Horizontal mit Buchstaben

	      A B C D E F G H I J 
	    * * * * * * * * * * * * 
	1   *                     *	
	2   *                     * 		
	3   *                     *
	4   *                     *
	5   *                     *
	6   *                     *
	7   *                     *
	8   *                     *
	9   *                     *
   	10  *                     *
	    * * * * * * * * * * * *

-Visualisierung
- über Konsole (mindestanfordeeung)
- GUI erwünscht
- Jedenfalls muss nach jedem Spielzug das gesammte Feld des Spielers (Eigene Schiffe inkl. treffer sed Gegners) und des Gegners (Versuchte Treffen und wirkliche Treffer) ausgegeben/angezeigt werden

### Schiffe
Bei jedem Spiel hat der Spieler folgende Schiffe zur Verfügung:

    - ein Schlachtschiff (5 Kästchen)
    - zwei Kreuzer (je 4 Kästchen)
    - drei Zerstörer (je 3 Kästchen)
    - vier U-Boote (je 2 Kästchen)

Optional kann die Funktion die Schiffe zufällig auf dem Feld zu verteilen etabliert werden.

## Spielablauf:
1. Der Spieler wählt 1 oder 2 Spieler Modus.
2. Vorbereitung:
   - Schiffe plazieren (manual or random)
   - Bei Manual werden die Kriterien für das plazieren angezeigt.
   - Es müssen alle Schiffe verwendet werden.
   - Die Schiffe dürfen sich nicht kreuzen oder überlappen.
   - Schiffe dürfen nicht diagonal aufgestellt werden.
   - Schiffe dürden keine Ausbuchtung besitzen.

   - Es müssen alle Schiffe verwendet werden.

   1. Spielzug
      - Bei einem Spielzug giebt der Spieler eine Koordinate (z.B. A7) an.
      - Darauf hin erfolgt die Meldung "Treffen", wenn ein Schiff getroffen worden ist oder "Daneben" wenn kein Treffer erzielt worden ist.
      - Falls das letzte Feld eines Schiffes getroffen wird erfolgt die Meldung "Treffer, Versenkt".
      - Die Verwendeten Koordinatne werden auf einem Spielfeld angezeigt, inkl Hervorhebung der Treffer und versenkten Schiffe.



            A B C D E F G H I J 
          * * * * * * * * * * * * 
      1   *                     *
      2   *                     * 		
      3   *                     *
      4   *                     *
      5   *                     *
      6   *                     *
      7   *                     *
      8   *                     *
      9   *                     *
      10  *                     *
          * * * * * * * * * * * *


Legende:

    - - kein Treffer 
    - X Treffer 
    - [#] Wenn Schiff versenkt ist
    - Nach jedem Spielzug wird der Spieler gewechselt. 
    - Eine Mehrfachnennung eines Feldes ist nicht möglich. 


4. Spielende
   - Das Spiel beendet automatisch, wenn ein Spieler alle gegnerischen Schiffe vollständig getroffen hat
   - Optional ist eine Implemetierung eines Auswertefensters (Spielzeit, Treffer, Fehlschüsse, Trefferserie,... ) anzudenken.
   - Eine Liste der besten Spieler inkl. der Spielzeit kann ebenfalls implementiert werden.



## Mindestanforderungen
1. Spieloberfläche und Eingabe der Koordinaten via Konsole
2. Manuelle Positionierung aller Schiffe (inkl. Kontrolle, dass alle verwendet worden sind)
3. Ausgabe der Oberfläche mit 2 Spielfeldern (Gegnerisches und eigenes Feld) inkl. eigener Schiffe, Treffer und Versuchen
4. Automatische beendigung des Spiels, sobald alle Schiffe eines Spielers getroffen worden sind.

# Autoren
- **[Christopher Moser](https://www.linkedin.com/in/christopher-moser-826658141/)** - *Creator* -
- **[Adriane Würfl]