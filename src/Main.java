import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        int num1 = sc.nextInt();

        System.out.print("Introduce el segundo número: ");
        int num2 = sc.nextInt();

        System.out.print("Introduce el tercer número: ");
        int num3 = sc.nextInt();

        System.out.println("Quieres sumarlos(1) o restarlos(2)?");
        int respuesta = sc.nextInt();

        if(respuesta == 1) {
            int suma = num1 + num2 + num3;
            System.out.println("La suma es: " + suma);
        }
        else{
            int resta= num1 - num2 - num3;
            System.out.println("La resta es: " + resta);
        }


    }
}