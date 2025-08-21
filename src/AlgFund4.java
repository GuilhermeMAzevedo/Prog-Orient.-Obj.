import java.util.Scanner;

public class AlgFund4 {
    public void fatorial(){
        Scanner prompt = new Scanner(System.in);
        System.out.println("Digite o numero que vc quer o fatorial");
        byte n = prompt.nextByte();
        byte fator = 1;
        byte i = 1;

        while (i <= n){
            fator = (byte)(i * fator);
            i++;
        }
        System.out.println("Resultado de " + n + "! :" + fator);
    }
}
