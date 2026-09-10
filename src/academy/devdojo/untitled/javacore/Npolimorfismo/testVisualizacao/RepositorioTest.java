package academy.devdojo.untitled.javacore.Npolimorfismo.testVisualizacao;
import academy.devdojo.untitled.javacore.Npolimorfismo.repositorio.Repositorio;
import academy.devdojo.untitled.javacore.Npolimorfismo.servicoRegrasDeNegocio.RepositorioBancoDeDados;

public class RepositorioTest {
    static void main(String[] args) {
        Repositorio repositorio = new RepositorioBancoDeDados();
        repositorio.salvar();
    }
}
