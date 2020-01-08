import java.util.Scanner;

public class JavaConsoleCalculator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int num1 = getInt();
        int num2 = getInt();
        char operation = getOperation();
        int res = calc(num1,num2, operation);
        System.out.println("Результат: " + res);

    }

    public  static int getInt(){
        System.out.println("Напишіть число:");
        int num;
        if(scanner.hasNextInt()){
            num = scanner.nextInt();
        } else {
            System.out.println("Ви зробили помилку! Будь ласка, спробуйте ще раз.");
            scanner.next(); //рекурсія
            num = getInt();
        }

        return  num;
    }

    public static char getOperation(){
        System.out.println("Напишіть операцію, яку потрібно виконати:");
        char operation;
        if(scanner.hasNext()) {
            operation = scanner.next().charAt(0);
        }else{
            System.out.println("Будь ласка, спробуйте знову.");
            scanner.next();
            operation = getOperation();
        }
        return operation;
    }
     public static int calc(int num1, int num2, char operation){
        int res;
        switch(operation){
            case '+':
                res = num1 + num2;
                break;
            case '-':
                res = num1 - num2;
                break;
            case '/':
                res = num1/num2;
                break;
            case '*':
                res = num1*num2;
                break;
             default:
                 System.out.println("Спробуйте ще раз");
                 res = calc(num1,num2, operation);
        }
        return res;
     }
}
