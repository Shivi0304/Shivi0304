class SortArray {

    int sort(int i, int j, int[] a, int num) {
        while ( j < a.length) {
            if (a[j] != num) {
                j++;
            }
            else if(a[j] == num) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j++;
            }
        }
        return i;
    }
    public int sort1(int[] a){

        if(a == null) {
            return -1;
        }
        if(a.length == 1) {
            return 0;
        }
        int i = 0, j = 0;

        //Sort 0
        i = sort(i,j,a,0);

        //Sort 1
        j = i;
        i = sort(i,j,a,1);

        //Sort 2
        j = i;
        sort(i,j,a,2);

        return 0;
    }

    public int sort(int[] a) {

        if(a == null) {
            return -1;
        }
        if(a.length == 1) {
            return 0;
        }

        int i = 0;
         int j = a.length - 1;
         int k = a.length - 1;
        while(i < j) {

            //1-1, 0-0, 2-2
            if(a[j] - a[i] == 0) {

                //2-2
                if(a[j] == 2) {
                    k=k-1;
                    j--;
                }
                //0-0
                else if(a[j] == 0) {
                    i++;
                }
                //1-1
                else if(a[j] == 1) {
                    if(a[j-1] <= a[j]) {
                        j--;
                    } else {
                        int temp = a[k];
                        a[k]=a[j-1];
                        a[j-1]=temp;
                        k=k-1;
                        j--;
                    }
                }
            }
            //2-1, 1-0
            else if(a[j] - a[i] == 1) {
                //2-1
                if(a[j] == 2 && j != k-1) {
                    int temp = a[k];
                    a[k]=a[j];
                    a[j]=temp;
                    k=k-1;
                    j--;
                }

                //1-0
                else if(a[j] == 1){
                    i++;
                }
            }
            //2-0
            else if(a[j] - a[i] == 2){
                k = j;
                j--;
            }
            //0-2
            else if(a[j] - a[i] == -2) {
                int temp = a[j];
                a[j] = a[i];
                a[i] = temp;
                k=k-1;
                j--;
            }
            //1-2, 0-1
            else if(a[j] - a[i] == -1) {
                int temp = a[j];
                a[j] = a[i];
                a[i] = temp;

                //1-2
                if(a[j] == 2) {
                    int t = a[k];
                    a[k] = a[j];
                    a[j] = t;
                    k=k-1;
                    j--;
                }

                //0-1
                else{
                    i++;
                }
            }

        }
        return 0;
    }
}
public class ArraySort012 {
    public static void main(String args[]) {
        int[] a = new int[]{1,2,1};
        SortArray sortArray = new SortArray();
        int res1 =sortArray.sort1(a);
        int res2 =sortArray.sort(a);
        if(res1 >=0 || res2 >= 0) {
            int i = 0;
            while(i < a.length){
                System.out.print(a[i]);
                i++;
            }
        }

    }
}
