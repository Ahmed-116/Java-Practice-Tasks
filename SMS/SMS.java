

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class SMS {
     Sender sender;
     String receiver;
     String content;
     boolean status;
     String messageId;
     LocalDateTime timeStamp;




    public SMS(Sender sender, String receiver, String content, boolean status, String messageId) {
        this.sender = sender;
        this.receiver = receiver;
        this.content = content;
        this.status = status;
        this.messageId = messageId;
        this.timeStamp = LocalDateTime.now();

    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    public boolean getStatus() {
        return status;
    }
    public String getFormattedDateTime(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        return timeStamp.format(formatter);
    }

    @Override
    public String toString() {
        return "SMS{" +
                "sender=" + sender +
                ", receiver='" + receiver + '\'' +
                ", content='" + content + '\'' +
                ", status=" + status +
                ", messageId='" + messageId + '\'' +
                ", timeStamp=" + timeStamp +
                '}';
    }
}