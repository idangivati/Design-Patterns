package structural.pattern.strategy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StrategyPatternDemo {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the first value: ");
        float value1=Float.parseFloat(br.readLine());
        System.out.print("Enter the second value: ");
        float value2=Float.parseFloat(br.readLine());
        System.out.println("Enter the desired option: \n1 -> Add\n2 -> Multiply\n3 -> Subtract");
        String choice = br.readLine();
        Context context = new Context();
        context.choiceToStrategy(choice, value1, value2);
    }

}