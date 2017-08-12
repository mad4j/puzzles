# Only for Genius

*Il 95% di voi non sarà capace di dare una risposta al seguente problema.*

Trovo molto spesso sul web (a dire il vero il più delle volte su Facebook) problemi pseudo-matematici che cercano di attirare click proponendo quesiti banali o che, al più, nascondono qualche ambiguità di notazione.
Se invece si tentasse di proporre un piccolo problema di facile comprensione, ma che pochi fossero capaci di risolvere?
Vediamo cosa sono riscito a fare.


## Un po' di riscaldamento

Incominciamo con una cosa semplice.

> :apple: x :lemon: = 1.234.567
>
> dove :apple: e :lemon: sono numeri interi.

Banale? 

Per esempio :apple: = 1 e :lemon: = 1.234.567!!


Allora cerchiamo di rendere la cosa più interessante.


## Affrontiamo il vero Problema

Vediamo cosa succede se aggiungiamo un nuovo vincolo:

> :apple: + :lemon: = 9.848
>
> :apple: x :lemon: = 1.234.567
>
> dove :apple: e :lemon: sono valori interi.

Riuscite a trovare una soluzione?

## La soluzione

Si tratta di scomporre un numero in due fattori.
Tenendo conto dei soli numeri positivi, la soluzione al problema è la seguente:

:apple: = 127
:lemon: = 9721


```c++
#include <stdio.h>

int main() {
    int N = 1234567;
    for (int i=2; i<=N; i++) {
        while (N%i == 0) {
            printf("%d ", i);
            N /= i;
        }
    }
}
```
