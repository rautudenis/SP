import java.util.*;

public class Section implements Element {
	public String sectionTitle;
	public List<Element> elements1 = new ArrayList<Element>();
	
	public Section(String title)
	{
		this.sectionTitle = title;
	}
	
	public int add(Element el)
	{
		elements1.add(el);
		return elements1.indexOf(el);
	}
	
	public void remove(Element el)
	{
		elements1.remove(el);
	}
	
	public Element getElement(int index)
	{
		return elements1.get(index);
	}
	
	public void print()
	{
		System.out.println(this.sectionTitle);
		
		for(Element el : elements1)
		{
			el.print();
		}
	}
}
