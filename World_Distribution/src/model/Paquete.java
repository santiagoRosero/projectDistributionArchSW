package model;

import java.util.ArrayList;
import java.util.List;

import Exception.PaqueteException;

public class Paquete {

    public static final int CANT = 3;
    private List<Articulo<String>> products;
    private int id;

    public Paquete (int id){
        this.id = id;
        this.products = new ArrayList<>();
    }

    public int getId(){
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
            if(pdtA>3){
                products.add(pdt);
                return true;
            }
            else{
                new PaqueteException("No se pueden añadir mas articulos A"); 
                return false;
            }
        }
        else {

            if(pdtB>=4){
                products.add(pdt);
                return true;
            }
            else{
                new PaqueteException("No se pueden añadir mas articulos B"); 
                return false;
            }
        }

    }
    
}
