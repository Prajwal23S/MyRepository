import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class FrameExample 
{
 	private Frame f;
 	public FrameExample() 	{
     		f = new Frame("Hello .....!");
 	}
 	public void launchFrame() 
	{
 		f.setSize(200,200);
	 	f.setBackground(Color.blue);
	 	f.setVisible(true);	
	// Add a window listener
	
	 f.addWindowListener(new WindowAdapter(){
	public void windowClosing(WindowEvent evt)
	{
		System.exit(0);
	}
	});   //Anonymous Inner Classes 

	 }



 	public static void main(String args[]) 
	{
		FrameExample f = new FrameExample();
		f.launchFrame();
	}
}
