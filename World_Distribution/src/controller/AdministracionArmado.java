package controller;

import Exception.PaqueteException;
import model.Articulo;
import model.Paquete;

public class AdministracionArmado {

    private Paquete pqt;

    public AdministracionArmado (Paquete pqt){
        this.pqt = pqt;
    }

    public Paquete getPackage(){
        return pqt;
    }

    public void armarPaquete(Articulo<String> pdt){
        try{
            pqt.addProduct(pdt);
        }
        catch(PaqueteException e){
            System.out.println(e.getMessage());
        }
    }
}
