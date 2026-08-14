# Aula 12 - setter com setIdade

## Ideia da aula

Na Aula 11, voce usou `getNome()` e `getIdade()` para ler dados `private`.

Agora voce vai aprender a alterar um dado protegido usando um metodo `set`.

```text
get = pegar um dado
set = alterar um dado
```

## Por que nao mudar direto?

Com `private`, isto nao pode ser feito no `Main.java`:

```java
pessoa1.idade = 21;
```

Em vez disso, a propria classe `Pessoa` controla a mudanca por um metodo.

## Modelo de setter

No `Pessoa.java`, o formato e:

```java
public void setIdade(int idade) {
    this.idade = idade;
}
```

Leia assim: "altere a idade desta pessoa para a idade informada".

- `void`: o metodo altera um dado, mas nao devolve nada.
- `setIdade`: nome da acao.
- `int idade`: novo valor que chegou.
- `this.idade`: atributo que pertence a pessoa.

## Passo 1 - Pessoa.java

1. Crie os atributos `private String nome` e `private int idade`.
2. Crie o construtor, igual ao da Aula 11.
3. Crie `getNome()` e `getIdade()`.
4. Crie `setIdade(int idade)`.

## Passo 2 - Main.java

1. Crie uma pessoa passando nome e idade pelo construtor.
2. Mostre a idade inicial usando `getIdade()`.
3. Altere a idade usando `pessoa1.setIdade(...)`.
4. Mostre a nova idade usando `getIdade()`.

## Saida esperada

Use seus dados. Exemplo:

```text
Idade antes: 20
Idade depois: 21
```

## Erros comuns

- Escrever `pessoa1.idade = 21`: idade e `private`, use o setter.
- Esquecer de passar um numero dentro de `setIdade(...)`.
- Criar o setter com `return`: setter usa `void` e nao precisa devolver valor.

## Como testar

Dentro da pasta `Aula12_POO`, rode:

```powershell
javac Main.java Pessoa.java
java Main
```

Tente sozinho e me mande o codigo quando terminar.
