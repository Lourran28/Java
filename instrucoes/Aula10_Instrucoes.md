# Aula 10 - construtor

## Objetivo

Aprender a usar um construtor para criar objetos ja com seus dados.

Na Aula 09, voce criava uma pessoa vazia e depois preenchia os atributos em linhas separadas:

```java
Pessoa pessoa1 = new Pessoa();
pessoa1.nome = "Ana";
pessoa1.idade = 20;
```

Com um construtor, voce pode criar a pessoa ja pronta:

```java
Pessoa pessoa1 = new Pessoa("Ana", 20);
```

## O que e um construtor?

Um construtor e um trecho especial da classe que roda automaticamente quando usamos `new`.

Ele tem o mesmo nome da classe e nao usa `void`.

```java
public Pessoa(String nome, int idade) {
    this.nome = nome;
    this.idade = idade;
}
```

## Entendendo o `this`

Nesta linha:

```java
this.nome = nome;
```

- `this.nome` e o atributo que pertence ao objeto criado.
- `nome` e a informacao recebida pelo construtor.

Leia como: "o nome desta pessoa recebe o nome que foi informado".

## Questao

Na pasta `Aula10_POO`, faca um programa que:

1. Em `Pessoa.java`, crie os atributos `String nome` e `int idade`.
2. Crie um construtor que receba nome e idade.
3. Use `this.nome` e `this.idade` para guardar os valores recebidos.
4. Crie ou mantenha o metodo `apresentar()` para mostrar nome e idade.
5. Em `Main.java`, crie `pessoa1` ja passando seu nome e idade dentro de `new Pessoa(...)`.
6. Chame `pessoa1.apresentar();`.

## Regra importante

O construtor tem o mesmo nome da classe:

```java
public Pessoa(...)
```

Ele nao e assim:

```java
public void Pessoa(...)
```

## Saida esperada

Use seus dados. Exemplo:

```text
Ola, eu sou Ana e tenho 20 anos.
```

## Como testar

No terminal, dentro da pasta `Aula10_POO`, rode:

```powershell
javac Main.java Pessoa.java
java Main
```

Tente sozinho. Quando terminar, me mande o codigo ou um print e eu analiso.
