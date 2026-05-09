public class Trappedwater {
    public static void main(String[] args) {
        int arr [] = {4,2,0,6,3,2,5};
		int n = arr.length;
        int width = 1;

		int left []= new int[n]; //left boundary
		left[0]= arr[0];
		
		
		int right []= new int[n];//right boundary
		right[n-1]= arr[n-1];
		
		//calculating left boundary 
		for(int i  = 1;i<n;i++){
		    left[i] = Math.max(left[i-1],arr[i]);
		}

		//calculating right boundary 
		for(int i = n-2;i>=0;i--){
		    right[i]= Math.max(right[i+1],arr[i]);
		}
        
		int trappedwater = 0;
		//calculating water level 
		for(int i = 0;i<n;i++){
		    int waterlevel = Math.min(left[i],right[i]);
		    trappedwater+= waterlevel-arr[i]*width;
		}
		
	 System.out.println("total trappedwater is " + trappedwater);
    }
}