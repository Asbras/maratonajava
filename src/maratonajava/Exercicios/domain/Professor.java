package maratonajava.Exercicios.domain;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminariosMinistrados;

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor(String nome, String especialidade, Seminario[] seminariosMinistrados) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminariosMinistrados = seminariosMinistrados;
    }

    public void imprime() {
        System.out.println("----------");
        System.out.println("Professor: " + this.nome);
        if (this.seminariosMinistrados == null) {
            return;
        }
        System.out.println("## Seminários cadastrados ##");
        for (Seminario seminario : seminariosMinistrados) {
            System.out.println(seminario.getTitulo());
            System.out.println(seminario.getLocal().getEndereco());
            if (seminario.getAlunos() == null || seminario.getAlunos().length == 0) {
                continue;
            }
            System.out.println("** Alunos **");
            for (Aluno aluno : seminario.getAlunos()) {
                System.out.println("Aluno: " + aluno.getNome());
                System.out.println("idade: " + aluno.getIdade());
            }
        }
    }

    public Seminario[] getSeminariosMinistrados() {
        return seminariosMinistrados;
    }

    public void setSeminariosMinistrados(Seminario[] seminariosMinistrados) {
        this.seminariosMinistrados = seminariosMinistrados;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
