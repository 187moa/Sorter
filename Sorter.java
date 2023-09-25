import java.util.Arrays;

public class Sorter {
    public static void main(String[] args) {
        System.out.println("hala");
        int[] data ={20, 12, 10, 15,2 };
        insertionSort(data);
        System.out.println(Arrays.toString(data));

    }

    public static void insertionSort(int[] array) {
        int n = array.length;
        for (int j = 1; j < n; j++) {
            int key = array[j];
            int i = j - 1;
            while ((i > -1) && (array[i] > key)) {
                array[i + 1] = array[i];
                i--;
            }
            array[i + 1] = key;
        }
    }
}
