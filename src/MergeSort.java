import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class MergeSort {
    List<String> in1;
    List<String> in2;
    List<String> in3;
    List<String> in123;

    public MergeSort (List<String> in1 , List<String> in2 , List<String> in3) {
        this.in1 = in1;
        this.in2 = in2;
        this.in3 = in3;
    }

    private static List<String> mergeTwoLists (List<String> array1 , List<String> array2) {
        List<String> sortedList = new ArrayList<>();
        int i = 0;

        while (array1 != null && array2 != null) {
            if (array1.get(i).) {
                sortedList.add(array1.get(i));
            }
            else {
                sortedList.add(array2.get(i));
            }
            i++;
        }
        return sortedList;
    }

    public List<String> getMergeSort () {
        List<String> midList = new ArrayList<>();
        midList.addAll(mergeTwoLists(in1 , in2));
        in123.addAll(mergeTwoLists(midList , in3));
        return in123;
    }
}
