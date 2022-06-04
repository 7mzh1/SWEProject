public class sort {

//  bubble sort Method
    int[] bubbleSort (int array[]){
        int temp ;
        for (int i = 0; i < ( array.length -1 ); i++) {
            for (int j = 0; j < array.length - i -1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }

//  merge sort Method
    int[] mergeSort(int array[], int size){
        if (size<2)
            return array;

        int middle = size/2 ;
        int l[] = new int [middle] ;
        int r[] = new int [size - middle] ;

        for (int i=0; i<middle; i++)
            l[i] = array[i] ;
        for (int i=middle ; i<size; i++)
            r[i-middle] = array[i] ;

        mergeSort(l, middle) ;
        mergeSort(r, size - middle) ;

        merge(array, l, r, middle, size-middle) ;
        return array;
    }

//  divide Method of merge sort
    void merge(int array[], int l[], int r[], int left, int right){
        int i=0, j=0, k=0 ;
        while (i<left && j<right){
            if (l[i] <= r[j])
                array[k++] = l[i++] ;
            else
                array[k++] = r[j++] ;
        }
        while (i<left)
            array[k++] = l[i++] ;
        while (j<right)
            array[k++] = r[j++] ;
    }

//  selection sort Method
    int[] selectionSort(int[] array){
        int min, temp ;
        for (int i=0; i<array.length-1; i++){
            min = i ;
            for (int j=i+1; j<array.length; j++)
                if (array[j]<array[min])
                    min = j ;
            temp = array[min] ;
            array[min] = array[i] ;
            array[i] = temp ;
        }
        return array;
    }

//  insertion sort Method
    public int[] insertionSort(int[] array) {
        for (int j = 1; j < array.length; j++) {
            int key = array[j];
            int i = j - 1;
            while ((i > -1) && (array[i] > key)) {
                array[i + 1] = array[i];
                i--;
            }
            array[i + 1] = key;
        }
        return array;
    }
}
