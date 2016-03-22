import java.util.Scanner;
import java.lang.*;

/**
 * Created by user on 21.03.2016.
 */
public class Input {
    double first,second;
    String operator,exit,save;
    boolean flag;

    private Scanner reader = new Scanner(System.in) ;
 /*
 * Set first arg
 * */
      double setFirst(){

           flag = true;
          while (flag){
              System.out.println("Put first arg:");
              flag = checkVoid();
          }

          return reader.nextDouble();
    }
/* Set second arg*/
    double setSecond(){
        flag = true;
        while (flag){
            System.out.println("Put second arg:");
            flag = checkVoid();
        }

        return reader.nextDouble();

    }
    /*
    * Set operator
    * */
    String setOperator(){

    System.out.println("Put operator");
        operator = reader.next();
        return operator;
    }
    /*
    * Checking first arg
    * for double
    * */
   String setExit(){
        System.out.println("Exit??? y/n" );
        return exit = reader.next();

    }
   String setSave(){
       System.out.println("Save result??? y/n");
       save = reader.next();
       return save;
   }
   public boolean checkVoid(){
      boolean flag1 = true;
       if (reader.hasNextDouble()){
         flag1 = false;
       }
       else {
           System.out.println("Wrong type of data");
           reader.next();
       }
       return flag1;
   }
}
