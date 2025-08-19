import java.util.Scanner;

public class Notas {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nota do primeiro trimestre: ");
        double nota1 = sc.nextDouble();

        System.out.println("Nota do segundo trimestre: ");
        double nota2 = sc.nextDouble();

        System.out.println("Nota do terceiro trimeste: ");
        double nota3 = sc.nextDouble();

        Double media = (nota1 + nota2 + nota3) /3;
        System.out.printf("A média do aluno é: %.2f ", media);

        if (media >= 6){
            System.out.println("Aluno aprovado");
        } 
        else if (media >= 5){
            System.out.println("Aluno em recuperação");
        }
        else{
            System.out.println("Aluno reprovado");
        }
    
        sc.close();
    }
}
