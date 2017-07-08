package lang.parser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class QObject {
	String tag;
	Map<String,Object> attributes;
	ArrayList<QObject> elements;
	
	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		System.out.println("entro tag"+tag);
		this.tag = tag;
	}

	public Map<String, Object> getAttributes() {
		return attributes;
	}

	public void setAttributes(Map<String, Object> attributes) {
		this.attributes = attributes;
	}

	public ArrayList<QObject> getElements() {
		return elements;
	}

	public void addElements(ArrayList<QObject> elements) {
		this.elements.addAll(elements);
	}
	
	public void addAttributes(Map<String, Object>  attributes) {
		this.attributes.putAll(attributes);
	}
	
	public void setElements(ArrayList<QObject> elements) {
		this.elements = elements;
	}
	public QObject(){
		super();
		System.out.println("entro constructor vacio");
	}
	public QObject(String tag, Map<String, Object> attributes, ArrayList<QObject> elements) {
		super();
		this.tag = tag;
		this.attributes = attributes;
		this.elements = elements;
	}

	@Override
	public String toString() {
		return "QObject [tag=" + tag + ", attributes=" + attributes + ", elements=" + elements + "]";
	}

}
