/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package list_4_number_2.List3.Number1;

import java.util.Stack;

/**
 *
 * @author Juliano Berselli
 */
public class CalculadoraNPR {
        
    public String calcula(Stack<String> pilha)
    {
        String result = "";
        do
            {
                String num_a = (String)pilha.pop();
                String num_b = (String)pilha.pop();
                String operador = (String)pilha.pop();
                System.out.print(num_a + " " +  operador + " " + num_b + " = ");
                float numb_a = Float.parseFloat(num_a);
                float numb_b = Float.parseFloat(num_b);
                float resultado;
                switch(operador)
                {
                    case "-":
                        resultado = numb_a - numb_b;
                        break;
                    case "/":
                        resultado = numb_a / numb_b;
                        break;
                    case "*":
                        resultado = numb_a * numb_b;
                        break;
                    default:
                        resultado = numb_a + numb_b;
                        break;
                }
                
                System.out.print(resultado + " \n");
                pilha.push(Float.toString(resultado));
                if(pilha.size() == 1)
                {
                    result = pilha.pop();
                }
            }while(!pilha.empty());
        return result;
    }
}
