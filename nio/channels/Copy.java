import java.io.*;
import java.nio.*;
import java.nio.channels.*;
public class Copy{
	public static void main(String... args){
		try(
		FileInputStream fis=new FileInputStream("abc.mp3");
		FileOutputStream fos =new FileOutputStream("xyz.mp3");
		FileChannel inChannel=fis.getChannel();
		FileChannel outChannel=fos.getChannel();){
		ByteBuffer buff = ByteBuffer.allocate((int)inChannel.size());
			inChannel.read(buff);
			buff.flip();
			outChannel.write(buff);
			}
	
			catch(IOException e){
				e.printStackTrace();
			}
		}	
}
		
