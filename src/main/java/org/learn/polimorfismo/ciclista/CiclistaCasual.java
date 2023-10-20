package org.learn.polimorfismo.ciclista;

public class CiclistaCasual extends Ciclista{
   private boolean conNino;
    protected CiclistaCasual(TipoBicicleta tipoBicicleta,double cantidadKm, boolean conNino) {
        super(tipoBicicleta,cantidadKm);
        this.conNino=conNino;

    }

    @Override
    public double puntuacion() {
        return 6.5;
    }

    public int cantidadNinos(){
        return 2;
    }
}
