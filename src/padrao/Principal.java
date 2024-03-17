/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package padrao;

/**
 * 29/02/2024 - Estrutura de Dados - ADS 1
 * @author João Enrique
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Estudante joao = new Estudante("Joao", "23827823"); //objeto 1 estudante
        Estudante enrique = new Estudante("Enrique", "4356324");//objeto 2 estudante
        Estudante andrei = new Estudante("Andrei", "3435353");//objeto 3 estudante
        Estudante gustavo = new Estudante("Gustavo", "3435353");//objeto 4 estudante
        Estudante hugo = new Estudante("Hugo", "3435353");//objeto 5 estudante
        
        Lista lista = new Lista(); //objeto da classe lista
        Object v[] = new Object[10];
        
        lista.adicionarElementoInicio(v, joao); //a. Adicionar um elemento no início da lista. (vetor, elemento)
        lista.adicionarElementoInicio(v, enrique); //a. Adicionar um elemento no início da lista. (vetor, elemento)
        lista.adicionarElementoFim(v, andrei); //b. Adicionar um elemento no fim da lista. (vetor, elemento)
        lista.adicionarElementoFim(v, gustavo); //b. Adicionar um elemento no fim da lista. (vetor, elemento)
        lista.adicionarElementoPosicao(v, hugo, 5); //c. Adicionar um elemento em qualquer posição da lista. (valor, elemento, posicao)
        lista.removerElementoPosicao(v, 0); //d. Remover um elemento de uma determinada posição da lista (vetor, posicao)
        
        System.out.println("");
        
        lista.elementoExiste(v, joao); //e. Verificar se um determinado elemento existe na lista. (vetor, elemento)
        lista.tamanhoVetor(v); //f. Um método para retornar o tamanho da lista. (vetor)
        lista.listaCheia(v); //g. Verificar se a lista está cheia. (considere que a lista não aumentará de tamanho) (vetor)
        lista.listaVazia(v); //h. Verificar se a lista está vazia. (vetor)
        lista.listar(v); //i. Listar todos os elementos da lista. (vetor)
    } 
    
}
