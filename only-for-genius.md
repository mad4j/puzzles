# Only for Genius
Il 95% di voi non sarà capace di dare una risposta al seguente problema.

## Riscaldamento

Incominciamo con una cosa semplice:

> :apple: x :lemon: = 1.234.567
>
> dove :apple: e :lemon: sono numeri interi.


Banale? 
Per esempio :apple: = 1 e :lemon: = 1.234.567!!

## Il Problema

Allora rendiamo il tutto più interessante aggiungendo un nuovo vincolo:

> :apple: + :lemon: = 9.848
>
> :apple: x :lemon: = 1.234.567
>
> dove :apple: e :lemon: sono valori interi.

Riuscite a trovare una soluzione?




```c++
#include <stdio.h>

int main() {
    int N = 1234567;
    for (int i=2; i<=N; i++) {
        if (N%i == 0) {
            printf("%d ", i);
            N /= i;
        }
    }
}
```
