import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        numberOne();
        numberTwo();
    }

    public static void numberOne() {
        Object[] array = new Object[12];
        array[0] = 1;
        for (int i = 0; i < array.length; i++) {
            array[i] = i * 3 + 1;
        }
        System.out.println(Arrays.toString(array));
        //хотим поменять местами второй и девятый элементы
        Object temp = array[1];
        array[1] = array[8];
        array[8] = temp;
        System.out.println(Arrays.toString(array));
    }

    public static void numberTwo(){
        String[] stringArray = { "a", "b", "c", "d", "e" };
        ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(stringArray));
        System.out.println(arrayList);
    }

}
