// SE O ARQUIVO ESTÁ DIRETAMENTE DENTRO DE src:
// Remova a linha "package Teste.src;" totalmente ou deixe vazia.

import java.util.Scanner; //

public class App { //[cite: 13]
    private static Scanner Teclado; //[cite: 13]

    public static void main(String[] args) { //[cite: 13]
        Teclado = new Scanner(System.in); //[cite: 13]

        int a;
        System.out.print("Oi: "); //[cite: 13]
        a = Teclado.nextInt(); //[cite: 13]

        System.out.println(a); //[cite: 13]

    }
}