import java.lang.reflect.Array;
import java.util.Scanner;

public class AlgFund8 {
    public void binario(){
        Scanner prompt = new Scanner(System.in);
        System.out.println("Digite o numero em decimal:");
        byte n = prompt.nextByte();
        byte q = n;
        byte ndig = 0;
        int[]binarios = new int[64];
        byte r;
        while (q > 0){
            r = (byte)(q % 2);
            binarios[ndig] = r;
            q = (byte) (q / 2);
            ndig++;
        }
        ndig--;
        System.out.print("Numero binario: ");
        if (n == 0){
            System.out.print(0);
        } else {
            while (ndig >= 0){
                System.out.print(binarios[ndig]);
                ndig--;
            }
        }
        System.out.println();

    }
}
