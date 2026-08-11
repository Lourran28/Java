# Aula 05 - Operacoes matematicas

## Objetivo

Aprender a fazer contas simples em Java.

Nesta aula voce vai usar:

1. `Scanner`.
2. Variaveis `int`.
3. Operadores matematicos.
4. `System.out.println`.

## Operadores principais

```text
+   soma
-   subtracao
*   multiplicacao
/   divisao
```

Nesta aula, vamos focar em:

```text
+   soma
-   subtracao
*   multiplicacao
```

## Exemplo para lembrar

```java
int a = 10;
int b = 5;

int soma = a + b;

System.out.println("Soma: " + soma);
```

Voce tambem pode fazer direto no `println`:

```java
System.out.println("Soma: " + (a + b));
```

Repare nos parenteses:

```java
(a + b)
```

Eles ajudam o Java a fazer a conta antes de juntar com o texto.

## Questao facil

No arquivo `TreinoJava.java`, faca um programa que:

1. Pergunte o primeiro numero.
2. Leia o primeiro numero com `Scanner`.
3. Pergunte o segundo numero.
4. Leia o segundo numero com `Scanner`.
5. Mostre a soma dos dois numeros.
6. Mostre a subtracao dos dois numeros.
7. Mostre a multiplicacao dos dois numeros.

## Regras

1. Use `import java.util.Scanner;`.
2. Use `Scanner entrada = new Scanner(System.in);`.
3. Use `entrada.nextInt();`.
4. Use pelo menos duas variaveis `int` para os numeros.
5. Use `+`, `-` e `*`.
6. Use `entrada.close();` no final.

## Como testar

No terminal, rode:

```powershell
javac TreinoJava.java
java TreinoJava
```

Teste com:

```text
primeiro numero: 10
segundo numero: 5
```

Resultados esperados:

```text
soma -> 15
subtracao -> 5
multiplicacao -> 50
```

Se der erro, procure primeiro:

1. Se o `import` esta antes da classe.
2. Se `Scanner` esta com `S` maiusculo.
3. Se as contas estao dentro de parenteses quando forem usadas junto com texto.
4. Se cada linha termina com `;`.
