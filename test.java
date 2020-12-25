// package TKXS;

public class test {
    public static <T extends Comparable<T>> void selectionSort(T[] data) {
        int min;
        T temp;

        for (int index = 0; index < data.length - 1; index++) {
            min = index;
            for (int scan = index + 1; scan < data.length; scan++)
                if (data[scan].compareTo(data[min]) < 0)
                    min = scan;
            swap(data, min, index);
        }
    }

    private static <T extends Comparable<T>> void swap(T[] data, int index1, int index2) {
        T temp = data[index1];
        data[index1] = data[index2];
        data[index2] = temp;
    }
    public static void main(String[] args) {
        Integer arr[] = { 12, 11, 13, 5, 6 }; 
        test ob= new test();
        ob.selectionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
