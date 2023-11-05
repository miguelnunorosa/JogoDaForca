package view;

import java.util.Scanner;

public class TUI {

    public void exibirMensagem(String mensagem) {
        System.out.println(mensagem);
    }

    public char solicitarPalpite() {
        System.out.print("Digite uma letra: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.next().charAt(0);
    }


}
