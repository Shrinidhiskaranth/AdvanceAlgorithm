import java.util.HashSet;

public class Lab3 {
    public static void main(String[] args) {
        int arry[]={4,2,4,5,2,6,7,5};
        HashSet<Integer> set=new HashSet<>();
        for(int i:arry){
            set.add(i);

        }
        System.out.println(set);
    }
}


