/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package list_4_number_2.List3.Number1;
import java.io.*;
import java.util.ArrayList;
/**
 *
 * @author Juliano Berselli
 */
public class LeituraEscritaTexto {
    
  public static ArrayList<String> lerArquivo() {
    // podia ser o caminho: "c:\\Pasta\\arquivo.txt"
    ArrayList<String> array = new ArrayList();
    String nomeArquivo = "temp.txt";
    try{
      // File tem vários métodos úteis
      File arquivo = new File(nomeArquivo);
      
      RandomAccessFile raf = new RandomAccessFile(arquivo, "rw");
      String linha = null;
      while((linha = raf.readLine()) != null) {
          //System.out.println(linha);
          array.add(linha);
      }
      
      raf.close();
    } catch (FileNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    return array;
  }
  
  public static void escreveArquivo(ArrayList<String> array)
  {
     String nomeArquivo = "saida.txt";
    try{
      // File tem vários métodos úteis
      File arquivo = new File(nomeArquivo);
      
      RandomAccessFile raf = new RandomAccessFile(arquivo, "rw");
      for(String ln : array)
      {
          raf.write((ln + "\r\n").getBytes());
      }
      
      raf.close();
    } catch (FileNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } 
  }

}
