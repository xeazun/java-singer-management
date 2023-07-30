import java.util.ArrayList;

public class Singers {
    private static ArrayList<String> listOfSinger = new ArrayList<String>();

    public void PrintTheSingers() {
        System.out.println("There are " + listOfSinger.size() + " singers in the singer list.");
        for (int i=0; i < listOfSinger.size(); i++) {
            System.out.println(i + 1 + " Singer: " + listOfSinger.get(i));
        }
    }

    public static void AddSinger(String name) {
        listOfSinger.add(name);
        System.out.println("Singer list updated");
    }

    public static void UpdateSinger(String newName, int position) {
        listOfSinger.set(position, newName);
        System.out.println("Singer list updated");
    }

    public static void DeleteSinger(int position) {
        String name = listOfSinger.get(position);
        listOfSinger.remove(position);
        System.out.println("The singer named " + name + " has been removed from the list.");
    }

    public static void SearchSinger(String singerName) {
        int position = listOfSinger.indexOf(singerName);
        if (position >= 0) {
            System.out.println("Singer found");
            System.out.println("Singer named " + singerName + " in " + (position + 1) + "st position");
        }
        else {
            System.out.println("Singer found");
        }
    }
}
