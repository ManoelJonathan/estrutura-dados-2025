import java.util.Scanner;
import java.util.Random;

public class TesteJogoDaVelha {
    public static void main(String[] args) {
        System.out.println("Jogando para ganhar");
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        boolean jogarNovamente = true;

        while (jogarNovamente) {
            JogoDaVelha jogo = new JogoDaVelha();
            int jogadas = 0;
            boolean acabou = false;

            while (jogadas < 9 && !acabou) {
                int i, j;
                do {
                    i = rand.nextInt(3);
                    j = rand.nextInt(3);
                } while (jogo.tabuleiro[i][j] != JogoDaVelha.VAZIO);

                jogo.poePeca(i, j);
                jogadas++;

                if (jogo.eVencedor(JogoDaVelha.X) || jogo.eVencedor(JogoDaVelha.O)) {
                    acabou = true;
                }
            }
            System.out.println(jogo.toString());
            jogo.vencedor();

            System.out.println("Deseja jogar novamente s/n");
            String reposta = scanner.nextLine();
            jogarNovamente = reposta.equals("s");
        }
        scanner.close();
        System.out.println("O jogo acabou");
    }
}