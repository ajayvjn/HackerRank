class Permutation {

    static void combinationUtil(int arr[], int data[], int start,
                                int end, int index, int r)
    {
        if (index == r)
        {
            for (int j=0; j<r; j++)
                System.out.print(data[j]);
            System.out.println("");
            return;
        }

        for (int i=start; i<=end && end-i+1 >= r-index; i++)
        {
            data[index] = arr[i];
            combinationUtil(arr, data, i+1, end, index+1, r);
        }
    }

    static void printCombination(int arr[], int n, int r)
    {
        // A temporary array to store all combination one by one
        int data[]=new int[r];

        // Print all combination using temprary array 'data[]'
        combinationUtil(arr, data, 0, n-1, 0, r);
    }

    public static void main (String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6,7,8,9,10};
        int r = 3;
        int n = arr.length;
        for (int i = 1; i < arr.length; i++) {

            printCombination(arr, n, i);
        }
    }

}