import java.util.*;

public class Chapter {
	public String name;
	public List<SubChapter> subchapters = new ArrayList<SubChapter>();
	
	public Chapter(String name)
	{
		this.name = name;
	}
	
	public int createSubChapter(String nameSubChapter)
	{
		SubChapter ch1 = new SubChapter(nameSubChapter);
		subchapters.add(ch1);
		return subchapters.indexOf(ch1);
	}
	
	public SubChapter getSubChapter(int index)
	{
		return subchapters.get(index);
	}
	
	public void print(){
        System.out.println("The chapter is "+ this.name);
    }
}
