
package txtOut;

import java.io.FileWriter;
import java.io.IOException;

public class RunTimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String fName = "/Users/josephmusngi/Desktop/TCSS343/HW/HW4/txtOut.txt"; //your path
		int[] R = {1,2,3,4,5,7,10,11};	//input runtimes
	
		toText(R, fName);

	}//end main
	
	public static void toText(int []Runtimes, String fileName) {
		
		try {
			FileWriter fw = new FileWriter(fileName);
			for(int i = 0; i< Runtimes.length; i++) {
				if (i<=Runtimes.length-2) {
					if(i==0) {
						fw.append("{");
						fw.append(Integer.toString(Runtimes[i]));
						fw.append(",");
					}
					else {
					fw.append(Integer.toString(Runtimes[i]));
					fw.append(",");	
					}
				}
				else {
					fw.append(Integer.toString(Runtimes[i]));
					fw.append("}");
				}
			}
			fw.flush();
			fw.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
	
	

}