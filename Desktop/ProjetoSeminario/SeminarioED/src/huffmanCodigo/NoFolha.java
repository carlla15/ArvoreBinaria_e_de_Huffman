package huffmanCodigo;

public class NoFolha extends NoHuffman {
    char caractere;

    public NoFolha(char caractere, int frequencia) {
        super(frequencia);
        this.caractere = caractere;
    }

    public char getCaractere() {
        return caractere;
    }
}


