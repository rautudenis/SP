
public class ImageProxy implements Element {
	public String url;
	private Image realImage;
	
	public ImageProxy(String url)
	{
		this.url = url;
	}
	
	public Image loadImage()
	{
		if(realImage == null)
		{
			realImage = new Image(url);
		}
		
		return realImage;
	}
	
	public void print()
	{
		loadImage();
		realImage.print();
	}
}
