class Intersection {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 4, 5, 6, 7};
        int ans[] = new int[Math.min(arr1.length, arr2.length)];

        System.out.println("Intersection of the two arrays:");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    ans[i] = arr1[i];
                    System.out.print(ans[i] + " ");
                    break;
                }
            }
        }
    }
}