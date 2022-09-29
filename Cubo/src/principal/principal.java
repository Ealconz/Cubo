/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import dominio.cubos;

/**
 *
 * @author elias
 */
public class principal {
    public static void main(String[] args) {
        cubos cubo1 = new cubos(7,4,10);
        System.out.println(cubo1);

        cubo1.Vol();
    }
    
    
}
