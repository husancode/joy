package aop;
/**
 * @author husan
 * @Date 2013-8-13
 * @description
 */
public class Volunteer implements Thinker {
	
	private String thoughts;

	public void thinkOfSomething(String thoughts) {
		// TODO Auto-generated method stub
		this.thoughts = thoughts;
		System.out.println("i think");
	}
	
	public void perform(){
		System.out.println("hi i come");
	}
	
	public String getThoughts(){
		return thoughts;
	}

}


