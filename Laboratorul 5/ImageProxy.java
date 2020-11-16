
public class ImageProxy implements Element{

    private String name;
    Image realImage= null;

    ImageProxy(String name){
        this.name=name;
    }

    public void print() {
        if (this.realImage == null){
            this.realImage = new Image(this.name);
        }
        realImage.print();
    }
}