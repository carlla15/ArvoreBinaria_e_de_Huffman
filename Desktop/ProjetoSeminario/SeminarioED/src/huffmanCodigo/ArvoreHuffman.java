package huffmanCodigo;

import java.util.PriorityQueue;

public class ArvoreHuffman {
    public static NoHuffman construirArvore(int[] frequencias, char[] caracteres) {
        PriorityQueue<NoHuffman> fila = new PriorityQueue<>(frequencias.length, new CompararNo());

        for (int i = 0; i < caracteres.length; i++) {
            fila.add(new NoFolha(caracteres[i], frequencias[i]));
        }

        while (fila.size() > 1) {
            NoHuffman esquerdo = fila.poll();
            NoHuffman direito = fila.poll();
            NoHuffman noInterno = new NoInterno(esquerdo, direito);
            fila.add(noInterno);
        }

        return fila.poll();
    }

    public static void imprimirCodigos(NoHuffman raiz, String prefixo) {
        if (raiz instanceof NoFolha) {
            NoFolha folha = (NoFolha) raiz;
            System.out.println(folha.getCaractere() + "\t" + prefixo);
        } else if (raiz instanceof NoInterno) {
            NoInterno noInterno = (NoInterno) raiz;
            imprimirCodigos(noInterno.esquerdo, prefixo + "0");
            imprimirCodigos(noInterno.direito, prefixo + "1");
        }
    }
}
