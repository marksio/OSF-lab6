class MyThread extends Thread	{
public	void run() {
System.out.println("Creating thread	using the subclass method.");
}
}
public	class Ques1	{
public static void main ( String[] args )	{
MyThread NewThreadName =	new	MyThread();
NewThreadName.start();
}
}