import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.UnaryOperator;
public class UnaryOperatorMain {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите слово");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
        UnaryOperator<String> unaryOperator = s -> {
            StringBuilder sb=new StringBuilder();
            for(int i=0; i<s.length(); i++)
                sb.append(s.charAt(i)).append(s.charAt(i));
            return sb.toString();
        };
        SetLettersDuplicate(string, unaryOperator);
    }
    static void setLettersDuplicate(String s, UnaryOperator<String> unaryOperator){
        System.out.println(unaryOperator.apply(s));
    }
}


