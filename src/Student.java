import java.util.Objects;
import java.util.Scanner;

public class Student {
    String name;

    Student(String name){
        this.name= name;


    }
    public void Name(){
        if(Objects.equals(name, " ")){
            System.out.println("unknown");
        }
        else{
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        Student obj = new Student("Rohan");
        obj.Name();
    }
}
