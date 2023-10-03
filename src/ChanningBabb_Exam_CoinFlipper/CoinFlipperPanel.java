package ChanningBabb_Exam_CoinFlipper;

import javax.swing.*;

/**
 * coin flipper panel class
 */
public class CoinFlipperPanel extends JPanel {
    // create buttons/jlabels
    public static JButton flipButton;
    public static JButton resetButton;
    public static JLabel coinImage;
    public static JLabel tallyLabel;

    // create tally variables
    public int headsTally = 0;
    public int tailsTally = 0;

    // coin class
    public Coin coin;


    //flip button action listener
    public void flipButtonListener() {
        flipButton.addActionListener(e -> {
            coin.flip();
            this.remove(coinImage);
            coinImage = new JLabel(coin.returnIcon());
            this.add(coinImage);
            if (coin.getState().equals("heads")) {
                headsTally++;
            } else {
                tailsTally++;
            }
            tallyLabel.setText("Heads: " + headsTally + " Tails: " + tailsTally);
        });
    }

    //reset button action listener
    public void resetButtonListener() {
        resetButton.addActionListener(e -> {
            headsTally = 0;
            tailsTally = 0;
            // check state of coin
            if (coin.getState().equals("heads")) {
                headsTally++;
            } else {
                tailsTally++;
            }
            tallyLabel.setText("Heads: " + headsTally + " Tails: " + tailsTally);
        });
    }

    /**
     * Constructor for the CoinFlipperPanel
     * This will instantiate the GUI as well.
     */
    public CoinFlipperPanel() {
        coin = new Coin();
        flipButton = new JButton("Flip");
        resetButton = new JButton("Reset");
        flipButtonListener();
        resetButtonListener();


        // check state of coin
        if (coin.getState().equals("heads")) {
            headsTally++;
        } else {
            tailsTally++;
        }

        // get coin image
        coinImage = new JLabel(coin.returnIcon());

        // create tally label
        tallyLabel = new JLabel("Heads: " + headsTally + " Tails: " + tailsTally);

        super.add(flipButton);
        super.add(resetButton);
        super.add(tallyLabel);
        super.add(coinImage);
    }

}
