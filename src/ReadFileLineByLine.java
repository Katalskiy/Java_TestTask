import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReadFileLineByLine {

    public static List<String> readFileLineByLine(String path) {
        List<String> allLine = new ArrayList<>();
        try {
            List<String> lines = Files.readAllLines(Paths.get(path));
            for (String line : lines) {
                String[] fragments = line.split("\n");
                allLine.addAll(Arrays.asList(fragments));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return allLine;
    }
}
