

package boletin74;

import javax.swing.JOptionPane;

/**
 *
 * @author agomezcastro
 */
public class Peso {
    public int pedirNumEnteiro(){
        int num;
        String res= JOptionPane.showInputDialog("teclea un numero");
        num= Integer.parseInt(res);
        return num;
    }
    public String pedirNome(){
        String nome= JOptionPane.showInputDialog("teclea o nome");
        return nome;
    }
    public void peso(int num1, int num2, String nome1, String nome2){
        if (num1>num2)
            System.out.println(nome1 +" pesa mais cunha diferenza de "+ (num1-num2)+ " kilos");
        else if (num1<num2)
            System.out.println(nome2 +" pesa mais cunha diferenza de "+ (num2-num1)+ " kilos");
    }
}
