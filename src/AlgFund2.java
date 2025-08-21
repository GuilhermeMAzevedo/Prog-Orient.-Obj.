import java.util.Scanner;

public class AlgFund2 {
    public void contagem() {
        Scanner prompt = new Scanner(System.in);
        System.out.println("Numero de notas");
        byte n = prompt.nextByte();
        byte nota;
        byte c = 0;
        byte i = 0;
        while (i < n){
            System.out.println("Digite a nota do aluno");
            nota = prompt.nextByte();
            if (nota >= 50){
                c++;
            }

            i++;
        }

        System.out.println("Quantidade de alunos aprovados: " + c);

    }
}
