import java.io.*;
public class printWriter
{
	static java.io.File outFile;
	public static void main(String[] args) throws IOException
	{
	outFile= new java.io.File("plzwork.txt");
	java.io.PrintWriter fout = new java.io.PrintWriter(outFile);
	fout.print("here");;
	fout.close();
	}
}
