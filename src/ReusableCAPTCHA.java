import javax.swing.*;
public class ReusableCAPTCHA extends JFrame {
    private JLabel captchaLabel;
    private JTextField captchaTextField;
    private JButton generateButton;
    private String generatedCaptcha;

    public ReusableCAPTCHA(){
        setTitle("Captcha Generator");
        setSize(500,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
}
