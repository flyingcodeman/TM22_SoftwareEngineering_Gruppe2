# Feature Sammlung

## Anforderungen

### Ships
- Spieler kann Schiffe random aufstellen lassen 
- Ausgabe an den Spieler falls er ein Schiff nicht dort hin platzieren kann wo er ausgewählt hat
- Count wie viele Schiffe getroffen u/o versenkt worden sind
- Schiffauflistung, damit Spieler weiß welche Schiffe er platzieren kann

### Field
- Die Ausgabe der Spielfelder ist über die Konsole möglich
- Die Ausgabe der Spielfelder ist über die GUI möglich

### Game logic
- Schwierigkeiten des Spiels durch verschieden großen Spielfeldern variieren können
- Wenn alle Schiffe versenkt worden sind muss das spiel terminieren
- Bei einer Spiel terminierung muss der Grund der Terminierung angegeben werden
- Bei Terminierungsmeldung soll es die Auswahl der weiteren schritte geben (z.b. nochmal spielen, spiel beenden)
- Schüsse werden überprüft ob sie was getroffen haben
- direkt nach einem schuss der getroffen hat muss überprüft werden ob das schiff versenkt wurde
- Nach eingabe der Koordinaten muss überprüft werden ob koordinaten valide sind (Char von A-Z, It von 0 - 10, etc)
- Falls valide Koordinate ausgegeben wurde muss überprüft werden ob dort hin schon einmal geschossen wurde -> Fehlermeldung ausgeben & Schuss wiederholen
- Nach jedem Versenken eines Schiffes muss überprüft werde ob alle Schiffe versenkt worden sind

### Outputs
- Grafische Abbildungen der Schiffe 
- Grafische Abbildung des Spielfeldes
- Wording der Useraufforderungen schreiben
- Wahl zwischen Englisch (Default) und Deutsch
- Möglichkeit einer HighScoreBoards
- Sound Effekts wenn Boote getroffen werden
- Dokumentation verfassen (Beschreibung etc)
- Möglichkeit sich die geltenden vor Spiel beginn Regeln anzeigen zu lassen
- Möglichkeit sich die geltenden während dem Spiel beginn Regeln anzeigen zu lassen

### Documentation and Usabilty
- Möglichkeit Spiel zu pausieren
- Möglichkeit Spiel abzubrechen
- Legende die auflistet welches Zeichen am Board was heißt
- Legende wird angezeicht wie Koordinaten sich zusammensetzen (zb Bucstaben A-X horizontal, Nummern vertical)


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
