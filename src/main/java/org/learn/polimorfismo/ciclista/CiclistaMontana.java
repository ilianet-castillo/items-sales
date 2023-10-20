package org.learn.polimorfismo.ciclista;

public class CiclistaMontana extends CiclistaRuta{

    protected CiclistaMontana(TipoBicicleta tipoBicicleta,double cantidadKm, boolean multiplesTramos) {
        super(tipoBicicleta, cantidadKm,multiplesTramos);
    }

    @Override
    public double puntuacion() {
        return super.puntuacion()+6;
    }
}
