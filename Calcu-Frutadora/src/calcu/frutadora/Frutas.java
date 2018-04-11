/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcu.frutadora;

import static calcu.frutadora.Fruta.LIMON;
import static calcu.frutadora.Fruta.MANZANA;
import static calcu.frutadora.Fruta.MELON;
import static calcu.frutadora.Fruta.NARANJA;
import static calcu.frutadora.Fruta.PERA;
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
    private ArrayList columna;

    public Frutas() {
        this.listasFilas = new ArrayList();
        this.fila1 = new ArrayList();
        this.fila2 = new ArrayList();
        this.fila3 = new ArrayList();
        this.fila4 = new ArrayList();
        this.fila5 = new ArrayList();
        this.columna = new ArrayList();

        llenarLista();
    }

    public void llenarLista() {

        fila1.add(0, PERA);
        fila1.add(1, MELON);
        fila1.add(2, NARANJA);
        fila1.add(3, LIMON);
        fila1.add(4, MANZANA);

        fila2.add(0, MELON);
        fila2.add(1, MANZANA);
        fila2.add(2, NARANJA);
        fila2.add(3, LIMON);
        fila2.add(4, PERA);

        fila3.add(0, NARANJA);
        fila3.add(1, PERA);
        fila3.add(2, LIMON);
        fila3.add(3, MANZANA);
        fila3.add(4, MELON);

        fila4.add(0, MANZANA);
        fila4.add(1, PERA);
        fila4.add(2, NARANJA);
        fila4.add(3, MELON);
        fila4.add(4, LIMON);

        fila5.add(0, LIMON);
        fila5.add(1, MELON);
        fila5.add(2, PERA);
        fila5.add(3, MANZANA);
        fila5.add(4, NARANJA);

        listasFilas.add(fila1);
        listasFilas.add(fila2);
        listasFilas.add(fila3);
        listasFilas.add(fila4);
        listasFilas.add(fila5);

        columna.add(PERA);
        columna.add(MANZANA);
        columna.add(LIMON);
        columna.add(MELON);
        columna.add(NARANJA);

    }

    public ArrayList getListasFilas() {
        return listasFilas;
    }

    public ArrayList getColumna() {
        return columna;
    }

    public String suma(int fila, int columna) {
        String resultado = null;

        List tempFila = new ArrayList();
        tempFila = (List) listasFilas.get(fila);

        resultado = (String) tempFila.get(columna).toString();

        return resultado;
    }

    public int posicionAlimento(String alimento) {
        int posicion = -1;
        for (int i = 0; i < columna.size(); i++) {
            String temp = columna.get(i).toString();

            if (temp.toUpperCase().equals(alimento.toUpperCase())) {
                posicion = i;
            }
        }

        return posicion;
    }

    public void agregarAlimento(String alimento) {

        List temp = new ArrayList();
        for (int i = 0; i < listasFilas.size(); i++) {
            temp = (List) listasFilas.get(i);
            temp.add(alimento);

        }
        columna.add(alimento);
        listasFilas.add(crearListaNueva(alimento));

    }

    public List crearListaNueva(String alimento) {
        ArrayList listaTemp = new ArrayList();
        String temporal = "";

        for (int i = 0; i < columna.size(); i++) {
            temporal = (String) columna.get(i).toString().toUpperCase();
            if (temporal.equalsIgnoreCase(alimento.toUpperCase())) {
                listaTemp.add(alimento.toUpperCase());

            } else {
                listaTemp.add((String) randomFruta());
            }
        }

        return listaTemp;
    }

    public String randomFruta() {
        String temporal = "";

        temporal = (String) columna.get((int) (Math.random() * columna.size())).toString().toLowerCase();

        return temporal;

    }

}
