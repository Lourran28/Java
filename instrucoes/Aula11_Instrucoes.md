# Aula 11 - encapsulamento com private e get

## Antes de comecar

Na Aula 10, o `Main` conseguia mexer diretamente nos dados da pessoa:

```java
pessoa1.nome = "gih";
```

Agora vamos proteger esses dados. A ideia e: o `Main` pede a informacao para a classe `Pessoa`, em vez de acessar o atributo diretamente.

## O que significa private?

Quando um atributo usa `private`, ele so pode ser acessado dentro da propria classe.

```java
private String nome;
private int idade;
```

Depois disso, `pessoa1.nome` deixa de funcionar no `Main.java`. Isso e normal: o dado esta protegido.

## O que e get?

Um metodo `get` serve para pegar um dado protegido.

Exemplo de formato:

```java
public String getNome() {
    return nome;
}
```

- `public`: o `Main` pode usar.
- `String`: o metodo devolve um texto.
- `getNome`: nome do metodo.
- `return nome`: entrega o nome que esta guardado na pessoa.

Para a idade, pense: qual tipo o metodo precisa devolver? `String` ou `int`?

## Passo 1 - Pessoa.java

No arquivo `Pessoa.java`:

1. Crie os atributos `nome` e `idade` usando `private`.
2. Crie o construtor, igual a Aula 10, para receber nome e idade.
3. Crie o metodo `getNome()` que devolve o nome.
4. Crie o metodo `getIdade()` que devolve a idade.

## Passo 2 - Main.java

No arquivo `Main.java`:

1. Crie uma pessoa ja passando nome e idade no construtor.
2. Mostre o nome usando o metodo `getNome()`.
3. Mostre a idade usando o metodo `getIdade()`.

Modelo de chamada:

```java
pessoa1.getNome()
```

## Saida esperada

Use seus dados. Um exemplo:

```text
Nome: gih
Idade: 20
```

## Erros comuns

- Esquecer o `return` dentro do metodo get.
- Criar `getIdade()` com `String`: idade e numero, entao veja qual tipo usar.
- Tentar usar `pessoa1.nome` no `Main`: com `private`, use `pessoa1.getNome()`.
- Escrever `getNome` sem `()`: para chamar o metodo, use parenteses.

## Como testar

Dentro da pasta `Aula11_POO`, rode:

```powershell
javac Main.java Pessoa.java
java Main
```

Tente primeiro. Quando terminar, me mande seu codigo ou um print e eu analiso.
