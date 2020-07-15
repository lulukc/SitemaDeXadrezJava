package TabuleiroDeJogo;

public class Tabuleiro {
    private int linhas;
    private int colunas;
    private Peca[][] pecas;

    public Tabuleiro(int linhas, int colunas) {
        if (linhas < 1 || colunas < 1) {
            throw new ExcecaoTabuleiro("Erro ao criar tabuleiro: ele precida ter pelomenos uma linha e uma coluna");
        }
        this.linhas = linhas;
        this.colunas = colunas;
        pecas = new Peca[linhas][colunas];
    }

    public int getLinhas() {
        return linhas;
    }

    public int getColunas() {
        return colunas;
    }

    public void setColunas(int colunas) {
        this.colunas = colunas;
    }

    public Peca peca(int linha, int coluna) {
        if (!existePosicao(linha, coluna)) {
            throw new ExcecaoTabuleiro("Posicao não exixte no tabuleiro");
        }
        return pecas[linha][coluna];
    }

    public Peca peca(Posicao posicao) {
        if (!existePosicao(posicao)) {
            throw new ExcecaoTabuleiro("Posicao não exixte no tabuleiro");
        }
        return pecas[posicao.getLinha()][posicao.getColuna()];
    }

    public void colocarPeca(Peca peca, Posicao posicao) {
        if(!verificarPeca(posicao)){
            throw new ExcecaoTabuleiro("Já tem uma pessa na posicao" + posicao);
        }
        pecas[posicao.getLinha()][posicao.getColuna()] = peca;
        peca.posicao = posicao;
    }

    private boolean existePosicao(int linha, int coluna) {
        return linha >= 0 && linha < this.linhas && coluna >= 0 && coluna < this.colunas;
    }

    public boolean existePosicao(Posicao posicao) {
        return existePosicao(posicao.getLinha(), posicao.getColuna());
    }

    public boolean verificarPeca(Posicao posicao) {
        if (!existePosicao(posicao)) {
            throw new ExcecaoTabuleiro("Posicao não exixte no tabuleiro");
        }
        return peca(posicao) != null;
    }
}
