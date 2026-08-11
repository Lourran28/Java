# Aula 06 - double e divisao

## Objetivo

Aprender a trabalhar com numeros quebrados em Java.

Ate agora voce usou `int`, que guarda numeros inteiros:

```java
int idade = 18;
int nota = 7;
```

Agora voce vai usar `double`, que guarda numeros com casas decimais:

```java
double altura = 1.75;
double preco = 29.90;
```

## Por que usar double?

Se voce usa `int`, o Java trabalha com numero inteiro.

Para divisao, media, altura, peso, preco e notas quebradas, use `double`.

## Exemplo para lembrar

```java
double nota1 = 8.5;
double nota2 = 7.0;

double media = (nota1 + nota2) / 2;

System.out.println("Media: " + media);
```

Repare nos parenteses:

```java
(nota1 + nota2) / 2
```

Eles fazem o Java somar primeiro e dividir depois.

## Scanner com double

Para ler numero quebrado, use:

```java
entrada.nextDouble();
```

Exemplo:

```java
double nota = entrada.nextDouble();
```

## Questao facil

No arquivo `TreinoJava.java`, faca um programa que:

1. Pergunte a primeira nota.
2. Leia a primeira nota usando `nextDouble()`.
3. Pergunte a segunda nota.
4. Leia a segunda nota usando `nextDouble()`.
5. Calcule a media das duas notas.
6. Mostre a media.
7. Se a media for maior ou igual a 7, mostre `Aprovado`.
8. Senao, mostre `Reprovado`.

## Regras

1. Use `import java.util.Scanner;`.
2. Use `Scanner entrada = new Scanner(System.in);`.
3. Use `double`.
4. Use `entrada.nextDouble();`.
5. Use `if`.
6. Use `else`.
7. Use parenteses para calcular a media.

## Como testar

No terminal, rode:

```powershell
javac TreinoJava.java
java TreinoJava
```

Teste com:

```text
8
6
```

A media deve ser:

```text
7.0
```

Depois teste com:

```text
5
6
```

A media deve ser:

```text
5.5
```

## Dica

Se o terminal der erro ao digitar `8.5`, tente `8,5`.
Em alguns computadores em portugues, o Java aceita virgula no lugar de ponto.
