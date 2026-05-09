 class LeftRotatebyKplaces{
    public static void main(String [] args){
        int nums[] = {1,2,3,4,5,6,7};
        int n = nums.length;
        int k = 4;
        k=k%n;
        int temp[] = new int[n];

        for(int i = 0; i < k; i++ ){
            temp[i]= nums[i]; //inserting  k elements in temp array
        }

        for(int i = k; i < n; i++ ){
            nums[i-k]= nums[i];// shifting elements
        }
        //now inserting the temp elements in the end of array
        int idx = 0;
        for(int i = n-k; i < n ; i++ ){
            nums[i]= temp[idx];
            idx++;
        }


        for(int i = 0; i < n ; i++ ){
            System.out.print(nums[i]+ " ");
        }

    }
}