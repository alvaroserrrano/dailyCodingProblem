import java.util.ArrayList;

// Write a function that returns all permutations of a given list
// {1, 2 ,3}
//  ^

class IntegerPermutations {

    public ArrayList<int[]> permutations(int[] array) {
        ArrayList<int[]> results = new ArrayList<int[]>();
        permutations(array, 0, results);
        return results;
    }

    private void permutations(int[] array, int start, ArrayList<int[]> results) {
        // BASE CASE
        if (start >= array.length) {
            results.add(array.clone());
        } else {
            for (int i = start; i < array.length; i++) {
                swap(array, start, i);
                permutations(array, start + 1, results);
                swap(array, start, i);
            }
        }
    }

    private void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}