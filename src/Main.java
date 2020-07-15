import xadrez.PartidaDeXadrez;

public class Main {

    public static void main(String[] args) {

        PartidaDeXadrez partidaDeXadrez = new PartidaDeXadrez();
        UI.imprimirTabuleiro(partidaDeXadrez.pecas());
    }
}
