package com.mikefullen.examples;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import net.miginfocom.swing.MigLayout;

/**
 *
 * @author mfullen
 */
public class MainApp
{
    public static void main(String[] args)
    {
        createAndShow("Swing Panel", new MoviePanel());
        createAndShow("Mig Layout", createMigLayoutPanel());
    }

    public static JPanel createMigLayoutPanel()
    {
        JPanel panel = new JPanel();
        JTextField title = new JTextField();
        JTextField descrption = new JTextField();
        JTextField releasedate = new JTextField();
        JTextField category = new JTextField();


        //allow 2 components per line
        panel.setLayout(new MigLayout("wrap 2"));
        panel.setBorder(BorderFactory.createTitledBorder("Movie"));

        panel.add(new JLabel("Title"));
        //grow in the x direction and span the space
        panel.add(title, "span,growx, w 150!");

        panel.add(new JLabel("Description"));
        panel.add(descrption, "growx");

        panel.add(new JLabel("Release Date"));
        panel.add(releasedate, "growx");

        panel.add(new JLabel("Category"));
        panel.add(category, "growx");
        return panel;
    }

    public static void createAndShow(String title, JPanel panel)
    {
        JFrame frame = new JFrame(title);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
