/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package padrao;

import java.util.Arrays;

/**
 * Classe Lista
 * @author João Enrique
 */
public class Lista {
    private int totalElementos; //2.c atualizar o total de objetos a cada adição ou remoção de elementos.
    
    //a. Adicionar um elemento no início da lista.
    public void adicionarElementoInicio(Object[] v, Object element) {
        if (totalElementos < v.length) { //verifica se tem espaço para preencher (não permitir adicionar novos elementos se não existir espaço no vetor)
            for (int i = totalElementos; i > 0; i--) { //percorre array de tras pra frente
                v[i] = v[i-1]; // move items para uma casa adiante
            }
            
            v[0] = element; //adiciona item na posição 0
            totalElementos++; 
            
            System.out.println(Arrays.toString(v));
        } else {
            System.out.println("A lista está cheia. Não é possível adicionar mais elementos.");
        }
    }

    
    //b. Adicionar um elemento no fim da lista.
    public void adicionarElementoFim(Object[] v, Object element) {
         if (totalElementos < v.length) { //verifica se tem espaço para preencher (não permitir adicionar novos elementos se não existir espaço no vetor)
             
             v[totalElementos] = element; //adiciona elemento depois do último
             totalElementos++;
             
            System.out.println(Arrays.toString(v));
         } else {
             System.out.println("A lista está cheia. Não é possível adicionar mais elementos.");
         }
     }
    
    //c. Adicionar um elemento em qualquer posição da lista.
    public void adicionarElementoPosicao(Object[] v, Object element, int position) {
        if (position >= 0 && position < v.length && totalElementos < v.length) { //caso posição seja verdadeira (>=0 e <=tamanho do vetor) e tenha espaço vazio
            
            if(v[position] == null){ //verifica se já tem número na posição
                v[position] = element;
                System.out.println(Arrays.toString(v));
                totalElementos++;
            }else{
                System.out.println("Essa posição está ocupada. Não foi possível adicionar o elemento");
            }
        } else {
            System.out.println("Posição inválida ou a lista está cheia.");
        }
    }
    
    //d. Remover um elemento de uma determinada posição da lista
    public void removerElementoPosicao(Object[] v, int position) {
        if (position >= 0 && position <= v.length && totalElementos != 0 && v[position] != null) { //caso posição seja verdadeira (>=0 e <=tamanho do vetor) e a lista não esteja vazia
                v[position] = null;  
                
            totalElementos--;
            System.out.println("Posição: " + position + " removido: " + Arrays.toString(v));
        } else {
            System.out.println("Posição inválida ou a lista está vazia");
        }
    }
    
    
    //e. Verificar se um determinado elemento existe na lista. (métodos para vetor não ordenado)
    public boolean elementoExiste(Object[] v, Object element){
        for(int i = 0; i< v.length; i++){ //percorre todos os valores
        
            if(v[i] == element){ //caso ache elemento
                System.out.println(element.toString() + " existe na lista");
                return true;
            }   
        }
        
        System.out.println("Nao Encontrado");
        return false;
    }
    
    //f. Um método para retornar o tamanho da lista.
    public int tamanhoVetor(Object[] v){
        System.out.println("Tamanho do vetor: " + v.length);
        
        return v.length;
    }
    
    
    //g. Verificar se a lista está cheia. (considere que a lista não aumentará de tamanho)
    public boolean listaCheia(Object v[]) {
        if(totalElementos == v.length){ //se os campos cheio for igual ao total de campo, a lista está cheia
            System.out.println("A lista está cheia");
            return true;
        }
        
        System.out.println("A lista não está cheia");
        return false;
    }

    //h. Verificar se a lista está vazia.
    public boolean listaVazia(Object v[]) {
        if(totalElementos==0){ //se o tamanho preenchido for 0 a lista é vazia
            System.out.println("A lista está vazia");
            return true;
        }
            
        System.out.println("A lista não está vazia");
        return false;
    }
    
    //i. Listar todos os elementos da lista.
    public void listar(Object[] v){
        for(int i=0; i <v.length; i++){ //percorre todos os itens
            System.out.println("Posicao: " + i + ": " + v[i]); //apresenta cada item
        }
    }
}
