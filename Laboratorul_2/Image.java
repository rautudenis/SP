
public class Image implements Element {
	public String imageName;
	
	public Image(String nameImage)
	{
		this.imageName = nameImage;
	}
	
	public void print() {
        System.out.println("The image is "+ this.imageName);
    }
}
