

package boletin74;

/**
 *
 * @author agomezcastro
 */
public class Boletin74 {

    
    public static void main(String[] args) {
        int num1, num2;
        String nome1, nome2;
        Peso obx= new Peso();
        num1= obx.pedirNumEnteiro();
        nome1= obx.pedirNome();
        num2= obx.pedirNumEnteiro();
        nome2= obx.pedirNome();
        obx.peso(num1, num2, nome1, nome2);
    }
    
}
