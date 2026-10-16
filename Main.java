
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
        input.close();

            
        
    }
}