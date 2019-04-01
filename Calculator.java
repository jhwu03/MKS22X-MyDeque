import java.util.*;
public class Calculator{
    /*Evaluate a postfix expression stored in s.
     *Assume valid postfix notation, separated by spaces.
     */
    public static double eval(String s){
      String[] ary = s.split(" ");
      MyDeque<String> string = new MyDeque<>(s.length());
      for(int i = 0; i < ary.length; i++) {
      if(ary[i].equals("+")){
        double num1 = Double.parseDouble(string.getLast());
        string.removeLast();
        double num2 = Double.parseDouble(string.getLast());
        string.removeLast();
        string.addLast(String.valueOf(num1+num2));
      }else if (ary[i].equals("-")){
        double num1 = Double.parseDouble(string.getLast());
        string.removeLast();
        double num2 = Double.parseDouble(string.getLast());
        string.removeLast();
        string.addLast(String.valueOf(num2-num1));
      }else if (ary[i].equals("*")){
        double num1 = Double.parseDouble(string.getLast());
        string.removeLast();
        double num2 = Double.parseDouble(string.getLast());
        string.removeLast();
        string.addLast(String.valueOf(num1*num2));
      }else if (ary[i].equals("/")){
        double num1 = Double.parseDouble(string.getLast());
        string.removeLast();
        double num2 = Double.parseDouble(string.getLast());
        string.removeLast();
        string.addLast(String.valueOf(num2/num1));
      }else if (ary[i].equals("%")){
        double num1 = Double.parseDouble(string.getLast());
        string.removeLast();
        double num2 = Double.parseDouble(string.getLast());
        string.removeLast();
        string.addLast(String.valueOf(num2%num1));
      }else{
        string.addLast(ary[i]);
      }
    }
    return Double.parseDouble(string.getLast());
  }
}
