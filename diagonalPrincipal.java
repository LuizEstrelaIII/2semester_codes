import java.util.Scanner;
public class diagonalPrincipal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Informe o tamanho da matriz quadrada: ");
        int tamanho = sc.nextInt();
        
        int[][] matriz = new int[tamanho][tamanho];
        System.out.println("Digite os elementos da matriz:");
        for(int i = 0; i < tamanho; i++) {
            for(int j = 0; j < tamanho; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("Elementos da diagonal principal:");
        for(int i = 0; i < tamanho; i++) {
            System.out.print(matriz[i][i] + " ");
        }
    }
}


