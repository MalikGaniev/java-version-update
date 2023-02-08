import java.util.Date;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

       Predicate<Integer> predicate=(p)->p%2==0?true:false;// implementation for the abstract method belongs to this functional interface
         Calculate s1=(x,y)-> System.out.println(x+y);
  Calculate s2=(x,y)->Calculator.findSum(x,y);
//Reference to a Static method
Calculate s3=Calculator::findSum;
s3.calculate(10,20);
//Reference to a instance method
            Calculator obj=new Calculator();
        Calculate s4=new Calculator()::findMultiply;
        BiFunction<String,Integer,String>func=(str,i)->str.substring(i);

        BiFunction<String,Integer,String>func2=String::substring;
        Function<Integer, Double>b=new MyClass()::method;
        BiFunction<MyClass,Integer,Double>b1=MyClass::method;
        Consumer<Integer>display=i-> System.out.println(i);
        Consumer<Integer>display2=System.out::println;




    }
}
