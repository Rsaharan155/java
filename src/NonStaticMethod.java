public class NonStaticMethod {

        int x;
        int y;
        void met1()
        {
            System.out.println("2. Object is created by using 'new' keyword");
        }
        void met2()
        {
            System.out.println("3. Mention class name whose object need to be created, refrence variable name , = , 'new' keyword constructor and semi-colon");
        }
        void met3()
        {
            System.out.println("4. Like - ClassName RefrenceVaribleName = new ClassName();");
        }
        public static void main(String []args)
        {
            NonStaticMethod a1 = new NonStaticMethod();  // Here we create a memory with a1 name of NonStaticMethod Type(we have default datatypes, but this is a datatype created with help of a class) and a1 will contain all method, variable of 'NonStaticMethod' class
            NonStaticMethod a2 = new NonStaticMethod();  // Predefined data types are like- int , float , and by using class we create userdefined datatypes.
            NonStaticMethod a3 = new NonStaticMethod();
            NonStaticMethod a4 = new NonStaticMethod();
            System.out.println("1. Main method in java is static, so from main to call any non static/instance member method need to create an object");
            a1.met1();
            a1.met2();
            a2.met3();
            a3.x = 100;


            System.out.println("5. By using object we can assign values in variables by mentioning object reference name dot variable name = value semicolon. eg. a3.x = 5; ");
            System.out.println(a3.x);
        }
    }
