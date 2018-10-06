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
    public void index() {
        Scanner buffer = new Scanner(System.in);
        Scanner buffer2 = new Scanner(System.in);

        String in = "Easter egg";
        int n=0;

        System.out.println("Digite a quantidade de identificadores: (NUMERO CARALHO)");
        try{
            n = buffer.nextInt();
        }
        catch(Exception e){
            System.out.println("Somente números!");
            System.exit(0);
        }
        

        this.iden = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite a atribuição " + (i + 1));
            in = buffer2.nextLine();
            String sub[] = in.split("=");

            if (!this.isLowerCase(sub[0]) || !this.isNumber(sub[1])) {
                System.out.println("Arquivo inválido !");
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
    private boolean isLowerCase(String value) {
        value = value.trim();
        char array[] = value.toCharArray();

        for (char sub : array) {

            if (!Character.isLowerCase(sub)) {
                return false;
            }
        }
        return true;
    }

    /**
     * Check if the String is number
     *
     * @param value
     * @return
     */
    private boolean isNumber(String value) {
        try {
            Double num = Double.parseDouble(value);
        } catch (NumberFormatException e) {
            return false;
        }

        return true;
    }
}
