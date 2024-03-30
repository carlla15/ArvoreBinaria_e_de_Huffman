package huffmanCodigo;

import java.util.Comparator;

public class CompararNo implements Comparator<NoHuffman> {
    @Override
    public int compare(NoHuffman no1, NoHuffman no2) {
        return no1.getFrequencia() - no2.getFrequencia();
    }
}
