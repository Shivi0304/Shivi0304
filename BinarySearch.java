class FindElement{
    public int find(int a[], int ele){
        if(a == null) {
            return -1;
        }
        if(a.length == 1 ) {
            if(a[0] == ele) {
                return 1;
            } else {
                return -1;
            }
        }

        int i = 0;
        int j = a.length;
        int mid;
        while(i < j) {
            mid = (i+j)/2;
            if(a[mid] == ele) {
                return mid+1;
            } else if(a[mid] > ele){
                j--;
            } else if(a[mid] < ele) {
                i++;
            }
        }
        return -1;
    }
}

public class BinarySearch {
    public static void main(String[] args) {
        int[] a = new int[]{1,4,6,9,10,23,56};
        int ele = 11;
        FindElement findElement = new FindElement();
        System.out.println(findElement.find(a, ele));
    }
}
