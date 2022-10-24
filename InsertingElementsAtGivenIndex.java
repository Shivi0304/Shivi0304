class InsertElement {
    public int insert(int[] arr, int index, int key, int size) {


        if(arr.length == size) {
            return -1;
        }
        if(arr == null) {
            return -1;
        }

        if(index >= arr.length) {
            return -1;
        }

        if(index < 0) {
             return -1;
        }

        //Shifting the elements till the insertion index by 1
        for(int i = arr.length - 1; i > index - 1; i--) {
           arr[i] = arr[i-1];
        }
        arr[index-1] = key;
//        int i, j, temp;
//        j = 0;
//        for(i = 0; i < arr.length; i++) {
//            if(i == (index - 1)) {
//                j = arr[i];
//                arr[i] = key;
//            }
//            else if (i > index-1) {
//                temp = arr[i];
//                arr[i] = j;
//                j=temp;
//            }
//        }
        size++;
        return size;
    }
}

public class InsertingElementsAtGivenIndex {


    public static void main(String[] args) {

        int[] arr = new int[4];
        int size = 0;
        for(int i = 0; i < 3; i++) {
           arr[i] = i + 1;
           size++;
        }

        InsertElement ie = new InsertElement();
        int index = 2;
        int key = 20;
        int result = ie.insert(arr,index,key,size);
        if(result == -1) {
            System.out.println("Element can't be inserted");
        }
        else {
            for(int i = 0; i < result; i++) {
                System.out.println(arr[i]);
            }
        }
    }
}
