# Aula 03 - else if

## Objetivo

Aprender a testar mais de uma possibilidade.

Na aula passada voce usou:

```java
if (condicao) {
    // se for verdadeiro
} else {
    // se for falso
}
```

Agora voce vai usar `else if`.

## Ideia principal

`else if` significa "senao, se".

Exemplo em portugues:

```text
se a nota for maior ou igual a 7
    aprovado
senao, se a nota for maior ou igual a 5
    recuperacao
senao
    reprovado
```

Em Java:

```java
if (condicao1) {
    // primeiro caso
} else if (condicao2) {
    // segundo caso
} else {
    // caso nenhum dos anteriores seja verdadeiro
}
```

## Exemplo para lembrar

```java
int nota = 6;

if (nota >= 7) {
    System.out.println("Aprovado");
} else if (nota >= 5) {
    System.out.println("Recuperacao");
} else {
    System.out.println("Reprovado");
}
```

## Questao facil

No arquivo `TreinoJava.java`, faca um programa que:

1. Crie uma variavel `int` chamada `nota`.
2. Se a nota for maior ou igual a 7, mostre `Aprovado`.
3. Senao, se a nota for maior ou igual a 5, mostre `Recuperacao`.
4. Senao, mostre `Reprovado`.

## Regras

1. Use `int`.
2. Use `if`.
3. Use `else if`.
4. Use `else`.
5. Use `System.out.println`.
6. Teste com `8`, depois com `6`, depois com `3`.

## Como testar

No terminal, rode:

```powershell
javac TreinoJava.java
java TreinoJava
```

Se der erro, leia a linha do erro e procure primeiro:

1. Falta de `;`.
2. Chaves `{}` abertas ou fechadas errado.
3. `System` escrito com letra minuscula.
4. `println` escrito errado.
