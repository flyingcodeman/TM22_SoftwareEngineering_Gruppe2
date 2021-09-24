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
- [DoD-40.010] Der User erhält sein Spielfeld und das gegnerische Feld in der gewählten Größe in der Konsole ausgegeben.
- [DoD-40.020] Auf dem gegnerischen Feld werden getroffene Schiffe mit einem X angezeigt. 
- [DoD-40.030] Auf dem gegnerischen Feld werden versenkte Schiffe mit einem # angezeigt.
- [DoD-40.040] Auf dem gegnerischen Feld werden nicht getroffene Schüsse (Felder auf die bereits geschossen wurde aber kein Schiff steht) mit - gekennzeichnet.
- [DoD-40.050] Auf dem gegnerischen Feld werden noch nicht beschossene Felder mit ~ gekennzeichnet. 
- [DoD-40.060] Auf dem eigenen Feld werden getroffene Schiffe mit einem X angezeigt. 
- [DoD-40.070] Auf dem eigenen Feld werden versenkte Schiffe mit einem # angezeigt.
- [DoD-40.080] Auf dem eigenen Feld werden Schüsse des Gegners, die nicht getroffenen mit - gekennzeichnet.
- [DoD-40.090] Auf dem eigenen Feld werden leere Felder (ohne Schuss und ohne Schiff) mit ~ gekennzeichnet.
- [DoD-40.100] Auf dem eigenen Feld werden nicht getroffene Schiffe mit 0 gekennzeichnet.

## DoD-44 Der User versenkt das letzte gegnerische Schiff und beendet damit das Spiel
- [DoD-44.010] Es muss ein Boolean (z.B. "aktiveSchiffeAmFeld") eingelesen werden
- [DoD-44.020] Wenn die Variable "true" ist, darf keine Reaktion erfolgen
- [DoD-44.030] Wenn die Variable "false" ist, wird eine Textmeldung ausgegeben
- [DoD-44.040] Die Textmeldung muss bestätigt werden
- [DoD-44.050] Nach bestätigung terminiert das Spiel automatisch und man gelang zum Hauptmenü 

## DoD-60 Dem User wird angezeigt welches Zeichen am Feld was bedeutet
- [DoD-60.010] Dem User wird der Text "X ==> Schiff getroffen" angezeigt
- [DoD-60.020] Dem User wird der Text "# ==> Schiff versenkt" angezeigt
- [DoD-60.030] Dem User wird der Text "- ==> Schuss ins Wasser" angezeigt
- [DoD-60.040] Dem User wird der Text "0 ==> Eigenes Schiff" angezeigt
- [DoD-60.050] Dem User wird der Text "~ ==> Leeres Feld (eigenes Spielfeld)" angezeigt
- [DoD-60.060] Dem User wird der Text "~ ==> Feld noch unbekannt (gegnerisches Spielfeld)" angezeigt