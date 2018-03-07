/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acm;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author aldaron
 */
public class Abc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        int values[] = new int[3];
        int j = 0;
        
        for (String i : a.split(" ")) {
            values[j] = Integer.parseInt(i);
            j++;
        }
        
        Arrays.sort(values);
        
        a = scan.nextLine();
        
        int d[] = new int[3];
        
        d[a.indexOf("A")] = 0;
        d[a.indexOf("B")] = 1;
        d[a.indexOf("C")] = 2;
        
        System.out.println(values[d[0]] + " " + values[d[1]] + " " + values[d[2]]);
    }
}
