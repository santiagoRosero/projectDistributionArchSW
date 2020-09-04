package model;

import java.util.ArrayList;

import Exception.PaqueteException;
import controller.AdministracionArmado;
import thread.AdministracionEspera;

public class Depositador {

    private int id;
    private AdministracionEspera espera;
    private ArrayList<AdministracionArmado> armado;
    private Bodega bodega;

    public Depositador(int id){
        this.id = id;
        espera =  new AdministracionEspera("En espera ....", "Realizado ....");
        armado = new ArrayList<>();
        bodega =  new Bodega();
    }

    public int getId(){
        return id;
    }

    public boolean armarPaquete(Articulo<String> pdt,int code){
        AdministracionArmado arm =  new AdministracionArmado(code);
        arm.armarPaquete(pdt);
        armado.add(arm);
        espera.start();
        return true;
    }

    public boolean depositar(Paquete pkt){
        try{
            bodega.añadirPaquete(pkt);
            espera.start();
            return true;
        }
        catch(PaqueteException e){
            System.out.println(e.getMessage());
            return false;
        }
    }
}
