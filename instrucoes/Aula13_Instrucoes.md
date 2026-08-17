# Aula 13 - validar idade no setter

## Ideia da aula

Na Aula 12, o metodo `setIdade()` aceitava qualquer numero.

Mas uma pessoa nao pode ter idade negativa. Agora voce vai usar `if` dentro do setter para validar o valor antes de alterar o atributo.

## Exemplo de problema

Sem validacao, isto seria aceito:

```java
pessoa1.setIdade(-5);
```

Nesta aula, se a idade for negativa, o programa nao deve mudar a idade da pessoa.

## Onde usar o if?

O `if` fica dentro de `setIdade()`, no arquivo `Pessoa.java`.

A ideia e:

```text
se a idade for maior ou igual a 0
    alterar a idade
senao
    mostrar uma mensagem de erro
```

## Passo 1 - Pessoa.java

1. Crie os atributos `private String nome` e `private int idade`.
2. Crie o construtor e os getters, como nas aulas anteriores.
3. Crie `setIdade(int idade)`.
4. Dentro do setter, use `if` para aceitar somente idade maior ou igual a zero.
5. No `else`, mostre uma mensagem como `Idade invalida`.

## Passo 2 - Main.java

1. Crie uma pessoa com idade inicial `20`.
2. Tente alterar a idade para `-5` usando `setIdade(-5)`.
3. Mostre a idade depois da tentativa usando `getIdade()`.
4. Depois altere a idade para `21`.
5. Mostre a idade novamente.

## Saida esperada

```text
Idade invalida
Idade depois da tentativa: 20
Idade atualizada: 21
```

## Dicas

- Para verificar se um numero nao e negativo, use `>= 0`.
- `this.idade = idade;` deve ficar dentro do `if`.
- No `else`, nao altere a idade.

## Como testar

Dentro da pasta `Aula13_POO`, rode:

```powershell
javac Main.java Pessoa.java
java Main
```

Tente sozinho e me mande o codigo quando terminar.
