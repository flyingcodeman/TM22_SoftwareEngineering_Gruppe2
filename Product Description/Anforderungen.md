# Feature Sammlung

## Anforderungen

### Ships
- Spieler kann Schiffe random aufstellen lassen 
- Ausgabe an den Spieler, falls er ein Schiff nicht dort hinplatzieren kann, wo er ausgewählt hat
- Count wie viele Schiffe getroffen u/o versenkt worden sind
- Schiffsauflistung, damit Spieler weiß welche Schiffe er platzieren kann
  - ein Schlachtschiff (5 Kästchen)
  - zwei Kreuzer (je 4 Kästchen)
  - drei Zerstörer (je 3 Kästchen)
  - vier U-Boote (je 2 Kästchen)

### Field
- Das Spielfeld ist Quadratisch
- Die Beschriftung der Horizontalachse erfolg mit Buchstaben bei A beginnend, von links nach rechts 
- Die Beschriftung der Vertikalachse erfolgt mit Zahlen bei 1 beginnend, von oben nach unten
- Die Ausgabe der Spielfelder ist über die Konsole möglich
- Die Ausgabe der Spielfelder ist über die GUI möglich
  - Genauere Definition der GUI wird in einem eignen Punkt erfolgen
- Das Spielfeld hat als Standardeinstellung eine Größe von 10X10 Feldern
- Es besteht die Möglichkeit, dass der Spieler die Größe des Spielfeldes wählen kann.
  - Einstellmöglichkeit von 10X10 bis 50X50 Feldern
- 

### Game logic
- Schwierigkeiten des Spiels durch verschieden großen Spielfeldern variieren können
- Wenn alle Schiffe versenkt worden sind, muss das spiel terminieren
- Bei einer Spiel terminierung muss der Grund der Terminierung angegeben werden
- Bei Terminierungsmeldung soll es die Auswahl der weiteren Schritte geben (z.b. nochmal spielen, spiel beenden)
- Schüsse werden überprüft, ob sie was getroffen haben
- direkt nach einem schuss der getroffen hat muss überprüft werden, ob das Schiff versenkt wurde
- Nach eingabe der Koordinaten muss überprüft werden ob koordinaten valide sind (Char von A-Z, It von 0 - 10, etc)
- Falls valide Koordinate ausgegeben wurde muss überprüft werden, ob dort hin schon einmal geschossen wurde -> Fehlermeldung ausgeben & Schuss wiederholen
- Nach jedem Versenken eines Schiffes muss überprüft werden, ob alle Schiffe versenkt worden sind

### Outputs
- Grafische Abbildungen der Schiffe 
- Grafische Abbildung des Spielfeldes
- Wording der Useraufforderungen schreiben
- Wahl zwischen Englisch (Default) und Deutsch
- Möglichkeit einer HighScoreBoards
- Sound Effekts, wenn Boote getroffen werden
- Dokumentation verfassen (Beschreibung etc)
- Möglichkeit sich die geltenden vor Spiel beginn Regeln anzeigen zu lassen
- Möglichkeit sich die geltenden während dem Spiel beginn Regeln anzeigen zu lassen

### Documentation and Usabilty
- Möglichkeit Spiel zu pausieren
- Möglichkeit Spiel abzubrechen
- Legende die auflistet welches Zeichen am Board was heißt
- Legende wird angezeicht wie Koordinaten sich zusammensetzen (zb Buchstaben A-X horizontal, Nummern vertical)

### Ship placement
- Es müssen alle Schiffe verwendet werden.
- Die Schiffe dürfen sich nicht kreuzen oder überlappen.
- Schiffe dürfen nicht diagonal aufgestellt werden.
- Schiffe dürfen keine Ausbuchtung besitzen.

### Shooting 
- Anhand der eingegebenen Koordinate wird überprüft, ob der Schuss auf eine von einem Schiff belegten Koordinate trifft. 
- Falls nicht, wird diese Koordinate am Spielfeld mit "-" für die Konsolen-Ansicht oder grafisch für die GUI-Ansicht markiert.
- Falls ein Schiff getroffen wird, ist eine Überprüfung des Schiffes durchzuführen (Schiff hat noch unbetroffene Felder).
  - Falls das Schiff noch nicht getroffene Felder hat, ist die Koordinate mit "X" zu markieren. 
  - Sollten alle Felder des Schiffes beschädigt sein, ist das gesamte Schiff mit "#" zu markieren. 
  - Im Falle einer Visualisierung mittels GUI ist dies laut den GUI-Anforderungen umzusetzen

### Audio interaction 
- Eine Implementierung von Soundeffekten ist für folgende Punkte umzusetzen: 
  - Schussabgabe: Wenn deine Koordinate eines Spielers eingegeben wird und die Überprüfung, ob die Koordinate in diesem Spiel schon versucht worden ist erfolgreich war, ist eine Soundeffekt, welcher einen Kanonenschuss ähnlich ist auszugeben. 
  - Schuss auf eine nicht-belegte Koordinate: Sollte der Schuss auf eine Koordinate treffen, welche nicht belegt ist, ist ein Soundeffekt "Wasser palatschen" auszugeben 
  - Schuss auf ein Schiff: Sollte der Schuss ein Schiff treffen, ist einen Explosionssoundeffekt auszugeben. 
- Der Spieler / die Spielerin hat die Möglichkeit, vor Spielbeginn die Soundeffekte zu aktivieren bzw. zu deaktivieren. 

### Announcements
- Grundeinstellung der Textmeldungen ist in englischer Sprache definiert
- Der User hat die Möglichkeit vor Spielbeginn zwischen folgenden Sprachen zu wählen: 
  - Englisch 
  - Deutsch 
  - Deutsch spezial Auswahl Spielfeldgröße 
  - Schiffsplatzierung 
  - Aufforderung eine Eingabe zu tätigen 
  - Meldung über Treffer/kein Treffer 
  - Meldung Schiff versenkt 
  - Meldung Gewinner 
  - Spielstatistik 
  - Verabschiedung 


## Testcases 
- Testcases zu den einzelnen User Stories schreiben


## Sprints
### Sprint 1
Ziel: MVP erfüllt

### Sprint 2
Ziel: 
- manuel Schiffe setzen 
- 1-Spieler (Com) Modus

### Sprint 3 
Ziel: 
- GUI
- intelligenter COM 
