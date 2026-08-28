package Udemy_NelioAlves.TiposReferenciaVSTipoValor;

public class referencia {
}

// classes == tipo referencia == eles aceitam valo null, nao estao apontando para ninguem
// variaveis cujo o tipo sao classes nao devem ser entendidas como caixas, mas sim tentaculos (ponteiros) para caixas

// alocacao dinamica da memoria
// Product p1, p2
// p1 e p2 armazenados na Stack
// p1 = new Product("Tv", 900) armazenado no heap

// tipos primitivos == tipo valor == sao caixa e nao ponteiros

// double x, y
// sao caixas alocadas na memoria na parte stack, adicionando um valor nao uma referencia apontando um lugar na heap

// Desalocacao de memoria garbage collector == e um processo que automatiza o gerenciamento de memoria de um programa em execucao
// ele monitora os objs alocados dinamicamente pelo programa (no heap), desalocando aqueles que nao estao mais sendo utilizados

// desalocacao por escopo == dentro do stack teremos um escopo relacionado ao metodo, aula dos escopos por exemplo do if
// entrou no if cria mais um sub escopo, ao finalizar o if esse escopo e deletado