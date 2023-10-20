package org.learn.polimorfismo.ciclista;

public class CiclistaRuta extends Ciclista{
    private boolean multipleTramos;
    protected CiclistaRuta(TipoBicicleta tipoBicicleta, double cantidadKm, Boolean multipleTramos) {
        super(tipoBicicleta,cantidadKm);
        this.multipleTramos= multipleTramos;
    }

    @Override
    public double puntuacion() {
        return 1.1;
    }

    public CalidadRuta calidad(){
        return CalidadRuta.regular;
    }
}
