import java.io.IOException;

public class TestingInput {
    public static void main(String[] args) {
        try {
            InputFile inputFile = Main.readInputFile("Data/a.txt");
            System.out.println(inputFile);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
