import java.util.*;
import java.io.*;

public class Jogo_Da_Forca {
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);
        int opcao, escolha, random = 0;
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
                    do {
                        escolha = 0;
                        System.out.println("Animais:");
                        System.out.println("1- Jogar");
                        System.out.println("2- Adicionar palavras");
                        System.out.println("10- Sair");
                        System.out.print("Escolha uma opção -> ");
                        escolha = ler.nextInt();
                        System.out.println();
                        if (escolha==1) {
                            File f = new File("animais.txt");
                            random = (int)(Math.random() * (f.length() - 1)) + 1;
                            Jogar(random, f);
                        }
                        if (escolha==2) {
                            File f = new File("animais.txt");
                            Adicionar(f);
                        }
                    } while (escolha!=10);
                    break;
            
                case 2:
                    do {
                        escolha = 0;
                        System.out.println("Desporto:");
                        System.out.println("1- Jogar");
                        System.out.println("2- Adicionar palavras");
                        System.out.println("10- Sair");
                        System.out.print("Escolha uma opção -> ");
                        escolha = ler.nextInt();
                        System.out.println();
                        if (escolha==1) {
                            File f = new File("desporto.txt");
                            random = (int)(Math.random() * (f.length() - 1)) + 1;
                            Jogar(random, f);
                        }
                        if (escolha==2) {
                            File f = new File("desporto.txt");
                            Adicionar(f);
                        }
                    } while (escolha!=10);
                    break;
            }
        } while (opcao!=10);
    }

    public static void Jogar(int random, File f) throws IOException {
        Scanner read = new Scanner(f);

        read.close();
    }

    public static void Adicionar(File f) throws IOException {
        FileWriter writer = new FileWriter(f);
        Scanner sc = new Scanner(System.in);
        String word;
        System.out.println("O ficheiro irá fechar quando não escrever nada");
        System.out.println("Escreva as palavras que quer adicionar:");
        word = sc.nextLine();
        while (word.length()>0) {
            writer.write(word.toUpperCase());
            word = sc.nextLine();
        }
        writer.close();
        sc.close();
    }

}
