package com.jdbc;

import com.jdbc.entity.CreateStudent;
import com.jdbc.entity.DeleteStudent;
import com.jdbc.entity.ReadStudents;
import com.jdbc.entity.UpdateStudent;

public class App 
{
    public static void main( String[] args )
    {
    	CreateStudent.insertStudent("HR Ansari ", 19, "rnasari143@gmail.com");
    	CreateStudent.insertStudent("Hashim Ansari ", 19, "hrrnasari143@gmail.com");
        CreateStudent.insertStudent("Moiez Khan ", 20, "moiez123@gmail.com");
        CreateStudent.insertStudent("Arsalan Khan ", 21, "arsalan123@gmail.com");
        CreateStudent.insertStudent("SRK Khan ", 21, "srk123@gmail.com");
        CreateStudent.insertStudent("Altmash Khan ", 19, "altmash143@gmail.com");
        
        System.out.println("\n All Student Details here");
        ReadStudents.getAllStudents();
        System.out.println("\n");
        UpdateStudent.updateStudent(5, "Sarukh123@gmail.com");
        
        DeleteStudent.deleteStudent(6);
        System.out.println("\n");
        System.out.println("\n All Student After All Operation finish");
        ReadStudents.getAllStudents();
        
    }
}
