# Only for Genius

*Il 95% di voi non sarà capace di dare una risposta al seguente problema.*

Trovo molto spesso sul web (a dire il vero il più delle volte su Facebook) problemi pseudo-matematici che cercano di attirare click proponendo quesiti banali o che, al più, nascondono qualche ambiguità di notazione.
Se invece si tentasse di proporre un piccolo problema di facile comprensione, ma che pochi fossero capaci di risolvere?
Vediamo cosa sono riscito a fare.


## Episode 01

![episode01](only4genius-ep01.png)

## La soluzione

Si tratta di scomporre un numero in due fattori.
Tenendo conto dei soli numeri positivi, la soluzione al problema è la seguente:

:pear: = 127

:apple: = 9721


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