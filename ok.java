import java.net.InetAddress;

public class IPAddressTracker {
    public static void main(String[] args) {
        try {
            InetAddress ipAddress = InetAddress.getLocalHost();
            System.out.println("IP Address: " + ipAddress.getHostAddress());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}