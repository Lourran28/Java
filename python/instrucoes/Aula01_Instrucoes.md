# Aula 01 - Primeiro treino em Python

## Objetivo

Treinar tres coisas basicas:

1. Escrever mensagens na tela com `print`.
2. Criar variaveis.
3. Juntar texto com variaveis em uma frase.

## Antes de comecar

Abra o arquivo `python/atividades/001-variaveis-e-textos/main.py`.

No Python, voce pode escrever o codigo diretamente no arquivo. Nao precisa criar uma classe nem o metodo `main` para este primeiro exercicio.

## Criando variaveis

Uma variavel guarda um valor. Exemplo:

```python
nome = "Lourran"
idade = 20
```

O texto fica entre aspas. O numero inteiro nao usa aspas.

## Mostrando valores

Use `print` para mostrar uma informacao:

```python
print(nome)
print(idade)
```

## Montando uma frase

Uma forma simples de colocar variaveis dentro de uma frase e usar `f` antes das aspas e escrever a variavel entre chaves:

```python
print(f"Meu nome e {nome} e tenho {idade} anos")
```

As chaves indicam onde o valor da variavel vai aparecer.

## Questao facil

No arquivo `main.py`, faca um programa que mostre:

1. Seu nome.
2. Sua idade.
3. Sua cidade.
4. Uma frase juntando as tres informacoes.

Exemplo de saida esperada:

```text
Meu nome e Lourran
Eu tenho 20 anos
Eu moro em Petrolandia
Meu nome e Lourran, tenho 20 anos e moro em Petrolandia
```

Pode trocar os dados pelos que voce quiser.

## Regras

1. Crie uma variavel para o nome.
2. Crie uma variavel para a idade.
3. Crie uma variavel para a cidade.
4. Use `print` para mostrar as frases.

## Como testar

Abra o terminal dentro da pasta da atividade e rode:

```powershell
python main.py
```

Se nao funcionar, tente:

```powershell
py main.py
```

Se aparecer um erro, leia o numero da linha e tente descobrir o motivo. Se travar, envie o erro ou uma imagem para analisarmos juntos.
