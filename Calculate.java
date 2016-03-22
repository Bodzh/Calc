/**
 * Created by user on 21.03.2016.
 */
public class Calculate {
    double first;
    double second;
    double result;
    String operator;

     void add(double first,double second){
        this.result = first + second;

    }
      void sub(double first , double second){
         this.result = first - second;

     }
     void mul(double first, double second){
        this.result = first*second;

    }
    void div(double first, double second){
        this.result = first/second;

    }
    void chooseMethod(double first, String operator, double second){
        if (operator.equals("+")){
        add(first,second);
        }
        else if (operator.equals("-")){
            sub(first,second);
        }
        else if (operator.equals("*")){
            mul(first,second);
        }
        else if (operator.equals("/")){
            div(first,second);
        }
        else {
            System.out.println("Wrong operator");
        }
    }
 public  double getResult(){

        return this.result;
    }
    void clearResult(){
        this.result =0;

    }
}
