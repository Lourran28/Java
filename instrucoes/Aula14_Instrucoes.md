# Aula 14 - dois objetos da mesma classe

## Ideia da aula

Uma classe e como um molde.

Na Aula 08, voce criou um objeto `Pessoa`.

Agora voce vai criar **duas pessoas diferentes** usando a mesma classe.

## Exemplo de ideia

Pense assim:

```text
Classe Pessoa = molde
pessoa1 = uma pessoa criada pelo molde
pessoa2 = outra pessoa criada pelo mesmo molde
```

Cada objeto pode guardar seus proprios valores.

## O que voce vai treinar

1. Criar uma classe com atributos `private`.
2. Criar um construtor.
3. Criar getters.
4. Criar dois objetos no `Main`.
5. Mostrar os dados de cada objeto.

## Passo 1 - Pessoa.java

No arquivo `Pessoa.java`:

1. Use os atributos:

```java
private String nome;
private int idade;
```

2. Crie um construtor que receba `nome` e `idade`.
3. Crie `getNome()`.
4. Crie `getIdade()`.

## Passo 2 - Main.java

No arquivo `Main.java`:

1. Crie uma pessoa chamada `pessoa1`.
2. Crie outra pessoa chamada `pessoa2`.
3. Mostre o nome e a idade da primeira pessoa.
4. Mostre o nome e a idade da segunda pessoa.

## Saida esperada

Use seus proprios nomes e idades. Um exemplo:

```text
Pessoa 1: Ana - 20 anos
Pessoa 2: Joao - 25 anos
```

## Dica

Para criar dois objetos, voce vai usar o `new` duas vezes.

```java
Pessoa pessoa1 = new Pessoa("Ana", 20);
Pessoa pessoa2 = new Pessoa("Joao", 25);
```

Mas tente entender a ideia: `pessoa1` e `pessoa2` sao objetos diferentes, mesmo vindo da mesma classe.

## Como testar

Dentro da pasta `Aula14_POO`, rode:

```powershell
javac Main.java Pessoa.java
java Main
```

Quando terminar, me mande o codigo para eu analisar sem entregar tudo direto.
