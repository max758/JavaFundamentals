import java.util.Scanner;

public class MainTaskOne {
    public static void main(String[] args) {
        //1st Приветствовать любого пользователя при вводе его имени через командную строку
        Scanner username = new Scanner(System.in);
        System.out.print("Enter your name, please: ");
        String p = ("Hello, " + username.nextLine() + "!");
        System.out.println(p);
    }
}
