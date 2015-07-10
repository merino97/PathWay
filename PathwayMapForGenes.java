/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pathwaymapforgenes;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import static java.util.Collections.list;
import java.util.Scanner;
/**
 *
 * @author nelsonmerino
 */
public class PathwayMapForGenes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        String i;
        String k;
     
        Scanner in = new Scanner(System.in);
     
     System.out.println("Example");
     System.out.println("Species - hsa");
     System.out.println("Entry Number - 05130, 440034, 100287010");
     
     System.out.println("__________");
        
     System.out.println("Enter the Species");
      i = in.nextLine();
      
      System.out.println("Enter the entry number");
      k = in.nextLine();
      System.out.println("  ");
      k = in.next ();
      
      
     StringBuilder pathway = new StringBuilder();

     pathway.append("http://rest.kegg.jp/get/");
     pathway.append(i);
     pathway.append(k);
     pathway.append("/kgml");
     
     try{
         URL map = new URL(pathway.toString());
         InputStream t = map.openStream();
         BufferedReader n = new BufferedReader(new InputStreamReader(t));
         String temp;
         while((temp = n.readLine()) != null){
             System.out.println(temp);
             
           
         }
         
     } catch (Exception e){
        System.err.println("Error: " + e.getMessage());
      
     }
     
    }
    
    
    
}
