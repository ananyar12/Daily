package programs;
class Queue{
		 int data;
		 boolean dataPresent= false;
		  synchronized void store(int x)
		 {
			if(dataPresent==false)
			{
				 data =x;
				 System.out.println("Producer is producing value "+data);
				 dataPresent=true;
				 notify();
			}
			else 
			{
				try {
					wait();
				} catch (InterruptedException e) {
			
					e.printStackTrace();
				}
			}
		 }
		  synchronized void consume()
		 {
			 if(dataPresent==true) 
			 {
				 System.out.println("consumer is consuming value "+data);
				 dataPresent=false;
				 notify();
			 }
			 else 
			 {
				 try {
					wait();
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			 }
		 }
	}
	class Producer extends Thread
	{
		Queue q;
		Producer(Queue q)
		{
			this.q=q;
		}
		public void run()
		{
			int i=0;
			for(;;)
			{
				q.store(i++);
			}
		}
	}
	class Consumer extends Thread
	{
		Queue q;
		Consumer(Queue q)
		{
			this.q=q;
		}
		public void run()
		{
			for(;;) 
			{
				q.consume();
			}
		}
	}
	
	
	public class ProducerConsumer {
    public static void main(String[] args) {
	 Queue q=new Queue();
	 Producer p=new Producer(q);
	 Consumer c=new Consumer(q);
	 
	 p.start();
	 c.start();
	}

}
