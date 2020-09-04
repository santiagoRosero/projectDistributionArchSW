package model;

import controller.AdministracionArmado;
import thread.AdministracionEspera;

public class Depositador {

    private int id;
    private AdministracionEspera espera;
    private AdministracionArmado armado;
    private Bodega bodega;

    public Depositador(int id){
        this.id = id;
        espera =  new AdministracionEspera("En espera ....", "Realizado ....");
        armado = new AdministracionArmado(id);
        bodega =  new Bodega();
    }

    public int getId(){
        return id;
    }

    public boolean depositar(Paquete pkt){

        return true;
    }
}
