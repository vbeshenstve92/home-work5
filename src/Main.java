public class Main {

    // ### Задание 1
    //Выведите в одну строку через пробел числа от 1 до 10, используя цикл while.
    //На следующей строке выведите числа в обратном порядке от 10 до 1, используя оператор for.
    //Для обоих циклов можно использовать как одну общую переменную, так и в каждом цикле свою.
    //Не забудьте выполнить переход на новую строку между двумя циклами.
    //В результате программы вывод должен получиться следующий:
    //1 2 3 4 5 6 7 8 9 10
    //10 9 8 7 6 5 4 3 2 1



    public static void main(String[] args) { task1();}

    public static void task1() {
        int currentNum = 0;
        while (currentNum < 10) {
            System.out.print(++ currentNum + " ");
        }
        System.out.println();

        for(; currentNum > 0; currentNum--) {
            System.out.print(currentNum + " ");
        }
    }

}
