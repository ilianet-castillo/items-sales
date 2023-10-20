package org.learn.polimorfismo.ciclista;

public abstract class Ciclista {
    protected double cantidadKm;
    protected TipoBicicleta tipoBicicleta;
    protected Ciclista(TipoBicicleta tipoBicicleta, double cantidadKm){
        this.tipoBicicleta=tipoBicicleta;
        this.cantidadKm=cantidadKm;
    }
    public abstract double puntuacion();


}
