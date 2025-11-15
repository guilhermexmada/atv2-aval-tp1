/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.fatec.atv2.notas;

import javax.swing.JOptionPane;

/**
 *
 * @author fatec-dsm2
 */
public class Atv2Notas {
    public static void main(String[] args) {
        
        // instâncias 
        Aluno al = new Aluno();
        
        // variáveis
        String nome;
        float[] notasArray = new float[3];
        String notaIndividual;
       
        
        // capturando nome 
        nome = JOptionPane.showInputDialog(
                null,
                "Por favor, digite seu nome: "
        );
        
        // salvando nome
        if(nome != null && !nome.trim().isEmpty()){
            // saudação
            al.setNome(nome);
            JOptionPane.showMessageDialog(
                null,
                "Seja bem-vindo " + al.getNome() + "!",
                "Saudação",
                JOptionPane.INFORMATION_MESSAGE
            );
        } else {
            // aviso 
            JOptionPane.showMessageDialog(
                null,
                "Preencha um nome válido",
                "Aviso",
                JOptionPane.WARNING_MESSAGE
            );
            return;
        }   
        
        // capturando notas
        for(int i = 0; i < 3; i++){
            // captura em string 
            notaIndividual = JOptionPane.showInputDialog(
                null,
                "Digite sua " + (i+1) + "ª nota: "
            );
            // verifica se está vazia
            if(notaIndividual != null && !notaIndividual.trim().isEmpty()){
                // converte em float
                float notaConvertida = Float.parseFloat(notaIndividual);
                // insere em array
                notasArray[i] = notaConvertida;
            } else{
                // aviso 
                JOptionPane.showMessageDialog(
                    null,
                    "Preencha uma nota válida" + notaIndividual,
                    "Aviso",
                    JOptionPane.WARNING_MESSAGE
                );
                return;
            }
             
    } // fim do for
        
        // salvando notas
        al.setNotas(notasArray);
        
        // calculando média
        al.calcularMedia(notasArray[0], notasArray[1], notasArray[2]);
        
        // avaliando desempenho
        al.avaliarDesempenho(al.getMedia());
        
        // exibindo média e desempenho
        JOptionPane.showMessageDialog(
                null,
                "Média: " + al.getMedia() + " pontos! \nDesempenho: " + al.getDesempenho(),
                "Avaliação de " + al.getNome(),
                JOptionPane.INFORMATION_MESSAGE
            );
    
// ---
}
}

