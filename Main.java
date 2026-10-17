
import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("------- BANCO BRASIL -------\nQual é o seu nome: ");
            HashMap< String ,Conta> contas = new HashMap<>();
                String nome  = input.next();
                    contas.put(nome, new Conta(nome));
                        System.out.println("Conta criada com sucesso " + nome + "!");
       
        boolean op = false;
        do {
            System.out.println("------ BANCO ------- \n1 - Ver saldo \n2 - Depositar saldo \n3 - Sacar saldo \n4 - sair do programa");
            int op2 = input.nextInt();
            Conta session = contas.get(nome);
                switch (op2) {
                    case 1:

                        System.out.println("Olá " + session.nome + "\nSeu saldo é de: " + session.getSaldo());                        
                        break;
                    case 2:
                        System.out.println("Olá " + session.nome + " Quanto deseja depositar: ");
                            float saldo2 =  input.nextFloat();
                                session.setSaldo(saldo2);
                                System.out.println("Saldo adicionado!");
                        break;
                    case 3:
                        System.out.println("Olá " + session.nome + " Quanto deseja sacar: ");
                            saldo2 = input.nextFloat();
                                session.takeSaldo(saldo2);
                        
                        break;
                    case 4:
                        op = true;
                        break;
                
                    default:
                    System.out.println("Opção inválida. Digite novamente: ");
                        break;
                }
            

        }

        while (!op);
        input.close();
    }
}