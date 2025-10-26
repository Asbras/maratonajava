package maratonajava.javacore.Aintroducaoclasses.test;

// Importa a classe Estudante do pacote especificado
import maratonajava.javacore.Aintroducaoclasses.domain.Estudante;

public class EstudanteTest01 {
    // Programa que demonstra a instanciação de um objeto da classe Estudante,
    // atribuição de valores aos seus atributos e exibição desses valores.
    // Conceitos cobertos:
    // - Instanciação: Criação de um objeto com 'new', alocando memória e chamando o construtor.
    // - Acesso direto a campos: atribuição e leitura de atributos públicos (não encapsulados).
    public static void main(String[] args) {
        // Instancia um objeto da classe Estudante usando o construtor padrão
        // O operador 'new' aloca memória no heap e inicializa os campos com valores padrão (null, 0, '')
        Estudante estudante = new Estudante();

        // Atribui valores aos atributos públicos do objeto
        estudante.nome = "João da Silva"; // Define o nome do estudante
        estudante.idade = 20;             // Define a idade do estudante
        estudante.sexo = 'M';             // Define o sexo do estudante (M para masculino)

        // Exibe os valores dos atributos do objeto
        System.out.println("Nome: " + estudante.nome);
        System.out.println("Idade: " + estudante.idade);
        System.out.println("Sexo: " + estudante.sexo);
        System.out.println(estudante);
    }
}
