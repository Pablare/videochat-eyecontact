import javax.swing.JFrame;

import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamPanel;


public class test {

	public static void main(String[] args) {
		Webcam webcam = Webcam.getWebcams().get(1);
		if (webcam != null) {
			System.out.println("Webcam: " + webcam.getName());
			
			WebcamPanel panel = new WebcamPanel(webcam);
			panel.setFPSDisplayed(true);

			JFrame window = new JFrame("Test webcam panel");
			window.add(panel);
			window.setResizable(true);
			window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			window.pack();
			window.setVisible(true);
		} else {
			System.out.println("No webcam detected");
		}
		
		

	}

}
