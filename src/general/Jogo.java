/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package general;

import java.util.ArrayList;

/**
 *
 * @author rjuni
 */
public class Jogo {

    private ArrayList<Jogador> jogadores = new ArrayList();
    private int jogadorAtual;
    private int vez;
    private int rodadas;

    public Jogo() {
        rodadas = 13;
        vez = 1;
    }

    public ArrayList<Jogador> getJogadores() {
        return jogadores;
    }

    public void setJogador(Jogador jogador) {
        jogadores.add(jogador);
    }

    public int getJogadorAtual() {
        return jogadorAtual;
    }

    public void setJogadorAtual(int jogadorAtual) {
        this.jogadorAtual = jogadorAtual;
    }

    public int getVez() {
        return vez;
    }

    public void setVez(int vez) {
        this.vez = vez;
    }

    public void setRodada() {
        rodadas = 13;
    }

    public int controladorMain() {
        if (jogadores.size() == 2) {
            controladorDois();
        }
        if (jogadores.size() == 3) {
            controladorTres();
        }
        if (jogadores.size() == 4) {
            controladorQuatro();

        }

        return vez;
    }

    private void controladorDois() {

        if (vez == 1) {
            vez = 2;

        } else {
            vez = 1;
        }

        
    }

    private void controladorQuatro() {
      int vezAr = 0;
      if (vez == 4) {
            vezAr = 1;

      }
        if (vez == 3) {
            vezAr = 4;

        }if(vez == 2){
            vezAr = 3;
        }
        if(vez == 1){
            vezAr = 2;
        }
        vez = vezAr;
    }

    private void controladorTres() {
        int vezAr = 0;
        if (vez == 3) {
            vezAr = 1;

        }if(vez == 2){
            vezAr = 3;
        }
        if(vez == 1){
            vezAr = 2;
        }
        vez = vezAr;
        
    }

}
