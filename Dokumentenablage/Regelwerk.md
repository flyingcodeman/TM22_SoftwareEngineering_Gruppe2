# Rulebook für Schiffe versenken
TM22 Software Engineering Team #2
- **[Christopher Moser](mailto:christopher.moser@stud.fh-campuswien.ac.at)** - *Product Owner* - *2010536047* -
- **[Daniel Gasser](mailto:daniel.gasser1@stud.fh-campuswien.ac.at)** - *Scrum Master* - *2010536060* -
- **[Adriane Würfl](mailto:adriane.wuerfl@stud.fh-campuswien.ac.at)** - *Jira, Team member* - *2010536065* -
- **[Simon König](mailto:simon.koenig@stud.fh-campuswien.ac.at)** - *Git, Team member* - *2010536059* -
- **[Mario Dangl](mailto:mario.dangl@stud.fh-campuswien.ac.at)** - *Team member* - *2010536036* - 
- **[Dino Ganic](mailto:dino.ganic@stud.fh-campuswien.ac.at)** - *Team member* - *2010536011* -
- **[Vera Adler](mailto:vera.adler@stud.fh-campuswien.ac.at)** - *Team member* - *2010536057* -

## Spielaufbau
- 2 Spieler Modus 
- 1 Spieler Modus gegen PC (Optional)
  - Schussabgabe wird mittels Zufallsgenerator 
  - Erweitert kann noch eine Logik implementiert werden, welche im Falle eines Treffers in Treffer-bereich weitere Schüsse abgibt.  
- Spielfeld Rechteckig in Koordinaten unterteilt
  - Horizontal in Buchstaben unterteilt 
  - Vertikal in Zahlen unterteilt
  - Siehe Musterspielfeld unten
- Vertikal mit Zahlen
- Horizontal mit Buchstaben



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
- über Konsole (Mindestanforderung)
- GUI erwünscht
- Jedenfalls muss nach jedem Spielzug das gesamte Feld des Spielers (Eigene Schiffe inkl. Treffer des Gegners) und des Gegners (Versuchte Treffen und wirkliche Treffer) ausgegeben/angezeigt werden.


### Schiffe 
Bei jedem Spiel hat der Spieler folgende Schiffe zur Verfügung:

    - ein Schlachtschiff (5 Kästchen)
    - zwei Kreuzer (je 4 Kästchen)
    - drei Zerstörer (je 3 Kästchen)
    - vier U-Boote (je 2 Kästchen)
    
Optional kann die Funktion "Schiffe zufällig auf dem Feld verteilen" etabliert werden. 


## Spielablauf:
1. Der Spieler wählt 1 oder 2 Spieler Modus.
2. Vorbereitung:

    - Schiffe platzieren (manuell oder zufällig)
    - Bei "manuell" werden die Kriterien für das Platzieren angezeigt. 
    - Es müssen alle Schiffe verwendet werden. 
    - Die Schiffe dürfen sich nicht kreuzen oder überlappen. 
    - Schiffe dürfen nicht diagonal aufgestellt werden. 
    - Schiffe dürfen keine Ausbuchtung besitzen.
    
3. Spielzug
    - Bei einem Spielzug gibt der Spieler eine Koordinate (z.B. A7) an. 
    - Darauf hin erfolgt die Meldung "Treffer", wenn ein Schiff getroffen worden ist oder "Daneben" wenn kein Treffer erzielt worden ist. 
    - Falls das letzte Feld eines Schiffes getroffen wird, erfolgt die Meldung "Treffer, Versenkt". 
    - Die Verwendeten Koordinaten werden auf einem Spielfeld angezeigt, inkl. Hervorhebung der Treffer und versenkten Schiffe.



         A B C D E F G H I J 
       * * * * * * * * * * * *
    1  *   O O     O O       *
    2  *               X     * 		
    3  * O O O O O     X     *
    4  *     O O O     O     *
    5  *     -         O     *
    6  *     #               *
    7  * O   #     O         *
    8  * O   #     O   O O O *
    9  *     #     O         *
    10 *                 O O *
       * * * * * * * * * * * *



  Legende:

    - O Schiff (Anzeige auf eigenem Spielfeld) 
    - kein Treffer 
    - X Treffer 
    - # Wenn Schiff versenkt ist
    - Nach jedem Spielzug wird der Spieler gewechselt. 
    - Eine Mehrfachnennung eines Feldes ist nicht möglich. 

4. Spielende 
   - Manuelle Beendigung des Spiels durch Schließen der Konsole / der Spieloberfläche. 
   - Das Spiel beendet automatisch, wenn ein Spieler alle gegnerischen Schiffe vollständig getroffen hat. 
   - Optional ist eine Implementierung eines Auswertefensters (Spielzeit, Treffer, Fehlschüsse, Trefferserie,... ) anzudenken. 
   - Eine Liste der besten Spieler inkl. der Spielzeit kann ebenfalls implementiert werden (Highscore). 
   

## Mindestanforderungen (MVP)
1. Spieloberfläche und Eingabe der Koordinaten via Konsole 
2. Manuelle Positionierung aller Schiffe (inkl. Kontrolle, ob alle Schiffe verwendet worden sind) 
3. Ausgabe der Oberfläche mit 2 Spielfeldern (eigenes und gegnerisches Feld) inkl. eigener Schiffe, Treffer und Versuchen
4. Automatische Beendigung des Spiels, sobald alle Schiffe eines Spielers getroffen worden sind 


# Autoren
- **[Christopher Moser](https://www.linkedin.com/in/christopher-moser-826658141/)** - *Creator* -
- **[Adriane Würfl]()** - *Changes* 