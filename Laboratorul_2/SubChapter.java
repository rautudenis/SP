import java.util.*;

public class SubChapter implements Element {
	public String name;
	public List <Element> elements = new ArrayList<Element>();
	
	public SubChapter(String name)
	{
		this.name = name;
	}
	
	public void createNewParagraph(String name)
	{
		Paragraph ph1 = new Paragraph(name);
		elements.add(ph1);
	}
	
	public void createNewImage(String name)
	{
		Image img1 = new Image(name);
		elements.add(img1);
	}
	
	public void createNewTable(String name)
	{
		Table tb1 = new Table(name);
		elements.add(tb1);
	}
	
	public void print()
	{
		System.out.println("Name SubChapter: " + this.name);
		
		for(Element el : elements)
		{		
			if(el instanceof Paragraph)
			{
				el.print();
			}
		}
		
		for(Element el : elements)
		{		
			if(el instanceof Image)
			{
				el.print();
			}
		}
		
		for(Element el : elements)
		{		
			if(el instanceof Table)
			{
				el.print();
			}
		}
	}
}
