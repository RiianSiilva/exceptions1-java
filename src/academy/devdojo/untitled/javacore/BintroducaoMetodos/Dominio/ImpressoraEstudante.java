package academy.devdojo.untitled.javacore.BintroducaoMetodos.Dominio;

public class ImpressoraEstudante {
    public void imprime (Estudante estudante) {

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);

        //estudante.nome = "Gohan";
    }
}
