package com.tnsif.staticvariable;
//demo for static variable
public class Student {
	int sid;
	String sname;
	static String collegename="Sri indu";

    void display( ) 
    {
	System.out.println("the details of the student:" +sid+","+sname+","+Student.collegename);
    }
    }
