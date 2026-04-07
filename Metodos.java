import java.util.Scanner;
import java.util.Stack;

public class Metodos {

    public int ValidarEntero(Scanner sc) {
        while (!sc.hasNextInt()) {
            System.out.println("Por favor digite un numero entero");
            sc.nextLine();
        }
        return sc.nextInt();
    }

    public Stack<Integer> llenarPila(Stack<Integer> p, Scanner sc) {
        System.out.println("Ingrese la cantidad de elementos: ");
        int n = ValidarEntero(sc);
        for (int i = 0; i < n; i = i + 1) {
            System.out.println("Ingrese el numero " + (i + 1) + ": ");
            p.push(ValidarEntero(sc));
        }
        return p;
    }

    public void procesarPila(Stack<Integer> p) {
        int cant20y80 = 0;
        int cantpositivos = 0;
        int suma80y200 = 0;
        int n = p.size();

        Stack<Integer> aux = new Stack<>();

        for (int i = 0; i < n; i = i + 1) {
            int numero = p.pop();
            if (numero >= 20 && numero <= 80) {
                cant20y80 = cant20y80 + 1;
            }
            if (numero > 0) {
                cantpositivos = cantpositivos + 1;
            }
            if (numero >= 80 && numero <= 200) {
                suma80y200 = suma80y200 + numero;
            }
            if (numero < 0) {
                aux.push(numero * numero * numero);
            } else {
                aux.push(numero);
            }
        }

        for (int i = 0; i < n; i = i + 1) {
            p.push(aux.pop());
        }

        System.out.println("Pila actualizada (negativos reemplazados por su cubo):");
        for (int valor : p) {
            System.out.println(valor);
        }
        System.out.println("Cantidad de numeros entre 20 y 80: " + cant20y80);
        System.out.println("Cantidad de numeros positivos: " + cantpositivos);
        System.out.println("Suma de numeros entre 80 y 200: " + suma80y200);
        System.out.println("-----------------------------");
    }
}