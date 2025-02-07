// Java program to demonstrate varargs

class Test1 {
    // A method that takes variable
    // number of integer arguments.
    static void fun(int... a)
    {
        System.out.println("Number of arguments: "
                + a.length);

        // using for each loop to display contents of a
        for (int i : a)
            System.out.print(i + " ");
        System.out.println();
    }

    // Driver code
    public static void main(String args[])
    {
        // Calling the varargs method with
        // different number of parameters

        // one parameter
        fun(100);

        // four parameters
        fun(1, 2, 3, 4);

        // no parameter
        fun();

        String s1="Hello";
        String s2="Hello";
        String s3="Hello1";
        String s4=new String("Hello");

        if(s1.contains("He"))
            System.out.println("Substring found");




        s1=s1+" world";
        System.out.println(s1);
    }
}

