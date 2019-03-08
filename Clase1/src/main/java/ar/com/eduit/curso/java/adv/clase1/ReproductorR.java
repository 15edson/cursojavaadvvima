package ar.com.eduit.curso.java.adv.clase1;

import java.io.FileInputStream;
import javazoom.jl.player.Player;

public class ReproductorR implements Runnable {
    public static void main(String[] args) throws Exception{
        FileInputStream fis=new FileInputStream("res/condor.mp3");
        Player player=new Player(fis);
        player.play();
    }
    
    @Override public void run(){
        try {
            FileInputStream fis=new FileInputStream("res/condor.mp3");
            Player player=new Player(fis);
            player.play();
        } catch (Exception e) {
        }
    }
}
