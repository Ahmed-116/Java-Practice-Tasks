import java.util.Arrays;
import java.util.Scanner;

public class MessagingApp {
    SMS[] smsArray = new SMS[10];
     public static int messageCounter = 0;
    {
           smsArray[0]=new SMS(new Sender("SAMI","Garden town"),"Tunda","Hello Snake",true,"001");
    }
public void sendMessage() {
    Scanner in = new Scanner(System.in);
    for(int i = 0; i < smsArray.length; i++) {
        if(smsArray[i] != null) {
            System.out.println(smsArray[i].toString());
        }



    }

}

    @Override
    public String toString() {
        return "MessagingApp{" +
                "smsArray=" + Arrays.toString(smsArray) +
                '}';
    }
}
