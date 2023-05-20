import java.util.Scanner;

public class Aula2 {
    
    public static void  main(String[] args) {

        //Desafio - Número Ímpar ou Par?
        /*System.out.println("Digite um número para descobrir se é ímpar ou par:");
        Scanner N = new Scanner (System.in);
        int num = N.nextInt();

        if (num%2 == 0) {
            System.out.println("Número Par.");
        }
        else {
            System.out.println("Número Ímpar.");
        }*/

        //Loops 

        //While - Exemplo
        /*int c = 0;
        while (c < 5) {
            System.out.println("Olá.");
            c++;
        }*/

        //Desafio - While soma

        /*int s = 0;
        int c = 1;
        while (c < 101) {
            s += c;
            c++;
            System.out.println("Soma Atual: " + (s + c));
        }*/

        //Desafio - While senha
        /*int senha = 123;
        
        System.out.println("Digite sua senha:");
        Scanner s = new Scanner (System.in);
        int entrada_senha = s.nextInt();

        while (entrada_senha != senha) {
            System.out.println("Acesso negado, digite novamente:");
            entrada_senha = s.nextInt();

        if (entrada_senha == senha) {
            System.out.println("Acesso permitido.");
            }
        }*/

        //Desafio - 1 For
        /*int c;
    
        System.out.println("Digite um número:");
        Scanner numero = new Scanner(System.in);
        int n = numero.nextInt();

        for (c = 1; c <= 10; c++) {
            int tab = (n * c);
            System.out.println(n + "x" + c + " = " + tab);
        }*/

        //Desafio - 2 For
        /*System.out.println("Digite um número:");
        Scanner n = new Scanner(System.in);
        int num = n.nextInt();
        
        for(int m = 0; m < num; m++) {
            if (m%2 == 1) {
                System.out.println("Números ímpares até " + num + " são: " + m);
            }
        }*/

        
    }                 
}

    

