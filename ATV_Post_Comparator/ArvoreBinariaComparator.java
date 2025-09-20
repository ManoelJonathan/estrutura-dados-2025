import java.util.Comparator; // ← ADICIONE ESTE IMPORT

public class ArvoreBinariaComparator<T> {
    private NodoArvore<T> raiz;
    private Comparator<T> comparator;

    public ArvoreBinariaComparator(Comparator<T> comparator){
        this.raiz = null;
        this.comparator = comparator;
    }

    public void inserir(T objeto){
        this.raiz = inserirRecursivo(this.raiz, objeto);
    }

    public NodoArvore<T> inserirRecursivo(NodoArvore<T> noAtual, T objeto){
        if( noAtual == null){
            return new NodoArvore(objeto);
        }

        if(comparator.compare(objeto, noAtual.objeto) < 0){
            noAtual.filhoEsquerda = inserirRecursivo(noAtual.filhoEsquerda, objeto);
        } else if (comparator.compare(objeto, noAtual.objeto) > 0){
            noAtual.filhoDireita = inserirRecursivo(noAtual.filhoDireita, objeto);
        }

        return noAtual;
    }

    public void imprimeEmOrdem(){
        imprimirEmOrdemRecursivo(this.raiz);
    }

    private void imprimirEmOrdemRecursivo(NodoArvore<T> no){
        if(no != null){
            imprimirEmOrdemRecursivo(no.filhoEsquerda);
            System.out.print(no.objeto + " ");
            imprimirEmOrdemRecursivo(no.filhoDireita);
        }
    }


    public void imprimePreFixado(){
        imprimirPreFixadoRecursivo(this.raiz);
    }

    private void imprimirPreFixadoRecursivo(NodoArvore<T> no){
        if(no != null){
            System.out.print(no.objeto + " ");
            imprimirPreFixadoRecursivo(no.filhoEsquerda);
            imprimirPreFixadoRecursivo(no.filhoDireita);
        }
    }
}

