package model;

public class JogoDaForca {

    private String palavraSecreta;
    private StringBuilder palavraAdivinhada;
    private StringBuilder letrasErradas;

    public JogoDaForca(String palavraSecreta) {
        this.palavraSecreta = palavraSecreta.toUpperCase(); // Para garantir que seja case-insensitive
        this.palavraAdivinhada = new StringBuilder("_".repeat(palavraSecreta.length()));
        this.letrasErradas = new StringBuilder();
    }

    public boolean adivinharLetra(char letra) {
        letra = Character.toUpperCase(letra); // Para garantir que seja case-insensitive

        if (palavraSecreta.indexOf(letra) != -1) {
            // A letra está na palavra
            for (int i = 0; i < palavraSecreta.length(); i++) {
                if (palavraSecreta.charAt(i) == letra) {
                    palavraAdivinhada.setCharAt(i, letra);
                }
            }
            return true;
        } else {
            // A letra não está na palavra
            letrasErradas.append(letra).append(" ");
            return false;
        }
    }

    public String getPalavraAdivinhada() {
        return palavraAdivinhada.toString();
    }

    public String getLetrasErradas() {
        return letrasErradas.toString();
    }

    public boolean jogoCompleto() {
        return !palavraAdivinhada.toString().contains("_");
    }


}
