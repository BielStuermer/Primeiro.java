import java.util.Scanner;

public class Total{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número total de eleitores: ");
        int total = sc.nextInt();

        System.out.println("Digite o número de votos brancos: ");
        int brancos = sc.nextInt();

        System.out.println("Digite o número de votos nulos: ");
        int nulos = sc.nextInt();

        System.out.println("Digite os votos válidos: ");
        int validos = sc.nextInt();


        double percBrancos = (brancos *100.0) / total;
        double percNulos = (nulos * 100.0) / total;
        double percValidos = (validos * 100.0) / total; 

        System.out.printf("Percentual de votos brancos: %.2f%%\n", percBrancos);
        System.out.printf("Percentual de votos nulos: %.2f%%\n", percNulos);
        System.out.printf("Percentual de votos válidos: %.2f%%\n", percValidos);

        sc.close();
        System.out.println("Cálculo de porcentagens concluído.");
    }

}
