# Aula 16 - primeira interface

## Inspiracao da faculdade

Na `Faculdade/aula06`, o professor usa uma interface chamada `Pagavel`.

Ela serve para dizer que varias formas de pagamento precisam ter os mesmos metodos.

Nesta atividade, voce vai fazer uma versao menor usando apenas `Pix`.

## Ideia principal

Na heranca, voce usou:

```java
public class Cachorro extends Animal
```

Isso quer dizer:

```text
Cachorro herda de Animal.
```

Agora, com interface, voce vai usar:

```java
public class Pix implements Pagavel
```

Isso quer dizer:

```text
Pix promete cumprir o contrato Pagavel.
```

## O que e uma interface?

Uma interface e como um contrato.

Ela fala quais metodos uma classe precisa ter, mas nao guarda o codigo completo desses metodos.

Exemplo:

```java
public interface Pagavel {
    double calcularPagamento();
    void processarPagamento();
}
```

Isso significa:

```text
Toda classe que implementar Pagavel precisa ter:
- calcularPagamento()
- processarPagamento()
```

## Passo 1 - Pagavel.java

No arquivo `Pagavel.java`, crie a interface com estes metodos:

```java
double calcularPagamento();
void processarPagamento();
```

## Passo 2 - Pix.java

No arquivo `Pix.java`:

1. Faca `Pix` implementar `Pagavel`.
2. Crie o atributo:

```java
private double valor;
```

3. Crie um construtor que receba `valor`.
4. Crie o metodo `calcularPagamento()`.
5. Crie o metodo `processarPagamento()`.

## Regra do Pix

O Pix vai dar 5% de desconto.

Se o valor for `100`, o pagamento final sera `95`.

Pense na conta:

```text
valor * 0.95
```

## Passo 3 - Main.java

No arquivo `Main.java`:

1. Crie um pagamento Pix com valor `100`.
2. Mostre o valor final do pagamento.
3. Chame o metodo que processa o pagamento.

## Saida esperada

```text
Valor final: R$ 95.0
Gerando QR Code do Pix
```

## Dicas

- `implements` e usado com interface.
- A classe `Pix` precisa criar todos os metodos que existem em `Pagavel`.
- O metodo `calcularPagamento()` devolve um `double`, entao precisa de `return`.
- O metodo `processarPagamento()` e `void`, entao nao precisa devolver nada.

## Como testar

Dentro da pasta `Aula16_POO`, rode:

```powershell
javac Main.java Pagavel.java Pix.java
java Main
```

Quando terminar, me mande o codigo para eu analisar.
