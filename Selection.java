package TKXS;

public class Selection {
    public static <T extends Comparable<T>> void seletionSort (T[] data){
        int min;
        T temp;
        for (int i =0; i<data.length-1;i++) {
            min=i;
            for (int scan = i+1; scan< data.length; scan++) {
                if (data[scan].compareTo(data[min]<0)) {
                    min =scan;
                
                swap(data, min, i);
                }
            }
        }
    }
private static <T extends Comparable<T>> void swap(T[] data,int i1,int i2){
    T temp =data[i1];
    data[i1]=data[i2];
    data[i2]=temp;
}
    public static void main(String[] args) {
        // int[] arr={1,2,3,4,5};
        // System.out.println(arr.length-1); 
    }
        

}
