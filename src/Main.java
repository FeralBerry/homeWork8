import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        // Объявите три массива:
        // Целочисленный массив, заполненный тремя цифрами — 1, 2 и 3 — с помощью ключевого слова new
        int i;
        int[] number = new int[3];
        number[0] = 1;
        number[1] = 2;
        number[2] = 3;
        for(i = 0; i < number.length;i++){
            System.out.println("Значение ячейки массива "+i+ ": " + number[i]);
        }
        System.out.println();
        // Массив, в котором можно хранить три дробных числа — 1.57, 7.654, 9.986. Массив сразу заполните значениями.
        float[] floatNumber = new float[3];
        floatNumber[0] = 1.57f;
        floatNumber[1] = 7.654f;
        floatNumber[2] = 9.986f;
        for(i = 0; i < floatNumber.length;i++){
            System.out.println("Значение ячейки массива "+i+ ": " + floatNumber[i]);
        }
        System.out.println();
        // Произвольный массив. Тип и количество данных определите сами. Самостоятельно выберите способ создания массива: с помощью ключевого слова или сразу заполненный элементами.
        Random rnd = new Random();
        int[] array = new int[rnd.nextInt(10)];
        for(i = 0; i < array.length;i++){
            array[i] = rnd.nextInt(1000);
        }
        System.out.println("\nЗадача 2");
        // Распечатайте на отдельной строчке элементы каждого массива по порядку через запятую.
        // В конце строки запятую ставить не надо.
        float[] arrResult = new float[number.length];
        for(i = 0; i < number.length;i++){
            arrResult[i] = (float) number[i];
        }
        upArray(arrResult);
        upArray(floatNumber);
        float[] arrRes = new float[array.length];
        for(i = 0; i < array.length;i++){
            arrRes[i] = (float) array[i];
        }
        upArray(arrRes);
        System.out.println("\nЗадача 3");
        // Распечатайте на отдельной строчке элементы каждого массива в обратном порядке через запятую.
        // В конце строки запятую ставить не надо.
        // Если в задаче 2 в консоль у вас вывелся результат:
        // 1, 2, 3
        // 1.57, 7.654, 9.986
        // Произвольные элементы третьего массива
        // то в этой задаче результат должен быть таким:
        // 3, 2, 1
        // 9.986, 7.654, 1.57
        // Произвольные элементы третьего массива в обратном порядке
        for(i = 0; i < number.length;i++){
            arrResult[i] = (float) number[i];
        }
        downArray(arrResult);
        downArray(floatNumber);
        for(i = 0; i < array.length;i++){
            arrRes[i] = (float) array[i];
        }
        downArray(arrRes);
        System.out.println("\nЗадача 4");
        // Пройдитесь по первому целочисленному массиву и все нечетные числа в нем сделайте четными (нужно прибавить 1).
        // Важно: код должен работать с любым целочисленным массивом, поэтому для решения задания используйте циклы.
        // Распечатайте результат преобразования в консоль.
        evenNumbers(number);
    }
    public static void upArray(float[] arr){
        for(int i = 0; i < arr.length;i++){
            if(i != arr.length -1){
                System.out.print(arr[i] + ", ");
            } else {
                System.out.print(arr[i]);
                System.out.println();
            }
        }
    }
    public static void downArray(float[] arr){
        for(int i = arr.length -1; i >= 0;i--){
            if(i != 0){
                System.out.print(arr[i] + ", ");
            } else {
                System.out.print(arr[i]);
                System.out.println();
            }
        }
    }
    public static void evenNumbers(int[] arr){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 1){
                arr[i] = arr[i] + 1;
            }
            System.out.print(arr[i] + " ");
        }
    }
}