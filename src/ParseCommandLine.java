import java.util.Scanner;

public class ParseCommandLine {
    private String[] args;

    ParseCommandLine (String... args) {
        this.args = args;
    }

    public static void messageToUser () {
        System.out.println("Выберите режим сортировки: -a (по возрастанию), -d (по убыванию) \n" +
                "Выберите тип данных для сортировки: -s (сортировка для строк), -i (для целых чисел) \n" +
                "Введите имя выходного файла, а также имена входных файлов для последующей сортировки \n" +
                "Примеры запуска из командной строки для Windows: \n" +
                " -i -a out.txt in.txt (для целых чисел по возрастанию) \n" +
                " -s out.txt in1.txt in2.txt in3.txt (для строк по возрастанию) \n" +
                " -d -s out.txt in1.txt in2.txt (для строк по убыванию) \n");
    }

    void readingCommands () {
        Scanner scanner = new Scanner(System.in);
        String command =
    }

    void parse() {

    }
}
