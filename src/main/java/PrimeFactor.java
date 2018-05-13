import java.util.ArrayList;

public class PrimeFactor {
    public static void main(String args[]){
        System.out.println(primeConcrete(30));
    }

    public static ArrayList<Integer> primeConcrete(int n){
        ArrayList<Integer> result = new ArrayList<>();
        int current =  n;
        for(int i=2;i<n;i++){
            int temp = current%i;
            if(temp==0){
                result.add(i);
            }
            current = n/i;
        }
        return result;
    }
}
