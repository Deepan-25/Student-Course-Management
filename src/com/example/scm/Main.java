package com.example.scm;
import java.util.*;

public class Main {
    private static ManagementSystem ms = new ManagementSystem();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1 Add Student 2 Add Course 3 Enroll 4 Show Student 0 Exit");
            int ch = Integer.parseInt(sc.nextLine());
            try {
                if (ch == 1) {
                    System.out.print("ID: "); int id = Integer.parseInt(sc.nextLine());
                    System.out.print("Name: "); String n = sc.nextLine();
                    ms.addStudent(new Student(id, n));
                } else if (ch == 2) {
                    System.out.print("CID: "); String cid = sc.nextLine();
                    System.out.print("CName: "); String cn = sc.nextLine();
                    ms.addCourse(new Course(cid, cn));
                } else if (ch == 3) {
                    System.out.print("SID: "); int sid = Integer.parseInt(sc.nextLine());
                    System.out.print("CID: "); String cid = sc.nextLine();
                    ms.enrollStudentInCourse(sid, cid);
                } else if (ch == 4) {
                    System.out.print("SID: "); int sid = Integer.parseInt(sc.nextLine());
                    System.out.println(ms.getStudent(sid));
                } else if (ch == 0) return;
            } catch (Exception e) { System.out.println(e.getMessage()); }
        }
    }
}
