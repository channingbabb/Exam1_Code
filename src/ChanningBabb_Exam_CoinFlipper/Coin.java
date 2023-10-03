package ChanningBabb_Exam_CoinFlipper;

import javax.swing.*;

/**
 * Coin class
 */
public class Coin {
    private Boolean isHeads;

    /**
     * Constructor
     */
    public Coin() {
        // flip coin and set state
        flip();
    }

    /**
     * Get current state
     * @return Boolean
     */
    public String getState() {
        // ternary operator to check if isHeads is true
        return this.isHeads ? "heads" : "tails";
    }

    /**
     * Flip method
     * Randomly sets isHeads to true or false
     */
    public void flip() {
        this.isHeads = Math.random() < 0.5;
    }

    /**
     * Image icon getter
     * @return ImageIcon
     */
    public ImageIcon returnIcon() {
        if (this.isHeads) {
            return new ImageIcon("src/ChanningBabb_Exam_CoinFlipper/heads.png");
        } else {
            return new ImageIcon("src/ChanningBabb_Exam_CoinFlipper/tails.png");
        }
    }

}
