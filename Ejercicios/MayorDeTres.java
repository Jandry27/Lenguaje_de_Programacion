import java.util.Scanner;
public class MayorDeTres {
    public static void main(String[] args) {

        @SuppressWarnings("resource")
        Scanner teclado = new Scanner(System.in);
        int n1, n2, n3;
        System.out.print("Introduzca primer número: ");
        n1 = teclado.nextInt();
        System.out.print("Introduzca segundo número: ");
        n2 = teclado.nextInt();
        System.out.print("Introduzca tercer número: ");
        n3 = teclado.nextInt();
        if (n1 > n2) {
            if (n1 > n3) {
                System.out.println("El mayor es: " + n1);                                             
            } else {
                System.out.println("el mayor es: " + n3);     
            }
        } else if (n2 > n3) {
            System.out.println("el mayor es: " + n2);
        } else {
            System.out.println("el mayor es: " + n3);
        }
    }
}