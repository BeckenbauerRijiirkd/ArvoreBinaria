
public class Arvore<T> {

    private Elemento<T> raiz;

    public Arvore() {
        this.raiz = null;
    }

    public void adicionar(Integer valor) {
        Elemento<T> novoElemento = new Elemento<T>(valor);
        if (raiz == null) {
            this.raiz = novoElemento;
        } else {
            Elemento<T> atual = this.raiz;

            while (true) {

                if (novoElemento.getValor() < atual.getValor()) {
                    if (atual.getEsquerda() != null) {
                        atual.getEsquerda().setProfundidade(atual.getProfundidade() + 1);
                        atual = atual.getEsquerda();
                    } else {
                        atual.setEsquerda(novoElemento);
                        atual.getEsquerda().setProfundidade(atual.getProfundidade() + 1);
                        break;
                    }
                } else {
                    if (atual.getDireita() != null) {
                        atual.getDireita().setProfundidade(atual.getProfundidade() + 1);
                        atual = atual.getDireita();

                    } else {

                        atual.setDireita(novoElemento);
                        atual.getDireita().setProfundidade(atual.getProfundidade() + 1);
                        break;
                    }
                }

            }
        }
    }

    public void emOrdem(Elemento<T> atual) {
        if (atual != null) {
            emOrdem(atual.getEsquerda());
            System.out.println(atual.getValor());
            emOrdem(atual.getDireita());
        }
    }

    public void folhas(Elemento<T> atual) {

        if (atual != null) {

            folhas(atual.getEsquerda());
            if (atual.getEsquerda() == null && atual.getDireita() == null) {
                System.out.println(atual.getValor());
            }
            folhas(atual.getDireita());
        }
    }

    public void subArvores(Elemento<T> atual) {

        if (atual != null) {

            subArvores(atual.getEsquerda());

            if (atual.getEsquerda() != null || atual.getDireita() != null) {
                System.out.println(atual.getValor());
            }
            subArvores(atual.getDireita());
        }
    }

    public void profundidade(Elemento<T> atual) {

        if (atual != null) {
            profundidade(atual.getEsquerda());
            System.out.println(atual.getValor() + " - Profundidade: " + atual.getProfundidade());
            profundidade(atual.getDireita());
        }

    }

    public Elemento<T> getRaiz() {
        return raiz;
    }
}