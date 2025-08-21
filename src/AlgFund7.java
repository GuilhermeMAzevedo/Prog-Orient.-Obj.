import java.util.Scanner;

public class AlgFund7 {
    public void inversao() {
        Scanner prompt = new Scanner(System.in);
        System.out.println("Digite o numero que deseja inverter");
        byte n = prompt.nextByte();
        int inv = 0;
        byte d;
        while (n > 0){
            d = (byte)(n % 10);
            inv = (int)(inv * 10) + d;
            n = (byte)(n / 10);
        }
        System.out.println("Numero invertido: " + inv);

    }
}
