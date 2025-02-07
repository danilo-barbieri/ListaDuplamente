public class No {
    private No proximo;
    private No anterior;
    private Integer elemento;

    public No(Integer elemento) {
        this.proximo = null;
        this.anterior = null;
        this.elemento = elemento;
        // cada nó tem 3 atributos: referência ao próximo, ao anterior e um valor (elemento)
    }

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }

    public No getAnterior() {
        return anterior;
    }

    public void setAnterior(No anterior) {
        this.anterior = anterior;
    }

    public Integer getElemento() {
        return elemento;
    }

    public void setElemento(Integer elemento) {
        this.elemento = elemento;
    }
}
