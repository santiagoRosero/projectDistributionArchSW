package model;

import java.util.ArrayList;
import java.util.List;

import Exception.PaqueteException;

public class Paquete {

    public static final int CANT_A = 3;
    public static final int CANT_B=4;
    private List<Articulo<String>> products;
    private String id;
    private double volTotal;

    public Paquete (String id){
        this.id = id;
        this.products = new ArrayList<>();
        volTotal = 0;
    }

    public String getId(){
        return id;
    }

    public List<Articulo<String>> getProducts(){
        return products;
    }

    public boolean addProduct(Articulo<String> pdt) throws PaqueteException{

        int pdtA = 0;
        int pdtB = 0;

        for(int i =0 ; i<products.size();i++){
            if(products.get(i).getProduct()=="A"){
                pdtA++;
            }
            else if(products.get(i).getProduct()=="B"){
                pdtB++;
            }
        }

        if(pdt.getProduct()=="A"){
            if(pdtA>CANT_A){
                products.add(pdt);
                return true;
            }
            else{
                new PaqueteException("No se pueden añadir mas articulos A"); 
                return false;
            }
        }
        else {

            if(pdtB>=CANT_B){
                products.add(pdt);
                return true;
            }
            else{
                new PaqueteException("No se pueden añadir mas articulos B"); 
                return false;
            }
        }

    }

    public double getVoltotal(){

        for(int i =0 ; i<products.size();i++){
            volTotal += products.get(i).getVolume();
        }

        return volTotal;
    }
    
}
