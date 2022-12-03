package application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame implements ActionListener {

    private int width, height;
    private TextField alturaField;
    private TextField pesoField;
    private Button calcularButton;
    private Double IMC;

    private ImageIcon img = new ImageIcon("res/icon.png");
    private Label resultadoLabel;

    public Window(int width, int height, String windowTitle) {
        this.width = width;
        this.height = height;
        setLayout(null);
        setSize(width, height);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle(windowTitle);
        setIconImage(img.getImage());
        initializeComponnents();
    }

    private void initializeComponnents() {

        Label pesoLabel = new Label(10, 50, 185, 21, "Peso: ", new Font("Arial", Font.BOLD, 10));
        this.alturaField = new TextField(160,47,45,30);
        Label barraLabel = new Label(105, 50, 185, 21, "/", new Font("Arial", Font.BOLD, 40));
        Label alturaLabel = new Label(120, 50, 185, 21, "Altura: ", new Font("Arial", Font.BOLD, 10));
        this.pesoField = new TextField(50,47,45,30);
        Label quadradoLabel = new Label(208, 35, 45, 30, "2", new Font("Arial", Font.BOLD, 12));
        Label igualLabel = new Label(220, 46, 45, 30, "=", new Font("Arial", Font.BOLD, 20));
        Label name = new Label(width / 2 - 200 / 2, 3, 185, 21, "Calculadora de IMC", new Font("Arial", Font.BOLD, 20));
        this.calcularButton = new Button((width/2 - 200/2) - 10, 85,185,21, "Calcular!", new Font("Arial", Font.BOLD, 20 ));

        add(name);
        add(alturaLabel);
        add(alturaField);
        add(pesoLabel);
        add(barraLabel);
        add(pesoField);
        add(quadradoLabel);
        add(igualLabel);
        add(calcularButton);
        setVisible(true);

        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                double alturaValue = Double.parseDouble(alturaField.getText());
                double pesoValue = Double.parseDouble(pesoField.getText());
                if (resultadoLabel == null) {
                    IMC = calculaIMC(alturaValue, pesoValue);
                    resultadoLabel = new Label(240, 50, 185, 21, String.format("%.4f", IMC), new Font("Arial", Font.BOLD, 15));
                    add(resultadoLabel);
                    resultadoLabel.repaint();
                }else {
                    remove(resultadoLabel);
                    IMC = calculaIMC(alturaValue, pesoValue);
                    resultadoLabel = new Label(240, 50, 185, 21, String.format("%.4f", IMC), new Font("Arial", Font.BOLD, 15));
                    add(resultadoLabel);
                    resultadoLabel.repaint();
                }

                }catch (NumberFormatException nfe){
                    JOptionPane.showMessageDialog(null, "Preencha a altura e o peso corretamente!",
                            "Valores Inválidos",JOptionPane.WARNING_MESSAGE);
                }
            }
        });

    }

    private double calculaIMC(double altura, double peso) {
        return peso / Math.pow(altura, 2);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

}
