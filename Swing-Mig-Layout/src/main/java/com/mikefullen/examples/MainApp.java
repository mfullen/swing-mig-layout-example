/* 
 * The MIT License
 *
 * Copyright 2014 mfullen.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
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
