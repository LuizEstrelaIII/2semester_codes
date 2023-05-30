import java.util.Arrays;
import java.util.Scanner;
public class Vetores {
    public static int[] somaVetores(int[] vetorA, int[] vetorB) {
        int n = vetorA.length;
        int[] vetorSoma = new int[n];
        if (n != vetorB.length) {
            System.out.println("Os vetores devem ter o mesmo tamanho para realizar a soma");
        }
        for (int i = 0; i < n; i++) {
            vetorSoma[i] = vetorA[i] + vetorB[i];
        }
        return vetorSoma;
    }
    public static int produtoEscalar(int[] a, int[] b) {
        int n = a.length;
        if (n != b.length) {
            System.out.println("Os vetores devem ter o mesmo tamanho para calcular o produto escalar");
        }
        int produto = 0;
        for (int i = 0; i < n; i++) {
            produto = a[i] * b[i];
        }
        return produto;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("escolha os números dos vetores: ");
       
            int x = sc.nextInt();
            int y = sc.nextInt();

            int[] vetorA = {x};
            int[] vetorB = {y};
        
        int[] soma = somaVetores(vetorA, vetorB);
        System.out.println("Soma: " + Arrays.toString(soma));
        
        int produto = produtoEscalar(vetorA, vetorB);
        System.out.println("Produto escalar: " + produto);
        sc.close();
    }
}

