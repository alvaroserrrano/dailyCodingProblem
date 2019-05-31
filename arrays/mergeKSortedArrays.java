import java.util.PriorityQueue;

// Given k sorted arrays, merge them into a single sorted array.
// Merge ({{1, 4, 7}, {2, 5, 8}, {3, 6, 9}})
// {1, 2, 3, 4, 5, 6, 7, 8, 9}
// ----------------------------------------------------------------
// Make an array and sort it
// kn * log(kn)
// ----------------------------------------------------------------
// {1, 4, 7}
// {2, 5, 8}
// {3, 6, 9}
// kn * k
// ----------------------------------------------------------------
// Adding and removing from priority queue
// kn * log(k)
class mergeSortedArrays {
    private class QueueNode implements Comparable<QueueNode> {
        int array; // index of the array;
        int index; // index in the array;
        int value; // value

        public QueueNode(int array, int index, int value) {
            this.array = array;
            this.index = index;
            this.value = value;
        }

        public int compareTo(QueueNode n) {
            if (value > n.value)
                return 1;
            if (value < n.value)
                return -1;
            return 0;
        }
    }

    public int[] merge(int[][] arrays) {
        PriorityQueue<QueueNode> pq = new PriorityQueue<QueueNode>();
        int size = 0;
        for (int i = 0; i < arrays.length; i++) {
            size += arrays[i].length;
            if (arrays[i].length > 0) {
                pq.add(new QueueNode(i, 0, arrays[i][0]));
            }
        }
        int[] result = new int[size];
        for (int i = 0; !pq.isEmpty(); i++) {
            QueueNode n = pq.poll();
            result[i] = n.value;
            int newIndex = n.index + 1;
            if (newIndex < arrays[n.array].length) {
                pq.add(new QueueNode(n.array, newIndex, arrays[n.array][newIndex]));
            }
        }
        return result;
    }
}