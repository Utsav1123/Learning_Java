package Unit_01;
/*
 * operators in java is a symbol that is used to perform operations 
 * sum=a+b;
 * 	for example: +,-,*,/
 * 	#types of operators in java
 * 		-Unary operators : {prefix and postfix}[a++,a--,++a,etc]
 * 		-Arithmetic operators: {*,-,/,+,%}
 * 		-Shift operators: {<< , >>}
 * 		-relational operators: {> < <= >= !=
 * 		-Bitwise operators : {& ^ |}
 * 		-Logical operators : {&& ||}
 * 		-ternary operators: {? : }
 * 		-Assignment operators: {=,+=,-=,/=,%=,&/,>>=,>>=}
 */

public class P3_task2_operatorsinjava{

	public static void main(String[] args) {
		OperatorsInJava obj=new OperatorsInJava();
		
		obj.UnaryOperator();
		obj.ArithmeticOperator();
		obj.ShiftOperator();
		obj.RelationalOperator();
		obj.BitwiseAndLogicalOperators();
		obj.TernaryOperator();
		obj.AssignmentOperator();
	}

}
class OperatorsInJava
{
	void UnaryOperator() {
		int a=10;
		boolean b= false;
		System.out.println("Inside UnaryOperator");
		System.out.println(a++);//10
		System.out.println(++a);//11
		System.out.println(a--);//11
		System.out.println(--a);//10
		
		/*
		 * Bitwise Complement(~)
		 * This unary operator returns the one's complement representation of the input value
		 * with all bits inverted, which means it makes every 0 to 1, and every 1 to 0
		 */
		System.out.println(~a);// 1010 invert all bits+> 0101 2's complement+>1010 +1 =>1011
		//00000000000.....1010
		
		//'Not' Operator(!): It is used to reverse the value of an operand
		System.out.println(!b);//true
		System.out.println("\n");
		
	}
	void ArithmeticOperator()
	{
		System.out.println("inside ArithmeticOperator");
		int a=10,b=5;
		System.out.println(a+b);//15
		System.out.println(a-b);//5
		System.out.println(a*b);//50
		System.out.println(a/b);//2
		System.out.println(a%b);//0
		
		System.out.println(((10*10)/5)+3-((1*4)/2));
		
		System.out.println("\n");
		
		}
	void ShiftOperator()
	{
		System.out.println("inside ShiftOperator");
		/*
		 01010101<<1
		 10101010
		 
		 01010101>>1
		 00101010
		 
		 0,0,1,0,0,0 {8>>1} >>
		 0,0,0,1,0,1 {4>>1}
		 0,0,0,0,1,0 {2>>1}
		 0,0,0,0,0,1 {1}
		 32,16,8,4,2,1
		 
		 0,0,1,0,0,0 {8<<1}
		 0,1,0,0,0,0 {16<<1}
		 1,0,0,0,0,0 {32
		 */
		
		System.out.println(10<<2);//10*2^2=10*4=40
		System.out.println(10<<3);//10*2^3=10*8=80
		System.out.println(20<<2);//20*2^2=20*4=80
		System.out.println(15<<4);//15*2^4=15*16=240
		
		System.out.println(10>>2);//10/2^2=10/4=2
		System.out.println(20>>2);//20/2^2=20/4=5
		
	}
	void RelationalOperator() {
		int a=10,b=5;
		System.out.println(a==b);
		System.out.println(a!=b);
		System.out.println(a>=b);
		System.out.println(a<=b);
	}
	void BitwiseAndLogicalOperator()
	{
		int a=10,b=5,c=20;
		
	}
	
}