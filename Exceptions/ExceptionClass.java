import java.io.File;

public class ExceptionClass {
    public static void main(String[] args) {
         int i=1;
        int j=0;
        int[] num=new int[5];
        String str=null;

        try{
            str.length();
            j=5/i;
            //num[5]=0;

        }
        catch(ArithmeticException e){
            System.out.println("WArr gai..");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("double WArr gai..");
        }
        catch (Exception e){
            System.out.println("pata nhi kaha WArr gai.."+e.getMessage());
         //   e.printStackTrace();
        }
        System.out.println(j);//j will print 0 if exception occcur bc we declare it 0
        System.out.println("I am not dead baby");
    }
}
