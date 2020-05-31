/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quicksort;

/**
 *
 * @author stive
 */
public class QuickSort {

    /**
     * @param args the command line arguments
     */
    public  void quickSort(int[] A, int ini, int fin) {
        if(ini>=fin) return;
        int piv=fin;
        int i = ini;
        int j = fin-1;
        while(i<=j){
            while(i<=j && A[i]<=A[piv])
                i++;
            while(i<=j && A[j]>=A[piv])
                j--;
            if(i<=j)
                this.swap(A, i, j);
        }
        swap(A, i, piv);
        quickSort(A, ini, i-1);
        quickSort(A, i+1, fin);
    }

    private void swap(int[] A, int i, int j) {
        int aux = A[i];
        A[i] = A[j];
        A[j] = aux;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        QuickSort q = new QuickSort();
        int[] array = new int[50];
        for(int i = 0; i <array.length; i++){
            array[i] = (int) (Math.random()*100+1);
            System.out.print(array[i]+ "-");
        }
        q.quickSort(array, 0, array.length-1);
        System.out.println("\nSORT");
        for(int i = 0; i <array.length; i++){
            System.out.print(array[i]+ "-");
        }
    }

}
