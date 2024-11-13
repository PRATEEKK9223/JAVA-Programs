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

    public static void main()
    {
        boolean result=isDigit("876521");
        if(result)
            System.out.println("yes it digit \n");
        else
            System.out.println("no it not digit\n");

    }
    
    
}