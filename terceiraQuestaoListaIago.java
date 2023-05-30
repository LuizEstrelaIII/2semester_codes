import java.util.Scanner;
public class terceiraQuestaoListaIago {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Lê o vetor de 10 elementos inteiros e positivos
        int[] vetor1 = new int[10];
        for (int i = 0; i < vetor1.length; i++) {
            do {
                System.out.print("Digite o " + (i+1) + "º elemento do vetor: ");
                vetor1[i] = sc.nextInt();
            } while (vetor1[i] < 1);
        }

        // Cria o segundo vetor da forma especificada
        int[] vetor2 = new int[10];
        for (int i = 0; i < vetor1.length; i++) {
            if (i % 2 == 0) {
                vetor2[i] = vetor1[i] / 2;
            } else {
                vetor2[i] = vetor1[i] * 3;
            }
        }

        // Imprime os dois vetores
        System.out.println("Vetor 1:");
        for (int i = 0; i < vetor1.length; i++) {
            System.out.print(vetor1[i] + " ");
        }
        System.out.println();

        System.out.println("Vetor 2:");
        for (int i = 0; i < vetor2.length; i++) {
            System.out.print(vetor2[i] + " ");
        }
        System.out.println();
        sc.close();
    }
}
