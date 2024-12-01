package task3;

public class ProxyImage implements MyImage {
    private MyImage image;

    @Override
    public void display() {
        if (image != null) {
            image.display();
        } else {
            image = new RealImage("src/main/java/task3/test.jpg");
            image.display();
        }
    }
}
