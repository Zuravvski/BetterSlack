import java.io.IOException;

public class SampleServerDemo {
    public static void main(String[] args) throws IOException {
        SampleServer sampleServer = new SampleServer();
        sampleServer.startServer(55555);
    }
}
