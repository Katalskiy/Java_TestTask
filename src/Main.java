
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static final String IN1 = "ExampleTxt/in1.txt";
    public static final String IN2 = "ExampleTxt/in2.txt";
    public static final String IN3 = "ExampleTxt/in3.txt";
    public static final String IN4 = "ExampleTxt/in4.txt";
    public static final String IN5 = "ExampleTxt/in5.txt";
    public static final String IN6 = "ExampleTxt/in6.txt";

    public static void main(String[] args) {
        messageToUser();

    }

    private static void messageToUser () {
        System.out.println("Выберите режим сортировки: -a (по возрастанию), -d (по убыванию) \n" +
                "Выберите тип данных для сортировки: -s (сортировка для строк), -i (для целых чисел) \n" +
                "Введите имя выходного файла, а также имена входных файлов для последующей сортировки \n" +
                "Примеры запуска из командной строки для Windows: \n" +
                "sort-it.exe -i -a out.txt in1.txt in2.txt in3.txt (для целых чисел по возрастанию) \n");
    }

    private static void saveFile (List<String> array , String outputNameFile) {
        try {
            Files.write(Paths.get("OutTxt/" + outputNameFile) , array , StandardOpenOption.CREATE);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


