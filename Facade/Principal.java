import modelos.*;
import facade.*;

public class Principal{
    public static void main(String[] args){
        Amplificador jbl = new Amplificador();
        Blueray sony = new Blueray();
        Projetor samsung = new Projetor();

        HomeTheatre controle = new HomeTheatre(jbl, sony, samsung);

        controle.Assistir("Velozes e Furiosos");
        controle.Desligar();
    }
}