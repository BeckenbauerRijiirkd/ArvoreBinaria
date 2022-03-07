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
                if (atual.getEsquerda() != null && atual.getDireita() != null) {
                    System.out.println("Raiz: " + atual.getValor() + " Esquerda: " + atual.getEsquerda().getValor()
                            + " Direita: " + atual.getDireita().getValor());
                }
                if (atual.getEsquerda() != null && atual.getDireita() == null) {
                    System.out.println("Raiz: " + atual.getValor() + " Esquerda: " + atual.getEsquerda().getValor());
                }
                if (atual.getDireita() != null && atual.getEsquerda() == null) {
                    System.out.println("Raiz: " + atual.getValor() + " Direita: " + atual.getDireita().getValor());
                }
            }
            subArvores(atual.getDireita());
        }
    }

    public void profundidade(Elemento<T> atual) {

        if (atual != null) {
            profundidade(atual.getEsquerda());
            String result = ("▌"+atual.getValor() + " - Profundidade||Nivel: " + atual.getProfundidade()+ "  ") ;
            if(result.length() == 29){
                System.out.println(result.concat(" ▌")); 
            }else{
                System.out.println(result.concat("▌")); 
            }

            profundidade(atual.getDireita());
        }

    }

    public void altura(Elemento<T> atual) {

        if (atual != null) {

            altura(atual.getEsquerda());

            altura(atual.getDireita());

            if (atual.getProfundidade() > this.raiz.getAltura()) {
                this.raiz.setAltura(atual.getProfundidade());
            }
            atual.setAltura(this.raiz.getAltura() - atual.getProfundidade());
            if (atual.getEsquerda() == null && atual.getDireita() == null) {
                atual.setAltura(0);
            }

            System.out.println(atual.getValor() + " - altura: " + atual.getAltura());

        }

    }

    public void grau(Elemento<T> atual) {

        if (atual != null) {

            grau(atual.getEsquerda());
            if (atual.getEsquerda() == null && atual.getDireita() == null) {
                System.out.println(atual.getValor() + " - Grau: 0");
            }
            if (atual.getEsquerda() != null && atual.getDireita() != null) {
                System.out.println(atual.getValor() + " - Grau: 2");
            } else if (atual.getEsquerda() != null || atual.getDireita() != null) {
                System.out.println(atual.getValor() + " - Grau: 1");
            }

            grau(atual.getDireita());
        }
    }

    public Elemento<T> getRaiz() {
        return raiz;
    }
}