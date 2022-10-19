 class InsertElement {
    public int[] insert(int[] arr, int index, int key) {

        if(index > arr.length + 1) {
            return arr;
        }

        int[] newArr = new int[arr.length + 1];
        int temp;

        //Copy the elements to new Array
        for(int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }

        //Shifting the elements till the insertion index by 1
        for(int i = newArr.length - 1; i > index - 1; i--) {
           newArr[i] = newArr[i-1];
        }
        newArr[index-1] = key;
        return newArr;
    }
}

public class InsertingElementsAtGivenIndex {


    public static void main(String[] args) {
        int[] arr = {2,7,1,5,9,100,45,23};
        int index = 10;
        int key = 10;
        InsertElement insertElement = new InsertElement();
        arr = insertElement.insert(arr, index, key);
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
