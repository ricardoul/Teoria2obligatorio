package lang.parser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class QObject {
	String tag;
	Map<String,Object> attributes;
	ArrayList<QObject> elements;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((attributes == null) ? 0 : attributes.hashCode());
		result = prime * result + ((elements == null) ? 0 : elements.hashCode());
		result = prime * result + ((tag == null) ? 0 : tag.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		QObject other = (QObject) obj;
		if (attributes == null) {
			if (other.attributes != null)
				return false;
		} else if (!attributes.equals(other.attributes))
			return false;
		if (elements == null) {
			if (other.elements != null)
				return false;
		} else if (!elements.equals(other.elements))
			return false;
		if (tag == null) {
			if (other.tag != null)
				return false;
		} else if (!tag.equals(other.tag))
			return false;
		return true;
	}

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
