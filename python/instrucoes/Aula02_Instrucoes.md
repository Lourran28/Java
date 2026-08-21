# Aula 02 - entrada de dados em Python

## Objetivo

Aprender a pedir uma informacao para o usuario usando `input`.

## Ideia principal

No Python, `input()` mostra uma pergunta e espera a pessoa digitar algo.

Exemplo:

```python
nome = input("Digite seu nome: ")
```

O texto digitado fica guardado dentro da variavel `nome`.

## Importante

O `input()` sempre devolve texto.

Se voce pedir idade e quiser tratar como numero, use `int`:

```python
idade = int(input("Digite sua idade: "))
```

## Questao facil

No arquivo `python/atividades/002-entrada-de-dados/main.py`, faca um programa que:

1. Pergunte o nome do usuario.
2. Pergunte a idade do usuario.
3. Pergunte a cidade do usuario.
4. Mostre uma frase final juntando as tres informacoes.

## Saida esperada

Um exemplo:

```text
Digite seu nome: Ana
Digite sua idade: 20
Digite sua cidade: Petrolandia
Ola, Ana. Voce tem 20 anos e mora em Petrolandia.
```

## Dica

Para montar uma frase bonita, use `f-string`:

```python
print(f"Ola, {nome}. Voce tem {idade} anos.")
```
