import java.util.Scanner;

public class AlgFund3 {
    public void somador(){
        Scanner prompt = new Scanner(System.in);
        System.out.println("Quantos numeros vc quer somar?");
        byte n = prompt.nextByte();
        int soma = 0;
        byte i = 0;
        while (i < n){
            System.out.println("Digite o numero");
            byte numero = prompt.nextByte();
            soma = soma + numero;
            i++;
        }
        System.out.println("Soma dos numeros: " + soma);
    }
}
