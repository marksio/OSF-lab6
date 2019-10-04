class	BankAccount	{
	private	int	x;
	public	void setValue(int intValue)	{
		x =	intValue;
	}
	public	void incrementBy(int incValue)	{
		x = x +	incValue;
	}
	public	int	getValue()	{
		return	x;
	}
}

class Person implements	Runnable	{
	BankAccount	bankAccount;
	Person(BankAccount	bankAccount)	{
					this.bankAccount	=	bankAccount;
	}
	public	void run() {
		for	(int	x	=	0;	x	<	10000;	x++) {
			this.bankAccount.incrementBy(1);
		}
	}
}
public	class	TestTransaction	{
	public	static	void	main(String[]	args)	{
		BankAccount	bankAccount	=	new	BankAccount();
		bankAccount.setValue(0);
		Person	person	=	new	Person(bankAccount);
		Thread	p0	=	new	Thread(person);
		Thread	p1	=	new	Thread(person);
		Thread	p2	=	new	Thread(person);
		Thread	p3	=	new	Thread(person);
		Thread	p4	=	new	Thread(person);
		Thread	p5	=	new	Thread(person);
		p0.start();
		p1.start();
		p2.start();
		p3.start();
		p4.start();
		p5.start();
		while	((p0.isAlive()||p1.isAlive()||p2.isAlive()||p3.isAlive()||p4.isAlive()||p5.isAlive()))	{ }
		System.out.println(bankAccount.getValue());
	}
}