package com.jap;

public class StringMethodDemo
{
    public static void main( String[] args )
    {
        StringMethodDemo stringManipulation = new StringMethodDemo();
        String string[]= {"Tommy","JOHN","JeNNy","Robert"};
        stringManipulation.getLength(string);
        System.out.println("------------------");
        stringManipulation.getAllUpperCase(string);
        System.out.println("------------------");
        stringManipulation.getAllStartsWithJ(string,"J");
        System.out.println("--------------------------------");
        stringManipulation.countAllVowels(string);
    }

    public void getLength(String [] string){
        for (int i = 0; i < string.length; i++) {
            System.out.println(string[i].length());
        }

    }

    public void getAllUpperCase(String [] string){
        for (int i = 0; i < string.length; i++) {
            System.out.println(string[i].toUpperCase());
        }
    }


    public void getAllStartsWithJ(String [] string,String startsWith){
        for (int i = 0; i < string.length; i++) {
            boolean flag = string[i].startsWith(startsWith);
            System.out.println(string[i] + " : " + flag );
        }
    }

    public void countAllVowels(String[] string){
        int count = 0;
        for (int i = 0; i < string.length; i++) {
            char ch[]= string[i].toCharArray();
            for (int j = 0; j < ch.length; j++) {
                if(ch[j] == 'a'||ch[j] == 'e'||ch[j] == 'i'||ch[j] == 'o'||ch[j] == 'u'){
                    count ++;
                }
            }
            System.out.println(string[i] + " Vowels " + count);
            count=0;
        }
    }








}
