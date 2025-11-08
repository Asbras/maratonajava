# Maratona Java - DevDojo

**Por: Leonardo Carnio Della Torre (@Asbras)**

![Java](https://img.shields.io/badge/Java-17-orange)
![Commits](https://img.shields.io/github/commit-activity/m/Asbras/maratonajava)

> Repositório com **todos os exercícios** da **Maratona Java do DevDojo**  
> Curso completo: POO, Métodos, Varargs, Exceptions, Clean Code

## Menu Rápido

- [Introdução](docs/01-Introducao.md)
- [Instalação no Linux](docs/02-instalacao.md)
- [Sintaxe Básica](docs/03-sintaxe-basica.md)
- [Estruturas de Controle](#estruturas-de-controle)
    - [Condicionais (`if`, `switch`, ternário)](#condicionais)
    - [Laços de Repetição (`for`, `while`)](#laço-de-repetição)
- [Arrays](#arrays)
- [Arrays Multidimensionais](#arrays-multidimensionais)
- [Classes](#classes)
- [Objetos](#objetos)
- [Métodos](#métodos)
- [Modificadores de Acesso](#modificadores-de-acesso)
- [Encapsulamento](#encapsulamento)
- [Sobrecarga](#sobrecarga)
- [Construtores](#construtores)

## *Estruturas de Controle*

Estruturas de controle em hava são elementos que permitem alterar o fluxo de execução do programa, como condicionais
(if, else, switch) e laços de repetição (for, while, do-while). Elas controlam decisões e repetições com base em
condições.

## Condicionais

### 1. if-else

```java
int idade = 15;

if(idade >=18){
        System.out.

println("Maior de idade");
}else if(idade >=13){
        System.out.

println("Adolescente");
}else{
        System.out.

println("Criança");
}
```

### 2. Switch

```java
byte dia = 5;
// O switch aceita dados dos tipos: char, int, byte, short, enum, String
int dia = 3;
switch(dia){
        case 1:
        System.out.

println("Domingo");
        break;
                case 2:
                System.out.

println("Segunda");
        break;
default:
        System.out.

println("Outro dia");
}
```

### 3. Operador ternário

O **operador ternário** é uma forma **compacta de substituir um `if-else` simples**, ideal para atribuir valores com
base em uma condição.

```java
// Sintaxe:
(condição)?valorSeVerdadeiro :valorSeFalso;

// Verifica se é par ou ímpar
int num = 10;
String tipo = (num % 2 == 0) ? "Par" : "Ímpar";
```

## Laço de repetição

### 1. For

```java
// Contar de 0 a 10
for(int i = 0;
i< 10;i++){
        System.out.

println("For "+i);
}
```

### 2. while

```java
// Imprimir a soma dos 100 primeiros números
int count = 1;
int soma = 0;
while(count <=100){
soma +=count;
count++;
        }
        System.out.

println(soma);
```

### 3. do-while

```java
int x = 5;
do{
        System.out.

println("Executa pelo menos uma vez: "+x);

x--;
        }while(x >5);
```

## Arrays

Arrays são estruturas de dados que armazenam vários valores do mesmo tipo em uma única variável.
Cada valor é acessado por um índice numérico, começando em 0.

```java
// Declara e inicializa um array de inteiros
int[] numeros = {10, 20, 30, 40};
System.out.

println("Números dentro do array: ");
// O for-each percorre todos os elementos do array automaticamente
for(
int num :numeros){
        System.out.

println(num);
}
// O for tradicional usa índices para acessar cada elemento
        for(
int i = 0;
i<numeros.length;i++){
        System.out.

println(numeros[i]);
}
```

## Arrays Multidimensionais

Um array multidimensional é um array que contém outros arrays.
O tipo mais comum é o array bidimensional, que pode ser visualizado como uma tabela (linhas e colunas).

```java
// Declara e inicializa um array bidimensional (matriz)
int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
// Exibe os elementos da matriz usando for convencional
System.out.

println("Elementos da matriz(for):");
for(
int i = 0;
i<matriz.length;i++){
        for(
int j = 0;
j<matriz[i].length;j++){
        System.out.

print(matriz[i][j]+" ");
    }
            System.out.

println();
}
// Exibe os elementos da matriz usando for-each
        System.out.

println("Elementos da matriz (usando for-each):");
for(
int[] linha :matriz){
        for(
int elemento :linha){
        System.out.

print(elemento +" ");
    }
            System.out.

println();
}
```

## Classes

Uma **classe** é um modelo usado para representar um objeto do mundo real. Ela define as **propriedades**
(chamadas de **atributos**) e os **comportamentos** (chamados de **métodos**) que os **objetos criados a partir dela**
terão.

```java
public class Carro {
    // Define os atributos da classe
    public String nome;
    public String modelo;
    public int ano;

    public void exibir() {
        System.out.println(nome + " " + modelo + " - Ano: " + ano);
    }
}
```

## Objetos

Um objeto é uma ocorrência real de uma classe, com dados próprios (atributos preenchidos) e capaz de realizar ações
(chamar métodos).

```java
public class Principal {
    public static void main(String[] args) {
        // Instanciar o objeto carro1
        Carro carro1 = new Carro();
        // Atribuir valores para os atributos da classe
        carro1.nome = "Hyundai";
        carro1.modelo = "HB20";
        carro1.ano = 2023;

        // Instanciar o objeto carro2
        Carro carro2 = new Carro();
        // Atribuir valores para os atributos da classe
        carro2.nome = "Renault";
        carro2.modelo = "C3";
        carro2.ano = 2022;

    }
}
```

### Resumo: Classe vs Objeto

| Conceito      | Descrição                                                       |
|---------------|-----------------------------------------------------------------|
| **Classe**    | É o modelo ou estrutura que define atributos e comportamentos.  |
| **Objeto**    | É uma instância concreta de uma classe com valores próprios.    |
| **Atributos** | São as características do objeto (ex: nome, modelo, ano).       |
| **Métodos**   | São as ações que o objeto pode executar (ex: exibir, acelerar). |

## Métodos

É um bloco de cógido que define um comportamento ou ação que um objeto pode executar. Ele é declarado numa
classe e pode receber parametros, executar instruções e opcionalmente retornar um valor.

```java
public class Carro {
    public String nome;
    public String modelo;
    public int ano;

    // método sem retorno (void)
    public void exibir() {
        System.out.println(nome + " " + modelo + " - Ano: " + ano);
    }

    // Método com PARÂMETROS e RETORNO.
    // O tipo de retorno é int, indicado antes do nome do método.
    // O método calcularIdade faz: anoAtual - ano
    // Neste caso: 2025 - 2023 = 2
    public int calcularIdade(int anoAtual) {
        return anoAtual - ano;
    }
}
```

```java
public class Principal {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.nome = "Hyundai";
        carro1.modelo = "HB20";
        carro1.ano = 2023;

        // Chamando o método com parâmetro e armazenando o retorno.
        int idade1 = carro1.calcularIdade(2025);
        // Imprimir no terminal o nome, modelo e idade do carro.
        // Saída esperada:
        // Hyundai HB20 tem 2 anos.
        System.out.println(carro1.nome + " " + carro1.modelo + " tem " + idade1 + " anos.");
    }
}
```

## Modificadores de Acesso

Os modificadores de acesso são importantes porque controlam a visibilidade e o encapsulamento dos dados e comportamentos
numa aplicação. Eles permitem que o desenvolvedor defina quais partes do código podem ser acessadas ou modificadas por
outras classes, ajudando a proteger informações sensíveis, evitar erros causados por uso indevido de atributos e manter
uma estrutura mais organizada e segura. são fundamentais para aplicar o encapsulamento.

Em java, existem quatro tipos de modificadores de acesso:

- public: Qualquer classe pode ter acesso, inclusive classes de outros pacotes.
- protected: Acesso permitido para a própria classe, para classes do mesmo pacote e para subclasses (mesmo que estejam
  em pacotes diferentes).
- private: Somente a própria classe tem acesso.
- default: Acesso permitido apenas para classes do mesmo pacote.

## Encapsulamento

O encapsulamento em Java é um princípio da programação orientada a objetos que consiste em ocultar os detalhes internos
de uma classe, expondo apenas o necessário por meio de métodos públicos (getters e setters).

### Getter e Setter

``` java
public class Aluno {
    private String nome;
    private int numeroAluno;
    
    public String getNome() {
        return nome;
    }
    
    public int getNumeroAluno() {
        return numeroAluno;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setNumeroAluno(int numeroAluno) {
        this.numeroAluno = numeroAluno;
    }
}    
```

## Sobrecarga

A sobrecarga permite definir vários métodos com o mesmo nome em uma mesma classe, desde que possuam listas de
parâmetros diferentes em número, tipo ou ordem.

```java
public class Calculadora {

    // Soma dois inteiros
    public int somar(int a, int b) {
        return a + b;
    }

    // Sobrecarga: soma três inteiros
    public int somar(int a, int b, int c) {
        return a + b + c;
    }

    // Sobrecarga: soma dois números de ponto flutuante
    public double somar(double a, double b) {
        return a + b;
    }

    // como utilizar no main
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println(calc.somar(2, 3));        // Saída: 5
        System.out.println(calc.somar(2, 3, 4));     // Saída: 9
        System.out.println(calc.somar(2.5, 3.7));    // Saída: 6,2
    }
}
```

## Construtores

Construtores em Java são métodos especiais usados para inicializar objetos ao criá-los com a palavra-chave new. Eles
têm o mesmo nome da classe, não possuem tipo de retorno (nem mesmo void) e são executados automaticamente no momento da
instanciação. Servem para garantir que o objeto comece em um estado válido, permitindo a atribuição inicial de valores
aos atributos por meio de parâmetros. Por exemplo, um construtor pode receber nome e idade de um aluno e já definir
esses dados ao criar o objeto, promovendo encapsulamento e evitando estados inconsistentes.

```java
// Classe Aluno com construtor
public class Aluno {
    private String nome;
    private int idade;

    // Construtor
    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Método para exibir os dados
    public void exibir() {
        System.out.println("Aluno: " + nome + ", Idade: " + idade);
    }

    // Método main para testar
    public static void main(String[] args) {
        // Criando um objeto usando o construtor
        Aluno aluno1 = new Aluno("Maria", 20);

        // Exibindo os dados
        aluno1.exibir(); // Saída: Aluno: Maria, Idade: 20
    }
}
```