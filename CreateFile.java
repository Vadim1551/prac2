import java.io.FileWriter;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("output.txt");
            fileWriter.write("Hello world");
            fileWriter.close();
            System.out.println("Файл успешно создан.");
        } catch (IOException e) {
            System.out.println("Произошла ошибка при создании файла: " + e.getMessage());
        }
    }
}
