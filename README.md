# Puzzles
Raccolta personale di giochi ed enigmi matematici

* [La Rana Affamata](Hungry-Frog.md)
* [Il Compleanno di Cheryl](Cheryl-Birthday.md)

## Indovinello di Pasquetta

### Il problema
Andrea sta guardando Barbara, ma Barbara sta guardando Carlo.
Andrea è sposato, mentre Carlo non lo è.
Sapete dire se c’è una persona sposata che sta guardando una persona non sposata?

Le risposte possibili sono: Sì, No, No si può dire.

### La soluzione
La risposta è *Sì*.
I casi possono essere due: Barbara è sposata o non lo è.
Nel primo caso, allora Barbara è sposata e sta guardando Carlo che non lo è.
Nel secondo, Andrea è sposato e sta guardando Barbara che non lo è.
In entrambi i casi la risposta è Sì.

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

Esistono altri numeri con proprietà simili?
Nella seguente tabella ne sono elencati i numeri (tra iprimi cento) per i quali il loro valore è divisibile per il 
numero delle proprie lettere.

|   N |         W        |  L  |  F |
|-----|------------------|----:|---:|
|   3 | tre              |   3 |  1 |
|   6 | sei              |   3 |  2 |
|   8 | otto             |   4 |  2 |
|  10 | dieci            |   5 |  2 |
|  12 | dodici           |   6 |  2 |
|  20 | venti            |   5 |  4 |
|  21 | ventuno          |   7 |  3 |
|  24 | ventiquattro     |  12 |  2 |
|  30 | trenta           |   6 |  5 |
|  36 | trentasei        |   9 |  4 |
|  40 | quaranta         |   8 |  5 |
|  66 | sessantasei      |  11 |  6 |
|  81 | ottantuno        |   9 |  9 |
|  84 | ottantaquattro   |  14 |  6 |
|  99 | novantanove      |  11 |  9 |
| 100 | cento            |   5 | 20 |


La tabella è stata calcolata usando questo [Codice in Java](https://github.com/mad4j/puzzles/blob/master/src/dolmisani/puzzles/numbers/NumberToWord.java)

### Riferimenti
````
Insalate di matematica. Nuovi buffet per stimolare l'appetito numerico, Volume 2
Paolo Gangemi
Alpha Test, 2007 - 160 pagine
````

## La Nifea

### Il problema
Una nifea cade in un lago. Ogni giorno raddoppia la sua dimensione e in 20 giorni copre tutta la superficie del lago.
Quanti giorni ha impiegato per coprirne la metà?

### La soluzione
Ha impiegato 19 giorni.

### Gli approfondimenti
E' interessante osservare che con una nifea in origine di 3.5 cm di diametro, in 20 giorni arriverebbe a coprire una superficie di 100 Km2.


## Gli Scacchi Impossibili
## Il problema
Stai partecipando a un torneo di scacchi e devi condurre due partite in contemporanea contro due Gran Maestri.
Per ogni partita vinta si guadagnano due punti, per ogni partita pareggiata un punto.
Quale strategia adattare per vincere sicuramente almeno un punto?

Che frustrazione! Alice è stata, nuovamente, rinchiusa nella Torre Deprimente. La Regina di Cuori l'ha scoperta, nuovamente, a dipingere murales irriverenti sulle mura della reggia. La condanna è il taglio della testa a meno che Alice non riesca a suparare uns Sfida Impossibile. Questa volta la sfida sarà quella di partecipare al Torneo degli Scacchi Impossibili. Alice dovrà affrontare contemporaneamente, in due partite distite, due Gran Maestri di Scacchi Impossibili. Vengono assegnati due punti per ogni partita vinta e un punto per ogni partita pareggiata. Alice salverà la testa se riuscirà a guadagnare almeno un punto.
Gli Scacchi Impossibili sono come gli scacchi tradizionali, ma con le seguenti eccezioni:
* si gioca con pezzi Neri e Rossi
* i pezzi Rossi muovono per primi
* la schacchiera è 8 per 13 caselle, i pezzi si dispongono per il lato corto
* i pezzi neri sono composti da:
* La Regina Seducente: si muove solo per mangiare, può mangiare qualsiasi pezzo "maschile" che possa raggiungere senza dover saltare
* Il Re Rospo: si sposta saltando di un casella in tutte le direzioni, nessuno si azzarda a mangiarlo, ma qualche Regina può tentare di baciarlo
* Il Vescovo
* 

La Regina Incantevole
Il Principe Azzurro

Il giorno successivo, Alice viene scortata nella stanza del torneo. Il pubblico è curiosio di sapere come andrà a finire. Vengono estratti a sorte i pezzi. Alice dovrà giocare con i pezzi neri con XXX e con i pezzi rossi contro YYY.
La partita ha inizio. Alice è titubante sta per muovere uno dei suoi Pedoni Rossi, quando con la coda dell'occhio vede YYY che senza neanche pensarci troppo fa avanzare con un gran balzo il suo ZZZ Rosso.
Alice sorride maliziosa. Decide di cambiare completamente strategia perché ormai ha capito che sicuramente riuscirà a salvare la testa.

Cosa ha capito Alice?

## La soluzione
E' necessario giocare con i bianchi in una partita e con i neri nell'altra. A questo punto è necessario ripetere le mosse dell'avversario sull'altra scacchiera in modo da far giocare i due Gran Maestri tra di loro.


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
