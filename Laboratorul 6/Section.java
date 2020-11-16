
import java.util.ArrayList;
import java.util.*;

public class Section implements Element {
    private String sectionTitle;
    public List<Element> elements = new ArrayList<>();

    public Section(String sectionTitle, List<Element> elements) {
        this.sectionTitle = sectionTitle;
        this.elements = elements;
    }

    public Section(String sectionTitle) {
        this.sectionTitle = sectionTitle;
    }

    public int add(Element element) {
        elements.add(element);
        return elements.indexOf(element);
    }

    public void remove(Element element) {
        elements.remove(element);
    }

    public Element getElement(int index) {
        return elements.get(index);
    }

    public void print() {
        System.out.println(sectionTitle);

        for(Element i : elements){
            i.print();
        }
    }
    
    public void accept(Visitor visitor)
    {
    	for(Element el : elements)
    	{
            el.accept(visitor);
    	}

    }
}
