import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class coba extends JFrame {
    private static final int FRAME_WIDTH = 600;
    private static final int FRAME_HEIGHT = 200;
    private JLabel aLabel;
    private JLabel bLabel;
    private JLabel cLabel;
    private JTextField aField;
    private JTextField bField;
    private JButton multiplyButton; // <-- Mengganti nama variabel 'button' agar lebih jelas
    private JButton addButton;      // <-- 1. Deklarasi tombol tambah BARU
    private JPanel panel;

    public coba() {
        createTextField();
        createButtons(); // <-- 2. Mengganti nama method createButton()
        createPanel();
        setSize(FRAME_WIDTH, FRAME_HEIGHT); // <-- Perbaikan Bug (sebelumnya FRAME_WIDTH kedua)
    }

    private void createTextField() {
        aLabel = new JLabel("Nilai A: ");
        bLabel = new JLabel("Nilai B: "); // <-- Perbaikan Teks (sebelumnya "Nilai C: ")
        cLabel = new JLabel("Hasil: ");

        final int FIELD_WIDTH = 10;
        aField = new JTextField(FIELD_WIDTH);
        aField.setText("0");
        bField = new JTextField(FIELD_WIDTH);
        bField.setText("0");
    }

    // <-- 2. Mengganti nama method dari createButton() menjadi createButtons()
    private void createButtons() {
        // Tombol 1: Calculate (Kali) - Kode asli Anda
        multiplyButton = new JButton("Calculate (Kali)"); // <-- Mengganti nama variabel
        class MultiplyListener implements ActionListener { // <-- Mengganti nama class
            @Override
            public void actionPerformed(ActionEvent event) {
                int a = Integer.valueOf(aField.getText());
                int b = Integer.valueOf(bField.getText());
                int c = a * b; // Operasi perkalian
                cLabel.setText("Hasil: " + c);
            }
        }
        ActionListener multiplyListener = new MultiplyListener();
        multiplyButton.addActionListener(multiplyListener);

        // --- INI BAGIAN BARU UNTUK TOMBOL TAMBAH ---
        // <-- 3. Membuat tombol "Tambah"
        addButton = new JButton("Tambah");
        class AddListener implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent event) {
                int a = Integer.valueOf(aField.getText());
                int b = Integer.valueOf(bField.getText());
                int c = a + b; // Operasi penjumlahan
                cLabel.setText("Hasil: " + c);
            }
        }
        ActionListener addListener = new AddListener();
        addButton.addActionListener(addListener);
        // --- AKHIR BAGIAN BARU ---
    }

    private void createPanel() {
        panel = new JPanel();
        panel.add(aLabel);
        panel.add(aField);
        panel.add(bLabel);
        panel.add(bField);
        panel.add(multiplyButton); // <-- Menggunakan nama variabel baru
        panel.add(addButton);      // <-- 4. Menambahkan tombol 'Tambah' ke panel
        panel.add(cLabel);
        add(panel);
    }

    public static void main(String[] args) {
        JFrame frame = new MyInputForm();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
}