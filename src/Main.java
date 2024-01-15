import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> g = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("21: ");
        int u = Integer.parseInt(reader.readLine());

        int counters;
        for (int index = 0; index < u; index++) {
            System.out.print("nugi,armas,n + counter: ");
            String name = reader.readLine();
            counters = CountWords(name);

            System.out.print("21: ");
            char s = reader.readLine().charAt(0);

            int result = CountOccurrences(name, s);
            g.add(result);
        }

        System.out.print("Hasil: ");
        for (int count : g) {
            System.out.print(count + " ");
        }
    }

    public static int CountWords(String str) {
        String[] words = str.split("\\s+");
        return words.length;
    }

    public static int CountOccurrences(String str, char ch) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == ch) {
                count++;
            }
        }
        return count;
}
}
