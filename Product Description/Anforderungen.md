# Anforderungen

## Ships
- User kann Schiffe manuell platzieren [TSV-37]
- Spieler kann Schiffe random aufstellen lassen [TSV-32]
- Ausgabe an den Spieler, falls er ein Schiff nicht dort hinplatzieren kann, wo er ausgewählt hat [TSV-33]
- Count wie viele Schiffe getroffen u/o versenkt worden sind [TSV-34]
- Count wie viele eigene Schiffe getroffen u/o versenkt worden sind [TSV-35]
- Schiffsauflistung, damit Spieler weiß welche Schiffe er platzieren kann [TSV-36]
  - ein Schlachtschiff (5 Kästchen) [TSV-36]
  - zwei Kreuzer (je 4 Kästchen) [TSV-36]
  - drei Zerstörer (je 3 Kästchen) [TSV-36]
  - vier U-Boote (je 2 Kästchen) [TSV-36]

## Field
- Die Beschriftung der Horizontalachse erfolgt mit Buchstaben bei A beginnend fortlaufend, von links nach rechts [TSV-39]
- Die Beschriftung der Vertikalachse erfolgt mit Zahlen bei 1 beginnend fortlaufend, von oben nach unten [TSV-39]
- Die Ausgabe der Spielfelder ist über die Konsole möglich [TSV-40]
- Die Ausgabe der Spielfelder ist über die GUI möglich [TSV-41]
  - Genauere Definition der GUI wird in einem eignen Punkt erfolgen 
- Das Spielfeld hat als Standardeinstellung eine Größe von 10X10 Feldern [TSV-42]
- Es besteht die Möglichkeit, dass der Spieler die Größe des Spielfeldes wählen kann. [TSV-38]
  - Einstellmöglichkeit von 10X10 bis 50X50 Feldern [TSV-38]
- 

## Game logic
- Schwierigkeiten des Spiels durch verschieden großen Spielfeldern variieren können [TSV-43]
- Der User versenkt alle gegnerischen Schiffe, das Spiel muss terminieren [TSV-44]
- Bei einer Spiel terminierung muss der Grund der Terminierung angegeben werden [TSV-45]
- Bei Terminierungsmeldung soll es die Auswahl der weiteren Schritte geben (z.b. nochmal spielen, Spiel beenden) [TSV-47 und TSV-48]
- Am Ende des Spiels werden detaillierte Informationen (verbrauchte Schüsse, usw. ) angezeigt... [TSV-46]
- Nach Eingabe der Koordinaten muss überprüft werden ob Koordinaten valide sind (Char von A-Z, Int von 1 - 50, etc) [TSV-51]
- Falls eine valide Koordinate eingegeben wurde muss überprüft werden, ob dort hin schon einmal geschossen wurde -> Fehlermeldung ausgeben & Schuss wiederholen [TSV-51]
- Schüsse werden überprüft, ob sie was getroffen haben (ja / nein) [TSV-49]
- Direkt nach einem Schuss der getroffen hat muss überprüft werden, ob das Schiff versenkt wurde (ja/nein) [TSV-50]
- Nach jedem Treffer eines Schiffes muss überprüft werden, ob alle Schiffe versenkt worden sind [TSV-44]
- Die Spieler wechseln sich stetig ab, eine weitere Schussabgabe ist nach einem Treffer ist beim aktuellen Spielzug nicht möglich [TSV-52]

## Outputs
- Grafische Abbildung des Spielfeldes [TSV-40 und TSV-41]
- Grafische Abbildungen der Schiffe  [TSV-40 und TSV-41]
- Wording der Useraufforderungen schreiben [TSV-53]
- Wahl zwischen Englisch (Default) und Deutsch [TSV-54]
- Möglichkeit einer HighScoreBoards [TSV-46]
- Sound Effekts, wenn Boote getroffen werden [TSV-55]
- Möglichkeit sich die geltenden vor Spiel beginn Regeln anzeigen zu lassen [TSV-56]
- Möglichkeit sich die geltenden während dem Spiel beginn Regeln anzeigen zu lassen [TSV-57]


## Documentation and Usabilty
- Möglichkeit Spiel zu pausieren [TSV-58]
- Möglichkeit Spiel abzubrechen [TSV-59]
- Legende die auflistet welches Zeichen am Board was heißt [TSV-60]
- Legende wird angezeicht wie Koordinaten sich zusammensetzen (zb Buchstaben A-X horizontal, Nummern vertical) [TSV-39]
- Dokumentation verfassen (Beschreibung etc)

## Ship placement
- Es müssen alle Schiffe verwendet werden. [TSV-32 und TSV-37]
- Die Schiffe dürfen sich nicht kreuzen oder überlappen. [TSV-32 und TSV-37]
- Schiffe dürfen nicht diagonal aufgestellt werden. [TSV-32 und TSV-37]
- Schiffe dürfen keine Ausbuchtung besitzen. [TSV-32 und TSV-37]

## Shooting 
- Anhand der eingegebenen Koordinate wird überprüft, ob der Schuss auf eine von einem Schiff belegten Koordinate trifft. [TSV]
- Falls nicht, wird diese Koordinate am Spielfeld mit "-" für die Konsolen-Ansicht oder grafisch für die GUI-Ansicht markiert. [TSV]
- Falls ein Schiff getroffen wird, ist eine Überprüfung des Schiffes durchzuführen (Schiff hat noch unbetroffene Felder). [TSV]
  - Falls das Schiff noch nicht getroffene Felder hat, ist die Koordinate mit "X" zu markieren. [TSV]
  - Sollten alle Felder des Schiffes beschädigt sein, ist das gesamte Schiff mit "#" zu markieren. [TSV]
  - Im Falle einer Visualisierung mittels GUI ist dies laut den GUI-Anforderungen umzusetzen [TSV]

## Audio interaction 
- Eine Implementierung von Soundeffekten ist für folgende Punkte umzusetzen: [TSV]
  - Schussabgabe: Wenn deine Koordinate eines Spielers eingegeben wird und die Überprüfung, ob die Koordinate in diesem Spiel schon versucht worden ist erfolgreich war, ist eine Soundeffekt, welcher einen Kanonenschuss ähnlich ist auszugeben. 
  - Schuss auf eine nicht-belegte Koordinate: Sollte der Schuss auf eine Koordinate treffen, welche nicht belegt ist, ist ein Soundeffekt "Wasser palatschen" auszugeben 
  - Schuss auf ein Schiff: Sollte der Schuss ein Schiff treffen, ist einen Explosionssoundeffekt auszugeben. 
- Der Spieler / die Spielerin hat die Möglichkeit, vor Spielbeginn die Soundeffekte zu aktivieren bzw. zu deaktivieren. [TSV-61]

## Score list 
- Am Ende eines Spiels wird eine Statistik aufgestellt, welche folgende Punkte mitschreibt: [TSV]
  - Spielrunden 
  - Trefferserie des Siegers
  - Trefferserie des Gegners 
  - Übrige Schiffsfelder des Siegers (nicht getroffene Felder)

## Announcements
- Grundeinstellung der Textmeldungen ist in englischer Sprache definiert [TSV]
- Der User hat die Möglichkeit vor Spielbeginn zwischen folgenden Sprachen zu wählen: [TSV]
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