package modelos;

public class Projetor {
    private int modo;
    
    public void on(){
        System.out.println("Projetor ligado");
    }
    public void off(){
        System.out.println("Projetor desligado");
    }
    public void setMode(){
        if (modo == 0){
            modo = 1;
            System.out.println("Projetor em modo widescreen.");
        }
        else{
            modo = 0;
            System.out.println("Projetor em modo padrão.");
        }
    }
}