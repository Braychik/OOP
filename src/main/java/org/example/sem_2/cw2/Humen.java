package org.example.sem_2.cw2;

public class Humen {
  private Transpart lastTransport;
    public void drive(Transpart transpart){
        if (lastTransport==null){
            transpart.start();
            lastTransport = transpart;
        }else {
            System.out.println("Уже еду");
        }
    }
    public void stop(){
        if (lastTransport != null){
            lastTransport.stop();
            lastTransport = null;
        }else {
            System.out.println("Уже стою");
        }
    }
}
