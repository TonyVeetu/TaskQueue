package uteevbkru;

public class Task {
	
	private String name;
	private int priority;
	
	public Task(String name, int prior){
		this.name = name;
		priority = prior;
	}
	public Task(String name){
		this.name = name;
		priority = -1;
	}
	public String getName(){
		return name;
	}
	public int getPriority(){
		return priority;
	}
}
