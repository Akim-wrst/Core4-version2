package task;

import java.util.Scanner;

import static task.UserManager.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String string = "";
        try {
            while (!string.equals("stop")) {
                System.out.println("Введите операцию");
                string = scanner.nextLine();

                switch (string) {
                    case "create":
                        System.out.println("Введите: id name age mail address -> через один пробел, в одну строку!");
                        Scanner scanner4 = new Scanner(System.in);
                        String string1 = scanner4.nextLine();
                        String[] parts = string1.split(" ");
                        create(Integer.parseInt(parts[0]), String.valueOf(parts[1]),
                                Integer.parseInt(parts[2]), String.valueOf(parts[3]), String.valueOf(parts[4]));
                        break;
                    case "get":
                        System.out.println("Введите id");
                        Scanner scanner1 = new Scanner(System.in);
                        get(scanner1.nextInt());
                        break;
                    case "update":
                        System.out.println("Введите id");
                        Scanner scanner2 = new Scanner(System.in);
                        update(scanner2.nextInt());
                        break;
                    case "delete":
                        System.out.println("Введите id");
                        Scanner scanner3 = new Scanner(System.in);
                        delete(scanner3.nextInt());
                        break;
                    case "sortAddress":
                        sortAddress();
                        break;
                    case "sortName":
                        sortName();
                        break;
                }

                System.out.println("-----------------------");
                System.out.println("Список user: -> " + list);
                System.out.println("-----------------------");
            }
        }catch (Exception e){
            System.out.println(e + " Некорректные данные, Следуйте инструкции!");
        }
    }
}
