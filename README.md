# Estudo de Java

## Menu Rápido
- [Introdução](#introdução)
- [Instalação no Linux](#instalação-do-java-no-linux)
- [Sintaxe Básica](#sintaxe-básica)
    - [Tipos de Dados](#tipos-de-dados)
    - [Variáveis](#variáveis)
    - [Operadores](#operadores)
- [Estruturas de Controle](#estruturas-de-controle)
    - [Condicionais (`if`, `switch`, ternário)](#condicionais)
    - [Laços de Repetição (`for`, `while`)](#laços-de-repetição)

## Introdução
**Java** é uma linguagem de programação de alto nível, orientada a objetos, amplamente usada para desenvolver aplicações
multiplataforma. Ela é compilada para um código intermediário chamado *bytecode*, que não é executado diretamente pelo
sistema operacional, mas sim interpretado pela **Java Virtual Machine (JVM)**, permitindo que o mesmo programa rode em
diferentes sistemas.

.java → javac → .class (bytecode) → JVM (JIT) → Código nativo

![compilation.png](./images/java%20compilation.png)
## Instalação do Java no Linux

Instale o **JDK 17** (LTS) para compilar e executar:

### Ubuntu / Debian
```bash
sudo apt update
sudo apt install openjdk-17-jdk -y
java -version
javac -version

# Fedora/Red Hat
sudo dnf update
sudo dnf install java-17-openjdk-devel
java -version
javac -version

# Configuração opcional da variável JAVA_HOME
echo "export JAVA_HOME=$(dirname $(dirname $(readlink -f $(which javac))))" >> ~/.bashrc
source ~/.bashrc 
```
# *Sintaxe Básica*

## *Tipos de Dados*

## Tipos primitivos: armazenam valores simples diretamente na memória.

    - byte – números inteiros pequenos (-128 a 127)
    - short – inteiros curtos (-32.768 a 32.767)
    - int – inteiros comuns
    - long – inteiros longos
    - float – números decimais de precisão simples
    - double – números decimais de dupla precisão
    - char – caracteres únicos (como 'A')
    - boolean – valores lógicos (true ou false)
    - Referência: armazenam endereços de objetos (como String, arrays e classes personalizadas).

## *Variáveis*

Uma variável é um espaço na memória para armazenar um valor.

A sintaxe básica é:
```java
tipo nomeDaVariavel = valor;
```
### Exemplo:
```java
int idade = 25;
double salario = 3500.50;
boolean ativo = true;
String nome = "João";
```
## *Operadores*
    - Aritméticos: +, -, *, /, %
    - Comparação: ==, !=, <, >, <=, >=
    - Lógicos: &&, ||, !
    - Atribuição: =, +=, -=, *=, /=
    - Incremento/Decremento: ++, --

### Exemplo:
```java
int a = 10;
int b = 5;
System.out.println(a + b); // 15
System.out.println(a > b); // true
```
## *Estrutura de Controle*
Estruturas de controle em hava são elementos que permitem alterar o fluxo de execução do programa, como condicionais 
(if, else, switch) e laços de repetição (for, while, do-while). Elas controlam decisões e repetições com base em 
condições.
## Condicionais
### 1. if-else
```java
int idade = 15;

if (idade >= 18) {
    System.out.println("Maior de idade");
} else if (idade >= 13) {
    System.out.println("Adolescente");
} else {
    System.out.println("Criança");
}
```

### 2. Switch
```java
byte dia = 5;
// O switch aceita dados dos tipos: char, int, byte, short, enum, String
int dia = 3;
switch (dia) {
    case 1:
        System.out.println("Domingo");
        break;
    case 2:
        System.out.println("Segunda");
        break;
    default:
        System.out.println("Outro dia");
}
```

### 3. Operador ternário
O **operador ternário** é uma forma **compacta de substituir um `if-else` simples**, ideal para atribuir valores com base em uma condição.

```java
(condição) ? valorSeVerdadeiro : valorSeFalso;

// Verifica se é par ou ímpar
int num = 10;
String tipo = (num % 2 == 0) ? "Par" : "Ímpar";
```

## Laço de repetição
### 1. For
```java
// Contar de 0 a 10
for (int i = 0; i < 10; i++) {
    System.out.println("For " + i);
}
```

### 2. while
```java
// Imprimir a soma dos 100 primeiros números
int count = 1;
int soma = 0;
while (count <= 100){
    soma += count;
    count++;
}
System.out.println(soma);
```

### 3. do-while
```java
int x = 5;
do {
    System.out.println("Executa pelo menos uma vez: " + x);
    x--;
} while (x > 5);
```