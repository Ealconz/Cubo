/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

/**
 *
 * @author elias
 */
public class cubos {
    public int alto;
    public int ancho;
    public int profundo;

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getProfundo() {
        return profundo;
    }

    public void setProfundo(int profundo) {
        this.profundo = profundo;
    }

    public cubos(int alto, int ancho, int profundo) {
        this.alto = alto;
        this.ancho = ancho;
        this.profundo = profundo;
    }

    @Override
    public String toString() {
        return "cubos: " + "alto=" + alto + " ancho=" + ancho + " profundo=" + profundo ;
    }
    
    public void Vol(){
        int vol = alto*ancho*profundo;
        System.out.println("El volumen del cubo es: " + vol);
    }
}
