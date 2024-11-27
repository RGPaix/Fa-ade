package modelos;

public class Blueray {
    public void on(){
        System.out.println("BlueRay ligado");
    }
    public void off(){
        System.out.println("BlueRay desligado");
    }
    public void play(String filme){
        System.out.println("Exibindo: " + filme);
    }
    public void stop(String filme){
        System.out.println("Parando filme: " + filme);
    }
}