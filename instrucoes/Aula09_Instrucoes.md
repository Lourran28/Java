# Aula 09 - metodos em uma classe

## Antes de comecar

Voce vai continuar usando dois arquivos:

```text
Pessoa.java -> guarda os dados e cria a acao apresentar
Main.java   -> cria pessoa1, preenche os dados e manda ela se apresentar
```

Na Aula 08, a classe `Pessoa` guardava dados: `nome` e `idade`.

Agora ela tambem vai fazer uma acao: se apresentar.

## Passo 1 - criar a acao em Pessoa.java

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

O metodo deve ficar dentro da classe `Pessoa`, depois dos atributos.

## Passo 2 - chamar a acao em Main.java

Depois de criar e preencher um objeto, voce chama o metodo assim:

```java
pessoa1.apresentar();
```

Leia como: "pessoa1, se apresente". Essa linha deve ficar dentro do `main` e depois de preencher nome e idade.

## Ordem certa para pensar

```text
1. Criar pessoa1
2. Dar nome e idade para pessoa1
3. Chamar pessoa1.apresentar()
4. O Java entra no metodo apresentar e mostra a frase
```

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

## Erros comuns

- O nome do metodo precisa ser igual nos dois arquivos: `apresentar()` e `apresentar()`.
- Nao escreva `apresentar` sem parenteses ao chamar: use `pessoa1.apresentar();`.
- Dentro do metodo, use `nome` e `idade` para pegar os dados daquela pessoa.

## Como testar

No terminal, dentro da pasta `Aula09_POO`, rode:

```powershell
javac Main.java Pessoa.java
java Main
```

Tente sozinho. Quando terminar, me mande um print ou cole o codigo aqui e eu analiso.
