import javax.swing.*;

public class PembelianBuket {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Form Pembelian Buket"); 
        frame.setSize(400, 430); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        frame.setLayout(null); 

        JLabel judul = new JLabel("FORM PEMBELIAN BUKET"); 
        judul.setBounds(110, 20, 200, 25); 
        frame.add(judul); 

        JLabel nama = new JLabel("Nama Pembeli:");
        nama.setBounds(30, 65, 120, 25);
        frame.add(nama);

        JTextField inputNama = new JTextField();
        inputNama.setBounds(150, 65, 200, 25);
        frame.add(inputNama); 

        JLabel budget = new JLabel("Budget Buket:");
        budget.setBounds(30, 110, 120, 25);
        frame.add(budget);

        JRadioButton harga50 = new JRadioButton("Rp50.000"); 
        harga50.setBounds(150, 110, 120, 25);
        JRadioButton harga100 = new JRadioButton("Rp100.000");
        harga100.setBounds(150, 140, 120, 25);
        JRadioButton harga150 = new JRadioButton("Rp150.000");
        harga150.setBounds(150, 170, 120, 25);

        ButtonGroup grupBudget = new ButtonGroup(); 
        grupBudget.add(harga50);
        grupBudget.add(harga100);
        grupBudget.add(harga150);

        frame.add(harga50);
        frame.add(harga100);
        frame.add(harga150);

        JLabel bunga = new JLabel("Pilih Bunga:"); 
        bunga.setBounds(30, 215, 120, 25);
        frame.add(bunga);
        JCheckBox mawar = new JCheckBox("Mawar");
        mawar.setBounds(150, 215, 100, 25);
        JCheckBox tulip = new JCheckBox("Tulip");
        tulip.setBounds(150, 245, 100, 25);
        JCheckBox carnation = new JCheckBox("Carnation");
        carnation.setBounds(150, 275, 150, 25);
        JCheckBox babyBreath = new JCheckBox("Baby Breath");
        babyBreath.setBounds(150, 305, 150, 25);

        frame.add(mawar);
        frame.add(tulip);
        frame.add(carnation);
        frame.add(babyBreath);

        JButton order = new JButton("ORDER"); 
        order.setBounds(140, 350, 100, 30);
        frame.add(order);

        order.addActionListener(e -> { 

            String namaPembeli = inputNama.getText();

            String harga = "";
            if (harga50.isSelected()) harga = "Rp50.000";
            else if (harga100.isSelected()) harga = "Rp100.000";
            else if (harga150.isSelected()) harga = "Rp150.000";

            String pilihanBunga = ""; 
            if (mawar.isSelected()) pilihanBunga += "Mawar, ";
            if (tulip.isSelected()) pilihanBunga += "Tulip, ";
            if (carnation.isSelected()) pilihanBunga += "Carnation, ";
            if (babyBreath.isSelected()) pilihanBunga += "Baby Breath, ";

            if (namaPembeli.isEmpty() || harga.isEmpty() 
                || pilihanBunga.isEmpty()) {
                JOptionPane.showMessageDialog(frame,
                    "Mohon lengkapi semua pilihan!");
            } else {
                JOptionPane.showMessageDialog(frame,
                    "PESANAN BERHASIL!\n\n" +
                    "Nama Pembeli: " + namaPembeli +
                    "\nBudget Buket: " + harga +
                    "\nPilihan Bunga: " + pilihanBunga);
            }
        });
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
