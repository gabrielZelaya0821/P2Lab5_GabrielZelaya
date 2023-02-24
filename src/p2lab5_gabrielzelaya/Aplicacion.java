package p2lab5_gabrielzelaya;

import java.util.ArrayList;

/**
 *
 * @author gabri
 */
public class Aplicacion extends javax.swing.JFrame {

    public Aplicacion() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg_principal = new javax.swing.JPanel();
        btn_simulacion = new javax.swing.JToggleButton();
        btn_agregar = new javax.swing.JToggleButton();
        btn_listar = new javax.swing.JToggleButton();
        bg_agregar = new javax.swing.JPanel();
        nombreLabel = new javax.swing.JLabel();
        poderLabel = new javax.swing.JLabel();
        fuerzaLabel = new javax.swing.JLabel();
        fisicaLabel = new javax.swing.JLabel();
        mentalLabel = new javax.swing.JLabel();
        hpLabel = new javax.swing.JLabel();
        debilidadLabel = new javax.swing.JLabel();
        universoLabel = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        txt_poder = new javax.swing.JTextField();
        txt_fuerza = new javax.swing.JTextField();
        txt_fisica = new javax.swing.JTextField();
        txt_mental = new javax.swing.JTextField();
        txt_hp = new javax.swing.JTextField();
        txt_debilidad = new javax.swing.JTextField();
        txt_universo = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg_principal.setBackground(new java.awt.Color(0, 0, 0));

        btn_simulacion.setBackground(new java.awt.Color(204, 204, 255));
        btn_simulacion.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        btn_simulacion.setText("Simulación de batalla");

        btn_agregar.setBackground(new java.awt.Color(204, 204, 255));
        btn_agregar.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        btn_agregar.setText("Agregar");

        btn_listar.setBackground(new java.awt.Color(204, 204, 255));
        btn_listar.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        btn_listar.setText("Listado de personajes");

        javax.swing.GroupLayout bg_principalLayout = new javax.swing.GroupLayout(bg_principal);
        bg_principal.setLayout(bg_principalLayout);
        bg_principalLayout.setHorizontalGroup(
            bg_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bg_principalLayout.createSequentialGroup()
                .addContainerGap(129, Short.MAX_VALUE)
                .addGroup(bg_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_listar, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_simulacion, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        bg_principalLayout.setVerticalGroup(
            bg_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bg_principalLayout.createSequentialGroup()
                .addContainerGap(73, Short.MAX_VALUE)
                .addComponent(btn_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(btn_listar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(btn_simulacion, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        bg_agregar.setBackground(new java.awt.Color(0, 0, 0));
        bg_agregar.setPreferredSize(new java.awt.Dimension(800, 500));

        nombreLabel.setForeground(new java.awt.Color(255, 255, 255));
        nombreLabel.setText("Nombre:");

        poderLabel.setForeground(new java.awt.Color(255, 255, 255));
        poderLabel.setText("Poder: ");

        fuerzaLabel.setForeground(new java.awt.Color(255, 255, 255));
        fuerzaLabel.setText("Fuerza:");

        fisicaLabel.setForeground(new java.awt.Color(255, 255, 255));
        fisicaLabel.setText("Agilidad física:");

        mentalLabel.setForeground(new java.awt.Color(255, 255, 255));
        mentalLabel.setText("Agilidad mental:");

        hpLabel.setForeground(new java.awt.Color(255, 255, 255));
        hpLabel.setText("Puntos de vida:");

        debilidadLabel.setForeground(new java.awt.Color(255, 255, 255));
        debilidadLabel.setText("Debilidad: ");

        universoLabel.setForeground(new java.awt.Color(255, 255, 255));
        universoLabel.setText("Universo:");

        jButton1.setText("Agregar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout bg_agregarLayout = new javax.swing.GroupLayout(bg_agregar);
        bg_agregar.setLayout(bg_agregarLayout);
        bg_agregarLayout.setHorizontalGroup(
            bg_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg_agregarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bg_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(bg_agregarLayout.createSequentialGroup()
                        .addComponent(fuerzaLabel)
                        .addGap(18, 18, 18)
                        .addComponent(txt_fuerza, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bg_agregarLayout.createSequentialGroup()
                        .addComponent(mentalLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_mental))
                    .addGroup(bg_agregarLayout.createSequentialGroup()
                        .addComponent(hpLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_hp))
                    .addGroup(bg_agregarLayout.createSequentialGroup()
                        .addComponent(debilidadLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_debilidad))
                    .addGroup(bg_agregarLayout.createSequentialGroup()
                        .addComponent(fisicaLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_fisica, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bg_agregarLayout.createSequentialGroup()
                        .addGroup(bg_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(poderLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nombreLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(bg_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_poder)
                            .addComponent(txt_nombre)))
                    .addGroup(bg_agregarLayout.createSequentialGroup()
                        .addComponent(universoLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(bg_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_universo))))
                .addContainerGap(473, Short.MAX_VALUE))
        );
        bg_agregarLayout.setVerticalGroup(
            bg_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg_agregarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bg_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreLabel)
                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(bg_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(poderLabel)
                    .addComponent(txt_poder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(bg_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fuerzaLabel)
                    .addComponent(txt_fuerza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(bg_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fisicaLabel)
                    .addComponent(txt_fisica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(bg_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mentalLabel)
                    .addComponent(txt_mental, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(bg_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hpLabel)
                    .addComponent(txt_hp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(bg_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(debilidadLabel)
                    .addComponent(txt_debilidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(bg_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(universoLabel)
                    .addComponent(txt_universo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(bg_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(bg_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        Personaje personaje = new Personaje(
        txt_nombre.getText(),
        Double.parseDouble(txt_poder.getText()),
        txt_debilidad.getText(),
        txt_universo.getText(),
        Double.parseDouble(txt_fuerza.getText()),
        Double.parseDouble(txt_fisica.getText()),
        Double.parseDouble(txt_mental.getText()),
        Double.parseDouble(txt_hp.getText())     
        );
        personajes.add(personaje);
    }//GEN-LAST:event_jButton1MouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new Aplicacion().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg_agregar;
    private javax.swing.JPanel bg_principal;
    private javax.swing.JToggleButton btn_agregar;
    private javax.swing.JToggleButton btn_listar;
    private javax.swing.JToggleButton btn_simulacion;
    private javax.swing.JLabel debilidadLabel;
    private javax.swing.JLabel fisicaLabel;
    private javax.swing.JLabel fuerzaLabel;
    private javax.swing.JLabel hpLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel mentalLabel;
    private javax.swing.JLabel nombreLabel;
    private javax.swing.JLabel poderLabel;
    private javax.swing.JTextField txt_debilidad;
    private javax.swing.JTextField txt_fisica;
    private javax.swing.JTextField txt_fuerza;
    private javax.swing.JTextField txt_hp;
    private javax.swing.JTextField txt_mental;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_poder;
    private javax.swing.JTextField txt_universo;
    private javax.swing.JLabel universoLabel;
    // End of variables declaration//GEN-END:variables

    private ArrayList<Personaje> personajes = new ArrayList<>();
}
