
public class Elemento<T> {
    private Integer valor;

    private Elemento<T> esquerda;
    private Elemento<T> direita;

    private Integer profundidade = 0;

    private Integer altura = 0;


    public Integer getAltura() {
        return altura;
    }

    public void setAltura(Integer altura) {
        this.altura = altura;
    }

    public Integer getProfundidade() {
        return profundidade;
    }

    public void setProfundidade(Integer profundidade) {
        this.profundidade = profundidade;
    }

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
