import java.util.Scanner;

public class Students {
    String name;
    String name1;
    float percentage;
    float percentage1;


    Students(String name,String name1){
        this.name=name;
        this.name1=name1;

    }
}
class Test extends Students{
    float maths, eng, sst;
    float maths1, eng1, sst1;

    Test(String name,String name1){
        super(name,name1);

        Scanner s =new Scanner(System.in);
         maths = s.nextFloat();
         eng=s.nextFloat();
          sst = s.nextFloat();
         maths1 = s.nextFloat();
          eng1= s.nextFloat();
           sst1= s.nextFloat();
    }
    public void topper(){
        percentage=(maths+eng+sst)/3;
        percentage1=(maths1+eng1+sst1)/3;
        if(percentage>percentage1){
            System.out.println(name);
        }
        else{
            System.out.println(name1);
        }
    }

    public static void main(String[] args) {
        Test obj=new Test("Rohan","Raghav");
        obj.topper();
    }
}
