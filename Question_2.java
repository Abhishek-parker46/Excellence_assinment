public class Question_2 {
    public static void main(String[] args) {
        int[] arr1 = {0,0,1,1,0,0,0,1,0,0,1,1,1,0};
        int[] arr2 = {1,0,0,0,0,1,0,0,0,1};

        System.out.println("Max number of consecutive 1's is "+consecutive(arr1));
        System.out.println("Max number of consecutive 1's is "+consecutive(arr2));
    }

    public static int consecutive(int[] arr){
        int count = 0, max = 0;

        for(int i=0; i<arr.length; i++){
            if(arr[i]==0){
                count = 0;
            }else {
                count++;
                max = count > max ? count : max;
            }
        }
        return max;
    }
}
