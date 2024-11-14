import java.util.Scanner;

public class Workshop{

    //  1.Function getsum to get sum of two numbers?
    private static int getSum(int number1,int number2)
    {
        int sum;
        sum=number1+number2;
        return sum;
    }
     public static void invoke_getSum()
    {
        int result=getSum(10,20);
        System.out.println("sum of two numbers="+result);
    }
    //2.Function swapnumbers to swap two variables values?

    //THIS CODE NOT WORK BECAUSE OF SCOPE OF VAREABLES
    static void swap_v1(int number1,int number2){
        int temp=number1;
        number1=number2;
        number2=temp;
    }
    static void swap_v2(int[] numbers)
    {
        int temp=numbers[0];
        numbers[0]=numbers[1];
        numbers[1]=temp;
    }

    static void invoke_swap(){
        int number1=10,number2=20;
        System.out.printf("before swap:number1="+number1+" and number2="+number2);
        swap_v1(number1,number2);//here pass the values
        System.out.printf("\nAfter swap:number1="+number1+" and number2="+number2);

        int[] numbers={number1,number2};
        System.out.printf("\nbefore swap:number1="+numbers[0]+" and number2="+numbers[1]);
        swap_v2(numbers);//here pass te refrence
        System.out.printf("\nafter swap:number1="+numbers[0]+" and number2="+numbers[1]);
    }

    //3.Function isEven to return if number is even otherwice false?

    static boolean isEven(int number){
        if(number%2==0)
            return true;
        else   
             return false;
    }
    static void invoke_isEven(){
        int number=10;
        if(isEven(number))
            System.out.println("entered number is even\n");
        else    
            System.out.printf("entered number is odd\n");  
        
    }
    //4.Function is Digit to return true if it is true?

    public static boolean isDigit(String input){
        boolean flag=true;
        for(int i=0;i<input.length();i++)
        {
            char ch=input.charAt(i);
            if(ch <'0' || ch>'9'){
                flag=false;
                break;
            }
        } 
        return flag;  
    }

    public static void invoke_isDigit(){
        boolean result=isDigit("876521");
        if(result)
            System.out.println("yes it digit \n");
        else
            System.out.println("no it not digit\n");

    }

    //5.Function getgreeting by accepting name and print greeting with name?

    public static void getGreeting(String input){
        System.out.println("hello, "+input);
        System.out.printf("welcome %s",input);
    }
    static void invoke_getGreeting(){
        Scanner reader= new Scanner(System.in);
        String name;
        name=reader.nextLine();
        reader.close();
        getGreeting((name)); 

    }

    //6.Functionto print ASCII values of strinf input?

    static void printAscii(String name){
    
        for(int i=0;i<name.length();i++)
        {
            char character=name.charAt(i);
            int asciiValue=character;
            System.out.println("Ascii value of char "+character+ " "+asciiValue);
        }
    }
    static void invoke_printAscii(){
        Scanner S =new Scanner(System.in); //this is for creating the object
        String str=S.nextLine();//it is for read a string
        S.close();//it compulsry to cloe the scanner object
        printAscii(str);
    }
    // 7.Function getstrlength to get String to get string length?

    public static int getLength(String str){
        char[] array=str.toCharArray();
        int length=0;
        for(char x : array)//this is for each loop it traver each element of array
        {
            System.out.printf("%c ",x);
            length++;
        }
        
        return length;
    }
    static void invoke_getLength()
    { 
        Scanner scan = new Scanner(System.in);
        String input;
        input=scan.nextLine();
        scan.close();
        int length=getLength(input);
        System.out.printf("\nthe length of the string %s is %d",input,length);
    }

    //8.Function getCOUNTOfOvewel to count ovewels in given string?
     
    public static int getCOUNTOfOvwels(String input)
    {
        int count=0;
        char[] chArray=input.toCharArray();
        for(char character : chArray)
        {
            character=toLower((character));
            if(character=='a'|| character== 'e'
            || character=='i'||character=='o'
            ||character=='u')
            {
                count++;
            }
        }
        return count;
    }

    static char toLower(char ch){
        if(ch>='A' && ch <='Z') 
        {
            //int num=ch;
            ch=(char) (ch+32);
        }
        return ch;
    }
    

    static void invoke_getCOUNTOfOvwels(){
        System.out.println("enter one string to count number of ovwels");
       Scanner read =new Scanner(System.in);
       String word;
       word=read.nextLine();
       read.close();
       int result=getCOUNTOfOvwels(word);
       System.out.println("te number of ovwels are "+ result);

    }
    //reversing  the str using another memory
    static String reversStr(String str){
        StringBuffer outstr=new StringBuffer();//here StringBuffer is the class that alows the modification in string
        //char[] strArray=str.toCharArray();
        for(int i=str.length()-1;i>=0;i--)
        {
            outstr.append(str.charAt(i));
        }
        return outstr.toString();//to coner the buffer string to string
    }

    public static void invoke_reversStr(){
        Scanner read=new Scanner(System.in);
       System.out.printf("enter the str to revers\n");
       String name,reversName;
       name=read.nextLine();
       read.close();
       reversName=reversStr(name);
       System.out.printf("reversed str="+reversName);
    }

    //rever the string in same memory>>>>

    public static String Revers_v2(String input){
        char[] arrayStr=input.toCharArray();
        int start=0;
        int end=input.length()-1;
        while(start<end)
        {
            char temp=arrayStr[start];
            arrayStr[start]=arrayStr[end];
            arrayStr[end]=temp;
            start++;
            end--;
        }
        return new String(arrayStr);//to covert the array of str into str

    }
    public static void main()
    {
        Scanner S = new Scanner(System.in);
        System.out.println("enter the string to revers");
        String name;
        name = S.nextLine();
        S.close();
        System.out.println("BEFORE::"+name);
        name=Revers_v2(name);
        System.out.println("AFTER::"+name);

    }
}