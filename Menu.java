import java.util.Scanner;

public class Menu {
        static Scanner sc = new Scanner(System.in);

//      method to input elements to the array
        public void inputArray(int[] array){
            Scanner input = new Scanner(System.in);
            System.out.println("Enter " + array.length + " numbers: ");
            for (int i = 0; i<array.length; i++) {
                System.out.print((i+1) + ". ") ;
                array[i] = input.nextInt();
            }
        }

//      method to print the elements of the array
        public String printArray(int[] array){
            String s="";
            for (int i = 0; i < array.length; i++) {
                s=s+ String.valueOf(array[i]);
                if (i<(array.length - 1))
                s=s+"\t|\t";
            }
            return s;
        }

//      method of the menu options to be chosen
        public String options(int [] array, int size, int select) {
            String s;
            int sp;
            Menu m = new Menu();
            sort sort = new sort();

            sp = select;
            switch (sp) {
                case 1:
                    // Bubble sort
                    System.out.println(m.printArray(sort.bubbleSort(array)));
                    s=m.printArray(sort.bubbleSort(array));
                    break;
                case 2:
                    // Insertion sort
                    System.out.println(m.printArray(sort.insertionSort(array)));
                    s=m.printArray(sort.insertionSort(array));
                    break;
                case 3:
                    // Merge sort
                    System.out.println(m.printArray(sort.mergeSort(array,size)));
                    s=m.printArray(sort.mergeSort(array,size));
                    break;
                case 4:
                    // Selection sort
                    System.out.println(m.printArray(sort.selectionSort(array)));
                    s=m.printArray(sort.selectionSort(array));
                    break;
                default:
                    System.out.println("Program Ended");
                    s="Program Ended";
                    //System.exit(0);
                    break;
            }
           return s;
        }

//      Main
        public static void main(String[] args) {
            Menu m = new Menu();
            System.out.print("How many numbers? ");
            int size = sc.nextInt();
            int[] array = new int[size];
            m.inputArray(array);
            System.out.println("Please Select an option below:");
            System.out.println("================================");
            System.out.println("Press 1 for Bubble ");
            System.out.println("Press 2 for Insertion ");
            System.out.println("Press 3 for Merge ");
            System.out.println("Press 4 for Selection ");
            System.out.println("Press any key to Exit");
            System.out.println("================================");
            System.out.println("choose on of the above : ");
            int select = sc.nextInt();
            m.options(array,size,select);

        }
}
