import java.util.Scanner;
import static java.lang.System.in;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(in);
        System.out.println("Ввод первого числа для записи в строковую переменную: ");
        int i1 = input.nextInt(); // вопрос 1
        //System.out.println(String.valueOf(i1)); один из вариантов
        String Odin;
        Odin = Integer.toString(i1);
        System.out.println(Odin);
        System.out.println("Ввод второго числа и сохранение его в целочисленной переменной типа int: ");
        int i2 = input.nextInt(); // вопрос 2
        int resultInt1 = Math.max (i1, i2); //вопрос 3
        System.out.println("Сравнили два числа и вывели большее на экран: "+ resultInt1 );
        int resultInt2 = Math.min (i1, i2);
        double f = resultInt2; // вопрос 4
        System.out.println("Вывод меньшего числа, предварительно переконвертированного в тип double: " + f);

    }
}
