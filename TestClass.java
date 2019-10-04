class MyThreadQues2 implements Runnable	{
public	void	run()	{
	for(int a=0; a<100; a++){
		System.out.println("Creating thread	using the implement	runnable method 1.");
	}
}
}
class MyThreadQues2part1 implements Runnable	{
public	void	run()	{
	for(int a=0; a<100; a++){
		System.out.println("Creating thread	using the implement	runnable method 2.");
	}

}
}
class MyThreadQues2part2 implements Runnable	{
public	void	run()	{
	for(int a=0; a<100; a++){
		System.out.println("Creating thread	using the implement	runnable method part 3.");
	}
	}
}
public	class TestClass	{
public	static	void	main (	String[]	args	)	{
MyThreadQues2 NewInstance =	new MyThreadQues2();
MyThreadQues2part1 NewInstancepart1 =	new MyThreadQues2part1();
MyThreadQues2part2 NewInstancepart2 =	new MyThreadQues2part2();
Thread	NewThreadName =	new Thread(NewInstance);
Thread	NewThreadNamepart1 =	new Thread(NewInstancepart1);
Thread	NewThreadNamepart2 =	new Thread(NewInstancepart2);
NewThreadName.start();
NewThreadNamepart1.start();
NewThreadNamepart2.start();
}
}