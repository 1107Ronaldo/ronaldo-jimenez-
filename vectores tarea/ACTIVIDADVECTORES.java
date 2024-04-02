/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.actividadvectores;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author USUARIO
 */
public class ACTIVIDADVECTORES {

    public static void main(String[] args) {
        ArrayList<Integer> lista_vacia = new ArrayList();

        ArrayList<Integer> lista_numeros = new ArrayList();
        lista_numeros.add(1);
        lista_numeros.add(2);
        lista_numeros.add(3);
        lista_numeros.add(4);
        lista_numeros.add(5);

        System.out.println("longitud lista vacia : " + lista_vacia.size());
        System.out.println("Longitud lista numeros : " + lista_numeros.size());

        // paso 4

        System.out.println(" Primer numero: " + lista_numeros.get(0));
        System.out.println(" numero central: " + lista_numeros.get(lista_numeros.size() / 2));
        System.out.println(" Ultimo numero: " + lista_numeros.get(lista_numeros.size() - 1));

        // paso 5

        ArrayList<String> datos_personales = new ArrayList();
        datos_personales.add("Ronaldo");
        datos_personales.add("18");
        datos_personales.add("1.80");
        datos_personales.add("soltero");
        datos_personales.add("PLAYAS BLANCAS, CALLE LAS DELICIAS");

        // paso 6

        ArrayList<String> it_companies = new ArrayList();
        it_companies.add("Facebook");
        it_companies.add("Google");
        it_companies.add("Microsoft");
        it_companies.add("Apple");
        it_companies.add("IBM");
        it_companies.add("Oracle");
        it_companies.add("Amazon");

        it_companies.add(3, "movistar");
        System.out.println("Lista con elemento agregado: " + it_companies);

        System.out.println(it_companies.contains("movistar"));

        Collections.sort(it_companies);
        System.out.println("lista organizada: " + it_companies);

        Collections.reverse(it_companies);
        System.out.println("invertir lista : " + it_companies);

        it_companies.remove(1);
        System.out.println("lista con elemento eliminado " + it_companies);

        it_companies.clear();
        System.out.println("Lista  vaciada: " + it_companies);
    }
}
