/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula07Exemplo002;

import javax.swing.JFrame;

/**
 *
 * @author ice
 */
public class Aula07Exemplo002 {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
        
        JanelaListaPessoa j1 = new JanelaListaPessoa();
        // por ser no main o comportamento nem sempre vai ser o mesmo, se for dentro da classe janela vai ser sempre desse jeito.
        
        j1.setSize(400, 200); // define tamanho da janela
        j1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //clicar no botao de fechar, fecha a janela
        j1.setLocationRelativeTo(null);// Centraliza a janela
        j1.setVisible(true);// faz a janela visivel ao executa

}
    
}
