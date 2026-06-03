package org.example.Driver;

import org.example.Dao.Dbutil;
import org.example.Entity.Student;

import java.util.Scanner;

public class StudentDriver {

    private static int choice = 0;
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Dbutil dbutil = new Dbutil();

        Dbutil.connectToDb();

        do {

            System.out.println(
                    "\n1.Insert\n2.Delete\n3.Update\n4.DisplayAll\n5.GetById\n0.Exit");

            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    Student s1 = new Student();

                    System.out.println("Enter id");
                    s1.setId(sc.nextInt());

                    sc.nextLine();

                    System.out.println("Enter name");
                    s1.setName(sc.nextLine());

                    System.out.println("Enter Course");
                    s1.setCourse(sc.nextLine());

                    int rws = dbutil.insert(s1);

                    if (rws > 0) {
                        System.out.println("Inserted Successfully");
                    } else {
                        System.out.println("Issue in inserting");
                    }
                    break;

                case 2:

                    System.out.println("Enter ID");

                    if (dbutil.deleteByid(sc.nextInt())) {
                        System.out.println("Data Deleted");
                    } else {
                        System.out.println("Issue in deleting");
                    }
                    break;

                case 3:

                    Student st = new Student();

                    System.out.println("Enter id to Update");
                    st.setId(sc.nextInt());

                    sc.nextLine();

                    System.out.println("Enter New Name");
                    st.setName(sc.nextLine());

                    System.out.println("Enter New Course");
                    st.setCourse(sc.nextLine());

                    if (dbutil.update(st) > 0) {
                        System.out.println("Updated...");
                    } else {
                        System.out.println("Issue in updating");
                    }
                    break;

                case 4:
                    dbutil.DisplayAll();
                    break;

                case 5:

                    System.out.println("Enter id");
                    dbutil.getByid(sc.nextInt());
                    break;

                case 0:
                    System.out.println("Exit");
                    break;

                default:
                    System.out.println("Enter Valid Choice");
            }

        } while (choice != 0);
    }
}