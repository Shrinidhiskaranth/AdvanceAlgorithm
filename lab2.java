import java.util.Hashtable;

public class Lab2 {
    public static void main(String[] args) {
        int[] arr={1,2,3,5,7,8,40,50,88};
        int n =arr.length+1;
        Hashtable<Integer,Boolean> table=new Hashtable<>();
        for(int num:arr){
            table.put(num,true);}
            for(int i=arr[0];i<=arr[arr.length-


                    1];i++){
                if (!table.containsKey(i)) {
                    System.out.println("Missin number is"+i);

                }
                }
            }
        }
