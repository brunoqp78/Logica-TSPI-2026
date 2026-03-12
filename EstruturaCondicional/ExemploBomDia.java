
import java.util.Scanner;

public class ExemploBomDia {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Que horas são? ");
        int horas = s.nextInt();
        if (horas >= 7 && horas <= 12){
            System.out.println("Bom dia!!!");
        }else if (horas >= 19 && horas <= 22){
            System.out.println("Boa noite");
        }else if (horas < 0 || horas >24){
             System.out.println("Em qual planeta você mora!!!!");
        }
    }
}
