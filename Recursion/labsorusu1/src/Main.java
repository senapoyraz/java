public class Main {
    public static int sumOfOddNumbers(int[] array, int index) {
        if(index==array.length) {
            return 0;
        }
        if(array[index]%2 !=0) {
            return array[index]+ sumOfOddNumbers(array,index+1);
        }
        return sumOfOddNumbers(array,index+1);
    }
    public static void main(String[] args) {
        int[] arr1= {3,2,-1,0,4,-3,7};
        int sonuc1=sumOfOddNumbers(arr1,0);
        System.out.println("arr1 tek sayilarin toplami "+ sonuc1);
        int[] arr2= {5,3,-1,-4,6,-8,4,10,-15,75,66};
        int sonuc2=sumOfOddNumbers(arr2,0);
        System.out.println("arr1 tek sayilarin toplami "+ sonuc2);
        int[] arr3= {0,-4,4};
        int sonuc3=sumOfOddNumbers(arr3,0);
        System.out.println("arr1 tek sayilarin toplami "+ sonuc3);
    }
}
