
import java.util.List;

public class Main {
    public static final String IN1 = "ExampleTxt/in1.txt";
    public static final String IN2 = "ExampleTxt/in2.txt";
    public static final String IN3 = "ExampleTxt/in3.txt";
    public static final String IN4 = "ExampleTxt/in4.txt";
    public static final String IN5 = "ExampleTxt/in5.txt";
    public static final String IN6 = "ExampleTxt/in6.txt";
    public static void main(String[] args) {
        System.out.println(printOnScreen(IN1 , IN2 , IN3));

    }
    private static List<String> printOnScreen(String path1, String path2, String path3) {
        List<String> in1 = ReadFileLineByLine.readFileLineByLine(path1);
        List<String> in2 = ReadFileLineByLine.readFileLineByLine(path2);
        List<String> in3 = ReadFileLineByLine.readFileLineByLine(path3);
        MergeSort mergeSort = new MergeSort(in1 , in2 , in3);

        return mergeSort.getMergeSort();
    }

}


