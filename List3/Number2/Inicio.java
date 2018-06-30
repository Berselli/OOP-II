/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOPII.List3.Number2;

/**
 *
 * @author berse
 */
public class Inicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String url = "";
        
        Navegador myNavegador = new Navegador();
        url = myNavegador.novaAba();
        myNavegador.addToHistorico(url);
        
        System.out.printf("URL: %s \n", myNavegador.selecionaAba(0).atual);
        
        url = myNavegador.selecionaAba(0).alterarURL("www.bing.com");
        myNavegador.addToHistorico(url);
        
        System.out.printf("URL: %s \n", myNavegador.selecionaAba(0).atual);
        
        url = myNavegador.novaAba();
        myNavegador.addToHistorico(url);
        
        System.out.printf("URL: %s \n", myNavegador.selecionaAba(1).atual);
        
        url = myNavegador.selecionaAba(1).alterarURL("www.yahoo.com");
        myNavegador.addToHistorico(url);
        
        myNavegador.showHistorico();
        
    }
    
}
