package com.inventory.UI;

import com.inventory.DAO.UserDAO;
import com.inventory.DTO.UserDTO;

public class HomePage extends javax.swing.JPanel {

        public HomePage(String username) {
                initComponents();
                UserDTO userDTO = new UserDTO();
                new UserDAO().getFullName(userDTO, username);
                welcomeLabel.setText("Bem vindo,  " + userDTO.getFullName() + ".");
        }

        @SuppressWarnings("unchecked")

        private void initComponents() {

                welcomeLabel = new javax.swing.JLabel();
                jLabel1 = new javax.swing.JLabel();

                welcomeLabel.setFont(new java.awt.Font("Impact", 0, 36));
                welcomeLabel.setText("Bem vindo");

                jLabel1.setFont(new java.awt.Font("Impact", 0, 18));
                jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel1.setText(
                                "<html>Gerencie seu estoque, transações e pessoal, tudo em um só lugar.<br><br>Clique no botão Menu para iniciar.<html>");

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
                this.setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addContainerGap()
                                                                                                .addComponent(welcomeLabel,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                355,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addGap(54, 54, 54)
                                                                                                .addComponent(jLabel1,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                355,
                                                                                                                Short.MAX_VALUE)))
                                                                .addContainerGap(84, Short.MAX_VALUE)));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addGap(12, 12, 12)
                                                                .addComponent(welcomeLabel,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                48,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jLabel1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                133,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap(174, Short.MAX_VALUE)));
        }

        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel welcomeLabel;
}
