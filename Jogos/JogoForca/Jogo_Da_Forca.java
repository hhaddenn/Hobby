import java.util.*;
import java.io.*;

public class Jogo_Da_Forca {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int opção = 0;
        do {
            System.out.println("Lista de Categorias:");
            System.out.println("1- Animais");
            System.out.println("2- Desporto");
            System.out.println("10- Sair");
            System.out.print("Escolha uma opção -> ");
            opção = ler.nextInt();
        } while (opção!=10);
    }
}
