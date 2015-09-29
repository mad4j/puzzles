# Puzzles
Raccolta personale di giochi ed enigmi matematici

* [La Rana Affamata](Hungry-Frog.md)
* [Il Compleanno di Cheryl](Cheryl-Birthday.md)

## La parola d'ordine

### Il problema
Un agente segreto deve inflitarsi in un centro di ricerca altamente sorvegliato. Per capire come fare ad entrare, l'agente decide di nascondersi nei pressi del cancello di ingresso. 

All'arrivo del primo visitatore, le guardie intimano di rispondere alla parola d'ordine "12". Il visitatore risponde con "6" e gli viene permesso di entrare. Al secondo visitatore viene chiesto di rispondere alla parola d'ordine "10". Il visitatore risponde correttamente con "5". Al terzo visitatore viene chiesto "8" e la risposta è "4". Al visitatore successivo la richiesta è "6" con risposta "3".

A questo punto l'agente decide di presentarsi all'ingresso, ma alla parola d'ordine "4" risponde con "2"... facendo inesorabilmente scattare l'allarme.

Dove ha sbagliato?

### La soluzione
La risposta attesa era "7". 
Infatti la parola "quattro" ha sette lettere, la parola "sei" ne ha tre, "otto" ne ha quattro...

### Gli approfondimenti
Anche "24" è scritto (ovviamente, in Italiano) con un numero di lettere uguale alla metà del suo valore.
Metre "3", invece, è *invariante*: il suo valore è uguale al numero delle lettere con le quali viene scritto.

Quali sono gli altri numeri che hanno proprietà simili?
Nella seguente tabella ne sono elencati i primi cento numeri per i quali il loro valore è divisibile per il 
numero delle proprie lettere.

|   N |         L        |  F |
|-----|------------------|---:|
|   3 | tre              |  1 |
|   6 | sei              |  2 |
|   8 | otto             |  2 |
|  10 | dieci            |  2 |
|  12 | dodici           |  2 |
|  20 | venti            |  4 |
|  21 | ventuno          |  3 |
|  24 | ventiquattro     |  2 |
|  30 | trenta           |  5 |
|  36 | trentasei        |  4 |
|  40 | quaranta         |  5 |
|  66 | sessantasei      |  6 |
|  81 | ottantuno        |  9 |
|  84 | ottantaquattro   |  6 |
|  99 | novantanove      |  9 |
| 100 | cento            | 20 |

La tabella è stata calcolata usando questo [Codice in Java](https://github.com/mad4j/puzzles/blob/master/src/dolmisani/puzzles/numbers/NumberToWord.java)

## Regine Bianche e Nere

### Il Problema
Inserire in una scacchiera 5x5 tre regine bianche e cinque regine nere in modo che nessuna regina sia sotto l'attacco di una regina di colore opposto.
Esiste una sola soluzione a meno di riflessioni e rotazioni.

### La Soluzione

```
X X . . .
. . . O O
. . . . O
X . . . .
. . O O .
```

## L'eredità

### Il Problema
Un ragazzo ha ricevuto in eredità 1024€.
Ogni giorno spende la metà di quello che possiede.
Dopo quanti giorni rimarrà senza un euro in tasca?

### La Soluzione
Al 12° giorno rimarrà senza un euro in tasca.

| Giorni | €    | Giorni | €    |
|:------:|-----:|:------:|-----:|
|  1     | 1024 |  7     |   16 |
|  2     |  512 |  8     |    8 |
|  3     |  256 |  9     |    4 |
|  4     |  128 | 10     |    2 |
|  5     |   64 | 11     |    1 |
|  6     |   32 | 12     | 0.50 |

Infatti sarà in possesso di 50 centesimi (<1€).

## L'euro scomparso

### Il Problema
Tre amici vanno a cena in un ristorante. Il conto è di 25€ che decidono di dividere in parti uguali. Ognuno paga con una banconota da 10€. Quando il cameriero porta il resto di 5€, decidono di prendere 1€ a testa e lasciano 2€ di mancia.
Più tardi fanno i conti e ragionano in questo modo:
*Abbiamo pagato 9€ a testa, per un totale di 9x3=27€. A questo si aggiungono i 2€ di mancia, fanno in totale 29€. __Dove è andato a finire l'euro mancante?__*

### La Soluzione
Il ragionamento sbagliato perché somma due volte la mancia (la prima volta nei 9€ pagati singolarmente e la seconda volta addizionandola al totale) e non tiene conto dei 3€ rimanenti di resto.
Il ragionamento corretto sarebbe: abbiamo pagato in totale 27€ tra cena e mancia, ai quali vanno aggiunti 3€ di resto.

## Tutti hanno pagato, ma la cassa è vuota

### Il Problema
Tre signori molto onesti cenano in una locanda. Il primo di loro, quando ha finito di cenare, chiede il conto. Il padrone gli risponde: *Vai alla cassa, conta quanti soldi ci sono, mettici altrettanto e prendi come resto 2 Euro.*
Anche il secondo, quando ha finito di cenare, chiede il conto. Il padrone gli risponde:
"Vai alla cassa, conta quanti soldi ci sono, mettici altrettanto e prendi come resto 2 Euro"
Il terzo infine, quando chiede il conto riceve la stessa risposta:
"Vai alla cassa, conta quanti soldi ci sono, mettici altrettanto e prendi come resto 2 Euro."
Quando i tre se ne sono andati il padrone, tutto soddisfatto, apre la cassa e la trova vuota!
"Il mondo è pieno di ladri! pensa, ma ha torto."
Tenendo conto che i tre signori non hanno rubato nulla ed hanno eseguito alla lettera le disposizioni del padrone, sapresti dire quanto c'era nella cassa all'inizio?

### La Soluzione
1,75€
