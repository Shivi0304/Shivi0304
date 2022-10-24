class FindEle{
    int binarySearch(int[] a, int i, int j, int ele) {
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

    public int find(int[] a, int ele) {

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
        int firstEle = a[0];
        int pivot = 0;
        for(int i = 0; i < a.length - 1; i++) {
            if(a[i+1] < a[i]) {
             pivot = i + 1;
            }
        }
        System.out.println("pivot:" + pivot);
        if(ele == a[pivot]) {
            return pivot + 1;
        } else if(ele == firstEle) {
            return 1;
        } else if(ele > a[pivot - 1]) {
            return -1;
        }else if(ele > firstEle && ele < a[pivot - 1]) {
            return binarySearch(a,0,pivot-1, ele);
        } else if(ele == a[a.length - 1]) {
            return a.length;
        } else if(ele > a[pivot] && ele < a[a.length - 1]) {
            return binarySearch(a,pivot,a.length - 1, ele);
        } else {
            return -1;
        }
    }
}

public class BinarySearchRotatedSortedArray {
    public static void main(String[] args) {
        int[] a = new int[]{4,5,6,8,10,11,1,2,3};
        int ele = 1;
        FindEle findEle = new FindEle();
        System.out.println(findEle.find(a, ele));

    }
}
