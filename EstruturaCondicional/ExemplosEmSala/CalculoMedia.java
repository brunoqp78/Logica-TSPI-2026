import java.util.Scanner;

public class CalculoMedia {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		double nota1, nota2, media;
		int frequencia;
		System.out.println("Digite a primeira nota: ");
		nota1 = s.nextDouble();
		System.out.println("Digite a segunda nota: ");
		nota2 = s.nextDouble();
		System.out.println("Digite a frequência em porcentagem: ");
		frequencia = s.nextInt();
		media = (nota1+nota2)/2.0;
		if (media>=6 && frequencia >= 75) {
			System.out.println("Aprovado");
		}else{
		    System.out.println("Reprovado");
		}
	}
}