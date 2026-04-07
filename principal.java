import java.util.Scanner;
import java.util.Stack;

public class principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Metodos m = new Metodos();
        Stack<Integer> pila = new Stack<>();

        pila = m.llenarPila(pila, sc);
        m.procesarPila(pila);
    }
}