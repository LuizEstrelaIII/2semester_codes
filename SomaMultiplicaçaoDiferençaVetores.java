import java.util.Scanner;
public class SomaMultiplicaçaoDiferençaVetores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Lê e monta o primeiro vetor
        int[] vetor1 = new int[20];
        for (int i = 0; i < vetor1.length; i++) {
            System.out.print("Digite o " + (i+1) + "º número do primeiro vetor: ");
            vetor1[i] = sc.nextInt();
        }

        // Lê e monta o segundo vetor
        int[] vetor2 = new int[20];
        for (int i = 0; i < vetor2.length; i++) {
            System.out.print("Digite o " + (i+1) + "º número do segundo vetor: ");
            vetor2[i] = sc.nextInt();
        }

        // Gera o terceiro vetor com a diferença dos dois vetores lidos
        int[] vetor3 = new int[20];
        for (int i = 0; i < vetor3.length; i++) {
            vetor3[i] = vetor1[i] - vetor2[i];
        }

        // Gera o quarto vetor com a soma dos dois vetores lidos
        int[] vetor4 = new int[20];
        for (int i = 0; i < vetor4.length; i++) {
            vetor4[i] = vetor1[i] + vetor2[i];
        }

        // Gera o quinto vetor com a multiplicação dos dois vetores lidos
        int[] vetor5 = new int[20];
        for (int i = 0; i < vetor5.length; i++) {
            vetor5[i] = vetor1[i] * vetor2[i];
        }

        // Imprime os cinco vetores gerados
        System.out.println("Primeiro vetor:");
        for (int i = 0; i < vetor1.length; i++) {
            System.out.print(vetor1[i] + " ");
        }
        System.out.println();

        System.out.println("Segundo vetor:");
        for (int i = 0; i < vetor2.length; i++) {
            System.out.print(vetor2[i] + " ");
        }
        System.out.println();

        System.out.println("Terceiro vetor (diferença dos dois vetores lidos):");
        for (int i = 0; i < vetor3.length; i++) {
            System.out.print(vetor3[i] + " ");
        }
        System.out.println();

        System.out.println("Quarto vetor (soma dos dois vetores lidos):");
        for (int i = 0; i < vetor4.length; i++) {
            System.out.print(vetor4[i] + " ");
        }
        System.out.println();

        System.out.println("Quinto vetor (multiplicação dos dois vetores lidos):");
        for (int i = 0; i < vetor5.length; i++) {
            System.out.print(vetor5[i] + " ");
        }
        System.out.println();
        sc.close();
    }
}

