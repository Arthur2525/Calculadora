
package calculadora;

import javax.swing.JOptionPane;

    public class Calculadora {

        public static void main(String[] args) {
            
        JOptionPane.showMessageDialog(null, "Qual operação você deseja fazer?");
        String op = JOptionPane.showInputDialog("ObS: utilize apenas os simbolos: +, para adição. -, para subtração. *, para multiplição e / para divisão ");
        
        String s1 = JOptionPane.showInputDialog("Digite um numero");
        String s2 = JOptionPane.showInputDialog("Digite um segundo numero");
        
        int n1 = Integer.parseInt(s1);
        int n2 = Integer.parseInt(s2);
        int resul;
        switch (op){
            case "+":
                resul = n1 + n2;
                JOptionPane.showMessageDialog(null, resul);
                   break;         
            case "-":
                resul = n1 - n2;
                JOptionPane.showMessageDialog(null, resul);
                    break;
            case "*":
                resul = n1 * n2;
                JOptionPane.showMessageDialog(null, resul);
                    break;
            case "/":
                resul = n1 / n2;
                JOptionPane.showMessageDialog(null, resul);
                    break;
        }
        
        
                    
        }
    
    }
