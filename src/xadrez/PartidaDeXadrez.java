package xadrez;

import TabuleiroDeJogo.Posicao;
import TabuleiroDeJogo.Tabuleiro;
import xadrez.pecaXadrez.Rei;

public class PartidaDeXadrez {
    private Tabuleiro tabuleiro;

    public PartidaDeXadrez() {
        this.tabuleiro = new Tabuleiro(8, 8);
        posicaoInicial();
    }

    public PecaDeXadrez[][] pecas() {
        PecaDeXadrez[][] mat = new PecaDeXadrez[tabuleiro.getLinhas()][tabuleiro.getColunas()];
        for (int i = 0; i < tabuleiro.getLinhas(); i++) {
            for (int j = 0; j < tabuleiro.getColunas(); j++) {
                mat[i][j] = (PecaDeXadrez) tabuleiro.peca(i, j);
            }
        }
        return mat;
    }
    private void posicaoInicial(){
        tabuleiro.colocarPeca(new Rei(tabuleiro, Cor.PRETO),new Posicao(0,4));
        tabuleiro.colocarPeca(new Rei(tabuleiro, Cor.BRANCO),new Posicao(7,4));

    }
}
