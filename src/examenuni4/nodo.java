
package examenuni4;


public class nodo {
    private int Resultado;
    private nodo izq, der;

    public nodo(int dato, nodo izq, nodo der) {
        this.Resultado =Resultado;
        this.izq = izq;
        this.der = der;
    }

    public int getDato() {
        return Resultado;
    }

    public void setDato(int Resultado) {
        this.Resultado = Resultado;
    }

    public nodo getIzq() {
        return izq;
    }

    public void setIzq(nodo izq) {
        this.izq = izq;
    }

    public nodo getDer() {
        return der;
    }

    public void setDer(nodo der) {
        this.der = der;
    }

}
    

