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
        
        // variáveis de captura
        String nome;
        Object[] opcoes = {"Exibir notas", "Exibir media", "Exibir desempenho"};
        
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
        }
    }
}

