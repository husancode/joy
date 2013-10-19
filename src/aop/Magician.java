package aop;
/**
 * @author husan
 * @Date 2013-8-13
 * @description
 */
public class Magician implements MindReader {
	
	private String thougths;

	public String getThoughts() {
		// TODO Auto-generated method stub
		return thougths;
	}

	public void interceptThoughts(String thoughts) {
		// TODO Auto-generated method stub
		System.out.println("Intercepting volunteer's thoughts:"+this.thougths);
		this.thougths = thoughts;
		
	}
	
	public String getThougths() {
		return thougths;
	}
	public void setThougths(String thougths) {
		this.thougths = thougths;
	}

}


