package org.learn.polimorfismo.ciclista;

public class CiclistaCarretera extends CiclistaRuta{

    protected CiclistaCarretera(TipoBicicleta tipoBicicleta, double cantidadKm,boolean multiplesTramos) {

        super(tipoBicicleta,cantidadKm, multiplesTramos);
    }

    public double puntuacion(){
        return super.puntuacion()+7;
    }
}
