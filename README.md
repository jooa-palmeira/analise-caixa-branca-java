# Análise de Caixa Branca Estática – Java

Este repositório contém a análise de caixa branca estática de um código Java responsável pela autenticação de usuários em um banco de dados MySQL.

O trabalho contempla:
- Análise do código original
- Identificação de falhas
- Refatoração do código
- Cálculo da complexidade ciclomática
- Definição dos caminhos básicos
- Criação de planilha de teste
- Documentação completa em README.md

---

## 📌 Código Original Analisado

O arquivo **UserOriginal.java** representa o código-fonte original fornecido para análise.

Principais características do código original:
- Ausência de documentação
- Uso de SQL por concatenação de strings
- Falta de tratamento de exceções
- Recursos de banco não fechados
- Possibilidade de NullPointerException
- Vulnerável a SQL Injection

Este código foi mantido sem alterações para fins de análise de caixa branca estática.

---

## 🧪 Análise de Caixa Branca Estática

### Documentação
❌ O código original não possui comentários explicativos ou documentação adequada.

### Nomenclatura
⚠️ Parcialmente adequada. Algumas variáveis utilizam nomes genéricos como `conn`, `sql` e `result`.

### Legibilidade e Organização
⚠️ O código é compreensível, porém apresenta falhas de organização, indentação e boas práticas.

### Tratamento de NullPointerException
❌ Não há validações adequadas para objetos que podem ser nulos.

### Fechamento de Conexões
❌ Os recursos `Connection`, `Statement` e `ResultSet` não são fechados corretamente.

---

## 📋 Planilha de Teste – Caixa Branca Estática

Foi criada uma planilha de teste contendo a avaliação estática do código analisado, abordando critérios como:
- Documentação
- Nomenclatura
- Legibilidade
- Tratamento de exceções
- Gerenciamento de conexões

📎 A planilha encontra-se disponível neste repositório.

---

## 🔀 Notação de Grafo de Fluxo

A notação de grafo de fluxo foi elaborada com base no método `verificarUsuario()`.

Nós identificados:
1. Início do método  
2. Criação da conexão  
3. Montagem da instrução SQL  
4. Execução da consulta  
5. Estrutura condicional `if (rs.next())`  
6. Retorno verdadeiro  
7. Retorno falso  

📎 O grafo de fluxo encontra-se na pasta `/imagens`.

---

## 📐 Complexidade Ciclomática

### Fórmula utilizada:
