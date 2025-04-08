import java.util.Scanner;
import java.util.Locale;
import java.util.InputMismatchException;

public class AboutMeTwo {
    public static void main(String[] args) {
        try {
            //criando objeto Scanner
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    
            System.out.println("Digite seu nome");
            String nome = scanner.next();
    
            System.out.println("Digite seu sobrenome");
            String sobrenome = scanner.next();
            
            System.out.println("Digite sua idade");
            int idade = scanner.nextInt();
            
            System.out.println("Digite sua altura");
            double altura = scanner.nextDouble();
    
            //imprimindo os dados obtidos pelo usuario
            System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome);
            System.out.println("Tenho " + idade + " anos ");
            System.out.println("Minha altura é  " + altura + " cm ");
    
            // Fecha o Scanner
            scanner.close();            
        }
        catch (InputMismatchException event){
            System.err.println("Os campos idade e altura precisam ser numéricos.");
        }
    }
}
