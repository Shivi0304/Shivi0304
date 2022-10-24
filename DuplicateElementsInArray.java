import java.util.HashMap;
import java.util.Map;

class FindUsingMaxArray {

    int findMax(int[] a){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < a.length; i++) {
            if(a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }
    public int find(int[] a) {
        if(a == null) {
            return -1;
        }
        if(a.length == 1) {
            return -1;
        }
        int max = findMax(a);
        int[] countArray = new int[max+1];
        for(int i = 0; i < a.length; i++) {
            countArray[a[i]]++;
        }
        for(int i = 0; i < max; i++){
            if(countArray[i] == 2) {
                System.out.println(i);
            }
        }

        return 0;


    }
}
class FindUsingHashMap {
    public void find(int[] a) {
        Map<Integer,Integer> countMap = new HashMap<>();
        for(int i : a) {
            if(countMap.get(i) == null) {
                countMap.put(i, 1);
            } else{
                int count = countMap.get(i);
                countMap.put(i,count+1);
            }
        }
        for(int i : countMap.keySet()){
            if(countMap.get(i) == 2) {
                System.out.println(i);
            }
        }
    }
}

public class DuplicateElements {
    public static void main(String[] args) {
        int[] a = new int[]{3,1,6,2,8,2,3};
       FindUsingHashMap findUsingHashMap = new FindUsingHashMap();
       findUsingHashMap.find(a);
       FindUsingMaxArray findUsingMaxArray = new FindUsingMaxArray();
       findUsingMaxArray.find(a);

    }
}
