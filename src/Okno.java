import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Okno extends JFrame implements ActionListener {
    private JButton przycisk;
    private JTextField pole1;
    private JLabel wynik;
    private JPanel kontenerNaKlawiszeNumpada;
    private JPanel prawyKontener;
    private JPanel kontenerNaKlawiszeOperacji;
    private JPanel kontenerNaKlawiszeOperacji2;
    private JButton[] klawiszeNumpada;
    private JButton[] klawiszeOperacji;
    private JButton[] klawiszeOperacji2;
    Font font;

    public Okno(String nazwa){
        super(nazwa);
        setDefaultCloseOperation(3);
        setLocationRelativeTo(null);
        font = new Font("SansSerif", Font.BOLD, 15);


        JPanel panel = new JPanel();
        panel.setBackground(Color.BLACK);

        panel.setLayout(new GridLayout(1,2,0,10));
        stworzKontererNaKlawiszeNumpada();
        stworzPrawyKontener();
        panel.add(kontenerNaKlawiszeNumpada);
        panel.add(prawyKontener);


        setContentPane(panel);
        pack();
        setVisible(true);

        przycisk.addActionListener(this);


    }

    private void stworzPrawyKontener() {
        prawyKontener = new JPanel();
        prawyKontener.setLayout(new GridLayout(4, 1,10,10));
        prawyKontener.setBackground(Color.black);
        prawyKontener.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        pole1 = new JTextField();
        pole1.setFont(font);
        pole1.setText("0");
        pole1.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        pole1.setBackground(Color.DARK_GRAY);
        pole1.setForeground(Color.ORANGE);
        przycisk = new JButton("=");
        przycisk.setFont(font);
        przycisk.setForeground(Color.ORANGE);
        przycisk.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        przycisk.setBackground(Color.DARK_GRAY);
        stworzKontenerNaKlawiszeOperacji();
        stworzKontenerNaKlawiszeOperacji2();


        prawyKontener.add(pole1);
        prawyKontener.add(kontenerNaKlawiszeOperacji);
        prawyKontener.add(kontenerNaKlawiszeOperacji2);
        prawyKontener.add(przycisk);
    }

    private void stworzKontererNaKlawiszeNumpada() {
        kontenerNaKlawiszeNumpada = new JPanel();
        kontenerNaKlawiszeNumpada.setLayout(new GridLayout(4,3,10,10));
        kontenerNaKlawiszeNumpada.setBackground(Color.BLACK);
        kontenerNaKlawiszeNumpada.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));

        stworzKlawiszeNumpada();
        for(int i = 0; i < klawiszeNumpada.length; i++) {
            kontenerNaKlawiszeNumpada.add(klawiszeNumpada[i]);

        }

    }

    private void stworzKontenerNaKlawiszeOperacji() {
        kontenerNaKlawiszeOperacji = new JPanel();
        kontenerNaKlawiszeOperacji.setLayout(new GridLayout(1,4,10,20));
        kontenerNaKlawiszeOperacji.setBackground(Color.black);

        stworzKlawiszeOperacji();
        for(int i = 0; i < klawiszeOperacji.length; i++) {
            kontenerNaKlawiszeOperacji.add(klawiszeOperacji[i]);
        }
    }
    private void stworzKontenerNaKlawiszeOperacji2() {
        kontenerNaKlawiszeOperacji2 = new JPanel();
        kontenerNaKlawiszeOperacji2.setLayout(new GridLayout(1, 4,10,10));
        kontenerNaKlawiszeOperacji2.setBackground(Color.black);


        stworzKlawiszeOperacji2();
        for(int i = 0; i < klawiszeOperacji2.length; i++) {
            kontenerNaKlawiszeOperacji2.add(klawiszeOperacji2[i]);
        }
    }

    private void stworzKlawiszeNumpada() {
        klawiszeNumpada = new JButton[11]; // 0-9 i kropka
        String[] liczby = {"7", "8", "9", "4","5","6","1","2","3","0",","};
        for(int i = 0; i < 11; i++) {
            klawiszeNumpada[i] = new JButton(liczby[i]);
            klawiszeNumpada[i].setBackground(Color.ORANGE);
            klawiszeNumpada[i].setFont(font);
        }
        //klawiszeNumpada[9] = new JButton(",");

      // klawiszeNumpada[10] = new JButton("0");




    }

    private void stworzKlawiszeOperacji() {
        klawiszeOperacji = new JButton[4];

        String[] operacje = {"+", "-", "x", "/"};
        for(int i = 0; i < 4; i++) {
            klawiszeOperacji[i] = new JButton(operacje[i]);
            klawiszeOperacji[i].setBackground(Color.ORANGE);
            klawiszeOperacji[i].setFont(font);

        }


    }
    private void stworzKlawiszeOperacji2() {
        klawiszeOperacji2 = new JButton[4];

        String[] operacje2 = {"sqrt", "^2", "+/-", "AC"};
        for(int i = 0; i < 4; i++) {
            klawiszeOperacji2[i] = new JButton(operacje2[i]);
            klawiszeOperacji2[i].setBackground(Color.ORANGE);
            klawiszeOperacji2[i].setFont(font);
        }


    }
    @Override
    public void actionPerformed(ActionEvent evt) {
        Object zrodlo = evt.getSource();

        if(zrodlo == przycisk){


            //Tutaj wszystko będzie inne z powodu zmiany formy
//            String l1 = pole1.getText();
//           String l2 = pole1.getText();
//           pole1.

            //String l2 = pole2.getText();
        }
        if(zrodlo == klawiszeNumpada) {

        }
        if(zrodlo == klawiszeOperacji) {

        }
        if(zrodlo == klawiszeOperacji2) {

        }


    }
}
