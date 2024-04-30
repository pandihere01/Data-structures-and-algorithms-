import java.util.*;

public class Stack{

    int[]nums = new int[5];

    int top = 0;

    public void push(int num){
        
        nums[top]= num;
        top++;
    }

    public int pop(){

        int data ; 
        top--;
        data = nums[top];
        nums[top] = 0;
        return data;
    }

    public int peek(){

        int data;
        data = nums[top-1];
        
        return data;
    }

    public int size(){

        return top;
    }
    
    public boolean isEmpty(){

        if(top <= 0){

            return true;
        }
        return false;
    }

    public void show(){

        for(int num : nums){

            System.out.print(num + " ");
        }
    }
}