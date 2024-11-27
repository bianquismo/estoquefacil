package com.inventory.UI;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import com.inventory.DAO.ProductDAO;
import com.inventory.DAO.SupplierDAO;
import com.inventory.DTO.ProductDTO;

public class ProductPage extends javax.swing.JPanel {

        ProductDTO productDTO;
        String username = null;
        String supplier = null;
        int userID;
        Dashboard dashboard;

        public ProductPage() {
        }

        public ProductPage(String username, Dashboard dashboard) {
                initComponents();
                this.username = username;
                this.dashboard = dashboard;
                loadComboBox();
                loadDataSet();
        }

        @SuppressWarnings("unchecked")

        private void initComponents() {

                jLabel1 = new javax.swing.JLabel();
                jSeparator1 = new javax.swing.JSeparator();
                entryPanel = new javax.swing.JPanel();
                suppCombo = new javax.swing.JComboBox<>();
                addSuppButton = new javax.swing.JButton();
                jLabel2 = new javax.swing.JLabel();
                jLabel3 = new javax.swing.JLabel();
                jLabel4 = new javax.swing.JLabel();
                jLabel5 = new javax.swing.JLabel();
                jLabel6 = new javax.swing.JLabel();
                jLabel7 = new javax.swing.JLabel();
                jLabel8 = new javax.swing.JLabel();
                codeText = new javax.swing.JTextField();
                nameText = new javax.swing.JTextField();
                jDateChooser1 = new com.toedter.calendar.JDateChooser();
                quantityText = new javax.swing.JTextField();
                costText = new javax.swing.JTextField();
                sellText = new javax.swing.JTextField();
                brandText = new javax.swing.JTextField();
                addButton = new javax.swing.JButton();
                editButton = new javax.swing.JButton();
                deleteButton = new javax.swing.JButton();
                clearButton = new javax.swing.JButton();
                jScrollPane1 = new javax.swing.JScrollPane();
                productTable = new javax.swing.JTable();
                refreshButton = new javax.swing.JButton();
                searchText = new javax.swing.JTextField();
                jLabel9 = new javax.swing.JLabel();

                jLabel1.setFont(new java.awt.Font("Impact", 0, 24));
                jLabel1.setText("PRODUTOS");

                entryPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Insira detalhes do produto"));

                suppCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select a supplier" }));
                suppCombo.setToolTipText("Selecione o fornecedor");

                addSuppButton.setText("Clique para adicionar fornecedor");
                addSuppButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                addSuppButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                addSuppButtonActionPerformed(evt);
                        }
                });

                jLabel2.setText("Codigo produto:");

                jLabel3.setText("Nome produto:");

                jLabel4.setText("Data:");

                jLabel5.setText("Quantidade:");

                jLabel6.setText("Preço de custo:");

                jLabel7.setText("Preço de venda:");

                jLabel8.setText("Marca:");

                jDateChooser1.setForeground(new java.awt.Color(102, 102, 102));

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
                                                                                .addComponent(suppCombo, 0,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(addSuppButton,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addGroup(entryPanelLayout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(jLabel2,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                84,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(codeText))
                                                                                .addGroup(entryPanelLayout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(jLabel3,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                84,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(nameText))
                                                                                .addGroup(entryPanelLayout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(jLabel8,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                84,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(brandText))
                                                                                .addGroup(entryPanelLayout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(jLabel4,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                84,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(jDateChooser1,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                Short.MAX_VALUE))
                                                                                .addGroup(entryPanelLayout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(jLabel5,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                84,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(quantityText))
                                                                                .addGroup(entryPanelLayout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(jLabel6,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                84,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(costText))
                                                                                .addGroup(entryPanelLayout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(jLabel7,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                84,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(sellText))
                                                                                .addGroup(entryPanelLayout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(addButton)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(editButton,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                78,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(deleteButton,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                75,
                                                                                                                Short.MAX_VALUE)))
                                                                .addContainerGap()));
                entryPanelLayout.setVerticalGroup(
                                entryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(entryPanelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(suppCombo,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                31,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(addSuppButton,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                30,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(
                                                                                entryPanelLayout.createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                .addComponent(jLabel2,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                26,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addComponent(codeText,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                26,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(
                                                                                entryPanelLayout.createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                .addComponent(jLabel3,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                26,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addComponent(nameText,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                26,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(entryPanelLayout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                false)
                                                                                .addComponent(jDateChooser1,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                26,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(jLabel4,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(
                                                                                entryPanelLayout.createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                .addComponent(jLabel5,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                26,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addComponent(quantityText,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                26,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(
                                                                                entryPanelLayout.createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                .addComponent(jLabel6,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                26,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addComponent(costText,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                26,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(
                                                                                entryPanelLayout.createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                .addComponent(jLabel7,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                26,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addComponent(sellText,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                26,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(
                                                                                entryPanelLayout.createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                .addComponent(jLabel8,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                26,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addComponent(brandText,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                26,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(
                                                                                entryPanelLayout.createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                .addComponent(addButton)
                                                                                                .addComponent(editButton)
                                                                                                .addComponent(deleteButton))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(clearButton)
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)));

                productTable.setModel(new javax.swing.table.DefaultTableModel(
                                new Object[][] {
                                                { null, null, null, null },
                                                { null, null, null, null },
                                                { null, null, null, null },
                                                { null, null, null, null }
                                },
                                new String[] {
                                                "Title 1", "Title 2", "Title 3", "Title 4"
                                }));
                productTable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                productTable.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                productTableMouseClicked(evt);
                        }
                });
                jScrollPane1.setViewportView(productTable);

                refreshButton.setFont(new java.awt.Font("Segoe UI", 1, 12));
                refreshButton.setText("ATUALIZAR");
                refreshButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                refreshButtonActionPerformed(evt);
                        }
                });

                searchText.addKeyListener(new java.awt.event.KeyAdapter() {
                        public void keyReleased(java.awt.event.KeyEvent evt) {
                                searchTextKeyReleased(evt);
                        }
                });

                jLabel9.setText("Pesquisa:");

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
                                                                                                                126,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                Short.MAX_VALUE)
                                                                                                .addComponent(jLabel9)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(searchText,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                158,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGap(18, 18, 18)
                                                                                                .addComponent(refreshButton))
                                                                                .addComponent(jSeparator1)
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                layout
                                                                                                                .createSequentialGroup()
                                                                                                                .addComponent(jScrollPane1,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                496,
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
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addContainerGap()
                                                                                                .addComponent(jLabel1,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                41,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                Short.MAX_VALUE))
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                layout
                                                                                                                .createSequentialGroup()
                                                                                                                .addContainerGap(
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                Short.MAX_VALUE)
                                                                                                                .addGroup(layout
                                                                                                                                .createParallelGroup(
                                                                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                                                .addComponent(refreshButton,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                29,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                .addComponent(searchText,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                .addComponent(jLabel9))
                                                                                                                .addPreferredGap(
                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
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
                                                                .addGap(64, 64, 64)));
        }

        private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {
                if (productTable.getSelectedRow() < 0)
                        JOptionPane.showMessageDialog(null, "Selecione o produto na tabela.");
                else {
                        productDTO = new ProductDTO();
                        if (nameText.getText().equals("") || costText.getText().equals("")
                                        || sellText.getText().equals("") || brandText.getText().equals(""))
                                JOptionPane.showMessageDialog(null, "Insira todos os detalhes pedidos.");
                        else {
                                productDTO.setProdCode(codeText.getText());
                                productDTO.setProdName(nameText.getText());
                                productDTO.setDate(jDateChooser1.getDateFormatString());
                                productDTO.setQuantity(Integer.parseInt(quantityText.getText()));
                                productDTO.setCostPrice(Double.parseDouble(costText.getText()));
                                productDTO.setSellPrice(Double.parseDouble(sellText.getText()));
                                productDTO.setBrand(brandText.getText());
                                productDTO.setUserID(userID);

                                new ProductDAO().editProdDAO(productDTO);
                        }
                        loadDataSet();
                }
        }

        private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {
                productDTO = new ProductDTO();
                if (nameText.getText().equals("") || costText.getText().equals("")
                                || sellText.getText().equals("") || brandText.getText().equals(""))
                        JOptionPane.showMessageDialog(null, "Insira todos os detalhes pedidos.");
                else {
                        productDTO.setProdCode(codeText.getText());
                        productDTO.setProdName(nameText.getText());
                        productDTO.setDate(jDateChooser1.getDateFormatString());
                        productDTO.setQuantity(Integer.parseInt(quantityText.getText()));
                        productDTO.setCostPrice(Double.parseDouble(costText.getText()));
                        productDTO.setSellPrice(Double.parseDouble(sellText.getText()));
                        productDTO.setBrand(brandText.getText());
                        productDTO.setUserID(userID);

                        new ProductDAO().addProductDAO(productDTO);
                        loadDataSet();
                }
        }

        private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {
                if (productTable.getSelectedRow() < 0)
                        JOptionPane.showMessageDialog(null, "Selecione o produto na tabela.");
                else {
                        int opt = JOptionPane.showConfirmDialog(
                                        null,
                                        "Deseja excluir esse produto?",
                                        "Confirmação",
                                        JOptionPane.YES_NO_OPTION);
                        if (opt == JOptionPane.YES_OPTION) {
                                new ProductDAO().deleteProductDAO(
                                                (String) productTable.getValueAt(
                                                                productTable.getSelectedRow(), 0));
                                loadDataSet();
                        }
                }
        }

        private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {
                codeText.setText("");
                nameText.setText("");
                jDateChooser1.setDate(null);
                quantityText.setText("");
                costText.setText("");
                sellText.setText("");
                brandText.setText("");
                searchText.setText("");
        }

        private void productTableMouseClicked(java.awt.event.MouseEvent evt) {
                int row = productTable.getSelectedRow();
                int col = productTable.getColumnCount();

                Object[] data = new Object[col];
                for (int i = 0; i < col; i++)
                        data[i] = productTable.getValueAt(row, i);

                codeText.setText(data[0].toString());
                nameText.setText(data[1].toString());
                costText.setText(data[2].toString());
                sellText.setText(data[3].toString());
                brandText.setText(data[4].toString());

        }

        private void addSuppButtonActionPerformed(java.awt.event.ActionEvent evt) {
                dashboard.addSuppPage();
        }

        private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {
                loadDataSet();
                loadComboBox();
                clearButtonActionPerformed(evt);
        }

        private void searchTextKeyReleased(java.awt.event.KeyEvent evt) {
                loadSearchData(searchText.getText());
        }

        public void loadComboBox() {
                try {
                        SupplierDAO supplierDAO = new SupplierDAO();
                        suppCombo.setModel(supplierDAO.setComboItems(supplierDAO.getQueryResult()));
                } catch (SQLException e) {
                        e.printStackTrace();
                }
        }

        public void loadDataSet() {
                try {
                        ProductDAO productDAO = new ProductDAO();
                        productTable.setModel(productDAO.buildTableModel(productDAO.getQueryResult()));
                } catch (SQLException throwables) {
                        throwables.printStackTrace();
                }
        }

        public void loadSearchData(String text) {
                try {
                        ProductDAO productDAO = new ProductDAO();
                        productTable.setModel(productDAO.buildTableModel(productDAO.getProductSearch(text)));
                } catch (SQLException throwables) {
                        throwables.printStackTrace();
                }
        }

        private javax.swing.JButton addButton;
        private javax.swing.JButton addSuppButton;
        private javax.swing.JTextField brandText;
        private javax.swing.JButton clearButton;
        private javax.swing.JTextField codeText;
        private javax.swing.JTextField costText;
        private javax.swing.JButton deleteButton;
        private javax.swing.JButton editButton;
        private javax.swing.JPanel entryPanel;
        private com.toedter.calendar.JDateChooser jDateChooser1;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JLabel jLabel6;
        private javax.swing.JLabel jLabel7;
        private javax.swing.JLabel jLabel8;
        private javax.swing.JLabel jLabel9;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JSeparator jSeparator1;
        private javax.swing.JTextField nameText;
        private javax.swing.JTable productTable;
        private javax.swing.JTextField quantityText;
        private javax.swing.JButton refreshButton;
        private javax.swing.JTextField searchText;
        private javax.swing.JTextField sellText;
        private javax.swing.JComboBox<String> suppCombo;

}
