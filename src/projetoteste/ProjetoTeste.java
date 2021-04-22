
package projetoteste;

import java.util.Scanner;

/**
 *
 * @author Jeferson
 */
public class ProjetoTeste {

    public static void main(String[] args) {
       int ano, idade;
       String nome;
       Scanner ler = new Scanner(System.in);
        System.out.println("Qual seu nome");
        nome = ler.nextLine();
        System.out.println("Informe o ano nascimento");
        ano = ler.nextInt();
        idade = 2021-ano;
        System.out.println("Boa tarde "+nome+" você tem "+idade+" anos");
       
    }
    
}
