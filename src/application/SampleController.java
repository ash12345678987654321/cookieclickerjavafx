package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import java.util.Timer;
import java.util.TimerTask;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

public class SampleController {
	@FXML
	private ImageView big_cookie;
	@FXML
	private Button btn;
	@FXML
	private Label num;
	@FXML
	private Label cps;
	Timer timer=new Timer();
	private long a=0;
	private long start_time;
	// Event Listener on Button[#btn].onAction
	@FXML
	public void addcookie(ActionEvent event) throws InterruptedException {
		timer.schedule(new TimerTask() {
			public void run() {
				big_cookie.setOpacity(1.0);
			}}, 50);
		if (a==0) start_time=System.currentTimeMillis()-1;
		num.setText("Cookies: "+(++a));
		cps.setText("CPS: "+String.format("%.2f",(double)a*1000/(System.currentTimeMillis()-start_time)));
		big_cookie.setOpacity(0.0);
	}
}
