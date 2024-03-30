package huffmanCodigo;

public class NoInterno extends NoHuffman {
    NoHuffman esquerdo, direito;

    public NoInterno(NoHuffman esquerdo, NoHuffman direito) {
        super(esquerdo.getFrequencia() + direito.getFrequencia());
        this.esquerdo = esquerdo;
        this.direito = direito;
    }
}