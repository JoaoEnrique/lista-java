/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package padrao;

/**
 * Classe Estudante
 * @author João Enrique
 */
public class Estudante {
    private String nome;
    private String ra;

    public Estudante(String nome, String ra) {
        this.nome = nome;
        this.ra = ra;
    }

    // set e get
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getRa(){
        return ra;
    }
    
    public void setRa(String ra){
        this.ra = ra;
    }
    
    @Override
    public String toString(){
        return "Nome: " + nome + " - Ra: " + ra;
    }
}
