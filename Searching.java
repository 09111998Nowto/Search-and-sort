package TKXS;

/**
 * Searching demonstrates various search algorithms on an array of objects.
 *
 * @author Java Foundations
 * @version 4.0
 */
public class Searching {
    /**
     * Searches the specified array of objects using a linear search algorithm.
     *
     * @param data   the array to be searched
     * @param min    the integer representation of the minimum value
     * @param max    the integer representation of the maximum value
     * @param target the element being searched for
     * @return true if the desired element is found
     */
    public static <T> boolean linearSearch(T[] data, int min, int max, T target) {
        int index = min;
        boolean found = false;

        while (!found && index <= max) {
            found = data[index].equals(target);
            index++;
        }
        System.out.println(index);
        return found;
    }   

    public static void main(String[] args) {
        Integer[] a = { 10, 20, 30, 50, 70, 90 };
        int target = 50;
        int min = 1;
        int max = 6;
        System.out.println(linearSearch(a, min, max, target));
    }
}
