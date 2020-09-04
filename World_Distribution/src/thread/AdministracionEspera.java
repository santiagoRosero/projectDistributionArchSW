package thread;

public class AdministracionEspera extends Thread {

    private String messageIn;
    private String messageOut;

    public AdministracionEspera(String messageIn,String messageOut){
        
        this.messageIn = messageIn;
        this.messageOut = messageOut;
    }

    @Override
    public void run(){
        try {
            System.out.println(messageIn);
            sleep(3000);
            System.out.println(messageOut);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
