package com.nataliatsi;

import java.util.Scanner;

import com.nataliatsi.model.Iphone;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Iphone iPhone = new Iphone();

        System.out.println("*** Aparelho Telefônico ***");
        System.out.println("Deseja ligar para alguém? (sim/não)");
        String ligar = scanner.nextLine();

        if (ligar.equalsIgnoreCase("sim")) {
            System.out.println("Digite o nome do contato: ");
            String contato = scanner.nextLine();
            iPhone.ligar(contato);

            iPhone.atender();
            iPhone.iniciarCorreioVoz();
        }

        System.out.println("\n*** Navegador Web ***");
        iPhone.exibirPagina();
        iPhone.adicionarNovaAba();
        iPhone.atualizarPagina();

        System.out.println("\n**** Reprodutor Musical ***");
        System.out.println("Digite o nome da música para reproduzir: ");
        String musica = scanner.nextLine();
        
        iPhone.selecionarMusica(musica);
        iPhone.tocar(musica);
        iPhone.pausar();

        scanner.close();

    }
}
