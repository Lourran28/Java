# Aula 04 - Entrada de dados com Scanner

## Objetivo

Aprender a deixar o usuario digitar informacoes no terminal.

Ate agora, voce colocava valores direto no codigo:

```java
int idade = 18;
```

Agora o programa vai poder perguntar e receber o valor digitado.

## Importante

Para usar `Scanner`, coloque esta linha antes da classe:

```java
import java.util.Scanner;
```

Dentro do `main`, voce cria o leitor:

```java
Scanner entrada = new Scanner(System.in);
```

## Exemplo para lembrar

Este exemplo pergunta uma idade.

```java
import java.util.Scanner;

public class TreinoJava {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite sua idade:");
        int idade = entrada.nextInt();

        System.out.println("Idade digitada: " + idade);

        entrada.close();
    }
}
```

## Comandos uteis

```java
entrada.nextInt();
```

Le um numero inteiro.

```java
entrada.nextLine();
```

Le uma linha de texto.

Nesta aula, use apenas `nextInt()` para ficar mais simples.

## Questao facil

No arquivo `TreinoJava.java`, faca um programa que:

1. Pergunte a idade da pessoa.
2. Leia a idade digitada usando `Scanner`.
3. Se a idade for maior ou igual a 18, mostre `Maior de idade`.
4. Senao, mostre `Menor de idade`.

## Regras

1. Use `import java.util.Scanner;`.
2. Use `Scanner entrada = new Scanner(System.in);`.
3. Use `entrada.nextInt();`.
4. Use `if`.
5. Use `else`.
6. Use `entrada.close();` no final.

## Como testar

No terminal, rode:

```powershell
javac TreinoJava.java
java TreinoJava
```

Quando o programa pedir a idade, digite um numero e aperte Enter.

Teste com:

```text
17
18
25
```

Se der erro, procure primeiro:

1. Se o `import` esta antes de `public class`.
2. Se `Scanner` esta com `S` maiusculo.
3. Se `System.in` esta escrito com `S` maiusculo.
4. Se colocou `;` no fim das linhas.
