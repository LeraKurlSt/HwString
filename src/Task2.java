import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
//        Написать программу, которая создаст строку, в которой
//находятся все целые числа, начиная с 1, выписаны в одну
//строку «123456789101112131415...». Строка должна быть
//длиной не более 1 000 символов.
//По числу n (введенного с клавиатуры), выведите цифру на
//n-й позиции (используется нумерация с 1).
        StringBuilder st = new StringBuilder();

        for (int i = 1; i < 10000; i++){
            st.append(i);
        }
        System.out.println(st);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the index of digit you are searching for: ");
        int n = sc.nextInt();
        char c = st.charAt(n - 1);
        System.out.println("The digit you are searching for is " + c);
    }
}
