# Aula 08 - primeira classe e primeiro objeto

## Antes de comecar

Nesta aula existem dois arquivos:

```text
Pessoa.java -> descreve como uma pessoa e
Main.java   -> cria uma pessoa e usa essa pessoa
```

Faca primeiro o `Pessoa.java`. Depois va para o `Main.java`.

## Ideia principal

Uma **classe** e como um molde.

Uma classe `Pessoa` pode guardar informacoes como nome e idade. Uma pessoa especifica criada com esse molde e um **objeto**.

```java
class Pessoa {
    String nome;
    int idade;
}
```

Essa classe diz que toda pessoa pode ter `nome` e `idade`.

## Passo 1 - criar o molde em Pessoa.java

No arquivo `Pessoa.java`, voce vai escrever os dados que toda pessoa pode ter:

```java
String nome;
int idade;
```

Nao use `main` nesse arquivo.

## Passo 2 - criar uma pessoa em Main.java

Dentro do `main`, voce pode criar uma pessoa assim:

```java
Pessoa pessoa1 = new Pessoa();
```

`pessoa1` e o nome do objeto. `new Pessoa()` cria uma nova pessoa a partir da classe `Pessoa`.

Agora, ainda dentro do `main`, coloque os dados nessa pessoa:

```java
pessoa1.nome = "Ana";
pessoa1.idade = 20;
```

## Passo 3 - mostrar os dados

```java
System.out.println(pessoa1.nome);
System.out.println(pessoa1.idade);
```

## Questao facil

Na pasta `atividades/008-classes-e-objetos`, faca um programa que:

1. No arquivo `Pessoa.java`, crie uma classe chamada `Pessoa`.
2. Dentro dela, crie os atributos `String nome` e `int idade`.
3. No arquivo `Main.java`, dentro do `main`, crie um objeto chamado `pessoa1`.
4. Coloque seu nome no atributo `nome`.
5. Coloque sua idade no atributo `idade`.
6. Mostre o nome e a idade dessa pessoa no terminal.

## Regra importante

Cada arquivo tera uma classe publica com o mesmo nome do arquivo:

```text
Main.java   -> public class Main
Pessoa.java -> public class Pessoa
```

## Erros comuns

- Escrever `pessoa1.nome` fora do `main`: o objeto so existe dentro do `main`.
- Colocar aspas na idade: use `20`, nao `"20"`, porque idade e `int`.
- Usar um nome diferente: `Pessoa` e o nome da classe; `pessoa1` e o nome do objeto.

## Saida esperada

Os seus dados devem aparecer, por exemplo:

```text
Nome: Ana
Idade: 20
```

## Como testar

No terminal, rode:

```powershell
javac Main.java Pessoa.java
java Main
```

Tente por conta propria. Quando terminar, me mande o codigo ou um print e eu analiso.
