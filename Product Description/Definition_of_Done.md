## [DoD-32] Der User kann Schiffe zufällig vom Programm platzieren lassen
- [DoD-32.010] Es muss Boolean welche den Platzierungsmodus (bool manShipPlacement) angibt auf TRUE sein
- [DoD-32.020] Es werden alle Schiffe plaziert 
- [DoD-32.030] Kein Schiff ragt über das Spielfeld 
- [DoD-32.040] Kein Schiff keuzt ein anderes
- [DoD-32.050] Kein Schiff ist diagonal platziert 
- [DoD-32.060] Alle Schiffe (siehe TSV-36) sind am Spielfled verteilt 
- [DoD-32.070] Die Verteilung ändert sich bei mehrmahligen automatischen Verteilen (min. 1 Schiff muss auf anderen Koordinaten positioniert sein)  
- [DoD-32.080] Die Verteileung ist gemäß den Vorgaben (Regeln) 


## DoD-36 Dem User stehen verschieden Schiffe zum Spielen zu Verfügung
- [DoD-36.010] Der User verfügt über 1 Flugzeugträger welcher 5 Einheiten lang ist
- [DoD-36.020] Der User verfügt über 2 Schlachtschiffe welcher 4 Einheiten lang ist
- [DoD-36.030] Der User verfügt über 3 Zerstörer welcher 3 Einheiten lang ist
- [DoD-36.040] Der User verfügt über 4 U-Boote welcher 2 Einheiten lang ist
- [DoD-36.050] Die Felder der Schfiffe haben zwei Zustände (Getroffen, nicht getroffen)
- [DoD-36.060] Das Schiff überprüft ob es gesunken ist (alle Felder getroffen) 

## DoD-39 Der User sieht bei der Ausgabe des Spielfeldes die Achsenbeschriftung
- [DoD-36.010] Es muss über eine Variable die Größe des Spielfeldes eingalesen werden
- [DoD-36.020] Die horizontale Beschriftung ist alphabetisch fortlaufend und beginne bei der ersten Spalte mit A
- [DoD-36.030] Die vertikale Beschriftung ist numerisch fortlaufend und beginnt in der ersten Zeile mit 1  

## DoD-40 Dem User wird das Spielfeld und dessen aktueller Inhalt auf der Konsole ausgegeben
- [DoD-40.010] Der User erhält das Spielfeld in der gewählten Größe 
- [DoD-40.020] Das Spielfeld verfügt über eine Beschriftung 
- [DoD-40.030] Die getroffenen Schiffe werden mit einem X angezeigt.
- [DoD-40.040] Die versenkten Schiffe werden mit einem # angezeigt.
- Die nicht-getroffenen Schiffe werden mit O angezeigt. 


gegnerisch
- x getroffen, # versenkt, hingeschossen nicht vgetroffen -, (wasser ~)

nicht gegnerisch
- x getroffen, # versenkt, 0 nicht getroffene eigene schiffe, - schüsse des gegners
