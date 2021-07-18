import java.util.*;


public class Jogo_Do_Galo{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String jogador1,jogador2;
        int jogadas = 0;
        System.out.println("Escreve nome dos jogadores");
        System.out.print("Jogador 1: ");
        jogador1 = ler.nextLine();
        System.out.print("Jogador 2: ");
        jogador2 = ler.nextLine();
        /*while (jogadas<9 && vencedor()=="ninguem") {
            
        }*/
    }

    public static String vencedor(){
        String ganhou = "ninguem";
        return ganhou;
    }
    
}