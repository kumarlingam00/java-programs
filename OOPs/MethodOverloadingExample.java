class Calculator{
    public void add(int a , int b){
        System.out.println("Addition of two numbers : " + (a + b));
    }
    public void add(int a , int b, int c){
        System.out.println("Addition of thtee numbers : " + (a + b + c));
        
    }
    public void add(int a , int b, int c, int d){
        System.out.println("Addition of four numbers : " + (a + b + c + d));
    }
}
public class MethodOverloadingExample{
    public static void main(String[] args){
        Calculator cal = new Calculator();
        
        cal.add(10,20);
        cal.add(10,20,30);
        cal.add(10,20,30,40);
    }
}