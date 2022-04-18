import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
//        Пользователь вводит с клавиатуры любую строку.
//        Поменять в исходной строке все большие буквы на
//        маленькие, а маленькие – на большие. Если в строке при-
//                сутствуют цифры, заменить на символ подчеркивания и
//        вывести результат на консоль.

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the sentence: ");
        String st = in.nextLine();
        StringBuilder st2 = new StringBuilder();

        for (int i = 0; i < st.length(); i++){
            if (Character.isLetter(st.charAt(i))){
                if (Character.isLowerCase(st.charAt(i))){
                    st2.append(Character.toUpperCase(st.charAt(i)));
                }else if(Character.isWhitespace(st.charAt(i))){
                    st2.append(" ");
                } else {
                    st2.append(Character.toLowerCase(st.charAt(i)));
                }
            }
        }
        System.out.println(st2);
    }
}
