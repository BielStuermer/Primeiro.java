import java.util.Scanner;

public class Idade {

    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
        
    System.out.println("Digite a sua idade (anos): ");
    int anos = sc.nextInt();

    System.out.println("Digite os meses: ");
    int meses = sc.nextInt();

    System.out.println("Digite os dias: ");
    int dias = sc.nextInt();

    int idadeEmDias = (anos * 365) + (meses *30) + dias;
    System.out.println("Sua idade em dias é: " + idadeEmDias);
    sc.close();

    } 
    
}
