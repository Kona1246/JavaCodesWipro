package Day10;
import java.io.*;


class Student6 implements Serializable {
 private static final long serialVersionUID = 1L;

 private String name;
 private int age;

 public Student6(String name, int age) {
     this.name = name;
     this.age = age;
 }

 public Student6() {
     
 }

 public String getName() {
     return name;
 }

 public void setName(String name) {
     this.name = name;
 }

 public int getAge() {
     return age;
 }

 public void setAge(int age) {
     this.age = age;
 }
}

public class SerilazationDemo {
 public static void main(String[] args) throws IOException, ClassNotFoundException {
     Student6 s1 = new Student6();
     s1.setName("Sayantani");
     s1.setAge(25);

     
     String filePath = "C:\\Users\\sayan\\Downloads\\outputdemo.txt";

    
     FileOutputStream out = new FileOutputStream(filePath);
     ObjectOutputStream output = new ObjectOutputStream(out);
     output.writeObject(s1);
     output.close();
     out.close();

     
     FileInputStream in = new FileInputStream(filePath);
     ObjectInputStream input = new ObjectInputStream(in);
     Student6 s2 = (Student6) input.readObject();
     input.close();
     in.close();

     
     System.out.println("Name: " + s2.getName());
     System.out.println("Age: " + s2.getAge());
 }
}
