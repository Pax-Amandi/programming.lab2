package ru.spb.herzen.ivt3;

import org.kohsuke.randname.RandomNameGenerator;

import java.util.Arrays;

public class App
{
    public static void main( String[] args )
    {
        RandomNameGenerator rand = new RandomNameGenerator(0);

        String[] array = new String[15];

        /*task_1*/
        System.out.println("Task one");
        for(int i=0; i<15; i++){
            String name = rand.next();
            array[i] = name;
        }
        for(String tmp : array){
            System.out.println("Hello, " + tmp);
        }

        /*task_2*/
        System.out.println("\nTask two");
        Arrays.sort(array);
        for(String tmp : array){
            System.out.println("Hello, " + tmp);
        }

        /*task_3*/
        System.out.println("\nTask three");
        for(int i=2; i<5; i++){
            System.out.println("Hello, " + array[i]);
        }

        /*task_4*/
        System.out.println("\nTask four");
        for(int i=0; i<15; i++){
            array[i] = array[i].toUpperCase();
        }
        for(int i=0; i<15; i++){
            System.out.println("Hello, " + array[i]);
        }

        /*task_5*/
        System.out.println("\nTask five");
        int[] num_array = new int[30];

        for(int i=0; i<15; i++){
            String name = rand.next();
            num_array[i] = (int) Math.floor(Math.random()*201);
        }
        int count = 0;
        for(int i=0; i<15; i++){
            if(num_array[i]%2==0){
                count++;
            }
            System.out.println(i + " : " + num_array[i]);
        }
        System.out.println("Even numbers: " + count);

        /*task_6*/
        System.out.println("\nTask six");
        String my_name = "Dmitry";
        char[] char_array = my_name.toCharArray();
        Arrays.sort(char_array);
        for(char x : char_array){
            System.out.println(x);
        }

        /*task_7*/
        System.out.println("\nTask seven");
        count = 0;
        char[] vowels_array= {'A','E','I','O','U','a','e','i','o','u'};
        char tmp_char='\0';
        for(char x : char_array){
            if(Arrays.binarySearch(vowels_array, x)>0){
                if(x!=tmp_char) {
                    tmp_char = x;
                    count++;
                }
            }
        }
        System.out.println("Different vowels in the name: "+count);
    }
}