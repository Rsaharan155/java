public class StaticMethod
{
    static void fun1()
    {
        System.out.println("2. Static method/variable is only called by static area");
    }
    static void fun2()
    {
        System.out.println("3. Compiler always find main method first and compile it line by line");
    }

    public static void main(String []args)
    {
        System.out.println("1. Main method in java is static, so from main any static method/variable can be called directly without creating its object");
        fun1();
        fun2();
        ExtraClass.fun3();
    }
}
class ExtraClass
{
    static void fun3()
    {
        System.out.println("4. If we call any static method/variable within class then it can be call directly by mentioning method name fun1 like- fun1(); but if we call any method from another class in same program then we need to add class name before it like - ClassName.methodName();- same for variable");
        System.out.println("5. Also a static variable can be called using object also, same as nonstatic variable but vice versa not possible.");
    }
}