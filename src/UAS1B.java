import java.io.BufferedReader;
import java.io.IOException:
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.ArrayList;
public class UAS1B {

    public static void main(String[] args) throws IOException {
        ArrayList<String> g = new ArrayList<>();
        char[] karakter_pertama;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input ");
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            System.out.println("i = " + i);
        }
    }
}