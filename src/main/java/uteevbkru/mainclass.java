package uteevbkru;

public class mainclass {
	public static void main( String []args){
		Task a = new Task("doHomeWork", 6);
		Task b = new Task("buyFrut", 3);
		Task c = new Task("cleanHome", 1);
		Task d = new Task("callMother", 4);
	
		boolean flag = false;
		TaskPlanner plan = new TaskPlanner(4);
		flag = plan.addTask(a);
		flag = plan.addTask(b);
		flag = plan.addTask(c);
		flag = plan.addTask(d);		
		if(!flag){
			System.out.println("Ошибки при добавлении элемента!");
			return ;
		}
		
		int planSize = plan.sizeTaskPlanner();
		for(int i= 0; i < planSize; i++){
			Task aa = plan.pollTask();
			System.out.println(aa.getName()+" "+aa.getPriority());
		}			
	}
 }
