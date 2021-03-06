package os;

import java.util.LinkedList;
import java.util.Queue;

public class BlockQueue{
	
	Process p1;//队头元素
	Process p2; //队尾元素
	public int length = 0;
	Queue<Process> BQueue = new LinkedList<Process>(); 
	public void EnQueue(Process p) {//入队列
	
		BQueue.offer(p);
		length++;
	}
	
	public void DeQueue() {//出队列
		BQueue.poll();
		length--;
	}
	public 	Process GetTop() {//取队头元素
		return BQueue.peek();
	}
	public void PrintQueue() {//遍历队列
		for(Process q : BQueue){
            q.print();
        }
	}
	public int LenQueue() {//取队列长
		return BQueue.size();
	}
}
