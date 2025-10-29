# Estudo de Java

## Introdução
**Java** é uma linguagem de programação de alto nível, orientada a objetos, amplamente usada para desenvolver aplicações
multiplataforma. Ela é compilada para um código intermediário chamado *bytecode*, que não é executado diretamente pelo
sistema operacional, mas sim interpretado pela **Java Virtual Machine (JVM)**, permitindo que o mesmo programa rode em
diferentes sistemas.

O processo funciona em duas etapas: primeiro, o código-fonte `.java` é compilado pelo compilador `javac` em bytecode
`.class`; depois, a JVM interpreta ou just-in-time (JIT) compila esse bytecode em código nativo durante a execução,
garantindo portabilidade e eficiência.
![compilation.png](./images/java%20compilation.png)
## Instalação do Java no Linux

Para programar em Java, você precisa instalar o **JDK (Java Development Kit)**, que inclui o compilador `javac` e a JVM.

```bash
# Debian/Ubuntu
sudo apt update
sudo apt install openjdk-17-jdk
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

Java possui dois tipos principais de dados:

Primitivos: armazenam valores simples diretamente na memória.

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
