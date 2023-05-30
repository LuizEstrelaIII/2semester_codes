public class Busca {
    public static int buscaSequencialIterativa(int array[], int valor) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == valor) {
                return i;
            }
        }
        return -1;
    }

    public static int buscaBinariaIterativa(int array[], int valor) {
        int esquerda = 0;
        int direita = array.length - 1;

        while (esquerda <= direita) {
            int meio = esquerda + (direita - esquerda) / 2;

            if (array[meio] == valor) {
                return meio;
            }

            if (array[meio] < valor) {
                esquerda = meio + 1;
            } else {
                direita = meio - 1;
            }
        }
        return -1;
    }

    public static int buscaSequencialRecursiva(int array[], int valor) {
        return buscaSequencialRecursiva(array, valor, 0);
    }

    private static int buscaSequencialRecursiva(int array[], int valor, int index) {
        if (index >= array.length) {
            return -1;
        }

        if (array[index] == valor) {
            return index;
        }

        return buscaSequencialRecursiva(array, valor, index + 1);
    }

    public static int buscaBinariaRecursiva(int array[], int valor) {
        return buscaBinariaRecursivaAux(array, valor, 0, array.length - 1);
    }

    private static int buscaBinariaRecursivaAux(int array[], int valor, int esquerda, int direita) {
        if (esquerda <= direita) {
            int meio = esquerda + (direita - esquerda) / 2;

            if (array[meio] == valor) {
                return meio;
            }

            if (array[meio] < valor) {
                return buscaBinariaRecursivaAux(array, valor, meio + 1, direita);
            } else {
                return buscaBinariaRecursivaAux(array, valor, esquerda, meio - 1);
            }
        }
        return -1;
    }
}

