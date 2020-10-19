import java.util.*;

public class Book {
	public String title;
	public Author author;
	private List<Chapter> chapters = new ArrayList<Chapter>();
	
	public Book(String title)
	{
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
	
	public void print()
	{
        System.out.println("The book is named: " + this.title);
    }
}
