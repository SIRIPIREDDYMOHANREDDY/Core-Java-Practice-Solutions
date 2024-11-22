class A 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		switch(5)
		{
			case 6:
				System.out.println("from case6");
			case 4:
				System.out.println("from case4");
			case 35:
				System.out.println("from case35");
			case 5:
				System.out.println("from case5");
		}
		System.out.println("main end");
	}
}


/*

switch should take an argument.That argument value finally it should result in int.
case : every case value should be constant expression values. This values should
be type of switch argument.
switch argument can be a value or it can be a variable also. case should always be
a constant.
if case is not provided with break statement then case with matching argument
and subsequent all cases are executed. it continues remaining all cases or where
ever break is provided in any of the case.
It is recommended to provide break statement in all the case . so that only case
that match with argument of switch will be executed.
Any number of statements can be provided in body of cases.

*/

/*
Internally switch case is looking for a table switch or look up switch . compiler
generates either table switch or look up switch for every switch case which is a
int result so, switch argument should always result in an int value .
With respect to range of values of byte, short , char are with in the ranges of int ,
so these data types are automatically be converted in to int type and incase String
, every string is having a unique hashCode value which is also in the range of int ,
so when String is used in the argument it is converted in to int by calling hashCode
method.
So int,byte,short,char and String can be used as a swith argument.
*/


/*
So totally switch arguments six data type can be used, All results as int data type.
date type supported by switch arguments are
1. byte
2. short
3. int
4. char

5. String
6. enum.

Every case value should be in the range of switch argument data type. Otherwise
we will be getting compilation error.

*/

