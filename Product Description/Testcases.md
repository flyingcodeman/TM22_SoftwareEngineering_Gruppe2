# Testcases

| Number	  | Task | Precondition  | Eingabedaten	  | Ergebnis	   | State  | Notes |  Bug-ID |

## [TC-32] Der User kann Schiffe zufällig vom Programm platzieren lassen
| Number	  | Task | Precondition  | Eingabedaten	  | Ergebnis	   | State  | Notes |  Bug-ID |
- [TC-32.010] | Es muss Boolean welche den Platzierungsmodus (bool manShipPlacement) angibt auf TRUE sein
  | PC: Funktion bool manShipPlacement ist implementiert |
  | Task 1: Suche die Funktion bool manShipPlacement; Task 2: Funktion bool manShipPlacment aufrufen | 
  | Eingabedaten: Keine | 
  | Ergebnis 1: Funktion manShipPlacement im Programm-Code gefunden; Ergebnis 2: Funktion manShipPlacement konnte aufgerufen werden und gibt den Wet TRUE aus |
  | State: - | Note : - | BugID: - |
- [TC-32.020] | Es werden alle Schiffe plaziert
  | PC: Funktion setFleet() ist implementiert und funktionsfähig |
  | Task 1: Funktion setFleet aufrufen; Task 2: Koordinaten der gesetzten Schiffe auslesen |
  | Eingabedaten: 1K 2K | 
  | Ergebnis 1: Funktion setFleet konnte aufgerufen werden; Ergebnis 2: Die Koordinaten der gesetzten Schiffe wurden ausgelesen |
  | State: - | Note : - | BugID: - |
- | [TC-32.030] | Kein Schiff ragt über das Spielfeld
  | PC: Funktion setFleet(), createField(size) sind implementiert und funktionsfähig |
  | Task 1: Funktion setFleet aufrufen; Task 2: Koordinaten der gesetzten Schiffe auslesen Task 3: Koordinaten der gesetzten Schiffe mit den max. Koordinaten des Spielfelds vergleichen | 
  | Eingabedaten: 1K 2K |
  | Ergebnis 1: Funktion setFleet konnte aufgerufen werden; Ergebnis 2: Die Koordinaten der gesetzten Schiffe wurden ausgelesen; Ergebnis 3: Die Koordinaten der gesetzten Schiffe liegen nicht ausserhalb des vorgegebenen Spielfelds |
  | State: - | Note : - | BugID: - |
- | [TC-32.040] | Kein Schiff kreuzt ein anderes
  | PC: Funktion printFleet ist implementiert und funktionsfähig |
  | Task 1: Funktion printfleet aufrufen 2Arrays aus printfleet vergleichen, ob Werte doppelt vorhanden sind |
  | Eingabedaten: keine |
  | Ergebnis 1: Funktion printFleet liefert Daten; Ergebnis 2: keine Doppelten Werte vorhanden |
  | State: - | Note : - | BugID: - |
- [TC-32.050] | Kein Schiff ist diagonal platziert 
  | PC: Funktion testNotDiagonalShip ist implementiert und funktionsfähig |
  | Task 1: Funktion testNotDiagonalShip aufrufen; Task 2: Ergebnis aus Funktion testNotDiagonalShip ablesen |
  | Eingabedaten: keine |
  | Ergebnis 1: Funktion testNotDiagonalShip wurde ausgeführt; Ergebnis 2: Die Funktion testNotDiagonalShip gibt TRUE aus |
  | State: - | Note : - | BugID: - |
- [TC-32.060] | Alle Schiffe (siehe TC-36) sind am Spielfeld verteilt. 
  | PC: [welches Schiffe in der Flotte , Field AUsgabe , Prüfen ob Schiffe auch am SPielfeld vorhanden ]
  | Task:
  | Eingabedaten: keine |
  | Ergebnis:
- [TC-32.070] | Die Verteilung ändert sich bei mehrmaligen automatischen Verteilen (min. 1 Schiff muss auf anderen Koordinaten positioniert sein)  
  | PC: |
  | Task: |
  | Eingabedaten: keine |
  | Ergebnis: |
- [TC-32.080] | Die Verteilung erfolgt gemäß den Vorgaben (Regeln)
  | PC: |
- 
- 
  | Task 1: mit der Funktion Player(name) 2 Player-Objekte mit Standard-Spielfeld erstellen; Task 2: mit der Funktion Player.setStandardFleet die Spielfelder mit Schiffen (zufällige Platzierung) füllen |
  | Eingabedaten: keine |
  | Ergebnis: zufällige Verteilung, wenn beide Spielfelder inhaltlich unterschiedlich sind |

## [DoD-33] Der User bekommt eine Fehlermeldung angezeigt, wenn er die Schiffe falsch platziert
- [DoD-33.010] Wenn ein Schiff aus dem Spielfeld ragt, erscheint die Meldung "Das Schiff muss sich innerhalb des Spielfelds befinden!"
- [DoD-33.020] Wenn ein Schiff ein anderes Schiff kreuzt bzw. überlappt, erscheint die Meldung "Das Schiff darf mit keinem anderen Schiff kollidieren!"

## [TC-34] Dem User wird angezeigt wieviele gegnerische Schiffe er getroffen/versenkt hat
- [TC-34.010] Bei der Ausgabe des gegnerischen Feldes ist erkennbar, welche Schiffe der User getroffen & versenkt hat (siehe [TC-40]
- [TC-34.020] Zusätzlich zur Ausgabe des gegnerischen Feldes wird ein Counter mit Beschriftung "Getroffen: ", angezeigt welcher die Anzahl der getroffenen Schiffe als Zahl anzeigt 
- [TC-34.030] Zusätzlich zur Ausgabe des gegnerischen Feldes wird ein Counter mit Beschriftung "Versenkt: ", angezeigt welcher die Anzahl der versenkten Schiffe als Zahl anzeigt

## [DoD-35] Dem User wird angezeigt, wieviele eigene Schiffe getroffen/versenkt wurden
- [DoD-35.010] Es wird überprüft, wieviele eigene Schiffe getroffen wurden
- [DoD-35.020] Es wird überprüft, wieviele eigene Schiffe versenkt wurden
- [DoD-35.030] Es wird überprüft, wieviele eigene Schiffe noch intakt sind
- [DoD-35.040] Es wird die Meldung " %d Schiffe versenkt" angezeigt
- [DoD-35.050] Es wird die Meldung " %d Schiffe getroffen" angezeigt
- [DoD-35.060] Es wird die Meldung " %d Schiffe intakt" angezeigt

## [TC-36] Dem User stehen verschiedene Schiffe zum Spielen zu Verfügung
| TC-36.001| PC: Funktion printTestFleetComplete() wird benötigt | 1 Task: Funktion printTestFleetComplete() aufrufen | keine Eingabedaten | Ergebnis: Flotte wird zurückgegeben | State : - | Note : - | BugID: - |
| Number	  | Precondition | Task  | Eingabedaten	  | Ergebnis	   | State  | Notes |  Bug-ID |
| TC-36.002| PC: Funktion für [???] ist implementiert und funktionsfähig | Task: Funktion [???] aufrufen | Eingabedaten: - | Ergebnis:  | State: - | Notes: - | Bug-ID: - |

- [TC-36.010] Der User verfügt über 1 Flugzeugträger, welcher 5 Einheiten lang ist
- [TC-36.020] Der User verfügt über 2 Schlachtschiffe, welche 4 Einheiten lang sind
- [TC-36.030] Der User verfügt über 3 Zerstörer, welche 3 Einheiten lang sind
- [TC-36.040] Der User verfügt über 4 U-Boote, welche 2 Einheiten lang sind
- [TC-36.050] Die Felder der Schiffe haben zwei Zustände (Getroffen, nicht getroffen)
- [TC-36.060] Das Schiff wird darauf überprüft, ob es gesunken ist (alle Felder getroffen).
  | PC: Funktion printCheckIfSunk() ist implementiert und funktionsfähig | 
  | Task: Funktion printCheckIfSunk() aufrufen | 
  | Eingabedaten: keine - | 
  | Ergebnis: printCheckIfSunk() gibt Ergebnisse zurück |
  | State: - | Note : - | BugID: - | 
- [TC-36.070] Das Schiff hat zwei Zustände (floating, sunken)
  | PC: Funktion printCheckIfSunk() ist implementiert und funktionsfähig | 
  | Task: Funktion printCheckIfSunk() aufrufen | 
  | Eingabedaten: keine | 
  | Ergebnis: printCheckIfSunk() gibt Ergebnisse zurück |
  | State: - | Note: - | BugID: - |

## [DoD-37] Der User kann Schiffe manuell platzieren
- [DoD-37.010] Es wird überprüft, ob der User die manuelle Schiffsplatzierung gewählt hat
- [DoD-37.020] Dem User wird angezeigt, wieviele Schiffe er platzieren kann
- [DoD-37.030] Die Anzeige passt sich an, wenn der User ein Schiff platziert hat
- [DoD-37.040] Der User gibt die Koordinate für das Startfeld des Schiffs an (Zuerst hotizontal, dann vertikal)
- [DoD-37.050] Der User wählt zwischen H = Horizontale ausrichtung und V = vertikale Ausrichtung
- [DoD-37.060] Es wird überprüft, ob das Schiff an der angegebenen Position platziert werden darf
- [DoD-37.070] Wenn alle Schiffe platziert worden sind, erfolgt die Meldung "Alle Schiffe platziert, die Schlacht kann beginnen"

## [DoD-38] Der User kann die Größe des quadratischen Spielfeldes einstellen
- [DoD-38.010] Es wird überprüft, ob eine variable Spielfeldgröße gewählt worden ist
- [DoD-38.020] Der User gibt die Größe des Spielfeldes an
- [DoD-38.030] Die Größe muss zwischen 10 und 50 Einheiten sein



## [TC-39] Der User sieht bei der Ausgabe des Spielfeldes die Achsenbeschriftung
X- [TC-39.010] Es muss über eine Variable die Größe des Spielfeldes bekannt sein
| TC-39.010   | PC: Field.size muss gesetzt sein | Task: mit Funktion printSizeOfField(Field) die Field.size ausgeben lassen | Eingabedaten : Field | Ergebnis : die Funktion printSizeOfField(Field) gibt die Feldgröße von Field aus | State : - | Note : - | BugID: - |
X- [TC-39.020] Die horizontale Beschriftung ist alphabetisch fortlaufend, beginnt bei der ersten Spalte mit A und wird pro Spalte um einen Buchstaben im Alphabet hochgezählt.
| TC-39.020   | PC: Funktion printTestField() muss vorhanden und funktionsfähig sein | Task: mit Funktion printTestField() das Field ausgeben lassen | Eingabedaten : - | Ergebnis : die Funktion printTestField() gibt das Feld mit den Achsenbeschriftungen aus | State : - | Note : - | BugID: - |
X- [TC-39.030] Die vertikale Beschriftung ist numerisch fortlaufend, beginnt in der ersten Zeile mit 1 und wird pro Zeile um 1 erhöht.
| TC-39.030   | PC: Funktion printTestField() muss vorhanden und funktionsfähig sein | Task: mit Funktion printTestField() das Field ausgeben lassen | Eingabedaten : - | Ergebnis : die Funktion printTestField() gibt das Feld mit den Achsenbeschriftungen aus | State : - | Note : - | BugID: - |

  Task 1: mit der Funktion Player(name) 1 Player-Objekt mit Standard-Spielfeld erstellen
  Task 2: mit der Funktion Player.setStandardFleet das Spielfeld mit Schiffen (zufällige Platzierung) füllen
  Task 2: mit der Funktion Player.printFieldSet die Spielfelder ownField und opponentInfoField mit Achsenbeschriftung ausgeben
  Ergebnis 1: Ausgabe beinhaltet die Achenbeschriftung xAchse: "A B C D E F G H I J"
  Ergebnis 2: Ausgabe beinhaltet die Achenbeschriftung yAchse: "1 2 3 4 5 6 7 8 9 10"

## [TC-40] Dem User wird das Spielfeld und dessen aktueller Inhalt auf der Konsole ausgegeben
- [TC-40.010] Der User erhält sein Spielfeld und das gegnerische Feld in der gewählten Größe in der Konsole untereinander ausgegeben.
| TC-40.010   | PC: Funktion printFieldSet() muss vorhanden und funktionsfähig sein | 
  Task 1: mit der Funktion Player(name) ein Player-Objekt mit Standard-Spielfeld angeben
  Task 2: mit der Funktion Player.setStandardFleet das Spielfeld mit Schiffen (zufällige Platzierung) füllen
  Task 3: mit der Funktion Player.printFieldSet das OwnField und OpponentInfoField ausgeben
  Ergebnis 1: die Funktion Player.setStandardFleet legt ein Standard-Spielfeld mit zufällig platzierten Schiffen an
  Ergebnis 2: die Funktion Player.printFieldSet gibt das OwnFIeld und OpponentInfoField auf der Console aus
 
- [TC-40.020] Auf dem gegnerischen Feld werden getroffene Schiffe mit einem "X" angezeigt.
  | Number	  | Precondition | Task  | Eingabedaten	  | Ergebnis	   | State  | Notes |  Bug-ID |
  | TC-40.020   | PC:  Funktion für [???] ist implementiert und funktionsfähig | Task : Funktion [???] aufrufen | Eingabedaten :  | Ergebnis : Die getroffenen Schiffe auf dem gegnerischen Feld mit "X" anzeigen | State  | Notes |  Bug-ID |

- [TC-40.030] Auf dem gegnerischen Feld werden versenkte Schiffe mit einem "#" angezeigt.
  | Number	  | Precondition | Task  | Eingabedaten	  | Ergebnis	   | State  | Notes |  Bug-ID |
  | TC-40.030   | PC:  Funktion für [???] ist implementiert und funktionsfähig | Task : Funktion [???] aufrufen | Eingabedaten :  | Ergebnis : Die versenkten Schiffe auf dem gegnerischen Feld mit "#" anzeigen | State  | Notes |  Bug-ID |

- [TC-40.040] Auf dem gegnerischen Feld werden nicht getroffene Schüsse (Felder auf die bereits geschossen wurde, aber kein Schiff steht) mit "/" gekennzeichnet.
  | Number	  | Precondition | Task  | Eingabedaten	  | Ergebnis	   | State  | Notes |  Bug-ID |
  | TC-40.040   | PC:  Funktion für [???] ist implementiert und funktionsfähig | Task : Funktion [???] aufrufen | Eingabedaten :  | Ergebnis : Die bereits beschossenen aber nicht besetzten Felder auf dem gegnerischen Feld mit "/" anzeigen | State  | Notes |  Bug-ID |

- [TC-40.050] Auf dem gegnerischen Feld werden noch nicht beschossene Felder mit "~" gekennzeichnet.
  | Number	  | Precondition | Task  | Eingabedaten	  | Ergebnis	   | State  | Notes |  Bug-ID |
  | TC-40.050   | PC:  Funktion für [???] ist implementiert und funktionsfähig | Task : Funktion [???] aufrufen | Eingabedaten :  | Ergebnis : Die nicht beschossenen und nicht besetzten Felder auf dem gegnerischen Feld mit "~" anzeigen | State  | Notes |  Bug-ID |

- [TC-40.060] Auf dem eigenen Feld werden getroffene Schiffe mit einem "X" angezeigt.
  | Number	  | Precondition | Task  | Eingabedaten	  | Ergebnis	   | State  | Notes |  Bug-ID |
  | TC-40.060   | PC:  Funktion für [???] ist implementiert und funktionsfähig | Task : Funktion [???] aufrufen | Eingabedaten :  | Ergebnis : Die getroffenen Schiffe auf dem eigenen Feld mit "X" anzeigen | State  | Notes |  Bug-ID |

- [TC-40.070] Auf dem eigenen Feld werden versenkte Schiffe mit einem "#" angezeigt.
  | Number	  | Precondition | Task  | Eingabedaten	  | Ergebnis	   | State  | Notes |  Bug-ID |
  | TC-40.070   | PC:  Funktion für [???] ist implementiert und funktionsfähig | Task : Funktion [???] aufrufen | Eingabedaten :  | Ergebnis : Die versenkten Schiffe auf dem eigenen Feld mit "#" anzeigen | State  | Notes |  Bug-ID |

- [TC-40.080] Auf dem eigenen Feld werden Schüsse des Gegners, die nicht getroffen haben mit "/" gekennzeichnet.
  | Number	  | Precondition | Task  | Eingabedaten	  | Ergebnis	   | State  | Notes |  Bug-ID |
  | TC-40.080   | PC:  Funktion für [???] ist implementiert und funktionsfähig | Task : Funktion [???] aufrufen | Eingabedaten :  | Ergebnis : Die bereits beschossenen aber nicht besetzten Felder auf dem eigenen Feld mit "/" anzeigen | State  | Notes |  Bug-ID |

- [TC-40.090] Auf dem eigenen Feld werden leere Felder (ohne Schuss und ohne Schiff) mit "~" gekennzeichnet.
  | Number	  | Precondition | Task  | Eingabedaten	  | Ergebnis	   | State  | Notes |  Bug-ID |
  | TC-40.090   | PC:  Funktion für [???] ist implementiert und funktionsfähig | Task : Funktion [???] aufrufen | Eingabedaten :  | Ergebnis : Die nicht beschossenen und nicht besetzten Felder auf dem eigenen Feld mit "~" anzeigen | State  | Notes |  Bug-ID |

- [TC-40.100] Auf dem eigenen Feld werden vom Gegner nicht getroffene Schiffe mit "0" gekennzeichnet.
  |TC-40.100| derzeit nicht relevant - es war gemeint, dass die Schiffe mit den jeweiligen Zahlen (zB 2er Schiff mit "2" und 3er Schiff mit "3" usw. ) angezeigt werden


## [DoD-41] Dem User wird das Spielfeld und dessen aktueller Inhalt auf der GUI ausgegeben
- [DoD-41.010] Das Spielfeld wird an grafisch Wiedergegeben
- [DoD-41.020] Die Schiffe sind der Größe entsprechend modelliert und werden am Spielfeld wiedergegeben
- [DoD-41.030] Die Textmeldungen werden an der GUI mit einem Pop-up-Fenster angezeigt
- [DoD-41.040] Die Kommandoeingabe wird durch die Pop-up-Fenster eingelesen
- [DoD-41.050] Die Visualisierung der Schiffe ist so aufgebaut, dass ein klarer Unterschied zwischen intakt, getroffen und versenkt angezeigt wird
- [DoD-41.060] Die Eingabe via Maus (Koordinaten für einen Schussversuch, Schiffe platzieren, ...) ist möglich

## [TC-42] Der User bekommt ein Standard-Spielfeld mit 10x10 im Default-Spielmodus
- [TC-42.010] Beim Starten des Default-Spielmodus wird als Größe des Spielfeldes 10 definiert.
  PC: Die Funktionen Player.createField() und Player.getField.length() sind implementiert und es sind die Default-Werte ausgewählt
  Task 1: mit der Funktion Player.createField() ein Standard-Spielfeld anlegen
  Task 2: mit der Funktion Player.getField.length() die Größe ausgeben lassen
  Ergebnis 1: die Funktion Player.createField() gibt ein Standard-Spielfeld aus
  Ergebnis 2: die Funktion Player.getField.length() gibt die Grösse 10x10 aus | State : - | Note : - | BugID: - |


## [DoD-43] Der User kann die Schwierigkeit durch die Anzahl der Schiffe und die Spielfeldgröße variieren
- [DoD-43.010] Die Eingabe der Spielfeldgröße ist möglich
- [DoD-43.020] Die Eingabe der Anzahl der Flugzeugträger ist möglich (1-3)
- [DoD-43.030] Die Eingabe der Anzahl der Schlachtschiffe ist möglich (2-6)
- [DoD-43.040] Die Eingabe der Anzahl der Zerstörer ist möglich (3-9)
- [DoD-43.050] Die Eingabe der Anzahl der U-Boote ist möglich (4-12)


## [TC-44] Der User versenkt das letzte gegnerische Schiff und beendet damit das Spiel
- [TC-44.010] Bei jedem Versenken eines gegnerischen Schiffes wird überprüft, ob es noch aktive ("schwimmende") Schiffe des Gegners gibt.
- [TC-44.020] Wenn es noch aktive Schiffe gibt, wird das Spiel fortgesetzt
| TC-44.020   | PC: Funktion existActiveShips() ist vorhanden und funktionsfähig | Task: Funktion existActiveShips() aufrufen | Eingabedaten: keine | Ergebnis : Funktion existActiveShips() gibt True zurück | State : - | Note : - | BugID: - |
- [TC-44.030] Gibt es keine aktive Schiffe mehr, erfolgt kein weiterer Spielzug.
| TC-44.030   | PC: Funktion existActiveShips() ist vorhanden und funktionsfähig | Task: Funktion existActiveShips() aufrufen | Eingabedaten: keine | Ergebnis : Funktion existActiveShips() gibt True zurück | State : - | Note : - | BugID: - |
- [TC-44.040] Der User wird über den Ausgang des Spieles textuell informiert (siehe [TC-45.010]


## [TC-45] Der User erhält die Information, dass das Spiel beendet ist
- [TC-45.010] Es wird der gewählten Sprache sinngemäß die Meldung "Das Spiel ist nun beendet. XYZ hat gewonnen." ausgegeben.
| TC-45.010   | PC: Funktion existActiveShips() ist vorhanden und funktionsfähig | Task: Funktion existActiveShips() aufrufen | Eingabedaten: keine | Ergebnis : Funktion existActiveShips() gibt FALSE zurück --> Es wird die Meldung "Das Spiel ist nun beendet. XYZ hat gewonnen." in der Konsole ausgegeben | State : - | Note : - | BugID: - |

## [DoD-46] Der User erhält nach beendigung des Spiels die Möglichkeit detaillierte Informationen über das Spielergebnis angezeigt zu bekommen
- [DoD-46.010] Es wird die meiste Treffequote (Treffer die nacheinander erzielt worden sind) angezeigt
- [DoD-46.020] Es wird die Anzahl der Spielzüge angezeigt
- [DoD-46.030] Es wird die Dauer des Spiels angezeigt
- [DoD-46.040] Es wird die Fehltrefferquote angezeigt
- [DoD-46.050] Es wird das Verhältnis zwischen den zwei Gegnern angezeigt (Treffer, Fehltreffer, Versenkte Schiffe)


## [TC-47] Der User erhält nach Beendigung des Spiels die Möglichkeit erneut zu Spielen
- [TC-47.010] Nach Spielbeendigungsmeldung (siehe US-45 // TC-45.010) erhält der User eine Taste/Eingabemöglichkeit "Erneut spielen"
| Number	  | Precondition | Task  | Eingabedaten	  | Ergebnis	   | State  | Notes |  Bug-ID |
| TC-47.010   | PC:  Funktion für [weiterspielen]/[play again] ist implementiert und funktionsfähig | Task : Funktion [play again] aufrufen | Eingabedaten : [play again] wurde ausgewählt | Ergebnis : Möglichkeit "das Spiel erneut zu spielen" erhalten | State  | Notes |  Bug-ID |  
- [TC-47.020] Bei Wahl dieser Möglichkeit wird der User zum Startscreen weitergeleitet.
| Number	  | Precondition | Task  | Eingabedaten	  | Ergebnis	   | State  | Notes |  Bug-ID |
| TC-47.020   | PC:  Funktion für [weiterspielen]/[play again] ist implementiert und funktionsfähig | Task : Funktion [play again] aufrufen | Eingabedaten : [play again] wurde ausgewählt | Ergebnis : der User zum Startscreen weitergeleitet | State  | Notes |  Bug-ID |


## [TC-48] Der User erhält nach Beendigung des Spiels die Möglichkeit das Programm zu beenden 
- [TC-48.010] Nach Spielbeendigungsmeldung (siehe US-45 // TC-45.010) erhält der User eine Taste/Eingabemöglichkeit "Programm beenden"
| Number	  | Precondition | Task  | Eingabedaten	  | Ergebnis	   | State  | Notes |  Bug-ID |
  | TC-48.010   | PC:  Funktion für [play again] oder [quit]  ist implementiert und funktionsfähig | Task : | Eingabedaten : ?! | Ergebnis : nach Spielbeendigungsmeldung wird eine Auswahl [play again] oder [quit] angezeigt | State  | Notes |  Bug-ID |
- [TC-48.020] Bei Wahl dieser Möglichkeit wird das Programm beendet & geschlossen.
  | Number	  | Precondition | Task  | Eingabedaten	  | Ergebnis	   | State  | Notes |  Bug-ID |
  | TC-48.020   | PC:  Funktion für [play again] oder [quit]  ist implementiert und funktionsfähig | Task : Funktion [Quit] aufrufen | Eingabedaten : ?! | Ergebnis : das Spiel wird ordnungsgemäß beendet und das Programm geschlossen | State  | Notes |  Bug-ID |

## [TC-49] Der User erhält Rückmeldung über das Ergebnis seines Schusses
- [TC-49.010] Es wird überprüft, ob der Schuss ein gegnerisches Schiff getroffen hat
| Number	  | Precondition | Task  | Eingabedaten	  | Ergebnis	   | State  | Notes |  Bug-ID |
| TC-49.010   | PC: Funktion checkIfShotHit() ist implementiert und funktionsfähig | Task : Funktion checkIfShotHit() aufrufen | Eingabedaten : ?! | Ergebnis : gibt zurück ob das Schiff durch den Schuss gehitet wurde | State  | Notes |  Bug-ID |
- [TC-49.020] Wenn der User kein Schiff getroffen hat erfolgt die Meldung "Kein Treffer"
| TC-49.020   | PC: Funktion checkIfShotHit() ist implementiert und funktionsfähig | Task : Funktion checkIfShotHit() aufrufen | Eingabedaten : ?! | Ergebnis : wenn die Funktion FALSE ergibt, die Meldung "Kein Treffer" ausgeben | State  | Notes |  Bug-ID |
- [TC-49.030] Wenn ein Schiff getroffen wurde erfolgt die Meldung "Treffer!!"
| TC-49.030   | PC: Funktion checkIfShotHit() ist implementiert und funktionsfähig | Task : Funktion checkIfShotHit() aufrufen | Eingabedaten : ?! | Ergebnis : wenn die Funktion TRUE ergibt, die Meldung "Treffer!!" ausgeben | State  | Notes |  Bug-ID |

## [TC-50] Der User erhält Rückmeldung ob er mit dem Schuss ein Schiff versenkt hat
- [TC-50.010] Es wird nach einem erfolgreichen Schuss (Schuss hat ein Schiff getroffen) überprüft, ob ein Schiff noch intakte Felder besitzt
| Number	  | Precondition | Task  | Eingabedaten	  | Ergebnis	   | State  | Notes |  Bug-ID |
| TC-50.010   | PC: Funktion checkIfShotHit()=TRUE | Task : Funktion checkWhichShipWasShot(Shot<der getroffen hat>)  | Eingabedaten : ?! | Ergebnis : Ship als Ergebnis ,   | State  | Notes |  Bug-ID |
| TC-50.011   | PC: Funktion checkWhichShipWasShot(Shot<der getroffen hat>)=<SHIP> | Task: checkIfSunk(Ship) aufrufen | Eingabedaten : <Ship> | Ergebnis : TRUE oder FALSE 
- [TC-50.020] Wenn ein Schiff keine intakten Felder besitzt erfolgt die Meldung "Versenkt!!"
| TC-50.020   | PC: Funktion checkIfSunk()=TRUE | Task: checkIfSunk(Ship) aufrufen | Eingabedaten : ?! | Ergebnis : wenn <TRUE> , die Meldung "Versenkt!!" ausgeben | State  | Notes |  Bug-ID |


## [TC-51] Der User erhält Rückmeldung ob seine Eingaben über den Schuss valide sind
- [TC-51.010] Die Eingabe der Koordinaten wird eingelesen
| Number	  | Precondition | Task  | Eingabedaten	  | Ergebnis	   | State  | Notes |  Bug-ID |
| TC-51.010   | PC: Funktion shootsAt(Coodinate, Player) ist implementiert und funktionsfähig | Task: Funktion shootsAt(Coodinate, Player) mit den Eingabedaten | Eingabedaten : ?! | Ergebnis :  | State  | Notes |  Bug-ID |
- [TC-51.020] Die Koordinaten müssen sich am Spielfeld befinden, dh innerhalb der Spielgröße liegen.
| Number	  | Precondition | Task  | Eingabedaten	  | Ergebnis	   | State  | Notes |  Bug-ID |
| TC-51.020   | PC: Funktion  | Task:  | Eingabedaten : ?! | Ergebnis :  | State  | Notes |  Bug-ID |
- [TC-51.030] Die Koordinate darf in einem früheren Zug noch nicht beschossen worden sein.
 | Number	  | Precondition | Task  | Eingabedaten	  | Ergebnis	   | State  | Notes |  Bug-ID |
| TC-51.030   | PC: Funktion  | Task:  | Eingabedaten : ?! | Ergebnis :  | State  | Notes |  Bug-ID |
- [TC-51.040] Bei einer falschen Eingabe erfolgt eine Fehlermeldung "Dieser Schuss war nicht gültig" & der User darf erneut schießen.
| Number	  | Precondition | Task  | Eingabedaten	  | Ergebnis	   | State  | Notes |  Bug-ID |
| TC-51.040   | PC: Funktion  | Task:  | Eingabedaten : ?! | Ergebnis :  | State  | Notes |  Bug-ID |
- [TC-51.050] Bei einer richtigen Eingabe erfolgt die Meldung "Schuss erfolgreich abgegeben."
| Number	  | Precondition | Task  | Eingabedaten	  | Ergebnis	   | State  | Notes |  Bug-ID |
| TC-51.050   | PC: Funktion  | Task:  | Eingabedaten : ?! | Ergebnis :  | State  | Notes |  Bug-ID

## [DoD-53] Der User erhält aussagekräftige Eingabeaufforderungen
- [DoD-53.010] TBC - Dem User wird angezeigt, dass er seinen Namen eingeben soll
- [DoD-53.020] TBC - Dem User wird angezeigt, dass er seinen Gegner auswählen soll
- [DoD-53.030] TBC - Dem User wird angezeigt, dass er Schusskoordinaten eingeben soll
- [DoD-53.040] TBC - Dem User wird angezeigt, ob er das Spiel nach einer Unterbrechung fortsetzen möchte
- [DoD-53.050] TBC - Dem User wird angezeigt, ob er die Spielstatistik angezeigt haben will
- [DoD-53.060] TBC - Dem User wird angezeigt, ob er noch ein Mal spielen möchte
- [DoD-53.070] TBC - Dem User wird eine Fehlermeldung ausgegeben, wenn die Eingabe falsch war
- [DoD-53.080] TBC - Der User kann zwischen 3 Sprachen auswählen
- [DoD-53.090] TBC - Der User wird abgefragt, ob er für seinen Zug bereit ist
- [DoD-53.100] TBC - Der User wird abgefragt, ob er nach Spielende aufhören möchte

## [DoD-54] Der User kann die Sprache des Spiels auswählen
- [DoD-54.010] Die Standardsprache für das Spiel ist Englisch
  | PC: |
  | Task: |
  | Ergebnis: |
- [DoD-54.020] Der User kann die Sprache Deutsch wählen
  | PC: |
  | Task: |
  | Ergebnis: |
- [DoD-54.030] Der User kann die Sprache D² wählen
  | PC: |
  | Task: |
  | Ergebnis: |

## [DoD-55] Der User bekommt eine akustische Rückmeldung über das Ergebnis seines Treffers
- [DoD-55.010] Wenn ein Schiff getroffen wird, erfolgt eine akustisch Ausgabe, die einer Explosion gleicht
- [DoD-55.020] Wenn Wasser geroffen wird, erfolgt eine akustische Ausgabe, die Wasserplatschen imitiert


## [TC-56] Der User hat die Möglichkeit sich die Spielregeln in der ausgewählten Sprache vor dem Spielbeginnn anzeigen zu lassen
- [TC-56.010] Beim Spielstart besteht die Möglichkeit sich die Spielregeln ausgeben zu lassen |
  | PC: Die Funktion printGameRules() ist implementiert und funktionsfähig |
  | Task: Die Funktion printGameRules() aufrufen |
  | Ergebnis: Es werden die Spielregeln angezeigt |

## [TC-57] Der User hat die Möglichkeit sich die Spielregeln während des Spiels anzeigen zu lassen
- [TC-57.010] Während des Spielverlaufs besteht die Möglichkeit sich die Spielregeln anzeigen zu lassen
  | PC: Die Funktion printingGamerules() ist implementiert und funktionsfähig |
  | Task: die Funktion printingGamerules() aufrufen |
  | Ergebnis: Es werden die Spielregeln anzeigt |

## [DoD-58] Der User hat die Möglichkeit das Spiel zu pausieren
- [DoD-58.010] Ist der Pause-modus gewählt wird der Timer für die Spielzeit angehalten

## [DoD-59] Der User hat die Möglichkeit das Spiel abzubrechen
- [DoD-59.010] TBC - Es wird angezeigt, dass der User das Spiel abbrechen kann
- [DoD-50.020] TBC - Der User kann über die Eingabe von "(q)uit" das Spiel abbrechen

## [TC-60] Dem User wird angezeigt welches Zeichen am Feld was bedeutet
- [TC-60.010] Dem User wird der Text "X ==> Schiff getroffen" angezeigt
- | TC-60.010 | PC: Funktion checkIfHit() ist implementiert und funktionsfähig | Task: Funktion checkIfHit() aufrufen und auf TRUE setzen | Eingabedaten : TRUE | Ergebnis : Die Funktion checkIfHit() wurde ausgeführt und die Meldung "X ==> Schiff getroffen" wird ausgegeben | State : - | Note : - | BugID: - |
- 
- [TC-60.020] Dem User wird der Text "# ==> Schiff versenkt" angezeigt
- | TC-60.020 | PC: Funktion checkIfSunk() ist implementiert und funktionsfähig | Task: Funktion checkIfSunk() aufrufen und auf TRUE setzen | Eingabedaten : TRUE | Ergebnis : Die Funktion checkIfHit() wurde ausgeführt und die Meldung "# ==> Schiff versenkt" wird ausgegeben | State : - | Note : - | BugID: - |
- 
- [TC-60.030] Dem User wird der Text "- ==> Schuss ins Wasser" angezeigt
- | TC-60.030 | PC: Funktion checkIfHit() ist implementiert und funktionsfähig | Task: Funktion checkIfHit() aufrufen und auf FALSE setzen | Eingabedaten : FALSE | Ergebnis : Die Funktion checkIfHit() wurde ausgeführt und die Meldung "- ==> Schuss ins Wasser" wird ausgegeben | State : - | Note : - | BugID: - |
- 
- [TC-60.040] Dem User wird der Text "0 ==> Eigenes, ungetroffenes Schiff" angezeigt
- | TC-60.040 | PC:  | Task:  | Eingabedaten : - | Ergebnis :  | State : - | Note : - | BugID: - |
- 
- [TC-60.050] Dem User wird der Text "~ ==> Leeres Feld (eigenes Spielfeld)" angezeigt
- | TC-60.050 | PC:  | Task:  | Eingabedaten : - | Ergebnis :  | State : - | Note : - | BugID: - |
- 
- [TC-60.060] Dem User wird der Text "~ ==> Feld noch unbekannt (gegnerisches Spielfeld)" angezeigt
- | TC-60.060 | PC:  | Task:  | Eingabedaten : - | Ergebnis :  | State : - | Note : - | BugID: - |

## [DoD-61] Der User hat die Möglichkeit, die Audioeffekte an- bzw. abzuschalten
- [DoD-61.010] Es wird abgefragt, ob Audioeffekte erwünscht sind
- [DoD-61.020] Falls erwünscht wird die Methode für Audioeffekte angeschaltet
- [DoD-61.030] Falls nicht erwünscht wird die Methode für Audioeffekte abgeschaltet