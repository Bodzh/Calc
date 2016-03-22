import java.util.Scanner;

/**
 * Created by Bodzh on 21.03.2016.
 */
public class ArgRunner {

    public static void main(String [] args){
    try{
        String exit = "n",save = "n", operator;
        double first,second;
        Input input = new Input();
        Calculate calc = new Calculate();
        while (!exit.equals("y")){

           if (!save.equals("y")){first = input.setFirst();
           }
            else{
               System.out.println("Your first arg is:\n"+ calc.getResult());
               first=calc.getResult();
           }
            operator = input.setOperator();
            second = input.setSecond();
            calc.chooseMethod(first,operator,second);
            System.out.println("Result is: "+ calc.getResult());
            save = input.setSave();
            if (save.equals("n")){exit = input.setExit();
            calc.clearResult();
            }


        }


    }
    finally{

   System.out.print("Have a nice day");
    }

    }
}
