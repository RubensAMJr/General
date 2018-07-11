/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package general;

/**
 *
 * @author rjuni
 */
public class Jogador {

    private int numero;

    private String nome;
    private int pontuacaoTotal;

    private int tentativas = 3;

    public Jogador() {
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPontuacaoTotal() {
        return pontuacaoTotal;
    }

    public void setPontuacaoTotal(int pontuacaoTotal) {
        this.pontuacaoTotal = pontuacaoTotal;
    }

    public int calcularTotal() {
        return 0;
    }

    public int getTentativas() {
        return tentativas;
    }

    public Jogador(String nome) {
        this.nome = nome;
    }

}
