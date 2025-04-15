
public class JogoDaVelha {

    protected static final int X = 1, O = -1;
    protected static final int VAZIO = 0;
    protected int tabuleiro[][] = new int[3][3];
    protected int jogador;
  
    public JogoDaVelha() {
        limpaTabuleiro(); 
    }

    public void limpaTabuleiro() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tabuleiro[i][j] = VAZIO;
            }
        }
        jogador = X;
    }

    public void poePeca(int i, int j) {
        if (i < 0 || i > 2 || j < 0 || j > 2) {
            throw new IllegalArgumentException("Posição Inválida");
        }
        if (tabuleiro[i][j] != VAZIO) {
            throw new IllegalArgumentException("Posição Ocupada");
        }
        tabuleiro[i][j] = jogador;
        jogador = -jogador;

    }

    public boolean eVencedor(int marca) {
        for (int i = 0; i < 3; i++) {
            int sLinha = 0;
            int sColuna = 0;
            for (int j = 0; j < 3; j++) {
                sLinha += tabuleiro[i][j];
                sColuna += tabuleiro[j][i];
            }
            if (sLinha == marca * 3 || sColuna == marca * 3) {
                return true;
            }
        }

        int sDiagonalP = 0;
        int sDiagonalS = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    sDiagonalP += tabuleiro[i][j];
                }
                if (i + j == 2) {
                    sDiagonalS += tabuleiro[i][j];
                }
            }
        }
        if (sDiagonalP == marca * 3 || sDiagonalS == marca * 3) {
            return true;
        }

        return false;
    }

    public void vencedor() {
        if (eVencedor(X)) {
            System.out.println("Venceedor é jogador X");
        } else if (eVencedor(O)) {
            System.out.println("Vencedor é jogador O");
        } else {
            System.out.println("O jogo deu Empate");
        }
    }

    public String toString() {
        StringBuilder retorno = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tabuleiro[i][j] == X) {
                    retorno.append("X");
                } else if (tabuleiro[i][j] == O) {
                    retorno.append("O");
                } else {
                    retorno.append(" ");
                }
                if (j < 2) {
                    retorno.append("|");
                }
            }
            if (i < 2) {
                retorno.append("\n-----\n");
            }
        }
        return retorno.toString();
    }
}
