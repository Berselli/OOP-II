/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOPII.List6.Number2;
import OOPII.List3.Number1.*;
import java.io.*;
import java.util.ArrayList;
/**
 *
 * @author Juliano Berselli
 */
public class FileRW {
    
  public static String readFile(String filePath) {
    // podia ser o caminho: "c:\\Pasta\\arquivo.txt"
    ArrayList<String> array = new ArrayList();
    //filePath = "temp.txt";
    String fullText = "";
    try{
      // File tem vários métodos úteis
      File file_1 = new File(filePath);
      
      RandomAccessFile raf = new RandomAccessFile(file_1, "rw");
      String line = null;
      while((line = raf.readLine()) != null) {
          //System.out.println(linha);
          array.add(line);
      }
      
      raf.close();
      
      
      fullText = array.stream().map((item) -> item + "\n").reduce(fullText, String::concat);
      
    } catch (FileNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    return fullText;
  }
  
  public static void writeFile(String filePath, String fullText)
  {
     //String nomeArquivo = "temp.txt";
    try{
      // File tem vários métodos úteis
      File arquivo = new File(filePath);
      
      RandomAccessFile raf = new RandomAccessFile(arquivo, "rw");
      
      raf.setLength(0);
      
      //raf.write(fullText.getBytes());
      
      for(String line : fullText.split("\n")){
          raf.write((line + "\r\n").getBytes());
      }
              /*
      for(String ln : array)
      {
          raf.write((ln + "\r\n").getBytes());
      }
      */
      raf.close();
    } catch (FileNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } 
  }
  
  public static String newFile(){
      String filePath = "temp.txt";
      String fullText = "";
      
      try{
      // File tem vários métodos úteis
      File file_1 = new File(filePath);
      
      RandomAccessFile raf = new RandomAccessFile(file_1, "rw");
      
      raf.setLength(0);
      
      raf.close();
      
    } catch (FileNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    return fullText;
  }

}
