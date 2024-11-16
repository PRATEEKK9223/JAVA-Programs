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
    //  9.Function to reverse a string using other memory and also in same memory?
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

    static void invoke_revers_v2(){
        Scanner S = new Scanner(System.in);
        System.out.println("enter the string to revers");
        String name;
        name = S.nextLine();
        S.close();
        System.out.println("BEFORE::"+name);
        name=Revers_v2(name);
        System.out.println("AFTER::"+name);
    }
    //10.Function to revers array elements and sum of array elements?

    public static int[] ReverArray(int[] array){
        int end=array.length-1;
        int start=0;
        for(;start<end;start++,end--)
        {
            int temp=array[start];
            array[start]=array[end];
            array[end]=temp;
        }
        return array;
    }

    static int getSumOfArrayElements(int array[]){
        int sum=0;
        for(int element:array){
            sum+=element;
        }
        return sum;
    }

    static void invoke_ReversArrayAndgetSumOfArrayElements(){
        int number;
        System.out.println("enter the array size");
        Scanner S1=new Scanner(System.in);
        number=S1.nextInt();
        int[] myarray=new int[number];
        System.out.println("enter the array elements");
        for(int i=0;i<number;i++){
            myarray[i]=S1.nextInt();
        }
        S1.close();
        int[] array=ReverArray(myarray);
        System.out.println("after reversing the array");
        for(int i=0;i<myarray.length;i++){
            System.out.printf("%d ",array[i]);
        }
        int sum=getSumOfArrayElements(myarray);
        System.out.println("\nsum of array element is "+sum);
        
    }
    //11.Function isPalindrom to find given string is palindron or not if print true?

    public static boolean isPalindrom(String str){
        char[] arrayStr=str.toCharArray();
        int start=0;
        int end=arrayStr.length-1;
        while(start<end){
            if(arrayStr[start]!=arrayStr[end])
                return false;
            start++;
            end--;
        }
        return true;
    }
    public void invoke_isPalindrom(){
        Scanner scanner=new Scanner(System.in);
        String name;
        System.out.println("enter the string to check palindrom");
        name=scanner.nextLine();
        scanner.close();
        if(isPalindrom(name))
            System.out.println("entered string "+ name +" is palindrom");
        else
        System.out.println("entered string "+ name +" is not palindrom");

    }
    //12.Function to print max and min value in an array?

    public static void MaxAndMin(int []array){
        int max=array[0];//MIN_VALUE
        int min=array[0];//MAX_VALUE
        for(int i=1;i<array.length;i++)
        {
            if(array[i]>max)
                max=array[i];
            if(array[i]<min)
                min=array[i];
        }
        System.out.println("the maximum value is "+max);
        System.out.println("the minimum value is "+min);

    }
    static void invoke_MaxAndMin()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the size of the array\n");
        int num=scan.nextInt();
        int[] array=new int[num];
        System.out.println("enter the array elements");
        for(int i=0;i<num;i++)
        {
            array[i]=scan.nextInt();
        }
        scan.close();
        MaxAndMin(array);
    }

    //13.Function to search the  elementes in an array?(binary search)

    public static int  Binary_search(int[] array,int key)
    {
        int leftIndex=0;
        int rightIndex=array.length-1;
        //int midIndex=leftIndex+rightIndex/2;
        while(leftIndex<=rightIndex)
        {
            int midIndex=(leftIndex+rightIndex)/2;
            if(key==array[midIndex])
                return midIndex;
            else if(key<array[midIndex]) 
                rightIndex=midIndex-1;
            else if(key>array[midIndex])
                leftIndex=midIndex+1;

        }
        return -1;
    }
    public static void invoke_BinarySearch(){
        int[] array={1,2,3,4,5,6,7};
        System.out.println("enter the key you want to search");
        Scanner scan=new Scanner(System.in);
        int key=scan.nextInt();
        scan.close();
        int index=Binary_search(array,key);
        if(index<0)
             System.out.println("entered key is not found");
         else{
             System.out.println("entered key is found at index " + index);
         }
    }
    //14.Function to merge two arrays and return output in firstarray?
    public static int[] MergeArray(int[] array1,int[] array2)
    {
        int end=array2.length;
        int start=array1.length-end;
        for(int i=0;i<end;i++){
            array1[start]=array2[i];
            start++;
        }
        return array1;
    }
    public static void invoke_MergArray()
    {
        Scanner scan=new Scanner(System.in);
        int num1,num2;
        System.out.println("enter he size of array1");
        num1=scan.nextInt();
        System.out.println("enter he size of array2");
        num2=scan.nextInt();

        int[] array1=new int[num1+num2];
        int[] array2=new int[num2];
        System.out.println("enter te array1 elements");
        for(int i=0;i<num1;i++)
        {
            array1[i]=scan.nextInt();
        }
        System.out.println("enter te array2 elements");
        for(int i=0;i<num2;i++)
        {
            array2[i]=scan.nextInt();
        }
        scan.close();
        array1=MergeArray(array1,array2);
        System.out.println("After:merging the array1 elements");
        for(int i=0;i<array1.length;i++)
        {
            System.out.printf("%d ",array1[i]);
        }
    }
    //15.Function to get second largest element in an integer array?

    public static int getSecondLargest(int[] array){
        int large=array[0];
        int secondLarge=array[0];
        for(int i=1;i<array.length;i++)
        {
            if(array[i]>large)
            {
                secondLarge=large;
                large=array[i];
            }
            else if(array[i]>secondLarge)
                secondLarge=array[i];

        }
        return secondLarge;

    }
    public static void invoke_getSecondLargest()
    {
        int[] myArray={101,687,699,7664,1000,1005,4576,798,5000,685};
        int result=getSecondLargest(myArray);
        System.out.println("second largest is "+result);
    }
    //16.Function to print unique element in an integer array printUniqueelment?

    public static void Unique(int[] array)
    {
        for(int readIndex=0;readIndex<array.length;readIndex++)
        {
            boolean flage=false;
            for(int compareIndex=0;compareIndex<array.length;compareIndex++)
            {
                if(readIndex==compareIndex)
                    continue;
                else if(array[readIndex]==array[compareIndex])
                {
                    flage=true;
                    break;
                }
            }
            if(flage==false)
                System.out.printf("%d  ",array[readIndex]);
        }
    }
    public static void invoke_Unique()
    {
        int[] array={4,3,4,5,6,7,1,1,3};
        Unique(array);
    }
    //17.Function  to print intrsection or common elements of two integer arrays?
    
    public static void Intersection(int[] array1,int[] array2)
    {
        for(int i=0;i<array1.length;i++)
        {
            boolean isFound=false;
            for(int j=0;j<array2.length;j++)
            {
                if(array1[i]==array2[j])
                {
                    isFound=true;
                    break;
                }
                    
            }
            if(isFound)
                System.out.printf("%d ",array1[i]);
        }
    }
    public static void invoke_Intersection()
    {
        int[] friend1={1,23,4,5,8,2};
        int[] friend2={1,2,3,4,5,7,23};
        Intersection(friend1,friend2);
    }
    //18.Function to get count of words in the string ?

    public static int getCountWords(String sentence)
    {
        if(sentence==null)
            return 0;
        
        int count=0;
        boolean isWord=false;
        //char[] array=sentence.toCharArray();
        //int length=array.length;
        int length=sentence.length();
        for(int i=0;i<length;i++)
        {   
            char oneChar=sentence.charAt(i);
            if(oneChar==' '|| oneChar=='\t' || oneChar=='\n')
            {
                if(isWord)
                {
                    count++;
                    isWord=false;
                }
            }
            else
            {
                isWord=true;
            }
        }
        if(isWord)
            count++;
        return count;
    }
    public static void invoke_getCountWords()
    {
        String str="hello  world hi cd gtyf gfgfyjd";
        int result=getCountWords(str);
        System.out.println("number of words= "+result);
    }

    //19.Function to print binary values of various input like integer ,char,also perform shift operation on integer?
    
    public static void printBinary(int number)
    //When give only int then it is both positivt and negative (singed) number  
    {
        if(number<0)
            return;
        int mask=1;//00000000000000000000000000000001 (for 32 bit system)
        int Bites=Integer.BYTES*8;//to find the number of bits in this system
        mask=mask<<(Bites-2);//10000000000000000000000000000000
        System.out.println("\nbinary reprsenataion of "+number);
        while(mask>0)
        {
            int result= mask & number;//it for doing bit and bte number and mask if result 0 then pf(0) otherwice pf(1)
            if(result==0)
                System.out.print("0");
            else
                System.out.print("1");
            mask=mask>>1;//to move one-one bit for each iteration
        }

    }

    public static void invoke_printBinary()
    {
        printBinary(2);
        printBinary(3);
        printBinary(5);
        printBinary(100);
    }
    //20.Function to remove spaces from the string ?

    public static void removeSpace(String input)
    {
        int length=input.length();
        for(int index=0;index<length;index++)
        {
            char character=input.charAt(index);
            if(character==' ')
                continue;
            System.out.printf("%c",character);
        }
    }
    static void invoke_removeSpace()
    {
        String str;
        System.out.println("enter the string ");
        Scanner read=new Scanner(System.in);
        str=read.nextLine();
        read.close();
        removeSpace(str);
    }
    public static void main(String[] args)
    {
        invoke_removeSpace();

    }

}