
public class phone_interface {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.makeCall();
        phone.sendMessage();
    }
}
interface Caller {
    void makeCall();
}

interface Meesenger {
    void sendMessage();
}

class Phone implements Caller, Meesenger {
    public void makeCall() {
        System.out.println("Making a phone call...");
    }

    public void sendMessage() {
        System.out.println("Sending a text message...");
    }
}

