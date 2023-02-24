package p2lab5_gabrielzelaya;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author gabri
 */
public class Aplicacion extends javax.swing.JFrame {

    public Aplicacion() {
        initComponents();
        bg_listar.setVisible(false);
        bg_agregar.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pp_jTree = new javax.swing.JPopupMenu();
        jmi_modificar = new javax.swing.JMenuItem();
        jmi_listar = new javax.swing.JMenuItem();
        jmi_eliminar = new javax.swing.JMenuItem();
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
        btn_agregarPersonaje = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        btn_modificar = new javax.swing.JToggleButton();
        bg_listar = new javax.swing.JPanel();
        jScrollPane_tree = new javax.swing.JScrollPane();
        personajes_tree = new javax.swing.JTree();
        jScrollPane_list = new javax.swing.JScrollPane();
        personajes_list = new javax.swing.JList<>();
        btn_salirListar = new javax.swing.JButton();

        jmi_modificar.setText("Modificar");
        jmi_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_modificarActionPerformed(evt);
            }
        });
        pp_jTree.add(jmi_modificar);

        jmi_listar.setText("Listar");
        jmi_listar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_listarActionPerformed(evt);
            }
        });
        pp_jTree.add(jmi_listar);

        jmi_eliminar.setText("Eliminar");
        jmi_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_eliminarActionPerformed(evt);
            }
        });
        pp_jTree.add(jmi_eliminar);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg_principal.setBackground(new java.awt.Color(0, 0, 0));

        btn_simulacion.setBackground(new java.awt.Color(204, 204, 255));
        btn_simulacion.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        btn_simulacion.setText("Simulación de batalla");

        btn_agregar.setBackground(new java.awt.Color(204, 204, 255));
        btn_agregar.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        btn_agregar.setText("Agregar");
        btn_agregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_agregarMouseClicked(evt);
            }
        });

        btn_listar.setBackground(new java.awt.Color(204, 204, 255));
        btn_listar.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        btn_listar.setText("Listado de personajes");
        btn_listar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_listarMouseClicked(evt);
            }
        });

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

        btn_agregarPersonaje.setText("Agregar");
        btn_agregarPersonaje.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_agregarPersonajeMouseClicked(evt);
            }
        });

        btn_salir.setText("Salir");
        btn_salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_salirMouseClicked(evt);
            }
        });

        btn_modificar.setText("Modificar");
        btn_modificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_modificarMouseClicked(evt);
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
                            .addComponent(btn_agregarPersonaje, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_universo))))
                .addGap(1, 1, 1)
                .addComponent(btn_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(318, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bg_agregarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_salir)
                .addGap(82, 82, 82))
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
                .addGroup(bg_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_modificar, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                    .addComponent(btn_agregarPersonaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(btn_salir)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        bg_listar.setBackground(new java.awt.Color(0, 0, 0));
        bg_listar.setPreferredSize(new java.awt.Dimension(800, 500));

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Personajes");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("DC");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Marvel");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("MK");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Capcom");
        treeNode1.add(treeNode2);
        personajes_tree.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        personajes_tree.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                personajes_treeMouseClicked(evt);
            }
        });
        jScrollPane_tree.setViewportView(personajes_tree);

        jScrollPane_list.setViewportView(personajes_list);

        btn_salirListar.setText("Salir");
        btn_salirListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirListarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bg_listarLayout = new javax.swing.GroupLayout(bg_listar);
        bg_listar.setLayout(bg_listarLayout);
        bg_listarLayout.setHorizontalGroup(
            bg_listarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg_listarLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jScrollPane_tree, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93)
                .addComponent(jScrollPane_list, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(196, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bg_listarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_salirListar)
                .addGap(54, 54, 54))
        );
        bg_listarLayout.setVerticalGroup(
            bg_listarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg_listarLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(bg_listarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane_tree)
                    .addComponent(jScrollPane_list))
                .addGap(1, 1, 1)
                .addComponent(btn_salirListar)
                .addContainerGap(60, Short.MAX_VALUE))
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
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(bg_listar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(bg_listar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_agregarPersonajeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_agregarPersonajeMouseClicked
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
        for (Personaje personaje1 : personajes) {
            if (personaje1.equals(personaje)) {
                JOptionPane.showMessageDialog(bg_agregar, "agregado correctamente");
            }
        }

        DefaultTreeModel m = (DefaultTreeModel) personajes_tree.getModel();
        DefaultMutableTreeNode raiz
                = (DefaultMutableTreeNode) m.getRoot();
        DefaultMutableTreeNode nodo_personaje = new DefaultMutableTreeNode(new Personaje(
                txt_nombre.getText(),
                Double.parseDouble(txt_poder.getText()),
                txt_debilidad.getText(),
                txt_universo.getText(),
                Double.parseDouble(txt_fuerza.getText()),
                Double.parseDouble(txt_fisica.getText()),
                Double.parseDouble(txt_mental.getText()),
                Double.parseDouble(txt_hp.getText()),
                1)
        );
        switch (txt_universo.getText()) {
            case "DC":
                ((DefaultMutableTreeNode) raiz.getChildAt(0)).add(nodo_personaje);
                break;
            case "Marvel":
                ((DefaultMutableTreeNode) raiz.getChildAt(1)).add(nodo_personaje);
                break;
            case "MK":
                ((DefaultMutableTreeNode) raiz.getChildAt(2)).add(nodo_personaje);
                break;
            case "Capcom":
                ((DefaultMutableTreeNode) raiz.getChildAt(3)).add(nodo_personaje);
                break;

        }

    }//GEN-LAST:event_btn_agregarPersonajeMouseClicked

    private void btn_agregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_agregarMouseClicked
        bg_principal.setVisible(false);
        bg_listar.setVisible(false);
        bg_agregar.setVisible(true);
    }//GEN-LAST:event_btn_agregarMouseClicked

    private void btn_listarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_listarMouseClicked
        bg_principal.setVisible(false);
        bg_listar.setVisible(true);
    }//GEN-LAST:event_btn_listarMouseClicked

    private void personajes_treeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_personajes_treeMouseClicked
        if (evt.isMetaDown()) {
            int row = personajes_tree.getClosestRowForLocation(
                    evt.getX(), evt.getY());
            personajes_tree.setSelectionRow(row);
            Object v1
                    = personajes_tree.getSelectionPath().
                            getLastPathComponent();
            nodo_seleccionado = (DefaultMutableTreeNode) v1;
            if (nodo_seleccionado.getUserObject() instanceof Personaje) {
                pp_jTree.show(personajes_tree, evt.getX(), evt.getY());
            }
        }
    }//GEN-LAST:event_personajes_treeMouseClicked

    private void btn_salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_salirMouseClicked
        bg_principal.setVisible(true);
        bg_listar.setVisible(false);
        bg_agregar.setVisible(false);
        txt_nombre.setText("");
        txt_poder.setText("");
        txt_fuerza.setText("");
        txt_fisica.setText("");
        txt_mental.setText("");
        txt_hp.setText("");
        txt_debilidad.setText("");
        txt_universo.setText("");
    }//GEN-LAST:event_btn_salirMouseClicked

    private void btn_salirListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirListarActionPerformed
        bg_principal.setVisible(true);
        bg_listar.setVisible(false);
        bg_agregar.setVisible(false);
    }//GEN-LAST:event_btn_salirListarActionPerformed

    private void jmi_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_modificarActionPerformed
        personaje_seleccionado = (Personaje) nodo_seleccionado.getUserObject();
        txt_nombre.setText(personaje_seleccionado.getNombre());
        txt_poder.setText(String.valueOf(personaje_seleccionado.getPoder()));
        txt_fuerza.setText(String.valueOf(personaje_seleccionado.getFuerza()));
        txt_fisica.setText(String.valueOf(personaje_seleccionado.getAgilidadFisica()));
        txt_mental.setText(String.valueOf(personaje_seleccionado.getAgilidadMental()));
        txt_hp.setText(String.valueOf(personaje_seleccionado.getHp()));
        txt_debilidad.setText(personaje_seleccionado.getDebilidad());
        txt_universo.setText(personaje_seleccionado.getUniverso());

        bg_principal.setVisible(false);
        bg_listar.setVisible(false);
        bg_agregar.setVisible(true);

        DefaultTreeModel m
                = (DefaultTreeModel) personajes_tree.getModel();
        m.reload();

    }//GEN-LAST:event_jmi_modificarActionPerformed

    private void btn_modificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_modificarMouseClicked
        if (nodo_seleccionado instanceof DefaultMutableTreeNode) {
            personaje_seleccionado = (Personaje) nodo_seleccionado.getUserObject();
            personaje_seleccionado.setNombre(txt_nombre.getText());
            personaje_seleccionado.setPoder(Double.parseDouble(txt_poder.getText()));
            personaje_seleccionado.setFuerza(Double.parseDouble(txt_fuerza.getText()));
            personaje_seleccionado.setAgilidadFisica(Double.parseDouble(txt_fisica.getText()));
            personaje_seleccionado.setAgilidadMental(Double.parseDouble(txt_mental.getText()));
            personaje_seleccionado.setHp(Double.parseDouble(txt_hp.getText()));
            personaje_seleccionado.setDebilidad(txt_debilidad.getText());
            personaje_seleccionado.setUniverso(txt_universo.getText());
            JOptionPane.showMessageDialog(bg_agregar, "se ha modificado");
        } else {
            JOptionPane.showMessageDialog(bg_agregar, "no hay nada que modificar");
        }

        DefaultTreeModel m = (DefaultTreeModel) personajes_tree.getModel();
        DefaultMutableTreeNode raiz
                = (DefaultMutableTreeNode) m.getRoot();
        DefaultMutableTreeNode nodo_personaje = new DefaultMutableTreeNode(personaje_seleccionado);

        if (!(((Personaje) nodo_personaje.getUserObject()).getUniverso().equals(personaje_seleccionado.getUniverso()))) {
            DefaultMutableTreeNode s = new DefaultMutableTreeNode(personaje_seleccionado);
            eliminar(s);
            switch (txt_universo.getText()) {
                case "DC":
                    ((DefaultMutableTreeNode) raiz.getChildAt(0)).add(nodo_personaje);
                    break;
                case "Marvel":
                    ((DefaultMutableTreeNode) raiz.getChildAt(1)).add(nodo_personaje);
                    break;
                case "MK":
                    ((DefaultMutableTreeNode) raiz.getChildAt(2)).add(nodo_personaje);
                    break;
                case "Capcom":
                    ((DefaultMutableTreeNode) raiz.getChildAt(3)).add(nodo_personaje);
                    break;

            }
        }
        m.reload();
    }//GEN-LAST:event_btn_modificarMouseClicked

    private void jmi_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_eliminarActionPerformed
        eliminar(nodo_seleccionado);
    }//GEN-LAST:event_jmi_eliminarActionPerformed

    private void jmi_listarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_listarActionPerformed
        if (nodo_seleccionado.getUserObject() instanceof Personaje) {
            personaje_seleccionado = (Personaje) nodo_seleccionado.getUserObject();
            DefaultListModel modelo = (DefaultListModel) personajes_list.getModel();
            
            modelo.addElement(personaje_seleccionado.getNombre());
            modelo.addElement(personaje_seleccionado.getPoder());
            modelo.addElement(personaje_seleccionado.getFuerza());
            modelo.addElement(personaje_seleccionado.getDebilidad());
            modelo.addElement(personaje_seleccionado.getAgilidadFisica());
            modelo.addElement(personaje_seleccionado.getAgilidadMental());
            modelo.addElement(personaje_seleccionado.getHp());
            modelo.addElement(personaje_seleccionado.getUniverso());
            personajes_list.setModel(modelo);
        }
    }//GEN-LAST:event_jmi_listarActionPerformed

    private void eliminar(DefaultMutableTreeNode t) {
        DefaultTreeModel m = (DefaultTreeModel) personajes_tree.getModel();
        m.removeNodeFromParent(t);
        m.reload();
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new Aplicacion().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg_agregar;
    private javax.swing.JPanel bg_listar;
    private javax.swing.JPanel bg_principal;
    private javax.swing.JToggleButton btn_agregar;
    private javax.swing.JButton btn_agregarPersonaje;
    private javax.swing.JToggleButton btn_listar;
    private javax.swing.JToggleButton btn_modificar;
    private javax.swing.JButton btn_salir;
    private javax.swing.JButton btn_salirListar;
    private javax.swing.JToggleButton btn_simulacion;
    private javax.swing.JLabel debilidadLabel;
    private javax.swing.JLabel fisicaLabel;
    private javax.swing.JLabel fuerzaLabel;
    private javax.swing.JLabel hpLabel;
    private javax.swing.JScrollPane jScrollPane_list;
    private javax.swing.JScrollPane jScrollPane_tree;
    private javax.swing.JMenuItem jmi_eliminar;
    private javax.swing.JMenuItem jmi_listar;
    private javax.swing.JMenuItem jmi_modificar;
    private javax.swing.JLabel mentalLabel;
    private javax.swing.JLabel nombreLabel;
    private javax.swing.JList<String> personajes_list;
    private javax.swing.JTree personajes_tree;
    private javax.swing.JLabel poderLabel;
    private javax.swing.JPopupMenu pp_jTree;
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
    DefaultMutableTreeNode nodo_seleccionado;
    Personaje personaje_seleccionado;
}
