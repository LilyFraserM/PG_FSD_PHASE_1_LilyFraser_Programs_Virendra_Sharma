package Phase1.coreJava.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;



public class Serializatn_deSerialzatn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    Student obj1 = new Student(101, 25, "Lily", "LA", 6);
	    Student obj2 = new Student(102, 25, "abvc", "LA", 6);
	    Student obj3 = new Student(103, 25, "xyz", "LA", 6);
	    Object[] obj=new Object[]{obj1,obj2,obj3};
	    
	 /*   
	    //Create the multiple Objects
      //  SerializeMe serializeMe = new SerializeMe(1);
      //  SerializeMe serializeMe1 = new SerializeMe(10);
      //  SerializeMe serializeMe2 = new SerializeMe(100);
       // SerializeMe serializeMe3 = new SerializeMe(1000);

        //Create an array and assign objects
        Object[] obj=new Object[]{obj1,obj2,obj3};
        // Write object array to Stream Class
        oos.writeObject(obj);
        oos.close();

        //Process of Deserializable
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);

        //create an array of Object class
        Object[] obj1=(Object[]) ois.readObject();

        //looping the array
        for(int i=0;i<obj1.length;i++){

            SerializeMe dto = (SerializeMe) obj1[i];
            System.out.println("data : " + dto.getData());
        }
        ois.close();*/
	    
        for(int i=0;i<obj.length;i++){ 
	    
	    try{ 
	      FileOutputStream fos = new FileOutputStream("C:\\Users\\lilyf\\OneDrive\\Documents\\Phase1\\Student.txt"); 
	      ObjectOutputStream oos = new ObjectOutputStream(fos);
	      oos.writeObject(obj);
	      oos.close();
	      fos.close();
	      System.out.println("Serialzation Done!!");
	   }catch(IOException ioe){
	      System.out.println(ioe);
	    }
        }
     //Deserialization
     Student o=null;
     try{
       FileInputStream fis = new FileInputStream("C:\\Users\\lilyf\\OneDrive\\Documents\\Phase1\\Student.txt");
       ObjectInputStream ois = new ObjectInputStream(fis);
       o = (Student)ois.readObject();
       ois.close();
       fis.close();
     }
     catch(IOException ioe)
     {
        ioe.printStackTrace();
        return;
     }catch(ClassNotFoundException cnfe)
      {
        System.out.println("Student Class is not found.");
        cnfe.printStackTrace();
        return;
      }
     System.out.println("Student Name:"+o.getStuName());
     System.out.println("Student Age:"+o.getStuAge());
     System.out.println("Student Roll No:"+o.getStuRollNum());
     System.out.println("Student Address:"+o.getStuAddress());
     System.out.println("Student Height:"+o.getStuHeight());
  

	}

}
class Student implements java.io.Serializable{
	  
	  private int stuRollNum;
	  private int stuAge;
	  private String stuName;
	  private transient String stuAddress;// transient keyword means that that field needn't be serialized
	  private transient int stuHeight;
	 
	  public Student(int roll, int age, String name,
	  String address, int height) {
	    this.stuRollNum = roll;
	    this.stuAge = age;
	    this.stuName = name;
	    this.stuAddress = address;
	    this.stuHeight = height;
	  }
	 
	  public int getStuRollNum() {
	    return stuRollNum;
	  }
	  public void setStuRollNum(int stuRollNum) {
	    this.stuRollNum = stuRollNum;
	  }
	  public int getStuAge() {
	    return stuAge;
	  }
	  public void setStuAge(int stuAge) {
	    this.stuAge = stuAge;
	  }
	  public String getStuName() {
	    return stuName;
	  }
	  public void setStuName(String stuName) {
	    this.stuName = stuName;
	  }
	  public String getStuAddress() {
	    return stuAddress;
	  }
	  public void setStuAddress(String stuAddress) {
	    this.stuAddress = stuAddress;
	  }
	  public int getStuHeight() {
	    return stuHeight;
	  }
	  public void setStuHeight(int stuHeight) {
	    this.stuHeight = stuHeight;
	  }
	}
