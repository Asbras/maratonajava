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
