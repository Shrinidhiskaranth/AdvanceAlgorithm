public class Lab4 {
    public static void main(String[] args) {
        int arr[]={0,0,3,4,0,6};
        int arr1[]=new int[arr.length];
        int l=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr1[l]=arr[i];
                l++;
            }
        }

//        for(int i=l;i<arr1.length;i++){
//            arr1[i]=0;
//        }
        for(int i=0;i<arr1.length;i++){
            System.out.println(arr1[i]);
        }
    }
}
