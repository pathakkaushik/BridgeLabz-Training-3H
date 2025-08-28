public class maxinteger {
    public static void main(String[] args) {
        int arr[]={12,56,78,34};
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[i-1]){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
