import java.util.Scanner;

public class Main {
    private static Singers singers = new Singers();
    private static Scanner scanner = new Scanner(System.in);

    public static void PrintTransactions() {
        System.out.println("\t 0-View transactions");
        System.out.println("\t 1-View Singers");
        System.out.println("\t 2-Add Singer");
        System.out.println("\t 3-Update Singer");
        System.out.println("\t 4-Delete Singer");
        System.out.println("\t 5-Search Singer");
        System.out.println("\t 6-Exit");
    }

    public static void View() {
        singers.PrintTheSingers();
    }

    public static void Add() {
        System.out.println("The name of the singer you want to add:");
        String name = scanner.nextLine();
        Singers.AddSinger(name);
    }
    private static void Update() {
        System.out.println("The position you want to update");
        int position = scanner.nextInt();
        scanner.nextLine();

        String newName = scanner.nextLine();
        Singers.UpdateSinger(newName, position - 1);
    }
    private static void Delete() {
        System.out.println("The position you want to delete(1,2,3)");
        int position=scanner.nextInt();
       Singers.DeleteSinger(position-1);
    }
    public static void Search(){
        System.out.println("The singer you want to search");
        String name=scanner.nextLine();
        Singers.SearchSinger(name);
    }

    public static void main(String[] args) {
        System.out.println("\t Welcome!");
        PrintTransactions();
        boolean exit = false;
        int transactions;
        while (!exit) {
            System.out.print("Choose action:");
            transactions = scanner.nextInt();
            scanner.nextLine();
            switch (transactions) {
                case 0:
                    PrintTransactions();
                    break;
                case 1:
                    View();
                    break;
                case 2:
                    Add();
                    break;
                case 3:
                    Update();
                    break;
                case 4:
                    Delete();
                    break;
                case 5:
                    Search();
                    break;
                case 6:
                    exit = true;
                    System.out.println("Exit");
                    break;
            }

        }
    }
}
