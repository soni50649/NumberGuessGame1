import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class numberGuessGame {

    private JButton guessButton;
    private JPanel myPanel;
    private JTextField myNumber;
    private JTextField message;
    private JTextField computerNumber;

    public numberGuessGame() {

        guessButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int myNo = Integer.parseInt(myNumber.getText());
                int no2 = (int) ((Math.random() * 100) + 1);
                int tryCount = 0;
                final int maxTryCount = 5;


                //message.setText("Enter your guess ( 1 - 100 ):");


                    if (myNo == no2) {
                        message.setText("Correct! You Win!");
                        message.setText("It took you " + tryCount + " tries");

                    } else if (myNo + 1 == no2 || myNo - 1 == no2) {
                        message.setText("Close! Better luck next time.");
                    } else {
                        message.setText("You lost! The number was: " + no2);
                    }
                        computerNumber.setText(Integer.toString(no2));

                }

        });
    }


    public static void main(String[] args) {
    JFrame frame = new JFrame("Number Guessing Game");
    frame.setContentPane(new numberGuessGame().myPanel);
    frame.setSize(450,350);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    }
}
