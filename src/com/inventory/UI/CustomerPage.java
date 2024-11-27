package com.inventory.UI;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import com.inventory.DAO.CustomerDAO;
import com.inventory.DTO.CustomerDTO;

public class CustomerPage extends javax.swing.JPanel {

        public CustomerPage() {
                initComponents();
                loadDataSet();
        }

        @SuppressWarnings("unchecked")

        private void initComponents() {

                jLabel1 = new javax.swing.JLabel();
                jSeparator1 = new javax.swing.JSeparator();
                entryPanel = new javax.swing.JPanel();
                jLabel2 = new javax.swing.JLabel();
                jLabel3 = new javax.swing.JLabel();
                jLabel4 = new javax.swing.JLabel();
                jLabel5 = new javax.swing.JLabel();
                jLabel6 = new javax.swing.JLabel();
                jLabel7 = new javax.swing.JLabel();
                phoneText = new javax.swing.JTextField();
                locationText = new javax.swing.JTextField();
                codeText = new javax.swing.JTextField();
                nameText = new javax.swing.JTextField();
                creditText = new javax.swing.JTextField();
                debitText = new javax.swing.JTextField();
                addButton = new javax.swing.JButton();
                editButton = new javax.swing.JButton();
                deleteButton = new javax.swing.JButton();
                clearButton = new javax.swing.JButton();
                jScrollPane1 = new javax.swing.JScrollPane();
                custTable = new javax.swing.JTable();
                searchText = new javax.swing.JTextField();
                jLabel8 = new javax.swing.JLabel();

                jLabel1.setFont(new java.awt.Font("Impact", 0, 24));
                jLabel1.setText("CLIENTES");

                entryPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Insira detalhes do cliente"));

                jLabel2.setText("Codigo cliente:");

                jLabel3.setText("Nome completo:");

                jLabel4.setText("Localização:");

                jLabel5.setText("Contato:");

                jLabel6.setText("Quantidade debito:");

                jLabel7.setText("Quantidade credito:");

                addButton.setText("Adicionar");
                addButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                addButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                addButtonActionPerformed(evt);
                        }
                });

                editButton.setText("Editar");
                editButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                editButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                editButtonActionPerformed(evt);
                        }
                });

                deleteButton.setText("Excluir");
                deleteButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                deleteButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                deleteButtonActionPerformed(evt);
                        }
                });

                clearButton.setFont(new java.awt.Font("Segoe UI", 0, 14));
                clearButton.setText("LIMPAR");
                clearButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                clearButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                clearButtonActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout entryPanelLayout = new javax.swing.GroupLayout(entryPanel);
                entryPanel.setLayout(entryPanelLayout);
                entryPanelLayout.setHorizontalGroup(
                                entryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(entryPanelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(entryPanelLayout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(clearButton,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addGroup(entryPanelLayout
                                                                                                .createSequentialGroup()
                                                                                                .addGroup(entryPanelLayout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                false)
                                                                                                                .addComponent(jLabel2,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                Short.MAX_VALUE)
                                                                                                                .addComponent(jLabel4,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                Short.MAX_VALUE)
                                                                                                                .addComponent(jLabel5,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                Short.MAX_VALUE)
                                                                                                                .addComponent(jLabel6,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                Short.MAX_VALUE)
                                                                                                                .addComponent(jLabel7,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                Short.MAX_VALUE)
                                                                                                                .addComponent(jLabel3,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                Short.MAX_VALUE))
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addGroup(entryPanelLayout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addComponent(phoneText)
                                                                                                                .addComponent(creditText)
                                                                                                                .addComponent(debitText)
                                                                                                                .addComponent(locationText)
                                                                                                                .addComponent(codeText)
                                                                                                                .addComponent(nameText)))
                                                                                .addGroup(entryPanelLayout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(addButton)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(editButton)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(deleteButton)
                                                                                                .addGap(0, 0, Short.MAX_VALUE)))
                                                                .addContainerGap()));
                entryPanelLayout.setVerticalGroup(
                                entryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(entryPanelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(
                                                                                entryPanelLayout.createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                .addComponent(jLabel2,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                29,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addComponent(codeText,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                29,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(
                                                                                entryPanelLayout.createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                .addComponent(jLabel3,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                29,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addComponent(nameText,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                29,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(
                                                                                entryPanelLayout.createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                .addComponent(jLabel4,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                29,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addComponent(locationText,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                29,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(
                                                                                entryPanelLayout.createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                .addComponent(jLabel5,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                29,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addComponent(phoneText,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                29,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(
                                                                                entryPanelLayout.createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                .addComponent(jLabel6,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                29,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addComponent(debitText,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                29,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(
                                                                                entryPanelLayout.createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                .addComponent(jLabel7,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                29,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addComponent(creditText,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                29,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(
                                                                                entryPanelLayout.createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                .addComponent(addButton)
                                                                                                .addComponent(editButton)
                                                                                                .addComponent(deleteButton))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(clearButton,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                30,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap(18, Short.MAX_VALUE)));

                custTable.setModel(new javax.swing.table.DefaultTableModel(
                                new Object[][] {
                                                { null, null, null, null },
                                                { null, null, null, null },
                                                { null, null, null, null },
                                                { null, null, null, null }
                                },
                                new String[] {
                                                "Title 1", "Title 2", "Title 3", "Title 4"
                                }));
                custTable.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                custTableMouseClicked(evt);
                        }
                });
                jScrollPane1.setViewportView(custTable);

                searchText.addKeyListener(new java.awt.event.KeyAdapter() {
                        public void keyReleased(java.awt.event.KeyEvent evt) {
                                searchTextKeyReleased(evt);
                        }
                });

                jLabel8.setText("Pesquisa:");

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
                this.setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addComponent(jLabel1,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                122,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                Short.MAX_VALUE)
                                                                                                .addComponent(jLabel8)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(searchText,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                181,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addComponent(jSeparator1)
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                layout
                                                                                                                .createSequentialGroup()
                                                                                                                .addComponent(jScrollPane1,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                445,
                                                                                                                                Short.MAX_VALUE)
                                                                                                                .addPreferredGap(
                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                .addComponent(entryPanel,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addContainerGap()));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel1,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                40,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(searchText,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jLabel8))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jSeparator1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                10,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                false)
                                                                                .addComponent(entryPanel,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(jScrollPane1,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                0,
                                                                                                Short.MAX_VALUE))
                                                                .addContainerGap(67, Short.MAX_VALUE)));
        }

        private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {
                if (codeText.getText().equals("") || nameText.getText().equals("")
                                || locationText.getText().equals("") || phoneText.getText().equals(""))
                        JOptionPane.showMessageDialog(this, "Insira todos os detalhes pedidos.");
                else {
                        CustomerDTO customerDTO = new CustomerDTO();
                        customerDTO.setCustCode(codeText.getText());
                        customerDTO.setFullName(nameText.getText());
                        customerDTO.setLocation(locationText.getText());
                        customerDTO.setPhone(phoneText.getText());
                        new CustomerDAO().addCustomerDAO(customerDTO);
                        loadDataSet();
                }
        }

        private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {
                if (custTable.getSelectedRow() < 0)
                        JOptionPane.showMessageDialog(this, "Selecione o cliente na tabela.");
                else {
                        if (codeText.getText().equals("") || nameText.getText().equals("")
                                        || locationText.getText().equals("") || phoneText.getText().equals(""))
                                JOptionPane.showMessageDialog(this, "Insira todos os detalhes pedidos.");
                        else {
                                CustomerDTO customerDTO = new CustomerDTO();
                                customerDTO.setCustCode(codeText.getText());
                                customerDTO.setFullName(nameText.getText());
                                customerDTO.setLocation(locationText.getText());
                                customerDTO.setPhone(phoneText.getText());
                                new CustomerDAO().editCustomerDAO(customerDTO);
                                loadDataSet();
                        }
                }
        }

        private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {
                if (custTable.getSelectedRow() < 0)
                        JOptionPane.showMessageDialog(this, "Selecione o cliente na tabela.");
                else {
                        int opt = JOptionPane.showConfirmDialog(
                                        this,
                                        "Excluir o cliente?",
                                        "Confirmação",
                                        JOptionPane.YES_NO_OPTION);
                        if (opt == JOptionPane.YES_OPTION) {
                                new CustomerDAO().deleteCustomerDAO(
                                                custTable.getValueAt(custTable.getSelectedRow(), 0).toString());
                                loadDataSet();
                        }
                }
        }

        private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {
                codeText.setText("");
                nameText.setText("");
                locationText.setText("");
                phoneText.setText("");
                searchText.setText("");
        }

        private void custTableMouseClicked(java.awt.event.MouseEvent evt) {
                int row = custTable.getSelectedRow();
                int col = custTable.getColumnCount();
                Object[] data = new Object[col];

                for (int i = 0; i < col; i++)
                        data[i] = custTable.getValueAt(row, i);
                codeText.setText((String) data[0]);
                nameText.setText((String) data[1]);
                locationText.setText((String) data[2]);
                phoneText.setText((String) data[3]);
        }

        private void searchTextKeyReleased(java.awt.event.KeyEvent evt) {
                loadSearchData(searchText.getText());
        }

        public void loadDataSet() {
                try {
                        CustomerDAO customerDAO = new CustomerDAO();
                        custTable.setModel(customerDAO.buildTableModel(customerDAO.getQueryResult()));
                } catch (SQLException e) {
                        e.printStackTrace();
                }
        }

        public void loadSearchData(String text) {
                try {
                        CustomerDAO customerDAO = new CustomerDAO();
                        custTable.setModel(customerDAO.buildTableModel(customerDAO.getCustomerSearch(text)));
                } catch (SQLException e) {
                        e.printStackTrace();
                }
        }

        private javax.swing.JButton addButton;
        private javax.swing.JButton clearButton;
        private javax.swing.JTextField codeText;
        private javax.swing.JTextField creditText;
        private javax.swing.JTable custTable;
        private javax.swing.JTextField debitText;
        private javax.swing.JButton deleteButton;
        private javax.swing.JButton editButton;
        private javax.swing.JPanel entryPanel;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JLabel jLabel6;
        private javax.swing.JLabel jLabel7;
        private javax.swing.JLabel jLabel8;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JSeparator jSeparator1;
        private javax.swing.JTextField locationText;
        private javax.swing.JTextField nameText;
        private javax.swing.JTextField phoneText;
        private javax.swing.JTextField searchText;
}
