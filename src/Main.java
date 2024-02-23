//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Student3{
    int id;
    static String school;
    String name;
    Student3(int id,String name,String school){
        this.id=id;
        this.name=name;
        this.school=school;
    }
    //method to display the value of id and name
    void display(){
        System.out.println(id+" "+name+" "+school);
    }


}
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Student3 s1=new Student3(12,"dan","iit");
        s1.display();
        System.out.println(Student3.school);
    }
}