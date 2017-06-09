package chat;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPaddress {

	TextField inputText;
	TextArea output;
	
	public void work() {
		Frame f = new Frame("IPaddress");
		output = new TextArea();
		inputText = new TextField("type hostname");

		inputText.addActionListener(new AddressListener());
		f.add(output, "Center");
		f.add(inputText, "South");
		f.setSize(400, 300);
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});

		try {
			InetAddress inetaddr1 = InetAddress.getLocalHost();
			output.append("\nYour Hostname is :" + inetaddr1.getHostName());
			output.append("\nYour IP address is :" + inetaddr1.getHostAddress());
		} catch (UnknownHostException e) {
			System.out.println("error with ip address");
		}

	}

	class AddressListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			String h_name = inputText.getText();
			InetAddress inetaddr2;
			try {
				inetaddr2 = InetAddress.getByName(h_name);
				output.append("\n\nFor the Host:" + inetaddr2.getHostName());
				output.append("\nIP address is :" + inetaddr2.getHostAddress());
			} catch (UnknownHostException e1) {
				e1.printStackTrace();
			}
		}

	}

	public static void main(String[] args) {
		new IPaddress().work();
	}

}
