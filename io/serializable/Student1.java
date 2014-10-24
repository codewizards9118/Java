import java.io.*;
	public class Student implements Serializable{
		private String name;
		private int rollNo;
		public Student(String name, int rollNo){
			this.name=name;
			this.rollNo=rollNo;
		}
		public String toString(){
			return name+"   "+rollNo;
		}
		
	}
	class Test{
		public static void main(String... args){
			//Student s=new Student("mukul",4);
			try(
			FileInputStream fis=new FileInputStream("Stu.dat");
			ObjectInputStream ois =new ObjectInputStream(fis);){
			Student s =(Student) ois.readObject();
			System.out.println(s);
			}
			catch(IOException e){
				e.printStackTrace();
				
			}
			catch(ClassNotFoundException c){}
				
		}
	}
