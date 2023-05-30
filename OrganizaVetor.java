import java.util.Arrays;
import java.util.Scanner;
public class OrganizaVetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe a quantidade de números a serem lidos: ");  
        int tamanho = sc.nextInt();
        
        int[] vetor = new int[tamanho];
        System.out.println("Digite os números a serem organizados: ");
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = sc.nextInt();
        }

        //ordem dos vetores!
        int[] vetorPares = Arrays.stream(vetor).filter(n -> n % 2 == 0).toArray();
        int[] vetorImpares = Arrays.stream(vetor).filter(n -> n % 2 != 0).toArray();
        
        System.out.print("Vetor organizado:");
        for (int i = 0; i < vetorPares.length; i++) {
            System.out.print(vetorPares[i] + " ");
        }
        for (int i = vetorImpares.length - 1; i >= 0; i--) {
            System.out.print(vetorImpares[i] + " ");
        }
        System.out.println();
        sc.close();
    }
}

