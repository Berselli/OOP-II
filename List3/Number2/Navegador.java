/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOPII.List3.Number2;

import java.util.ArrayList;

/**
 *
 * @author berse
 */
public class Navegador {
    ArrayList<String> historico;
    ArrayList<Aba> abas;
    
    public Navegador() {
        historico = new ArrayList<>();
        abas = new ArrayList<>();
    }
    public String novaAba() {
        Aba newAba = new Aba(){};
        abas.add(newAba);
        return newAba.atual;
    }
    public Aba selecionaAba(int index){
        return abas.get(index);
    }
    public void addToHistorico(String novaURL)
    {
        historico.add(novaURL);
    }
    public ArrayList<String> getHistorico()
    {
        return historico;
    }
    public void showHistorico(){
        System.out.println("Histórico:");
        historico.forEach((url) -> {
            System.out.println(" URL: " + url);
        });
    }
}
