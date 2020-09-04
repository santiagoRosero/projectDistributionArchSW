package model;

public class Articulo<E> implements IArticulo<E> {

    private E element;
    private double volume;

    public Articulo (E element, double volume){
        this.element = element;
        this.volume = volume;
    }

    @Override
    public E getProduct() {
        return element;
    }

    @Override
    public double getVolume() {
        return volume;
    }

}
