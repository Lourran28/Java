# Aula 01 - Primeiro treino em Java

## Objetivo

Treinar tres coisas basicas:

1. Escrever mensagens na tela com `System.out.println`.
2. Criar variaveis.
3. Juntar texto com variaveis usando `+`.

## Antes de comecar

Abra o arquivo `TreinoJava.java`.

Voce vai escrever seu codigo dentro desta parte:

```java
public static void main(String[] args) {
    // seu codigo fica aqui
}
```

## Exemplo para lembrar

```java
String nome = "Lourran";
int idade = 20;

System.out.println("Meu nome e " + nome);
System.out.println("Minha idade e " + idade);
```

`String` guarda texto.

`int` guarda numero inteiro.

## Como juntar sem deixar colado

O sinal `+` junta textos e variaveis.

Mas o Java nao coloca espacos sozinho. O espaco precisa estar dentro das aspas.

Exemplo:

```java
String nome = "Lourran";
int idade = 20;

System.out.println("Nome: " + nome);
System.out.println("Nome e idade: " + nome + " - " + idade);
```

Repare nestes pedacos:

```java
"Nome: "
" - "
```

Eles sao textos normais. A diferenca e que eles tem espacos e simbolos para a frase nao ficar grudada.

Pense no `+` como uma cola. Voce escolhe quais pedacos entram na frase:

```text
"texto antes"
+ variavel
+ "texto no meio"
+ outraVariavel
```

## Questao facil

No arquivo `TreinoJava.java`, faca um programa que mostre:

1. Seu nome.
2. Sua idade.
3. Sua cidade.
4. Uma frase juntando as tres informacoes.

Exemplo de saida esperada:

```text
Meu nome e Lourran
Eu tenho 20 anos
Eu moro em Sao Paulo
Meu nome e Lourran, tenho 20 anos e moro em Sao Paulo
```

Pode trocar os dados pelo que voce quiser.

## Regras

1. Crie uma variavel `String` para o nome.
2. Crie uma variavel `int` para a idade.
3. Crie uma variavel `String` para a cidade.
4. Use `System.out.println` para mostrar as frases.

## Como testar

No terminal, rode:

```powershell
javac TreinoJava.java
java TreinoJava
```

Se aparecer erro, leia a linha do erro com calma e tente descobrir o motivo.
Se travar, me manda print ou copia o erro aqui.
