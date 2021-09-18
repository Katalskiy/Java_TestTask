
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MergeSort {
    List<String> in1;
    List<String> in2;
    List<String> in3;

    public MergeSort (List<String> in1 , List<String> in2 , List<String> in3) {
        this.in1 = in1;
        this.in2 = in2;
        this.in3 = in3;
    }

    private static List<String> mergeTwoListsAscending (List<String> array1 , List<String> array2) {
        List<String> sortedList = new ArrayList<>();

        int i = 0;
        int k = 0;

        while (i < array1.size() && k < array2.size()) {
            if (compareListIntegerAscending(array1.get(i) , array2.get(k)) > 0) {
                sortedList.add(array1.get(i));
                i++;
            }
            else {
                sortedList.add(array2.get(k));
                k++;
            }
        }

        while (i < array1.size() || k < array2.size()) {
            if (i < array1.size()) {
                sortedList.add(array1.get(i));
                i++;
            } else {
                sortedList.add(array2.get(k));
                k++;
            }
        }

        return sortedList;
    }

    private static List<String> mergeTwoListsDescending(List<String> array1 , List<String> array2) {
        List<String> sortedList = new ArrayList<>();

        int i = array1.size() ;
        int k = array2.size() ;

        while (i > 0  && k > 0) {
            if (compareListIntegerDescending(array1.get(i) , array2.get(k)) > 0) {
                sortedList.add(array1.get(i));
                i--;
            }
            else {
                sortedList.add(array2.get(k));
                k--;
            }
        }

        while (i > 0  && k > 0) {
            if (i < array1.size()) {
                sortedList.add(array1.get(i));
                i++;
            } else {
                sortedList.add(array2.get(k));
                k++;
            }
        }

        return sortedList;
    }

    private static int compareListIntegerAscending(String list1 , String list2) {
        int a = Integer.parseInt(list1);
        int b = Integer.parseInt(list2);
        if ((a - b) == 0 || (a - b) > 0) {
            return -1;
        }
        else {
            return 1;
        }
    }

    private static int compareListIntegerDescending(String list1 , String list2) {
        int a = Integer.parseInt(list1);
        int b = Integer.parseInt(list2);
        if ((a - b) == 0 || (a - b) > 0) {
            return 1;
        }
        else {
            return -1;
        }
    }

    public List<String> getMergeSort () {
        return mergeTwoListsAscending(in1 , in2);
    }
}
