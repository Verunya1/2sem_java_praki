package practice4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LabExample extends JFrame {


    public static void main(String[] args) {
        new BorderExample();
    }

}

class BorderExample extends JFrame implements ActionListener {

    JButton btnMadrid;
    JButton btnMilan;
    JLabel lastScorer, winner, result,filler;
    int milanScore = 0;
    int madridScore = 0;
    String lastScorerS;

    public BorderExample() {
        setLayout(new GridLayout(2, 3));


        Font fnt = new Font("Roboto", Font.BOLD, 20);
        this.btnMilan = new JButton("AC Milan");
        this.btnMilan.setFocusable(false);
        this.btnMilan.addActionListener(this);

        this.btnMadrid = new JButton("Real Madrid");
        this.btnMadrid.setFocusable(false);
        this.btnMadrid.addActionListener(this);

        this.lastScorer = new JLabel("Last Scorer: N/A");
        this.winner = new JLabel("Winner: DRAW");
        this.result = new JLabel("Result 0 X 0");
        this.filler = new JLabel("");


        this.add(lastScorer);
        this.add(result);
        this.add(winner);

        this.add(btnMadrid);
        this.add(filler);
        this.add(btnMilan);

        setSize(500, 400);
        this.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.btnMilan) {
            milanScore++;
            lastScorerS = "AC Milan";
            this.update();
        } else if (e.getSource() == this.btnMadrid) {
            madridScore++;
            lastScorerS = "Real Madrid";
            this.update();
        }
    }

    public void update() {
        this.lastScorer.setText("Last Scorer: " + lastScorerS);
        this.result.setText("Result " + madridScore + " X " + milanScore);
        this.winner.setText("Winner: " + ((madridScore==milanScore)? "DRAW" : (madridScore>milanScore)? "Real Madrid" : "AC Milan"));
    }

}