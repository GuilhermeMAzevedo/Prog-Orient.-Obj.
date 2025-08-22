import java.util.Scanner;

public class AlgFund9 {
    public void conversao(){
        Scanner prompt = new Scanner(System.in);
        System.out.println("Digite o numero inteiro");
        String numero = prompt.next();
        int n = numero.length();
        int[]decimal = new int[numero.length()];
        char letra;
        long digito;
        byte i = 0;
        System.out.print("Formato decimal: ");
        while (i < n){
            letra = numero.charAt(i);
            digito = ((long) letra);
            decimal[i] = (int) digito;
            System.out.print(decimal[i] + " ");
            i++;
        }


    }
}
