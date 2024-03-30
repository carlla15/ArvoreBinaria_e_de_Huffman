package arvoreBinaria;


public class ArvoreBinaria {
    private No raiz;

    public ArvoreBinaria() {
        raiz = null;
    }

    public void inserir(int valor) {
        No novoNo = new No(valor);

        if (raiz == null) {
            raiz = novoNo;
        } else {
            No atual = raiz;
            No pai;
            while (true) {
                pai = atual;
                if (valor < atual.valor) {
                    atual = atual.esquerda;
                    if (atual == null) {
                        pai.esquerda = novoNo;
                        return;
                    }
                } else if (valor > atual.valor) {
                    atual = atual.direita;
                    if (atual == null) {
                        pai.direita = novoNo;
                        return;
                    }
                } else {
                    
                    return;
                }
            }
        }
    }

    public boolean buscar(int valor) {
        No atual = raiz;

        while (atual != null) {
            if (valor < atual.valor) {
                atual = atual.esquerda;
            } else if (valor > atual.valor) {
                atual = atual.direita;
            } else {
                return true;
            }
        }

        return false; 
    }
}

