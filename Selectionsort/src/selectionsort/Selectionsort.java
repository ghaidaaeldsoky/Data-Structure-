
package selectionsort;

public class Selectionsort {

    
    public static void main(String[] args) {
       int[] arr={5,4,3,2,1};
        for (int i=0;i<5-1;i++) {
            int min=i;
            for (int j=i+1 ;j<5;j++) {
                if (arr[j]<arr[min]) {
                    min=j;
                    int temp=arr[min];
                    arr[min]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        for (int i=0 ; i<5;i++) {
            System.out.println(arr[i]);
        }
    }
    
}
