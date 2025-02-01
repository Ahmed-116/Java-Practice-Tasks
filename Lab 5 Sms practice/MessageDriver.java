public class MessageDriver {
    public static void main(String[] args) {
        //Message message = new Message("Hello, World!");
        MessagingApp messageApp=new MessagingApp();

        messageApp.sendMessage("sender","receiver","contents ");
        System.out.println(messageApp.messages[1]);
        messageApp.displaySenderMessage("sender");
       
    }
}