package maratonajava.javacore.Npolimorfismo.repositorio;

public class RepositorioArquivo implements Repositorio{

    @Override
    public void salvar() {
        System.out.println("Salvando no arquivo");
    }
}
