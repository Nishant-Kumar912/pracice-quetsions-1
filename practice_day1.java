package com.company;

public class practice_day1 {
    //Nishant kumar
    public static void main(String[] args) {
        //1.write a programme to check a number even or not
       /* int num;
        System.out.println("enter a number");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        if(num%2==0){
            System.out.println("number is even");
        }
        else{
            System.out.println("Number is not even");
        }

    }*/
        //2.programme for fibonacci series
       /* int count, num1 = 0, num2 = 1;
        System.out.println("enter the number you want in the sequence");
        Scanner sc = new Scanner(System.in);
        count = sc.nextInt();
        System.out.println("Fibonacci series of " + count + " numbers:");

        int i = 1;
        while (i <= count) {
            System.out.println(num1 + " ");
            int sumofPreviousTwo = num1 + num2;
            num1 = num2;
            num2 = sumofPreviousTwo;
            i++;
        }*/
        //3.programme for armstrong number in a range
       /* Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b= sc.nextInt();

        armstronginrange(a,b);

    }
    static void armstronginrange(int a,int b){
        for(int i=a;i<=b;i++){
            int num=i;
            int sum=0;

            while(num>0){
                int remainder = num % 10;
                sum=sum+(remainder*remainder*remainder);
                num=num/10;
            }
            if(sum==i){
                System.out.println(sum);
            }
        }
    }*/
        //5.program to find first and last digit of a number
       /* int number, firstdigit, lastdigit;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        number = sc.nextInt();

        firstdigit = number;
        while (firstdigit >= 10) {
            firstdigit = firstdigit / 10;
        }
        lastdigit = number % 10;

        System.out.println("the first digit of " + number + "=" + firstdigit);
        System.out.println("the last digit of" + number + "=" + lastdigit);
    }*/
        //6. program to print the pattern


        /* int i, j, row = 4;
        //i for rows,j for columns
        for (i = 0; i<row;i++){
            for ( j = 0; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }*/
        //6.ii

        }
    }
