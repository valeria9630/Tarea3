/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcu.frutadora;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ValeriaLeivaQuirós
 */
public class Frutas {

    private ArrayList listasFilas;
    private ArrayList fila1;
    private ArrayList fila2;
    private ArrayList fila3;
    private ArrayList fila4;
    private ArrayList fila5;

    public Frutas() {
        this.listasFilas = new ArrayList();
        this.fila1 = new ArrayList();
        this.fila2 = new ArrayList();
        this.fila3 = new ArrayList();
        this.fila4 = new ArrayList();
        this.fila5 = new ArrayList();
    }

    public void llenarLista() {

        fila1.add(1, "Pera");
        fila1.add(2, "Melón");
        fila1.add(3, "Naranja");
        fila1.add(4, "Limón");
        fila1.add(5, "Manzana");

        fila2.add(1, "Melón");
        fila2.add(2, "Manzana");
        fila2.add(3, "Naranja");
        fila2.add(4, "Limón");
        fila2.add(5, "Pera");

        fila3.add(1, "Naranja");
        fila3.add(2, "Pera");
        fila3.add(3, "Limón");
        fila3.add(4, "Manzana");
        fila3.add(5, "Melón");

        fila4.add(1, "Manzana");
        fila4.add(2, "Pera");
        fila4.add(3, "Naranja");
        fila4.add(4, "Melón");
        fila4.add(5, "Limón");

        fila5.add(1, "Limón");
        fila5.add(2, "Melón");
        fila5.add(3, "Pera");
        fila5.add(4, "Manzana");
        fila5.add(5, "Naranja");

        listasFilas.add(fila1);
        listasFilas.add(fila2);
        listasFilas.add(fila3);
        listasFilas.add(fila4);
        listasFilas.add(fila5);
    }

    private String suma(int fila, int columna) {
        String resultado;

        List temp = new ArrayList();
        temp = (List) listasFilas.get(fila);
        resultado = (String) temp.get(columna);
        return resultado;
    }
}
