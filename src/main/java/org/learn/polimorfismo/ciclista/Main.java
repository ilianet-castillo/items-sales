package org.learn.polimorfismo.ciclista;

public class Main {
    public static void main(String[] args) {
        Ciclista pepe = new CiclistaCasual(TipoBicicleta.urbanbike,12 ,true);
        Ciclista juan = new CiclistaCarretera(TipoBicicleta.carbonfibre, 20, false);
        CiclistaRuta juanRuta = new CiclistaCarretera(TipoBicicleta.urbanbike,12 ,true);
        CiclistaCasual pepeCasual = (CiclistaCasual) pepe;
        pepeCasual.cantidadNinos();
        juanRuta.calidad();

    }
}
