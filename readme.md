# React-Script

Willkommen zur Sprache React-Script.

React Skript ist eine einfache interpretierte Sprache. Die Sprache wird durch einen Java Parser und Scanner eingelesen
validiert und ausgeführt. Die Syntax ähnelt einem JavaScript Ansatz. Wie JavaScript handelt es sich um eine untypisierte
Sprache. Die Sprache befindet sich noch in der "Entwicklungsphase" und kann noch erweitert werden. Die aktuelle Version
ist als "Unstable" und höchtstens als "Preview" zu sehen.

## 🥳 Getting Started

### Interaktiver Modus - JAR

WICHTIG: Dieser Vorgang funktioniert lediglich mit einer gültigen JavaFX Version. 
Wir beabsichtigen die JavaFX Version zukünftig im Jar zu integrieren. 


Dies ist ein Zeilen - Interpreter. Sie können mehrere Zeilen an Code schreiben und diese zusammen ausführen lassen. Pro
ausführung wird das Environment gereinigt inkl. den bereits gesetzt Variablen. Laden Sie sich die Jar Datei herunter
/classes/artifacts/React_line_jar/React-Line.jar

Öffnen Sie ein CMD / Terminal - Fenster. Navigieren Sie zur Jar - Datei.

Führen Sie die Jar Datei mit folgendem Befehl aus. (Sie müssen Java installiert haben.)

java -jar React-Line.jar

### Interaktiver Modus - IDE

Dies ist ein Zeilen - Interpreter. Sie können mehrere Zeilen an Code schreiben und diese zusammen ausführen lassen. Pro
ausführung wird das Environment gereinigt inkl. den bereits gesetzt Variablen.

Um die eingegeben Zeilen auszuführen, soll eine leere Zeile abgesendet werden. Der reader wird die bereits eingegeben
Zeilen interpretieren und ggf. Ergebnisse ausgeben. Nur die Ergebnisse der letzten Zeile werden per Default auf der
Konsole ausgegeben. Sollten anderen Ergebnisse ausgegeben werden, so verwenden Sie bitte die ``print`` Funktionalität.

*Vorgehen:*
Öffnen Sie das Projekt und führen Sie die Main - Funktion aus. Wechseln Sie in die Konsolenansicht und geben Sie die
Befehle ein.

### Skript - Interpretation

Nebst dem interaktiven Modus haben Sie die möglichkeit ein Skript welches in "React-Line" geschrieben wurde auszuführen.
Öffnen Sie das Projekt und starten Sie die Main-Methode mit folgendem Parameter. -input=<Relativer-Pfad>.

Laden Sie sich die Jar Datei herunter /classes/artifacts/React_line_jar/React-Line.jar

Öffnen Sie ein CMD / Terminal - Fenster. Navigieren Sie zur Jar - Datei.

Führen Sie die Jar Datei mit folgendem Befehl aus. (Sie müssen Java installiert haben.)

java -jar React-Line.jar -input=<Relativer-Pfad>

Beispiele:

``java -jar React-Line.jar -input=my-script.rs``

``java -jar React-Line.jar -input=../my-script.rs``

``java -jar React-Line.jar -input=C:\\Skripte\\my-script.rs``

Beispiel Testskript:

Annahme (Navigation im Root - Directory des Projektes)

`` java -jar classes/artifacts/React_Line_jar/React-Line.jar -input=Beispiele/Testskript.rs ``

### Skript - Interpretation

Nebst dem interaktiven Modus haben Sie die möglichkeit ein Skript welches in "React-Line" geschrieben wurde auszuführen.
Öffnen Sie das Projekt und starten Sie die Main-Methode mit folgendem Parameter. -input=<Relativer-Pfad>.

Beispiele:

``-input=my-script.rs``

``-input=../my-script.rs``

``-input=C:\\Skripte\\my-script.rs``


## 📕 Features 


### Mehrzeilige Befehle
React-Skript ist dazu ausgelegt, dass jede Zeile ein Befehl beinhaltet.
<br> Dies macht nicht überall sinn. Z.B. bei komplexeren while - Befehlen oder switch-cases kann es nützlich sein die Statements auf mehreren Zeilen zu verteilen. Dies erhöht nicht nur die Lesbarkeit sondern auch die Wartbarkeit. 

Deswegen haben wir in der neusten Version die Möglichkeit (wie bei Python) hinzugefügt Befehle auf der Nächsten Zeile fortzuführen. 

Dafür wird ein ``\ `` verwendet. 

*Beispiel*: 

Gegeben sei nachfolgende Code: <code> if 3 < 5 ? 3 * 5 : 12 * 4 -3 </code>

Dieser kann wie folgt umgeschrieben werden:

```
if 3 < 5 \ 
? 3 * 5 \ 
: 12 * 4 - 3
```




### 🆎 Datentypen

Es handelt sich bei React-Skript um eine untypisierte Sprache. Die Datentypen werden zur Laufzeit automatisiert
evaluiert.

Wir unterscheiden folgende Datentypen:

* String ("<Ihr-Text>", '<Ihr-Text>')
* Boolean (true, false),
* Int ([0-9])
* Float ([1-9][0-9]\*.[0-9]\*)

### 🔁 Kontrolstrukturen & Schleifen

React-Skript unterstützt einige Kontrollstrukturen. Wir werden diese Sektion zu einem späteren Zeitpunkt noch um eine
For-Schleife erweitern.

#### IF
If - Kontrollstrukturen werden unterstützt.


Syntax: <code>if CONDITION ? TRUTHY-STATEMENT : FALSY-STATEMENT </code>

Besonderheiten: Da es sich hier um eine untypisierte Sprache handelt kann es zu automatisierten Typkonvertierungen kommen. 
Z.B. wären folgende Statements wahr. true == "true" oder 1 == true. 

Beispiel einer einfachen If-Struktur:

`` if 5 >= 3 ? 3 * 3 ``

Beispiel Multiline Statement: 

```
if 5 >= 3 \ 
? 3 * 3
``` 


#### If - Else
IF - Else Statements werden auch unterstützt. 

Nachfolgend ein Multi-Line-Beispiel: 

```
if 3 < 5 \ 
? 3 * 5 \ 
: 12 * 4 - 3
```


#### If - Else If - Else
Else-If Statement per se werden nicht unterstützt. Diese können allerdings dennoch mit einem zusätzlichen If erreich werden. 

```
if 3 < 5 \ 
? if 3 < 4 ? print("test") : print('failed') \ 
: 12 * 4 - 3
```


#### While-Schleife
While-Schleifen werden unterstützt.

Syntax: <code>while CONDITION STATEMENT_1 STATEMENT_2 ... STATEMENT_N END</code>

Beispiele: 

<code>a := 5  while a < 10  a +:= 1 print(a) end</code>

Beispiel Multi-Line

<code>a := 5; \ <br> while a < 10 \ <br> a +:= 1 \ <br> print(a) end</code>

#### Switch-Case

Switch - Case statements werden unterstützt.

Syntax: <code>switch VARIABLE|VALUE case COMPARISON  STATEMENT_1 STATEMENT_2 ... STATEMENT_N case STATEMENT_1 STATEMENT_2 ... STATEMENT_N</code> 

Beispiel: 
`` switch 5 case >= 5: 3 * 3 case >= 6: 3 - 3 ``

Hinweis: Das erste Case-Statement welches die Bedingung erfüllt wird ausgeführt. Es gibt kein "Fall-Through".
Die Statements müssen nicht mit "Break" unterbrochen werden. 


#### Arrays
Es werden Arrays unterstützt. Dabei können Arrays gemischte Datentypen beinhalten. 
Ein Array beginnt mit einer öffnenden Klammer [ und endet mit einer schliessenden Klammer ]. Die einzelnen Werte werden durch ein "," getrennt. 

Syntax: a := [1,2,3,false,"Hallo"]

Aktuell sind Arrays in ihrer Verwendung stark limitiert. Dies wird in Zukunft erweitert werden. 

#### Print - Funktion
Für Debug - Zwecke und um das lernen der Sprache zu vereinfachen kann eine "Print - Funktion" verwendet werden. 

Diese ist denkbar einfach zu verwenden. 

Syntax: print(STATEMENT)

Beispiel:

```
a := 2 \ <br>
print(a)
```

### 🧮 Arithmetic

Die gängigen Mathematik - Regeln werden unterstützt. 

Nachfolgend einige Beispiele: 


Addition:
`` 5 + 2 --> 7 ``

Multiplikation 1: 
``5 * 3 + 2 --> 17 ``

Multiplikation 2: ``2 + 5 * 3 --> 17``

Division: `` 5 / 2 --> 2.5``

Subtraktion: `` 5 - 3 --> 2``

Modulo: `` 5 % 2 --> 1 ``

Power to: `` 5 ** 2 --> 25``

### 🔥 Variablen

Variablen müssen mit einem Buchstaben beginnen dürfen anschliessend aus einer folge von Buchstaben & Zahlen bestehen. 
Des Weiteren können gängige Symbole wie z.B. "_" verwendet werden. 

Syntax: [BUCHSTABE][ZEICHEN|BUCHSTABE]

Beispiel: `` a_test`` oder `` meineVariable`` oder `` MeineVariable ``

Nicht gültig: `` 1_test `` order `` '_test``  

#### Variablen - Zuweisungen
Das Zuweisungssymbol ist nicht wie üblich ein = Zeichen sondern folgender Operator wird für die Zuweisung verwendet := 

Syntax: `` variable := 3 * 4 - 2 ``

Variablen sind nur für eine Ausführung gültig. Bei einem Skript bleiben die Variablen bis zum Ende gültig bei der interaktiven Variante bleiben die Variablen nur gültig, bis die Kombination zur Ausführung gebracht wird. 


#### Variablen - Arithmetische Zuweisung

Variablen können mit einer speziellen Zeichenfolge mit Arithmetischen Operationen verbunden werden. 

Syntax: <br> 
``` a:= 5 
 a +:= 3 
 print(a) --> 8  
 ```

Folgende Zuweisungen sind möglich: 
* `` *:=  `` Multiplikation
* `` +:=  `` Addition
* `` /:=  `` Division
* `` %:=  `` Modulo
* `` **:=  `` Power To



## 🧪 Testskript

Im Ordner - Beispiele befindet sich aktuell ein Testskript welches zur Ausführung verwendet werden kann. 
Es soll den Eindruck vermitteln, wie mit der Sprache umgegangen werden kann. 

Der Umfang ist aktuell noch etwas limitiert doch wird mit Sicherheit erweitert werden. 

### Testskript
Nachfolgend der Inhalt des Testskriptes: 

```` 
// Variable a erstellen und den Wert 5 zuweisen  
a := 5 
print("Value of a") 
print(a) 
// Variable um eins erhöhen 
a +:= 2 * 3 
print("Value of a") 
print(a) 
// Variable b auf den Wert von a setzen 
b := a 
print("Valur of b") 
print(b) 
print("Value of a") 
print(a) 
// Array c erstellen 
c := [1,2,false,true, "Hallo"] 
print("Value of c") 
print(c) 
// Kontrollstrukturen 
print("Resultat der Kontrollstruktur if 3 < 5 ? 3 * 5 : 12 * 4 -3") 
if 3 < 5 ? res := 3 * 5 : res := 12 * 4 -3 
print(res) 
// Switch - Case 
print("Resultat des Switch-Case Statemnets switch 5 case >= 5:  res:= 3 * 3 case >= 6: res :=  3 - 3") 
switch 5 case >= 5:  res:= 3 * 3 case >= 6: res :=  3 - 3 
print(res) 
// Beispiel Switch - Case Multiline 
print("Resultat des Switch-Case Statemnets switch 5 case >= 5:  res:= 3 * 3 case >= 6: res :=  3 - 3 (ALS MULTLINE-STATEMENT)") 
switch 5 \ 
case >= 5:  res:= 3 * 3 \ 
case >= 6: res := 3 - 3 
print(res) 
// Datentypen - Beispiele 
meinString := "Mein String" 
print("Beispiel String") 
print(meinString) 
meinStringSingleQuotes := "Mein String Single-Quote" 
// Float 
meinFloat := 1.42 
print(meinFloat) 
//  Negativer Float 
meinNegativerFloat := -1.42 
print(meinNegativerFloat) 
// Arithmetik 
print("3 * 3 = ") 
print(3 * 3) 
print("1 + 7 = ") 
print(1 + 7) 
print("3 - 12 = ") 
print(3 - 12) 
print("3^3 = ") 
print(3 ** 3) 
print("3 % 1 = ") 
print(3 % 1) 
print("1 / 3 = ") 
print(1 / 3) 
// While - Loop 
print ("Resultat der - While-Loop a := 5; while a < 10 +a:= 1 print(a) end") 
whileTest := 5 
while whileTest < 10 whileTest +:= 1 print(whileTest) end 
// Arithmetische zuweisung 
print("arithPlus := 5") 
print("arithPlus + := 5") 
print("Resultat von: arithPlus") 
arithPlus := 5 
arithPlus +:= 5 
print(arithPlus)
```