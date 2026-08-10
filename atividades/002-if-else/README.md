# Atividade 02 - if e else

## Objetivo

Treinar decisao com `if` e `else`.

## O que o programa faz

O programa cria uma idade e verifica se a pessoa e maior ou menor de idade.

## Arquivo

```text
TreinoJava.java
```

## Como rodar

Dentro desta pasta, use:

```powershell
javac TreinoJava.java
java TreinoJava
```

## Codigo final

```java
public class TreinoJava {

    public static void main(String[] args) {
        int idade = 18;

        if (idade >= 18) {
            System.out.println("Maior de idade");
        } else {
            System.out.println(" Menor de idade");
        }
    }
}
```

## Testes sugeridos

```text
17 -> Menor de idade
18 -> Maior de idade
19 -> Maior de idade
```
