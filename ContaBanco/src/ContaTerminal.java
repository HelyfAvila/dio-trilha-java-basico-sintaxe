import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal{
    public static void main(String[] args) {
    //1) TODO: Conhecer e importar classe Scanner
    //2) Exibir as mensagens para o nosso usuário
    //3) Obter pela Scanner os valores digitados no terminal
    //4) Exibir a mensagem conta criada.

        //1
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        //2
            System.out.println("\nOlá, seja bem vindo ao BANCO-GUAXINIM! ");
        //2
            System.out.println("\nInsira o número da conta, por gentileza: ");
        //3
            int numero = scanner.nextInt();
        //2
            System.out.println("\nInsira o número da agência, por gentileza: ");
        //3 
            String agencia = scanner.next();
        //2
            System.out.println("\nInsira o seu nome, por gentileza: ");
        //3
            String nome = scanner.nextLine();
            scanner.nextLine();
        //2
            System.out.println("\nInsira o saldo que deseja depositar, por gentileza: ");
        //3
            double saldo = scanner.nextDouble();
        //4
        /*mensagem de exemplo:
         * 
         * Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque
         * 
         * 
        */
            System.out.println("\nOlá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");

        //fim
            System.out.println("FIM");
        
        

        

        scanner.close();
    }
}