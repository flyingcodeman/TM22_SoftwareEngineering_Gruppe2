# Anforderungsdokumentation
Dieses Dokument definiert die Anforderungen, um das Projekt "Schiffe versenken" der ILV Software Engineering umzusetzen. 

## Spielablauf
Das Spiel "Schiffe versenken" ist ein Spiel für 2 Spieler, welches auch optional als 1 Spieler gegen den Computer gespielt werden kann. 
Ziel ist es, durch die Eingabe von Koordinaten alle gegnerischen Schiffe "abzuschießen". 
Der Spieler, der als Erstes alle Schiffe des Gegners versenkt hat, gewinnt.
Jeder Spieler verfügt über folgende Schiffe:
- ein Schlachtschiff (5 Kästchen)
- zwei Kreuzer (je 4 Kästchen)
- drei Zerstörer (je 3 Kästchen)
- vier U-Boote (je 2 Kästchen)

Alle Schiffe sind [wurde nicht ausformuliert?]

Es müssen alle Schiffe am Spielfeld verteilt werden. 
Das Spielfeld ist 10x10 Felder groß und horizontal mit Buchstaben, vertikal mit Zahlen nummeriert. 

1. Vorbereitung
      1. Spiel starten
      2. Auswahl Spieler\
         1- bzw. 2-Spieler 
      3. Schiffe platzieren
         1. Automatische Platzierung
         2. Manuelle Eingabe
      4. Abfrage ob das Spiel jetzt gestartet werden soll. 
2. Spielablauf 
   1. [wurde nicht ausformuliert?]
              
## Must have 
- Ausgabe via Konsole (Spielfeld, eigene Schiffe, Treffer und Versuche)
- Eingabe der Koordinaten via Konsole inkl. überprüfung der Koordinaten (Bereits beschossenes Feld, Auserhalb des Spielfeldes)
- Ablauf gemäß des unten beschriebenen Spielablaufes. 
## Nice to have 
- GUI 
- Eigene Positionierung der Schiffe [eigene dh der/die SpielerIn kann die Position(en) selbst wählen?]
- Single Player Modus (Schießen mit Zufallsalgorithmus)
## if some time 
- Dispatcher, welcher die 
- Automatische Verteilung der Schiffe
- Advanced Single Player (Logische Folgetreffer)
- Bestenliste 
- .exe Installations File 
- Multiplayer Modi via Netzwerk 


## Spielablauf
### Vorbereitung 