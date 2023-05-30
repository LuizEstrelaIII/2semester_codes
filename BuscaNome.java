import java.util.Scanner;
public class BuscaNome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Lê o vetor com 10 nomes de pessoas
        String[] nomes = new String[10];
        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Digite o " + (i+1) + "º nome: ");
            nomes[i] = sc.nextLine();
        }

        // Pede para o usuário digitar um nome e verifica se está presente no vetor
        System.out.print("Digite um nome: ");
        String nomeBuscado = sc.nextLine();

        boolean encontrado = false;
        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i].equalsIgnoreCase(nomeBuscado)) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("ACHEI");
        } else {
            System.out.println("NÃO ACHEI");
        }
        sc.close();
    }
}

