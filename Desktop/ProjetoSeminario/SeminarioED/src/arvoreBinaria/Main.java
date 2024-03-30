package arvoreBinaria;


public class Main {
    public static void main(String[] args) {
        ArvoreBinaria arvore = new ArvoreBinaria();

        arvore.inserir(5);
        arvore.inserir(2);
        arvore.inserir(8);
        arvore.inserir(1);
        arvore.inserir(3);

        if (arvore.buscar(3)) {
            System.out.println("Elemento encontrado.");
        } else {
            System.out.println("Elemento não encontrado.");
        }
    }
}
