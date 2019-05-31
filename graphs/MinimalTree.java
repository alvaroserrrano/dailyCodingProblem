// Given a sorted(increasing order) array with unique integer elements, write an algorithm to create a binary search tree with minimal height

//PROCEDURE
// Insert into the tree the middle elements
// Insert into th left subtree the left subarray elements
// Insert into th right subtree the right subarray elements
// Recurse
class MinimalTree {
    TreeNode createMinimalBST(int array[]) {
        return createMinimalBST(int arr [], int start, int end){
            if(end < start) return null;
            int middle = (start + end) / 2;
            TreeNode n = new TreeNode(arr[middle]);
            n.left = createMinimalBST(arr, start, mid-1);
            n.right = createMinimalBST(arr, mid+1, end);
            return n;
        }
    }
}