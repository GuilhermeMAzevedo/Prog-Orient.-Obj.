import java.util.Scanner;

public class AlgFund6 {
    public void fibonacci() {
        Scanner prompt = new Scanner(System.in);
        System.out.println("Digite quantos elementos da sequencia de fibonacci sejam mostrados:");
        byte n = prompt.nextByte();
        byte i = 0;
        byte fia2 = 0;
        byte fia1 = 1;
        byte fi;
        while (i < n){
            System.out.print(fia2);
            fi = (byte) (fia2 + fia1);
            fia2 = fia1;
            fia1 = fi;
            if (i != (n - 1)){
                System.out.print(", ");
            }


            i++;
        }
        System.out.println();
    }
}
