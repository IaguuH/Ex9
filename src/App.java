import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        double F, C;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Temperatura em Fahrenheit - ");

        F = teclado.nextDouble();
        C = 5 * ((F-32) / 9);
        
        System.out.print(+ F + " graus Fahrenheit é igual a " + C + " graus Celsius");
    }
}
