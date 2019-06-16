import java.util.Scanner;

public class Name {

    private String name;
    private int age;
    private double weight;
    private double height;

    public String getData() {
        System.out.println("Give me your name : ");
        System.out.println();
        Scanner name = new Scanner(System.in);
        System.out.print(name.next());

        System.out.print(" ,how old are you?");
        System.out.println();
        Scanner sc2 = new Scanner(System.in);
        //System.out.print(age.nextLine());
        sc2.nextLine();
        Scanner sc = new Scanner(System.in);
        System.out.print("Input weight in kilogram: ");
        System.out.println();
        weight = sc.nextDouble();
        System.out.print("Input height in meters: ");
        System.out.println();
        height = sc.nextDouble();
        return toString();
    }
    public String calculate(double weight, double height){

        double bmi = weight/(Math.pow(height, 2));

        return String.valueOf(bmi);
    }

    public Name() {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }
    public Name(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Name{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }
}
