package facade;

import modelos.Amplificador;
import modelos.Blueray;
import modelos.Projetor;

public class HomeTheatre {
    private Amplificador amplificador;
    private Blueray blueray;
    private Projetor projetor;

    public HomeTheatre(Amplificador amplificador, Blueray blueray, Projetor projetor){
        this.amplificador = amplificador;
        this.blueray = blueray;
        this.projetor = projetor;
    }

    public void Assistir(String filme){
        amplificador.on();
        amplificador.setVolume(15);
        projetor.on();
        projetor.setMode();
        blueray.on();
        blueray.play(filme);
    }

    public void Desligar(){
        amplificador.off();
        projetor.off();
       /*/ blueray.stop();*/ 
        blueray.off();
    }
}
