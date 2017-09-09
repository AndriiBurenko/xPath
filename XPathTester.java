package xPath;

import javax.swing.*;
import java.awt.*;

public class XPathTester {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new XPathFrame();
                frame.setTitle("XPathTest");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }


}
