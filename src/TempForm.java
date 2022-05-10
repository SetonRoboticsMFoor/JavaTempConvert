import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TempForm extends JFrame {
    private JTextField promtInput;
    private JButton convertBtn;
    private JPanel tempForm;
    private JLabel promptLbl;
    private JLabel responseLbl;

    public TempForm(JFrame parent) {

        setTitle("Temperature Converter");
        setContentPane(tempForm);
        setMinimumSize(new Dimension(350, 200));
        setLocationRelativeTo(parent);
        setSize(350, 200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        convertBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String userInput = promtInput.getText();
                double tempCel = (Double.parseDouble(userInput) - 32) * (5.0 / 9.0);

                int rounded = (int) tempCel;

                responseLbl.setText(String.valueOf(rounded));
            }
        });
    }

    public static void main(String[] args) {
        TempForm myForm = new TempForm(null);
    }
}
