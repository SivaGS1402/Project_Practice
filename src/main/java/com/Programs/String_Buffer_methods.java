package com.Programs;

public class String_Buffer_methods {

	public static void main(String[] args) {
		
		String s = "Welcome to Greens";
		
		StringBuffer stringBuffer = new StringBuffer(s);

        stringBuffer.append(", Tech!");
        System.out.println("After append: " + stringBuffer);

        stringBuffer.insert(11, " Porur");
        System.out.println("After insert: " + stringBuffer);
        
        stringBuffer.reverse();
        System.out.println("After reverse: " + stringBuffer);

        stringBuffer.delete(1, 10);
        System.out.println("After delete: " + stringBuffer);

        stringBuffer.setCharAt(0, 'h');
        System.out.println("After setCharAt: " + stringBuffer);

        int length = stringBuffer.length();
        System.out.println("Length of the StringBuffer: " + length);

        int capacity = stringBuffer.capacity();
        System.out.println("Capacity of the StringBuffer: " + capacity);

        stringBuffer.ensureCapacity(20);
        System.out.println("After ensureCapacity: " + stringBuffer);
	}
}
