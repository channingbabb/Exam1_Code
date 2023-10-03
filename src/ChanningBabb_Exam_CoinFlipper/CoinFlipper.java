package ChanningBabb_Exam_CoinFlipper;

import javax.swing.*;

public class CoinFlipper {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Coin Flipper");
        CoinFlipperPanel coinFlipperPanel = new CoinFlipperPanel();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(coinFlipperPanel);
        frame.pack();
        frame.setVisible(true);
    }

}
