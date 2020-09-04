package model;

import java.util.ArrayList;
import java.util.List;

import Exception.PaqueteException;

public class Bodega {

    public final double CAPASITY=200.0;

    private double capacity;
    private List<Paquete> listPackage;

    public Bodega(){
        this.listPackage = new ArrayList<>();
        this.capacity = 0;
    }
    
    public List<Paquete> getlistPackage(){
        return listPackage;
    }

    public double getCapacity(){
        return capacity;
    }

    public boolean añadirPaquete(Paquete qdt) throws PaqueteException{
        if(capacity>CAPASITY){
            listPackage.add(qdt);
            return true;
        }
        else{
            new PaqueteException("La bodega esta llena");
            return false;
        }
    }

}
