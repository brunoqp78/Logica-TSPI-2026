import java.util.Scanner;

public class ExemploNotas {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double nota1 = s.nextDouble();
        double nota2 = s.nextDouble();
        double media = (nota1 + nota2) / 2.0;
        System.out.printf("Média : %.2f\n", media);

        if (media >= 6.0) {
            if (media == 10.0) {
                System.out.println("Parabéns");
            }
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }

    }
}
