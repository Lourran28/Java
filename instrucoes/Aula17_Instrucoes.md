# Aula 17 - polimorfismo com interface

## Ideia da aula

Na Aula 16, voce criou uma interface `Pagavel` e uma classe `Pix`.

Agora voce vai criar **duas formas de pagamento**:

```text
Pix
Boleto
```

As duas vao implementar a mesma interface `Pagavel`.

## Objetivo

Entender que classes diferentes podem seguir o mesmo contrato.

```java
public class Pix implements Pagavel
public class Boleto implements Pagavel
```

Isso significa que `Pix` e `Boleto` precisam ter os metodos definidos em `Pagavel`.

## Passo 1 - Pagavel.java

Crie a interface com dois metodos:

```java
double calcularPagamento();
void processarPagamento();
```

## Passo 2 - Pix.java

No arquivo `Pix.java`:

1. Crie o atributo `private double valor`.
2. Crie um construtor recebendo `valor`.
3. Crie `calcularPagamento()`.
4. No Pix, aplique 5% de desconto:

```text
valor * 0.95
```

5. Crie `processarPagamento()` mostrando uma mensagem sobre QR Code.

## Passo 3 - Boleto.java

No arquivo `Boleto.java`:

1. Crie o atributo `private double valor`.
2. Crie um construtor recebendo `valor`.
3. Crie `calcularPagamento()`.
4. No Boleto, nao aplique desconto. Retorne o valor normal.
5. Crie `processarPagamento()` mostrando uma mensagem sobre codigo de barras.

## Passo 4 - Main.java

No arquivo `Main.java`:

1. Crie um pagamento Pix com valor `100`.
2. Crie um pagamento Boleto com valor `100`.
3. Mostre o valor final do Pix.
4. Mostre o valor final do Boleto.
5. Chame `processarPagamento()` nos dois.

## Saida esperada

```text
Pix: R$ 95.0
Gerando QR Code do Pix
Boleto: R$ 100.0
Gerando codigo de barras do Boleto
```

## Dica importante

Quando duas classes implementam a mesma interface, elas precisam ter os mesmos metodos.

Mas cada classe pode fazer a conta do seu jeito.

```text
Pix calcula com desconto.
Boleto calcula sem desconto.
```

## Como testar

Dentro da pasta `Aula17_POO`, rode:

```powershell
javac Main.java Pagavel.java Pix.java Boleto.java
java Main
```

Quando terminar, me mande o codigo para eu analisar.
