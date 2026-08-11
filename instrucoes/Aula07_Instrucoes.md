# Aula 07 - repeticao com while

## Objetivo

Aprender a repetir um trecho de codigo usando `while`.

Use `while` quando voce quer que algo aconteca varias vezes enquanto uma condicao for verdadeira.

## Ideia principal

Pense em um contador: ele comeca em um numero e vai aumentando.

```java
int contador = 1;

while (contador <= 3) {
    System.out.println(contador);
    contador++;
}
```

Esse exemplo mostra os numeros `1`, `2` e `3`.

## Partes do while

```java
while (contador <= 3) {
```

- `contador <= 3` e a condicao.
- Enquanto ela for verdadeira, o codigo dentro das chaves roda.
- `contador++` soma 1 ao contador.

Sem `contador++`, o contador nunca mudaria. Entao o programa ficaria repetindo sem parar.

## Questao facil

No arquivo `TreinoJava.java`, crie um programa que mostre os numeros de `1` ate `5`, um por linha.

Sua saida deve ficar assim:

```text
1
2
3
4
5
```

## Regras

1. Crie uma variavel `int` chamada `contador` e comece com `1`.
2. Use `while`.
3. Dentro do `while`, mostre o valor do contador com `System.out.println`.
4. Ainda dentro do `while`, aumente o contador em 1 usando `contador++`.
5. O programa deve parar quando chegar ao numero 5.

## Como testar

No terminal, rode:

```powershell
javac TreinoJava.java
java TreinoJava
```

Leia primeiro, tente sozinho e depois me mande seu codigo ou um print. Eu analiso sem entregar a resposta de cara.
