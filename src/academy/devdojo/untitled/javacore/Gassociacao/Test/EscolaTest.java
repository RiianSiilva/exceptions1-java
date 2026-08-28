package academy.devdojo.untitled.javacore.Gassociacao.Test;

import academy.devdojo.untitled.javacore.Gassociacao.Dominio.Escola;
import academy.devdojo.untitled.javacore.Gassociacao.Dominio.Professor;
// 1- criamos os objs, escola e professor
// 2- criamos um array para organizar os objs Professo, mas pq? Pq declaramos que a classe Professor é um array
// 3- no obj escola adicionamos o nome da escola e o nome do array (professores) que tem os valores dos objs (professor)
// 4- usamos o metodo imprimir para mostrar o nome da escola e todos os professores cadastrados nessa escola
public class EscolaTest {
    static void main(String[] args) {
       //Uma relacao de muitos para um, muitos porfessores para uma escola
       Professor professor1 = new Professor("Rian");
       Professor professor2 = new Professor("Diego");
       Professor professor3 = new Professor("Dayverson");
       Professor professor4 = new Professor("Kaique");

       Professor[] professores = {professor1, professor2, professor3, professor4}; //é necessario pq a Classe professor é um array
       Escola escola = new Escola("Joaquim", professores);

       escola.imprimir();



    }
}
