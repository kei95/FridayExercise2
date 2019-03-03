package Arrays;

public class GivingArrayBunchOfValuesOnce {
    public static void main( String[] args ) {
        String[] arr1 = { "alpha", "bravo", "charlie", "delta", "echo"};

        System.out.print("The first array is filled with the following values:\n\t");
        for ( int i=0; i<arr1.length; i++ )
            System.out.print( arr1[i] + " " );
        System.out.println();

        Integer[] arr2 = { 11, 24, 22, 45, 100};

        System.out.print("The second array is filled with the following values:\n\t");
        for( int i=0; i<arr2.length; i++)
            System.out.print( arr2[i] + " ");
        System.out.println();
    }
}