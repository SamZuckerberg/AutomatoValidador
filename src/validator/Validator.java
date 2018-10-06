/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validator;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author samzu
 */
public class Validator {
    private String form;
    String iden[];
    private char validOperations[] = {'+', '-', '/', '*'};
    
    /**
     * Index
     */
    public void index(){
        Scanner buffer = new Scanner(System.in);
        Scanner buffer2 = new Scanner(System.in);
        
        String in = "Easter egg";
        int n;
        
        System.out.println("Digite a quantidade de identificadores: (NUMERO CARALHO)");
        n = buffer.nextInt();
        
        this.iden = new String[n];
        
        for (int i = 0; i < n; i++) {
          System.out.println("Digite a atribuição " + (i+1));
          in = buffer2.nextLine();
          String sub[] = in.split("=");
          
          if(!this.isLowerCase(sub[0])){
              System.out.println("Variaveis somente em minusculo e sem espaço!");
              System.exit(0);
          }
          this.iden[i] = in;
        }
        
        for (String teste : this.iden) {
            System.out.println(teste);
        }
    }
    
    /**
     * Check if the String is Lower Case
     * 
     * @param value 
     */
    private boolean isLowerCase(String value){
        value = value.trim();
        char array[] = value.toCharArray();
        
        for (char sub : array) {
            System.out.println(Character.isLowerCase(sub));
            
            if(!Character.isLowerCase(sub))
                return false;
        }
        return true;
    }
}
