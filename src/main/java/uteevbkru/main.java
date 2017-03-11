package uteevbkru;

public class main {

	public static void main(String []args){
		Task a = new Task("doHomeWork", 6);
		Task b = new Task("buyFrut", 3);
		Task c = new Task("cleanHome", 2);
		Task d = new Task("callMother", 1);
	
		TaskPlanner plan = new TaskPlanner(4);
		plan.addTask(a);
		plan.addTask(b);
		plan.addTask(c);
		plan.addTask(d);
		
		System.out.println(plan.sizeTaskPlanner());
		
		for(int i= 0; i < plan.sizeTaskPlanner(); i++){
			System.out.println(plan.pollTask().getName() + " " + plan.pollTask().getPriority());
		}
	}
 }
