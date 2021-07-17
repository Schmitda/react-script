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
print("3^3 (3 ** 3) = ")
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