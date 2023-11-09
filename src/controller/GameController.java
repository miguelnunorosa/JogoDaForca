package controller;

import model.JogoDaForca;

import java.util.Random;
import java.util.Scanner;

public class GameController {

    private JogoDaForca jogo;
    private Scanner scanner;
    private String[] palavras;
    private int tentativasRestantes;

    public GameController(String[] palavras) {
        this.palavras = palavras;
        this.jogo = new JogoDaForca(selecionarPalavraAleatoria());
        this.scanner = new Scanner(System.in);
    }

    public void iniciarJogo() {
        tentativasRestantes = 6;

        while (!jogo.jogoCompleto() || tentativasRestantes == 0) {
            exibirStatusDoJogo();
            solicitarPalpite();

            if(tentativasRestantes == 0){
                System.out.println("Perdeu. Tente novamente.");
                System.exit(0);
            }
        }

        exibirResultadoFinal();
    }

    private void exibirStatusDoJogo() {
        System.out.println("Palavra: " + jogo.getPalavraAdivinhada());
        System.out.println("Letras erradas: " + jogo.getLetrasErradas());
        System.out.println("Tentativas errada: " + tentativasRestantes + "/6");
    }

    private void solicitarPalpite() {
        System.out.print("Digite uma letra: ");
        char palpite = scanner.next().charAt(0);
        boolean acertou = jogo.adivinharLetra(palpite);

        if (acertou) {
            System.out.println("Adivinha correta!");
        } else {
            System.out.println("Adivinha incorreta. Tente novamente!");
            tentativasRestantes--;
        }
    }

    private void exibirResultadoFinal() {
        System.out.println("Parabéns! Você adivinhou a palavra: " + jogo.getPalavraAdivinhada());
    }

    private String selecionarPalavraAleatoria() {
        Random random = new Random();
        int indice = random.nextInt(palavras.length);
        return palavras[indice].toUpperCase();
    }


}
