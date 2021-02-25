import java.io.IOException;

public class TestingInput {
    public static void main(String[] args) {
        try {
            InputFile inputFile = InputFile.read("Data/a.txt");
            System.out.println(inputFile);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
