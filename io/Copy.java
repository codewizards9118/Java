import java.io.*;
public class Copy{
	public static void main(String... args){
		try(
				FileInputStream fis=new FileInputStream("abc.mp3");
				FileOutputStream fos=new FileOutputStream("xyz.mp3");){
				fis.available();
				int c=0;
					while((c=fis.read())!=-1){
						fos.write(c);
					}
				}
		catch(IOException e){
			 e.printStackTrace();
		}
	}
}
