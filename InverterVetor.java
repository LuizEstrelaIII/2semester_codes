import java.util.Scanner;

public class InverterVetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Lê o vetor de 10 elementos
        int[] vetor1 = new int[10];
        for (int i = 0; i < vetor1.length; i++) {
            System.out.print("Digite o " + (i+1) + "º elemento do vetor: ");
            vetor1[i] = sc.nextInt();
        }

        // Cria o segundo vetor com os elementos na ordem inversa
        int[] vetor2 = new int[10];
        for (int i = 0; i < vetor1.length; i++) {
            vetor2[i] = vetor1[vetor1.length - 1 - i];
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
