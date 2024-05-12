package com.nataliatsi.model;

public class Iphone implements AparelhoTelefonico, ReprodutorMusical, NavegadorInternet {

    public void ligar(String contato) {
        System.out.printf("Ligando para %s\n", contato);
    }

    public void atender() {
        System.out.println("Atendendo chamada.");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz.");
    }

    public void exibirPagina() {
        System.out.println("Exibindo página web.");
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba.");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando página.");
    }

    public void tocar(String musica) {
        System.out.printf("Tocando %s\n", musica);
    }

    public void pausar() {
        System.out.println("Música pausada.");
    }

    public void selecionarMusica(String musica) {
        System.out.printf("Música selecionada: %s\n", musica);
    }

}
