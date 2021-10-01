import java.util.Arrays;
import java.util.List;
public class Main {
    
        public static void main(String[] args) {

            // Задача 1. Написать метод, который меняет два элемента массива местами.
            // (массив может быть любого ссылочного типа);**
            String[] arr = {"456", "hjf", "444", "123"};


            System.out.println("Task 1\n" + Arrays.toString(arr));
            swapElements(arr, 2, 3);
            System.out.println(Arrays.toString(arr));


            //Задача 2. Написать метод, который преобразует массив в ArrayList
            List<String> list = convertToList(arr);
            System.out.println("Task 2\n" + list.getClass() + " : " + list);

        }

    private static <T> void swapElements(T[] array, int index1, int index2) {
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    private static <E> List<E> convertToList(E[] array) {
        return Arrays.asList(array);
    }
    }
