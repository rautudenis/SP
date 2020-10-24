import java.util.*;

public class Book extends Section {
	public String title;
	public Author author;
	private List<Chapter> chapters = new ArrayList<Chapter>();
	
	public Book(String title)
	{
		super(title);
		this.title = title;
	}
	
	public void addAuthor(Author nameAuthor)
	{
		this.author = nameAuthor;
	}
	
	public int createChapter(String Chaptername)
	{
		Chapter cH = new Chapter(Chaptername);
		chapters.add(cH);
		return chapters.indexOf(cH);
	}
	
	public Chapter getChapter(int index)
	{
		return chapters.get(index);
	}
	
	public void addContent(Element el)
	{
		elements1.add(el);
	}
	
	public void print()
	{
		for(Element el : elements1)
		{
			el.print();
		}
    }
}
