package examenuni4;
import java.util.Scanner;
public class ExamenUni4 {

public static void main(String[] args) {
        
    }
    ArbolBinario abo = new ArbolBinario();
        int var;
        int valor;
        Scanner texto = new Scanner(System.in);

        System.out.println(" ingresa los vaores  : ");
        for (int i = 1; i <= 7; i++) {
            
            valor = (int) (Math.random() * 100);
            System.out.print(valor + " ");
            abo.agregar(valor);
        }

        do {
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("seleccione una opcion deceada ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("1.-  cuales son las Cantidad de nodos del arbol que estamos realizando atra vez de los arboles binario");
            System.out.println("2.-La  Altura del  arbol es ");
            var = texto.nextInt();
            switch (var) {
                case 1:
                    System.out.println("Cantidad de nodos del árbol que estamos realizando :" + abo.cantidad());
                    break;

                case 2:
                    System.out.println(" su altura del arbol es:" + abo.retornarAltura());
                    break;

                    
                    
                    
            }
        }// while (var != 0);

    }

    

