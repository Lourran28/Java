# Aula 18 - variavel do tipo interface

## Ideia da aula

Na Aula 17, voce criou `Pix` e `Boleto`.

Os dois implementavam a mesma interface:

```java
public class Pix implements Pagavel
public class Boleto implements Pagavel
```

Agora a ideia e entender uma coisa muito importante:

```java
Pagavel pagamento = new Pix(100);
```

Mesmo criando um `Pix`, a variavel pode ser do tipo `Pagavel`.

Isso funciona porque `Pix` implementa `Pagavel`.

## Pense assim

`Pagavel` e o contrato.

`Pix` e `Boleto` sao formas diferentes de cumprir esse contrato.

Entao o Java aceita:

```java
Pagavel pagamento1 = new Pix(100);
Pagavel pagamento2 = new Boleto(100);
```

Porque os dois sabem fazer:

```java
calcularPagamento()
processarPagamento()
```

## Objetivo

Criar dois pagamentos usando o tipo da interface `Pagavel`.

Depois, chamar os metodos sem se preocupar se o pagamento e Pix ou Boleto.

## Passo 1 - Pagavel.java

Crie a interface com dois metodos:

```java
double calcularPagamento();
void processarPagamento();
```

## Passo 2 - Pix.java

No arquivo `Pix.java`:

1. Faca a classe implementar `Pagavel`.
2. Crie o atributo `private double valor`.
3. Crie o construtor recebendo `valor`.
4. Crie o metodo `calcularPagamento()`.
5. No Pix, aplique 5% de desconto.
6. Crie o metodo `processarPagamento()`.

Conta do Pix:

```java
return valor * 0.95;
```

Mensagem do Pix:

```text
Gerando QR Code do Pix
```

## Passo 3 - Boleto.java

No arquivo `Boleto.java`:

1. Faca a classe implementar `Pagavel`.
2. Crie o atributo `private double valor`.
3. Crie o construtor recebendo `valor`.
4. Crie o metodo `calcularPagamento()`.
5. No Boleto, retorne o valor normal.
6. Crie o metodo `processarPagamento()`.

Conta do Boleto:

```java
return valor;
```

Mensagem do Boleto:

```text
Gerando codigo de barras do Boleto
```

## Passo 4 - Main.java

No arquivo `Main.java`:

1. Crie um pagamento Pix usando o tipo `Pagavel`.
2. Crie um pagamento Boleto usando o tipo `Pagavel`.
3. Mostre o valor final do primeiro pagamento.
4. Processe o primeiro pagamento.
5. Mostre o valor final do segundo pagamento.
6. Processe o segundo pagamento.

Modelo:

```java
Pagavel pagamento1 = new Pix(100);
Pagavel pagamento2 = new Boleto(100);
```

## Saida esperada

```text
Pagamento 1: R$ 95.0
Gerando QR Code do Pix
Pagamento 2: R$ 100.0
Gerando codigo de barras do Boleto
```

## O que voce precisa entender

Quando voce faz:

```java
Pagavel pagamento1 = new Pix(100);
```

Voce esta dizendo:

```text
Quero guardar um objeto que seja pagavel.
Neste caso, o objeto real e um Pix.
```

E quando faz:

```java
Pagavel pagamento2 = new Boleto(100);
```

Voce esta dizendo:

```text
Quero guardar outro objeto que tambem seja pagavel.
Neste caso, o objeto real e um Boleto.
```

Essa e a base do polimorfismo.

## Como testar

Dentro da pasta `Aula18_POO`, rode:

```powershell
javac Main.java Pagavel.java Pix.java Boleto.java
java Main
```

Quando terminar, me mande o codigo para eu analisar.
