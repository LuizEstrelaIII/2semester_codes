import java.util.Scanner;

public class MatrizIdentidade {
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
        
        boolean ehIdentidade = true;
        for(int i = 0; i < tamanho; i++) {
            for(int j = 0; j < tamanho; j++) {
                if(i == j && matriz[i][j] != 1) {
                    ehIdentidade = false;
                    break;
                }
                if(i != j && matriz[i][j] != 0) {
                    ehIdentidade = false;
                    break;
                }
            }
        }
        
        if(ehIdentidade) {
            System.out.println("A matriz é uma matriz identidade.");
        } else {
            System.out.println("A matriz não é uma matriz identidade.");
        }
    }
}
