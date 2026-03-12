
public class Main {
    public static int numberOfNegativeElements(int[] array,int index) {
        if(index==array.length) {
            return 0;
        }
        if (array[index]<0) {
            return 1+numberOfNegativeElements(array,index+1);
        }
        return numberOfNegativeElements(array,index+1);
    }
    public static void main(String[] args) {
        int[] arr1= {3,2,-1,0,4,-3,7};
        int sonuc1 = numberOfNegativeElements(arr1,0);
        System.out.println("arr1 negatif element sayisi "+ sonuc1);
        int[] arr2= {5,3,-1,-4,6,-8,4,10,-15,75,66};
        int sonuc2 = numberOfNegativeElements(arr2,0);
        System.out.println("arr1 negatif element sayisi "+ sonuc2);
        int[] arr3= {0,-4,4};
        int sonuc3 = numberOfNegativeElements(arr3,0);
        System.out.println("arr1 negatif element sayisi "+ sonuc3);
    }
}