package examenuni4;
public class ArbolBinario {
    
    private nodo raiz;
    int cant;
    int altura;

    public ArbolBinario() {
        this.raiz = null;
    }

    public void agregar(int dato) {
        nodo nuevo = new nodo(dato, null, null);
        insertar(nuevo, raiz);
    }

    public void insertar(nodo nuevo, nodo pivote) {
        if (this.raiz == null) {
            raiz = nuevo;
        } else {
            if (nuevo.getDato() <= pivote.getDato()) {
                if (pivote.getIzq() == null) {
                    pivote.setIzq(nuevo);
                } else {
                    insertar(nuevo, pivote.getIzq());
                }
            } else {
                if (pivote.getDer() == null) {
                    pivote.setDer(nuevo);
                } else {
                    insertar(nuevo, pivote.getDer());
                }
            }
        }

    }

    String retornarAltura() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String cantidad() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
