import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import com.gargoylesoftware.htmlunit.javascript.host.event.MouseEvent;

public class RobotTest {

	public static void main(String[] args) throws Exception {
		
		Robot rb = new Robot();
		
		rb.delay(5000);
		
		rb.keyPress(KeyEvent.VK_0);
		rb.keyRelease(KeyEvent.VK_0);
		
		rb.keyPress(KeyEvent.VK_1);
		rb.keyRelease(KeyEvent.VK_1);
		
		rb.keyPress(KeyEvent.VK_2);
		rb.keyRelease(KeyEvent.VK_2);
		
		rb.keyPress(KeyEvent.VK_3);
		rb.keyRelease(KeyEvent.VK_3);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		
		rb.keyPress(KeyEvent.VK_0);
		rb.keyRelease(KeyEvent.VK_0);
		
		rb.keyPress(KeyEvent.VK_1);
		rb.keyRelease(KeyEvent.VK_1);
		
		rb.keyPress(KeyEvent.VK_2);
		rb.keyRelease(KeyEvent.VK_2);
		
		rb.keyPress(KeyEvent.VK_3);
		rb.keyRelease(KeyEvent.VK_3);
		
		
	}

}
