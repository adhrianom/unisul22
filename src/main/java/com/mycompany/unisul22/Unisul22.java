

package com.mycompany.unisul22;
import javax.swing.JOptionPane;
public class Unisul22 {

    public static void main(String[] args) {
        double media;
        int soma = 0;
        int i = 0;
            while (i <= 1000) {
            soma = soma + i;
            if (i == 1000) {
              media = soma / 1000;  
              JOptionPane.showMessageDialog(null, "A média é: " + media);
            }
            i++;
        }
    }
}
