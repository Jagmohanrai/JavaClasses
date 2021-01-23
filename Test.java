package test;

public class Test {

    public static void main(String[] args) {
     
       Student smiti=new Student("Smiti",100,"CSE");
        smiti.showbranch();
        smiti.showname();
        smiti.showroll();
     
    }
}
class Student{
    String name;
    int roll;
    String branch;
    Student(String n,int r,String b){
    branch=b;
    roll=r;
    name=n;
    }
    
    void showbranch(){
    System.out.println(branch);
    }
    void showroll(){
    System.out.println(roll);
    }
    void showname(){
    System.out.println(name);
    }
}