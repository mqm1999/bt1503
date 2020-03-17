/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt3;

import static java.lang.Math.pow;
import java.util.Scanner;

/**
 *
 * @author HP Pavilion
 */
public class Bt3 {

    /**
     * @param args the command line arguments 
     */
    public static void main(String[] args) {
    int n, f = 1, count = 0, k = 1;
    Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n: ");
        n = sc.nextInt();
        for(int i = 1; i <= n; i++)
        {
            f = f*i;   
        }
        while(pow(5,k) <= n)
        {
            count += n/pow(5,k);
            k++;
        }
        System.out.println("So chu so 0 lien tiep tu hang don vi: " +count);
    }
}
