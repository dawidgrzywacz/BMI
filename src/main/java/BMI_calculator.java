import java.util.Scanner;

public class BMI_calculator {

    public static void main(String[] args) {

        Name User = new Name();

        User.getData();

        System.out.println("Na podstawie dostarczonych danych ");

        System.out.println(User.toString());

        System.out.println("Twój inddex BMI wynosi : ");
        System.out.println(User.calculate(User.getWeight(), User.getHeight()));

        double bmi = Double.parseDouble(User.calculate(User.getWeight(), User.getHeight()));

        if (bmi < 18.5) {
            System.out.println("Masz niedowagę... Zjedź sobie golonkę !");
        } else if (bmi >= 18.5 && bmi <= 24.99) {
            System.out.println("Gratulacje, Twoja waga jest OK, pewnie chodzisz do gimnazjum ;)");
        } else if (bmi >= 25.0 && bmi <= 29.99) {
            System.out.println("Masz lekką nadwagę, idź lepiej pobiegać.");
        } else if (bmi > 29.99) {
            System.out.println("OTYŁOŚĆ !!!, uważaj na kąpiele morskie, połowy waleni nadal cieszą się sporym powowdzeniem wśród kłusowników");
        }

    }



}
