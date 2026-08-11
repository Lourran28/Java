# Aula 02 - if e else

## Objetivo

Aprender a fazer o programa tomar uma decisao.

Em Java, usamos `if` e `else` para isso.

## Ideia principal

`if` significa "se".

`else` significa "senao".

Exemplo em portugues:

```text
se a nota for maior ou igual a 7
    mostrar "aprovado"
senao
    mostrar "reprovado"
```

Em Java, a estrutura fica assim:

```java
if (condicao) {
    // acontece se a condicao for verdadeira
} else {
    // acontece se a condicao for falsa
}
```

## Exemplo para lembrar

Este exemplo usa nota. A sua questao vai usar idade.

```java
int nota = 8;

if (nota >= 7) {
    System.out.println("Aprovado");
} else {
    System.out.println("Reprovado");
}
```

## Operadores uteis

```text
>   maior que
<   menor que
>=  maior ou igual
<=  menor ou igual
==  igual
!=  diferente
```

Importante: para comparar igualdade em Java, use `==`.
Um `=` sozinho serve para guardar valor em uma variavel.

## Questao facil

No arquivo `TreinoJava.java`, faca um programa que:

1. Crie uma variavel `int` chamada `idade`.
2. Se a idade for maior ou igual a 18, mostre uma mensagem dizendo que a pessoa e maior de idade.
3. Senao, mostre uma mensagem dizendo que a pessoa e menor de idade.

## Regras

1. Use `int`.
2. Use `if`.
3. Use `else`.
4. Use `System.out.println`.
5. Teste primeiro com idade `19`.
6. Depois teste com idade `15`.

## Como testar

No terminal, rode:

```powershell
javac TreinoJava.java
java TreinoJava
```

Se der erro, leia qual linha apareceu no erro.
Se rodar, troque a idade para testar os dois caminhos: maior e menor de idade.
