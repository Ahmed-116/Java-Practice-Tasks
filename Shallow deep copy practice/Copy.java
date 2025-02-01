public class Copy{

    public static void main(String[] args){

        Values v1=new Values(10,20);
        System.out.println(v1.sum());
        Value v2=v1;
        System.out.println(v2.sum());
    }
}