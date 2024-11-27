package modelos;

public class Amplificador {
    private int volume;
    
    public void on(){
        System.out.println("Amplificador ligado");
    }
    public void off(){
        System.out.println("Amplificador desligado");
    }
    public void setVolume(int volume){
        this.volume = volume;
        System.out.println("Volume:" + volume);
    }
}
