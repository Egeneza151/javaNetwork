package javanetworkclient.mainWindow;

import java.awt.*;
import java.awt.event.*;

public class MainWindow extends Frame {
    MenuBar menuBar = new MenuBar();
    Menu menu = new Menu("File");
    MenuItem fileItem = new MenuItem("Settings");
    public MainWindow() {
        menu.add(fileItem);
        menuBar.add(menu);
       setMenuBar(menuBar);
        
        setTitle("Cloud backup - ");
        setSize(300, 500);
        setLayout(new FlowLayout());
        setLocationRelativeTo(null);
        setVisible(true);        
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }
}
