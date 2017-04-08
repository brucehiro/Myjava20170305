package tw.org.iii;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Java20170408_windows {

	public static void main(String[] args) {
		WindowsProgram w1 = new WindowsProgram();

	}

}


class WindowsProgram extends JFrame
{
	private JButton open, save, exit;
	private JFileChooser filechooser = new JFileChooser();
	private JTextArea showfile = new JTextArea();
	private File file;
	
	WindowsProgram()
	{
		setLayout(new BorderLayout());
		
		open = new JButton("open");
		open.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				filechooser.showOpenDialog(null);
				file = filechooser.getSelectedFile();
				
				try
				{
					FileReader fr = new FileReader(file);
					BufferedReader br = new BufferedReader(fr);
					String input;
					while((input = br.readLine()) != null)
					{
						showfile.append(input + '\n');
					}
					
				}
				catch (Exception ee)
				{
					System.out.println(ee.toString());
				}
				
			}
		});
		save = new JButton("save");
		exit = new JButton("exit");
		
		JPanel top = new JPanel(new FlowLayout());
		top.add(open); top.add(save); top.add(exit);
		
		add(top, BorderLayout.NORTH);
		add(showfile, BorderLayout.CENTER);
		
		setSize(640,480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}