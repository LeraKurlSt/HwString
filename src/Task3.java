import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
//        Подсчитать среднюю длину слова, во введенном с
//клавиатуры предложении.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the sentence: ");
        String st = sc.nextLine();
        char[] c = st.toCharArray();

        int counter = 1;
        for (int i = 0; i < st.length(); i++){
            if (c[i] == ' '){
                counter += 1;
            }
        }
        System.out.println(counter);

        String wordLength = st.replace(" ", "");
        System.out.println("The average word length is " + (wordLength.length() / counter));
    }
}
