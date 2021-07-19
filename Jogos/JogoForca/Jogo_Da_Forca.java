import java.util.*;
import java.io.*;

public class Jogo_Da_Forca {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int opcao = 0;
        do {
            System.out.println("Lista de Categorias:");
            System.out.println("1- Animais");
            System.out.println("2- Desporto");
            System.out.println("10- Sair");
            System.out.print("Escolha uma opção -> ");
            opcao = ler.nextInt();
            System.out.println();
            switch (opcao) {
                case 1:
                    int escolha = 0;
                    do {
                        System.out.println("Animais:");
                        System.out.println("1- Jogar");
                        System.out.println("2- Adicionar palavras");
                        System.out.println("10- Sair");
                        System.out.print("Escolha uma opção -> ");
                        escolha = ler.nextInt();
                        System.out.println();
                        if (escolha==1) {
                            File f = new File("animais.txt");
                            Jogar(f);
                        }
                        if (escolha==2) {
                            File f = new File("animais.txt");
                            Adicionar(f);
                        }
                    } while (escolha!=10);
                    break;
            
                default:
                    break;
            }
        } while (opcao!=10);
    }

    public static void Jogar(File f){

    }

    public static void Adicionar(File f){

    }

}
