package criptografia;
import java.util.Scanner;
/**
 * ENGENHARIA DA COMPUTAÇÃO - FAINOR
 *
    
 * 
 */
public class transposicao {

    public static void main(String[] args) {
        String msg;
        String par = "";
        String impar = "";
        String descrip = "";
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite sua mensagem");
        msg = teclado.nextLine();
        // System.out.println("Mensagem digitada foi: "+msg+"\n");
//---------------------------------------------------------------------------------------------
        //CRIPTOGRAFANDO A MENSAGEM
        if ((msg.length() % 2) != 0) {//se impar, acrescenta um espaço
            msg += " ";
        }
        System.out.println("Texto Criptografado");
        for (int i = 0; i < msg.length() / 2; i++) {
            System.out.print("" + msg.charAt(2 * i));
            par += msg.charAt(2 * i);
        }
        for (int i = 0; i < msg.length() / 2; i++) {
            System.out.print("" + msg.charAt((2 * i) + 1));
            impar += msg.charAt((2 * i) + 1);
        }
//----------------------------------------------------------------------------------------------
        //DESCRIPTOGRAFANDO A MENSAGEM
        System.out.println("\nDescriptografando...");
        String crip = par + impar;
        char b[] = crip.toCharArray();
        for (int i = 0; i < b.length / 2; i++) {//primeira posição do par, com primeira posição do impar
            descrip += par.charAt(i);
            descrip += impar.charAt(i);

        }
        System.out.print(descrip);
    }
}
