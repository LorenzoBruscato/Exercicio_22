package exercicio_22;

import javax.swing.JOptionPane;

public class Exercicio_22 {

    public static void main(String[] args) {
        double soma = 0.0;
        double media = 0.0;
        int i = 1;
        while (i <= 1000) {
            soma = soma + i;
            i++;
        }
        media = soma / 1000;
        JOptionPane.showMessageDialog(null, "Media: " + media);
    }
}