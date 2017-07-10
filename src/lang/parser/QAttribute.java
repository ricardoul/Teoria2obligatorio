package lang.parser;

import java.util.ArrayList;
import java.util.Map;

public class QAttribute {
	String tag;
	Object obj;
	
	public QAttribute(String tag, Object obj) {
		super();
		this.tag = tag;
		this.obj = obj;
	}
	
	public String getTag() {
		return tag;
	}
	
}
