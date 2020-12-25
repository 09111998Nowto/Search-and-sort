package TKXS;

public class SapXepNoibot {
    public static <T extends Comparable<T>> void bubbleSort(T[] data) {
        int position, scan;
        T temp;
        for (position = data.length - 1; position >= 0; position--) {
            for (scan = 0; scan <= position - 1; scan++) {
                if (data[scan].compareTo(data[scan + 1]) > 0)
                    swap(data, scan, scan + 1);
            }
        }
    }

    private static <T extends Comparable<T>> void swap(T[] data, int index1, int index2) {
        T temp = data[index1];
        data[index1] = data[index2];
        data[index2] = temp;
    }
    public static void main(String[] args) {
        Integer[] A={2,1,0,4,7,2};
        SapXepNoibot ob= new SapXepNoibot();
        ob.bubbleSort(A);
        for (int i = 0; i < A.length; i++) {
            System.out.print(" "+A[i]);
        }
    }
}
