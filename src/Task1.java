import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

//        Ввести с клавиатуры строку текста, а затем один символ.
//Показать на консоль индексы и количество совпадений (ищем
//вхождения символа в строку). В случае если совпадений не
//найдено, вывести соответствующий текст.

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the sentence: ");
        String sentence = in.nextLine();
        System.out.print("Enter the symbol: ");
        String symbol = in.nextLine();


        int occurrence = sentence.length() - sentence.replace(symbol, "").length();
        if (occurrence > 0){
            System.out.println("The symbol " + symbol+ " repeats " + occurrence + " times in the sentence");
            for (int i = 0; i < sentence.length(); i++){
                char[] c = sentence.toCharArray();
                char[] s = sentence.toCharArray();
                if (c[i] == s[0]){
                    System.out.println("Index of symbol " + symbol + " is " + i);
                }
            }
        }else {
            System.out.println("There is no " + symbol + " in this sentence");
        }




    }
}
