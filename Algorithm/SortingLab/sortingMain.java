public class SortingLab {
    public static void main(String[] args) {
        Data d1 = new Data(100);
        d1.addNewInfo(507);
        d1.addNewInfo(100);
        d1.addNewInfo(9401);
        d1.addNewInfo(9);
        d1.addNewInfo(40);
        d1.addNewInfo(1200);
        d1.addNewInfo(2195);
        d1.addNewInfo(60);
        d1.addNewInfo(834);
        d1.addNewInfo(25);
        d1.addNewInfo(512);
        d1.addNewInfo(30);
        
        Data d2= new Data(100);
        d2.clone(d1);
//        d1.printAll();
//        d1.selectionSort();
//        d1.printAll();  

        System.out.println("1. Selection Sort: ");
        d2.selectionSort();
        d2.printAll();
        System.out.println("");
        
        Data d3 = new Data(100);
        d3.clone(d1);
        System.out.println("2. Insertion Sort: ");
        d3.insertionSort();
        d3.printAll();
        
        System.out.println("");
      
        Data d4= new Data(100);
        d4.clone(d1);
        System.out.println("3. Bubble Sort: ");
        d4.bubbleSort();
        d4.printAll();
        
        System.out.println(" ");
        Data d5 = new Data(100);
        d5.clone(d1);
        System.out.println("4. Quicksort: ");
        d5.quickSort(0, d5.size-1);
        d5.printAll();
        
        System.out.println("");
        
        Data d6 = new Data(100);
        d6.clone(d1);
        System.out.println("5. Radix Sort: ");
        d6.radixSort();
        d6.printAll();
        
        System.out.println("");
        
        Data d7 = new Data(100);
        d7.clone(d1);
        System.out.println("6. Merge Sort: ");
        d7.mergeSort(0, d7.size-1);
        d7.printAll();
        
        System.out.println("");
        
        Data d8 = new Data(100);
        d8.clone(d1);
        System.out.println("7. Shell Sort: ");
        d8.shellSort();
        d8.printAll();
    }
    
}
