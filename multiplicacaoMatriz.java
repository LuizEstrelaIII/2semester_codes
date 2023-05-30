import java.util.Scanner;
public class multiplicacaoMatriz{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Informe o número de linhas da primeira matriz: ");
        int linhas1 = sc.nextInt();
        
        System.out.print("Informe o número de colunas da primeira matriz: ");
        int colunas1 = sc.nextInt();
        
        int[][] matriz1 = new int[linhas1][colunas1];
        System.out.println("Digite os elementos da primeira matriz:");
        for(int i = 0; i < linhas1; i++) {
            for(int j = 0; j < colunas1; j++) {
                matriz1[i][j] = sc.nextInt();
            }
        }
        
        System.out.print("Informe o número de linhas da segunda matriz: ");
        int linhas2 = sc.nextInt();
        
        System.out.print("Informe o número de colunas da segunda matriz: ");
        int colunas2 = sc.nextInt();
        
        int[][] matriz2 = new int[linhas2][colunas2];
        System.out.print("Digite os elementos da segunda matriz:");
        for(int i = 0; i < linhas2; i++) {
            for(int j = 0; j < colunas2; j++) {
                matriz2[i][j] = sc.nextInt();
            }
        }
        
        if(colunas1 != linhas2) {
            System.out.print("As matrizes não são compatíveis para multiplicação.");
            return;
        }
        
        int[][] matrizResultado = new int[linhas1][colunas2];
        for(int i = 0; i < linhas1; i++) {
            for(int j = 0; j < colunas2; j++) {
                for(int k = 0; k < colunas1; k++) {
                    matrizResultado[i][j] += matriz1[i][k] * matriz2[k][j];
                }
            }
        }
        
        System.out.print("Matriz resultado:");
        for(int i = 0; i < linhas1; i++) {
            for(int j = 0; j < colunas2; j++) {
                System.out.print(matrizResultado[i][j] + " ");
            }
            System.out.println();
            
        }
    }
}





