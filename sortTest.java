import org.junit.Assert;
import org.junit.Test;

public class sortTest {
    Menu m = new Menu();
    sort s = new sort();


//*************************   bubbleSort method

//  first path test in CF testing
    @Test
    public void bubbleSortTest1(){
        int[] arr = {1};
        int[] expected ={1};
        s.bubbleSort(arr);
        Assert.assertArrayEquals(expected,arr);
    }

//  second path test in CF testing
    @Test
    public void bubbleSortTest2(){
        int[] arr = {5,3};
        int[] expected ={3,5};
        s.bubbleSort(arr);
        Assert.assertArrayEquals(expected,arr);
    }

//  third path test in CF testing
    @Test
    public void bubbleSortTest3(){
        int[] arr = {2,5};
        int[] expected ={2,5};
        s.bubbleSort(arr);
        Assert.assertArrayEquals(expected,arr);
    }

//*************************   printArray method

//  first path test in CF testing
    @Test
    public void printArrayTest1(){
        int[] arr = {};
        String expected ="";
        Assert.assertEquals(expected,m.printArray(arr));
    }

//  second path test in CF testing
    @Test
    public void printArrayTest2(){
        int[] arr = {2};
        String expected ="2";
        Assert.assertEquals(expected,m.printArray(arr));
    }

//  third path test in CF testing
    @Test
    public void printArrayTest3(){
        int[] arr = {2,3};
        String expected ="2\t|\t3";
        Assert.assertEquals(expected,m.printArray(arr));
    }

//*************************   insertionSort

//  first path test in CF testing
    @Test
    public void insertionSortTest1(){
        int[] arr = {1};
        int[] expected = {1};
        s.insertionSort(arr);
        Assert.assertArrayEquals(expected,arr);
    }

//  second path test in CF testing
    @Test
    public void insertionSortTest2(){
        int[] arr = {2,3};
        int[] expected = {2,3};
        s.insertionSort(arr);
        Assert.assertArrayEquals(expected,arr);
    }

//  third path test in CF testing
    @Test
    public void insertionSortTest3(){
        int[] arr = {4,2};
        int[] expected = {2,4};
        s.insertionSort(arr);
        Assert.assertArrayEquals(expected,arr);
    }

//*************************   mergeSort method

//  first path test in CF testing
    @Test
    public void MergeSortTest1(){
        int[] arr = {1};
        int size = 1;
        int[] expected = {1};
        s.mergeSort(arr,size);
        Assert.assertArrayEquals(expected,arr);
    }

//  second path test in CF testing
    @Test
    public void MergeSortTest2(){
        int[] arr = {1,2};
        int size = 2;
        int[] expected = {1,2};
        s.mergeSort(arr,size);
        Assert.assertArrayEquals(expected,arr);
    }

//  mutation test
    @Test
    public void MergeSortTest3(){
        int[] arr = {2,1};
        int size = 2;
        int[] expected = {1,2};
        s.mergeSort(arr,size);
        Assert.assertArrayEquals(expected,s.mergeSort(arr,size));
    }

//*************************   options method

//  first path test in CF testing
    @Test
    public void OptionsTest1(){
        int[] arr = {3,2,1};
        int size = 3;
        int select = 1;
        m.options(arr,size,select);
        Assert.assertEquals("1\t|\t2\t|\t3",m.options(arr,size,select));
    }

//  second path test in CF testing
    @Test
    public void OptionsTest2(){
        int[] arr = {2,1};
        int size = 2;
        int select = 2;
        m.options(arr,size,select);
        Assert.assertEquals("1\t|\t2",m.options(arr,size,select));
    }

//  third path test in CF testing
    @Test
    public void OptionsTest3(){
        int[] arr = {5,1,4,2};
        int size = 4;
        int select = 3;
        m.options(arr,size,select);
        Assert.assertEquals("1\t|\t2\t|\t4\t|\t5",m.options(arr,size,select));
    }

//  fourth path test in CF testing
    @Test
    public void OptionsTest4(){
        int[] arr = {2};
        int size = 1;
        int select = 4;
        m.options(arr,size,select);
        Assert.assertEquals("2",m.options(arr,size,select));
    }

//  fifth path test in CF testing
    @Test
    public void OptionsTest5(){
        int[] arr = {1,3,2,1,4};
        int size = 5;
        int select = 9;
        m.options(arr,size,select);
        Assert.assertEquals("Program Ended",m.options(arr,size,select));
    }

//*******************   selectionSort method

//  first path test in CF testing
    @Test
    public void selectionTest1(){
        int[] arr = {1};
        int[] expected = {1};
        s.selectionSort(arr);
        Assert.assertArrayEquals(expected,arr);
    }

//  second path test in CF testing
    @Test
    public void selectionTest2(){
        int[] arr = {1,7};
        int[] expected = {1,7};
        s.selectionSort(arr);
        Assert.assertArrayEquals(expected,arr);
    }

//  third path test in CF testing
    @Test
    public void selectionTest3() {
        int[] arr = {8, 3};
        int[] expected = {3, 8};
        s.selectionSort(arr);
        Assert.assertArrayEquals(expected, arr);
    }
//====================================================================================================================
//                                   Equivalence class partitioning
//           bubble sort
//  class 1: positive arranged numbers

    @Test
    public void bubble_positive_arr(){
        int[] arr = {1,3,5,7};
        int[] expected = {1,3,5,7};
        s.bubbleSort(arr);
        Assert.assertArrayEquals(expected,arr);
    }

//  Class 2: negative arranged numbers
    @Test
    public void bubble_negative_arr(){
        int[] arr = {-20,-10,-5,-2};
        int[] expected = {-20,-10,-5,-2};
        s.bubbleSort(arr);
        Assert.assertArrayEquals(expected,arr);
    }

//  class 3: positive not arranged numbers
    @Test
    public void bubble_positive_notArr(){
        int[] arr = {50,28,48,23,1};
        int[] expected = {1,23,28,48,50};
        s.bubbleSort(arr);
        Assert.assertArrayEquals(expected,arr);
    }

//  class 4: negative not arranged numbers
    @Test
    public void bubble_negative_notArr(){
        int[] arr = {-1,-10,-5,-24};
        int[] expected = {-24,-10,-5,-1};
        s.bubbleSort(arr);
        Assert.assertArrayEquals(expected,arr);
    }

//           selection sort
//  class 1: positive arranged numbers

    @Test
    public void selection_positive_arr(){
        int[] arr = {3,6,7,9};
        int[] expected = {3,6,7,9};
        s.selectionSort(arr);
        Assert.assertArrayEquals(expected,arr);
    }

//  Class 2: negative arranged numbers
    @Test
    public void selection_negative_arr(){
        int[] arr = {-24,-13,-11,-4};
        int[] expected = {-24,-13,-11,-4};
        s.selectionSort(arr);
        Assert.assertArrayEquals(expected,arr);
    }

//  class 3: positive not arranged numbers
    @Test
    public void selection_positive_notArr(){
        int[] arr = {43,84,48,33,24};
        int[] expected = {24,33,43,48,84};
        s.selectionSort(arr);
        Assert.assertArrayEquals(expected,arr);
    }

//  class 4: negative not arranged numbers
    @Test
    public void selection_negative_notArr(){
        int[] arr = {-20,-30,-50,-24};
        int[] expected = {-50,-30,-24,-20};
        s.selectionSort(arr);
        Assert.assertArrayEquals(expected,arr);
    }

    //       insertion sort
//  class 1: positive arranged numbers
    @Test
    public void insertion_positive_arr(){
        int[] arr = {10,23,45,78};
        int[] expected = {10,23,45,78};
        s.insertionSort(arr);
        Assert.assertArrayEquals(expected,arr);
    }

//  Class 2: negative arranged numbers
    @Test
    public void insertion_negative_arr(){
        int[] arr = {-100,-76,-54};
        int[] expected = {-100,-76,-54};
        s.insertionSort(arr);
        Assert.assertArrayEquals(expected,arr);
    }

//  class 3: positive not arranged numbers
    @Test
    public void insertion_positive_notArr(){
        int[] arr = {45,78,23,75,34};
        int[] expected = {23,34,45,75,78};
        s.insertionSort(arr);
        Assert.assertArrayEquals(expected,arr);
    }

//  class 4: negative not arranged numbers
    @Test
    public void insertion_negative_notArr(){
        int[] arr = {-23,-44,-24,-45};
        int[] expected = {-45,-44,-24,-23};
        s.insertionSort(arr);
        Assert.assertArrayEquals(expected,arr);
    }

    //       merge sort
//  class 1: positive arranged numbers

    @Test
    public void merge_positive_arr(){
        int[] arr = {10,20,40,70};
        int[] expected = {10,20,40,70};
        int size=4;
        s.mergeSort(arr,size);
        Assert.assertArrayEquals(expected,arr);
    }

//  Class 2: negative arranged numbers
    @Test
    public void merge_negative_arr(){
        int[] arr = {-132,-46,-24};
        int[] expected = {-132,-46,-24};
        int size=3;
        s.mergeSort(arr,size);
        Assert.assertArrayEquals(expected,arr);
    }

//  class 3: positive not arranged numbers
    @Test
    public void merge_positive_notArr(){
        int[] arr = {40,32,68,21,98};
        int[] expected = {21,32,40,68,98};
        int size=5;
        s.mergeSort(arr,size);
        Assert.assertArrayEquals(expected,arr);
    }

//  class 4: negative not arranged numbers
    @Test
    public void merge_negative_notArr(){
        int[] arr = {-64,-43,-75,-875};
        int[] expected = {-875,-75,-64,-43};
        int size=4;
        s.mergeSort(arr,size);
        Assert.assertArrayEquals(expected,arr);
    }
}