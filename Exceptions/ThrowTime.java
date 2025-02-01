import java.io.IOException;

public class ThrowTime {
    int i=0;
    int j;
     void A() throws Exception{
        j = 1 / i;
    }
}
class trick{
    ThrowTime t=new ThrowTime();
    void B()throws Exception{
        t.A();
    }
}
    class Driver{
    public static void main(String[] args) {
trick t1=new trick();

try {
    t1.B();
}
catch(Exception e) {
    System.out.println("He He...."+e);
}

    }
}
