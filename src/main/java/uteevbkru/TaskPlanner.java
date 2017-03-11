package uteevbkru;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class TaskPlanner {

	private Queue<Task> que ;
	
	public TaskPlanner(int s){
		que = new PriorityQueue<>(s, priorComp);
	}	
	public void addTask(Task A){
		que.add(A);
		System.out.println(que.element().getName());
	}
	public Task pollTask(){
		Task a = que.poll();
		return a;
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
