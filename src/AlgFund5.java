import java.util.Scanner;

public class AlgFund5 {
    public long fatorial(byte n){
        byte fator = 1;
        byte i = 1;
        while (i <= n) {
            fator = (byte)(i * fator);
            i++;

        }
        return fator;
    }

    public void somaInfinita(){
        Scanner prompt = new Scanner(System.in);
        System.out.println("Digite o numero de termos");
        byte n = prompt.nextByte();
        System.out.println("Digite o valor de X");
        byte x = prompt.nextByte();
        float termo;
        float s = 0;
        byte i = -1;
        byte sinal = -1;
        byte j = 0;
        while (j < n){
            i+=2;
            sinal =(byte)-sinal;
            termo =  (float) (sinal * Math.pow(x, i) / fatorial(i));
            s = s + termo;
            j++;
        }
        System.out.println("S = " + s);
    }
}
