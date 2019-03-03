import java.io.IOException;

public class SampleServerDemo {
    public static void main(String[] args) throws IOException, InterruptedException {
        SampleServer sampleServer = new SampleServer();
        sampleServer.startServer(55555);
        Thread.sleep(5000);
        sampleServer.shutdown();
    }
}
