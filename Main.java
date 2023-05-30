import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
        int[] casoA = gerarArrayOrdenado(5000);
        int[] casoB = gerarArrayOrdenado(15000);

        int elementoPresente = casoA[2500];
        int elementoNaoPresente = -1;

        System.out.println("Busca Sequencial Iterativa: ");
        medirTempoMemoria(() -> Busca.buscaSequencialIterativa(casoA, elementoPresente), "Caso A: Elemento Presente");
        medirTempoMemoria(() -> Busca.buscaSequencialIterativa(casoA, elementoNaoPresente), "Caso A: Elemento Não Presente");
        medirTempoMemoria(() -> Busca.buscaSequencialIterativa(casoB, elementoPresente), "Caso B: Elemento Presente");
        medirTempoMemoria(() -> Busca.buscaSequencialIterativa(casoB, elementoNaoPresente), "Caso B: Elemento Não Presente");

        System.out.println("\n Busca Binária Iterativa: ");
        medirTempoMemoria(() -> Busca.buscaBinariaIterativa(casoA, elementoPresente), "Caso A: Presente");
        medirTempoMemoria(() -> Busca.buscaBinariaIterativa(casoA, elementoNaoPresente), "Caso A: Elemento Não Presente");
        medirTempoMemoria(() -> Busca.buscaBinariaIterativa(casoB, elementoPresente), "Caso B:  Presente");
        medirTempoMemoria(() -> Busca.buscaBinariaIterativa(casoB, elementoNaoPresente), "Caso B: Elemento Não Presente");

        System.out.println("\n Busca Sequencial Recursiva: ");
        medirTempoMemoria(() -> Busca.buscaSequencialRecursiva(casoA, elementoPresente), "Caso A: Presente");
        medirTempoMemoria(() -> Busca.buscaSequencialRecursiva(casoA, elementoNaoPresente), "Caso A: Elemento Não Presente");
        medirTempoMemoria(() -> Busca.buscaSequencialRecursiva(casoB, elementoPresente), "Caso B: Presente");
        medirTempoMemoria(() -> Busca.buscaSequencialRecursiva(casoB, elementoNaoPresente), "Caso B: Elemento não presente");

        System.out.println("\n Busca Binária Recursiva: ");
        medirTempoMemoria(() -> Busca.buscaBinariaRecursiva(casoA, elementoPresente), "Caso A: Presente");
        medirTempoMemoria(() -> Busca.buscaBinariaRecursiva(casoA, elementoNaoPresente), "Caso A: Elemento Não Presente");
        medirTempoMemoria(() -> Busca.buscaBinariaRecursiva(casoB, elementoPresente), "Caso B: Presente");
        medirTempoMemoria(() -> Busca.buscaBinariaRecursiva(casoB, elementoNaoPresente), "Caso B: Elemento Não Presente");
    }

    public static int[] gerarArrayOrdenado(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = i;
        }
        return array;
    }

    public static void medirTempoMemoria(Runnable runnable, String descricao) {
        Runtime run = Runtime.getRuntime();
        double memoryBefore = run.totalMemory() - run.freeMemory();

        double startTime = System.nanoTime();
        runnable.run();
        double endTime = System.nanoTime();

        double memoryAfter = run.totalMemory() - run.freeMemory();
        double elapsedTime = endTime - startTime;

        System.out.println(descricao);
        System.out.println("Tempo: " + elapsedTime + " nanossegundos");
        System.out.println("Memória: " + (memoryAfter - memoryBefore) + " bytes");
    }
}

