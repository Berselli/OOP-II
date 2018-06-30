    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOPII.List3.Number1;

import java.util.ArrayList;
import java.util.Stack;

/**
 *
 * @author Juliano Berselli
 */
public class Inicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> array = LeituraEscritaTexto.lerArquivo();
        ArrayList<Stack> operacoes = new ArrayList();
        ArrayList<String> result = new ArrayList();
        CalculadoraNPR calc = new CalculadoraNPR();
        for(String linha : array)
        {
            String[] op = linha.split(" ");
            Stack<String> pilha = new Stack();
            for(int i = op.length - 1;  i >= 0; i--)
            {                
                pilha.push(op[i]);
            }
            operacoes.add(pilha);
        }
        
        for(Stack p : operacoes)
        {
            result.add(calc.calcula(p));
        }
        LeituraEscritaTexto.escreveArquivo(result);
    }
    
}
