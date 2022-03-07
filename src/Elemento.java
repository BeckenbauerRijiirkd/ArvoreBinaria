
public class Elemento<T> {
    private Integer valor;

    private Elemento<T> esquerda;
    private Elemento<T> direita;


    public Elemento(Integer novoValor) {
        this.valor = novoValor;
        this.esquerda = null;
        this.direita = null;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    public Elemento<T> getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(Elemento<T> esquerda) {
        this.esquerda = esquerda;
    }

    public Elemento<T> getDireita() {
        return direita;
    }

    public void setDireita(Elemento<T> direita) {
        this.direita = direita;
    }

}
