import java.util.Scanner;
public class vetorNosDoisSentidos {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        int[] vetor = new int[10];

        // lê 10 números inteiros do teclado e armazena no vetor
        for(int i = 0; i < 10; i++){
            System.out.print("Digite o " + (i+1) + " número: ");
            vetor[i] = sc.nextInt();
        }

        System.out.println("vetor na ordem direta: ");
        //imprime o vetor na ordem direta 
        for (int i = 0; i < 10; i++){
            System.out.println(vetor[i] + " ");
        }

        System.out.println("vetor na ordem inversa: ");
        // imprime o vetor na ordem inversa
        for(int i = 9; i >= 0; i--){
            System.out.println(vetor[i] + " ");
            sc.close();
        }
    }
}
    
