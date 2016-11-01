package net.sevecek;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;

public class HlavniOkno extends JFrame {

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner non-commercial license
    JPanel contentPane;
    JLabel labZralok;
    JLabel labRybaVlevo;
    JLabel labRybaVpravo;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    Timer casovac;
    Integer posunX;
    Integer posunY;
    Point poziceRyba;

    public HlavniOkno() {
        initComponents();
    }

    private void priOtevreniOkna(WindowEvent e) {
        posunX = 5;
        posunY = 5;
        casovac = new Timer(15, this::priTiknutiCasovace);
        casovac.start();
    }

    private void priZavreniOkna(WindowEvent e) {
        casovac.stop();
    }

    private void priTiknutiCasovace(ActionEvent e) {
        Point poziceZraloka;
        poziceZraloka = new Point();
        labZralok.getLocation(poziceZraloka);

        Integer x;
        Integer y;

        x = poziceZraloka.x;
        y = poziceZraloka.y;

        if (x < 0) {
            posunX = 5;
        }
        if (x + labZralok.getWidth() > contentPane.getWidth()) {
            posunX = -5;
        }
        if (y < 0) {
            posunY = 5;
        }
        if (y + labZralok.getHeight() > contentPane.getHeight()) {
            posunY = -5;
        }

        x = x + posunX;
        y = y + posunY;

        poziceZraloka.x = x;
        poziceZraloka.y = y;

        labZralok.setLocation(poziceZraloka);

    }

    private void priStiskuKlaves(KeyEvent e) {
        // TODO add your code here
    }

    private void PriStiskuKlaves(KeyEvent e) {

        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            labRybaVpravo.setVisible(false);
            labRybaVlevo.setVisible(true);
            poziceRyba = new Point();
            labRybaVlevo.getLocation(poziceRyba);
            labRybaVpravo.getLocation(poziceRyba);

            Integer x;
            Integer y;

            x = poziceRyba.x;
            y = poziceRyba.y;

            if (x > 0) {
                posunX = -5;
            }
            if (x + labRybaVlevo.getWidth() > contentPane.getWidth()) {
                posunX = -5;
            }
            if (x + labRybaVpravo.getWidth() > contentPane.getWidth()) {
                posunX = -5;
            }

            x = x + posunX;

            poziceRyba.x = x;
            poziceRyba.y = y;

            labRybaVlevo.setLocation(poziceRyba);
            labRybaVpravo.setLocation(poziceRyba);

        }
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            labRybaVpravo.setVisible(true);
            labRybaVlevo.setVisible(false);
            poziceRyba = new Point();
            labRybaVlevo.getLocation(poziceRyba);
            labRybaVpravo.getLocation(poziceRyba);

            Integer x;
            Integer y;

            x = poziceRyba.x;
            y = poziceRyba.y;

            if (x < 0) {
                posunX = 5;
            }
            if (x + labRybaVlevo.getWidth() < contentPane.getWidth()) {
                posunX = 5;
            }
            if (x + labRybaVpravo.getWidth() < contentPane.getWidth()) {
                posunX = 5;
            }
            x = x + posunX;
            poziceRyba.x = x;
            poziceRyba.y = y;

            labRybaVlevo.setLocation(poziceRyba);
            labRybaVpravo.setLocation(poziceRyba);
        }
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            if (labRybaVpravo.isVisible()) {
                labRybaVlevo.setVisible(false);
            } else {
                labRybaVlevo.setVisible(true);

            }
            poziceRyba = new Point();
            labRybaVlevo.getLocation(poziceRyba);
            labRybaVpravo.getLocation(poziceRyba);

            Integer x;
            Integer y;
            x = poziceRyba.x;
            y = poziceRyba.y;
            if (y < 0) {
                posunY = 5;
            }
            if (y + labRybaVlevo.getHeight() < contentPane.getHeight()) {
                posunY = 5;
            }
            if (y + labRybaVpravo.getHeight() < contentPane.getHeight()) {
                posunY = 5;
            }
            y = y + posunY;
            poziceRyba.x = x;
            poziceRyba.y = y;
            labRybaVlevo.setLocation(poziceRyba);
            labRybaVpravo.setLocation(poziceRyba);
        }
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            if (labRybaVpravo.isVisible()) {
                labRybaVlevo.setVisible(false);
            } else {
                labRybaVlevo.setVisible(true);

            }
            poziceRyba = new Point();
            labRybaVlevo.getLocation(poziceRyba);
            labRybaVpravo.getLocation(poziceRyba);

            Integer x;
            Integer y;
            x = poziceRyba.x;
            y = poziceRyba.y;
            if (y > 0) {
                posunY = -5;
            }
            if (y + labRybaVlevo.getHeight() > contentPane.getHeight()) {
                posunY = -5;
            }
            if (y + labRybaVpravo.getHeight() > contentPane.getHeight()) {
                posunY = -5;
            }
            y = y + posunY;
            poziceRyba.x = x;
            poziceRyba.y = y;
            labRybaVlevo.setLocation(poziceRyba);
            labRybaVpravo.setLocation(poziceRyba);
        }
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner non-commercial license
        contentPane = new JPanel();
        labZralok = new JLabel();
        labRybaVlevo = new JLabel();
        labRybaVpravo = new JLabel();

        //======== this ========
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Moje nov\u00e1 aplikace");
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                priZavreniOkna(e);
            }

            @Override
            public void windowOpened(WindowEvent e) {
                priOtevreniOkna(e);
            }
        });
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                PriStiskuKlaves(e);
            }
        });
        Container contentPane2 = getContentPane();
        contentPane2.setLayout(new BorderLayout());

        //======== contentPane ========
        {
            contentPane.setBackground(new Color(102, 204, 255));
            contentPane.addKeyListener(new KeyAdapter() {
                @Override
                public void keyPressed(KeyEvent e) {
                    priStiskuKlaves(e);
                }
            });
            contentPane.setLayout(null);

            //---- labZralok ----
            labZralok.setIcon(new ImageIcon(getClass().getResource("/net/sevecek/zralok.png")));
            contentPane.add(labZralok);
            labZralok.setBounds(45, 50, 105, 135);

            //---- labRybaVlevo ----
            labRybaVlevo.setIcon(new ImageIcon(getClass().getResource("/net/sevecek/Nemo-Left.png")));
            labRybaVlevo.setVisible(false);
            contentPane.add(labRybaVlevo);
            labRybaVlevo.setBounds(130, 150, 150, 100);

            //---- labRybaVpravo ----
            labRybaVpravo.setIcon(new ImageIcon(getClass().getResource("/net/sevecek/Nemo-Right.png")));
            contentPane.add(labRybaVpravo);
            labRybaVpravo.setBounds(130, 150, 150, 100);

            { // compute preferred size
                Dimension preferredSize = new Dimension();
                for (int i = 0; i < contentPane.getComponentCount(); i++) {
                    Rectangle bounds = contentPane.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = contentPane.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                contentPane.setMinimumSize(preferredSize);
                contentPane.setPreferredSize(preferredSize);
            }
        }
        contentPane2.add(contentPane, BorderLayout.CENTER);
        setSize(965, 920);
        setLocationRelativeTo(null);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }
}
