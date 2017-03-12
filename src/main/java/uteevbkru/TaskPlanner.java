package uteevbkru;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class TaskPlanner {

	private Queue<Task> que ;
	
	public TaskPlanner(int s){
		que = new PriorityQueue<>(s, priorComp);
	}	
	public boolean addTask(Task A){
		boolean bol = que.add(A);
		return bol;
	}
	public Task pollTask(){
		return que.poll();
	}
	
	public int sizeTaskPlanner(){
		return que.size();
	}
	
	public static Comparator<Task> priorComp = new Comparator<Task>(){
	
		@Override
		public int compare(Task a,Task b){
			return Integer.compare(a.getPriority(), b.getPriority())  ;
		}
		
	};
}
