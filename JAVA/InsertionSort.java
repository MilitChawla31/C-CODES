//INSERTION SORT

public class InsertionSort{
    
    public static void insertionSort(int array[]){
        int n = array.length;
        for(int i=1; i<n; i++){
            int c = array[i];
            int j = i-1;
            while((j>-1)&&(array[j]>c)){
                array[j+1] = array[j];
                j = j-1;
            }
            array[j+1] = c;
        } 
    }

    public static void main(String[] args) {
        int[] arr = {9,32,23,5,11,98};
        System.out.println("BEFORE INSERTION SORT");
        for(int i: arr){
            System.out.print(i+" ");
        }
        System.out.println();
        insertionSort(arr);
        System.out.println("AFTER INSERTION SORT");
        for(int i: arr){
            System.out.print(i+" ");     
        }
    }
}
