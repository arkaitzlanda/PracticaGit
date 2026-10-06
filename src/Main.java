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

        System.out.println("Quieres sumarlos(1) ,restarlos(2) o multiplicarlos(3)?");
        int respuesta = sc.nextInt();

        if(respuesta == 1) {
            int suma = num1 + num2 + num3;
            System.out.println("La suma es: " + suma);
        }
        else if(respuesta == 2){
            int resta = num1 - num2 - num3;
            System.out.println("La resta es: " + resta);
        }
        else{
            int multi = num1 * num2 * num3;
            System.out.println("La multiplicación es: " + multi);
        }


    }
}