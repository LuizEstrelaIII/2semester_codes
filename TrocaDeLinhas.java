import java.util.Scanner;

public class TrocaDeLinhas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Informe o número de linhas da matriz: ");
        int numLinhas = sc.nextInt();
        
        System.out.print("Informe o número de colunas da matriz: ");
        int numColunas = sc.nextInt();
        
        int[][] matriz = new int[numLinhas][numColunas];
        System.out.println("Digite os elementos da matriz:");
        for(int i = 0; i < numLinhas; i++) {
            for(int j = 0; j < numColunas; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }
        
        System.out.print("Informe a primeira linha a ser trocada: ");
        int linha1 = sc.nextInt();
        
        System.out.print("Informe a segunda linha a ser trocada: ");
        int linha2 = sc.nextInt();
        
        int[] linhaTemp = matriz[linha1];
        matriz[linha1] = matriz[linha2];
        matriz[linha2] = linhaTemp;
        
        System.out.println("Matriz com as linhas trocadas:");
        for(int i = 0; i < numLinhas; i++) {
            for(int j = 0; j < numColunas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
