/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubble2;

/**
 *
 * @author hp
 */
public class Bubble2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int arr[] = new int[]{1,2,3,4,5};
        for (int i=0 ; i<5-1 ; i++ ) {
            
            for (int j=0 ; j<5-i-1 ; j++) {
                if (arr[j] < arr[j+1]) {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        
        for (int i=0;i<5;i++) {
            System.out.println(arr[i]) ;
        }
    }
    
}
