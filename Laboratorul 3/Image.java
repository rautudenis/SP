
public class Image implements Element {
	public String imageName;
	
	public Image(String nameImage)
	{
		this.imageName = nameImage;
	}
	
	public void print() {
        System.out.println("Image with name: "+ this.imageName);
    }
}
