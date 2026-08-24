# Aula 15 - primeira heranca

## Inspiracao da faculdade

Na pasta `Faculdade/aula04 (heranca)/Animal`, existe um exemplo com `Animal`, `Mamifero` e `Cachorro`.

Nesta atividade, voce vai fazer uma versao menor para entender a base de heranca.

## Ideia principal

Heranca acontece quando uma classe aproveita caracteristicas de outra.

Exemplo:

```text
Cachorro e um Animal
```

Entao `Cachorro` pode herdar coisas de `Animal`.

Em Java, usamos `extends`:

```java
public class Cachorro extends Animal {
}
```

Isso quer dizer: `Cachorro` herda de `Animal`.

## O que voce vai treinar

1. Criar uma classe base chamada `Animal`.
2. Criar uma classe filha chamada `Cachorro`.
3. Usar `extends`.
4. Usar `super` no construtor.
5. Criar um objeto `Cachorro` no `Main`.

## Passo 1 - Animal.java

No arquivo `Animal.java`:

1. Crie os atributos:

```java
protected String nome;
protected int idade;
```

2. Crie um construtor recebendo `nome` e `idade`.
3. Crie um metodo chamado `exibirDados()`.
4. Dentro de `exibirDados()`, mostre o nome e a idade do animal.

## Passo 2 - Cachorro.java

No arquivo `Cachorro.java`:

1. Faca `Cachorro` herdar de `Animal`.
2. Crie o construtor de `Cachorro`.
3. Dentro do construtor, chame o construtor da classe `Animal` usando `super(nome, idade)`.
4. Crie um metodo chamado `latir()`.
5. Dentro de `latir()`, mostre uma frase dizendo que o cachorro latiu.

## Passo 3 - Main.java

No arquivo `Main.java`:

1. Crie um objeto `Cachorro`.
2. Chame `exibirDados()`.
3. Chame `latir()`.

## Saida esperada

Use os dados que voce quiser. Exemplo:

```text
Nome: Rex
Idade: 3
Rex latiu.
```

## Dicas importantes

- `protected` deixa a classe filha acessar o atributo.
- `extends` cria a heranca.
- `super(nome, idade)` chama o construtor da classe pai.
- O metodo `exibirDados()` fica em `Animal`, mas o objeto `Cachorro` consegue usar ele porque herdou.

## Como testar

Dentro da pasta `Aula15_POO`, rode:

```powershell
javac Main.java Animal.java Cachorro.java
java Main
```

Tente fazer primeiro. Quando terminar, me mande o codigo e eu analiso.
