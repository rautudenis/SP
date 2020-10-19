
public class Paragraph implements Element {
	public String text;
	
	public Paragraph(String text)
	{
		this.text = text;
	}
	
	public void print() 
	{
        System.out.println("The paragraph is "+ this.text);
    }
}
