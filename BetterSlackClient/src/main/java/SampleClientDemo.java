import java.io.IOException;

public class SampleClientDemo {
    public static void main(String[] args) throws IOException {
        SampleClient sampleClient = new SampleClient();
        sampleClient.connectToServer("localhost", 55555);
    }
}
