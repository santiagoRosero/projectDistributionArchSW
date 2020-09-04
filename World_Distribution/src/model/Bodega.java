package model;

import java.util.ArrayList;
import java.util.List;

public class Bodega {

    public static final double CAPASITY=200.0;

    private double capacity;
    private List<Paquete> listPackage;

    public Bodega(){
        this.listPackage = new ArrayList<>();
        this.capacity = CAPASITY;
    }
    
    public List<Paquete> getlistPackage(){
        return listPackage;
    }

    public double getCapacity(){
        return capacity;
    }

}
