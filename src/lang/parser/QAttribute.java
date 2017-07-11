package lang.parser;

import java.util.ArrayList;
import java.util.Map;

public class QAttribute {
	String tag;
	Object obj;
	
	@Override
	public String toString() {
		return "QAttr [tag=" + tag + ", obj=" + obj + "]";
	}

	public QAttribute(String tag, Object obj) {
		super();
		this.tag = tag;
		this.obj = obj;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((obj == null) ? 0 : obj.hashCode());
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
		QAttribute other = (QAttribute) obj;
		if (this.obj == null) {
			if (other.obj != null)
				return false;
		} else if (!this.obj.equals(other.obj))
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
	
}
