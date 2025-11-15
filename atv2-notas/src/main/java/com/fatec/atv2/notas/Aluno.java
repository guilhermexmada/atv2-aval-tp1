/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fatec.atv2.notas;

/**
 *
 * @author fatec-dsm2
 */
public class Aluno {
    // atributos 
    private String nome; 
    private float[] notas = new float[3];
    private float media;
    private String desempenho;
    
    // getters e setters
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public float[] getNotas(){
        return this.notas;
    }
    public void setNotas(float[] notas){
        this.notas = notas;
    }
    public float getMedia(){
        return this.media;
    }
    public void setMedia(float media){
        this.media = media;
    }
    public String getDesempenho(){
        return this.desempenho;
    }
    public void setDesempenho(String desempenho){
        this.desempenho = desempenho;
    }
    
    // métodos específicos
    public void calcularMedia(float n1,float n2,float n3){
        float mediaCalculada = (( n1 + n2 + n3 ) / 3);
        // salva média
        setMedia(mediaCalculada);
    }
    
    public void avaliarDesempenho (float media){
        String avaliacao;
        if(media <= 6.0 ){
           avaliacao = "Reprovado...";
        } else if(media >= 6.0 && media <= 9.0){
            avaliacao = "Aprovado!";
        } else if(media > 9.0){
            avaliacao = "Ótimo desempenho!";
        } else {
            avaliacao = "Nota inválida...";
        }
        // salva desempenho
        setDesempenho(avaliacao);
    }
    
}
