# Aula 09 - metodos em uma classe

## Objetivo

Aprender a criar um metodo dentro de uma classe e chamar esse metodo por um objeto.

Na Aula 08, a classe `Pessoa` guardava dados: `nome` e `idade`.

Agora ela tambem vai fazer uma acao: se apresentar.

## O que e um metodo?

Um metodo e uma acao que um objeto pode executar.

Exemplo: uma pessoa pode se apresentar.

```java
public void apresentar() {
    System.out.println("Ola, eu sou " + nome);
}
```

Nesta parte:

- `public` permite usar o metodo fora da classe.
- `void` significa que o metodo nao devolve um valor.
- `apresentar` e o nome da acao.
- `()` indica que, por enquanto, o metodo nao recebe nenhuma informacao.

## Chamando o metodo

Depois de criar e preencher um objeto, voce chama o metodo assim:

```java
pessoa1.apresentar();
```

Leia como: "pessoa1, se apresente".

## Questao

Na pasta `Aula09_POO`, faca um programa que:

1. No arquivo `Pessoa.java`, crie os atributos `String nome` e `int idade`.
2. Ainda em `Pessoa.java`, crie o metodo `public void apresentar()`.
3. Dentro do metodo, mostre uma frase usando o nome e a idade da pessoa.
4. No arquivo `Main.java`, crie um objeto chamado `pessoa1`.
5. Preencha o nome e a idade.
6. Chame o metodo com `pessoa1.apresentar();`.

## Saida esperada

Use os seus dados. Um exemplo seria:

```text
Ola, eu sou Ana e tenho 20 anos.
```

## Como testar

No terminal, dentro da pasta `Aula09_POO`, rode:

```powershell
javac Main.java Pessoa.java
java Main
```

Tente sozinho. Quando terminar, me mande um print ou cole o codigo aqui e eu analiso.
