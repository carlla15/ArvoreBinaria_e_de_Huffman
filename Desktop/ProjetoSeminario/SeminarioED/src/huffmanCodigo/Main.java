package huffmanCodigo;

public class Main {
    public static void main(String[] args) {
        char[] caracteres = {'a', 'b', 'c', 'd', 'e', 'f'};
        int[] frequencias = {5, 9, 12, 13, 16, 45};

        NoHuffman raiz = ArvoreHuffman.construirArvore(frequencias, caracteres);
        System.out.println("Códigos Huffman:");
        ArvoreHuffman.imprimirCodigos(raiz, "");
    }
}

