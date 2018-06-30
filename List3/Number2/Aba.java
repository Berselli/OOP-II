/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOPII.List3.Number2;

import java.util.ArrayList;
import java.util.Stack;

/**
 *
 * @author berse
 */
public abstract class Aba{
    Stack<String> anteriores;
    Stack<String> posteriores;
    String atual;
    public Aba()
    {
        anteriores = new Stack<>();
        posteriores = new Stack<>();
        atual = "www.google.com";
    }
    private void showAtual()
    {
        System.out.printf("Mudança do estado atual. URL: %s \n", atual);
    }        
    public String alterarURL(String novaURL)
    {        
        anteriores.push(atual);
        atual = novaURL;
        posteriores.clear();
        
        return novaURL;
    }
    public void retornar()
    {
        posteriores.push(atual);
        atual = anteriores.pop();
        showAtual();
    }
    public void avancar()
    {
        anteriores.push(atual);
        atual = posteriores.pop();  
        showAtual();
    }
}
