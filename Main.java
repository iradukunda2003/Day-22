import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Integer[] intArray1 = {1, 2, 3};
        Integer[] intArray2 = {4, 5, 6};

        Integer[] mergedIntegers =
                GenericArrayUtility.mergeArrays(intArray1, intArray2);

        System.out.println("Merged Integer Array: "
                + Arrays.toString(mergedIntegers));

        String[] stringArray1 = {"Orange", "Watermelon"};
        String[] stringArray2 = {"Apple", "Mango"};

        String[] mergedStrings =
                GenericArrayUtility.mergeArrays(stringArray1, stringArray2);

        System.out.println("Merged String Array: "
                + Arrays.toString(mergedStrings));
    }
}