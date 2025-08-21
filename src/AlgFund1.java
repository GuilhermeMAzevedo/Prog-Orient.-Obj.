import java.util.Scanner;

public class AlgFund1 {
    public void trocaValores() {
        System.out.println("Digite A");
        Scanner prompt = new Scanner(System.in);
        byte a = prompt.nextByte();
        System.out.println("Digite B");
        byte b = prompt.nextByte();
        byte aux;
        System.out.println("Antes da troca");
        System.out.println("A = " + a);
        System.out.println("B = " + b);

        aux = a;
        a = b;
        b = aux;

        System.out.println("Depois da troca");
        System.out.println("A = " + a);
        System.out.println("B = " + b);
    }
}
