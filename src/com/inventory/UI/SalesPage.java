package com.inventory.UI;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import com.inventory.DAO.CustomerDAO;
import com.inventory.DAO.ProductDAO;
import com.inventory.DTO.ProductDTO;

public class SalesPage extends javax.swing.JPanel {

        String username;
        Dashboard dashboard;
        int quantity;
        String prodCode;

        public SalesPage(String username, Dashboard dashboard) {
                initComponents();
                this.username = username;
                this.dashboard = dashboard;
                custNameLabel.setVisible(false);
                prodNameLabel.setVisible(false);
                loadDataSet();
        }

        @SuppressWarnings("unchecked")

        private void initComponents() {

                jLabel1 = new javax.swing.JLabel();
                jSeparator1 = new javax.swing.JSeparator();
                sellPanel = new javax.swing.JPanel();
                jLabel2 = new javax.swing.JLabel();
                jLabel3 = new javax.swing.JLabel();
                jLabel4 = new javax.swing.JLabel();
                jLabel5 = new javax.swing.JLabel();
                jLabel6 = new javax.swing.JLabel();
                custCodeText = new javax.swing.JTextField();
                prodCodeText = new javax.swing.JTextField();
                priceText = new javax.swing.JTextField();
                quantityText = new javax.swing.JTextField();
                jDateChooser1 = new com.toedter.calendar.JDateChooser();
                sellButton = new javax.swing.JButton();
                deleteButton = new javax.swing.JButton();
                clearButton = new javax.swing.JButton();
                addCustButton = new javax.swing.JButton();
                custNameLabel = new javax.swing.JLabel();
                prodNameLabel = new javax.swing.JLabel();
                jScrollPane1 = new javax.swing.JScrollPane();
                salesTable = new javax.swing.JTable();
                searchText = new javax.swing.JTextField();
                jLabel7 = new javax.swing.JLabel();

                jLabel1.setFont(new java.awt.Font("Impact", 0, 24));
                jLabel1.setText("VENDAS");

                sellPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Venda produto"));

                jLabel2.setText("Codigo cliente:");

                jLabel3.setText("Codigo produto:");

                jLabel4.setText("Data:");

                jLabel5.setText("Preço de venda:");

                jLabel6.setText("Quantidade:");

                custCodeText.addKeyListener(new java.awt.event.KeyAdapter() {
                        public void keyReleased(java.awt.event.KeyEvent evt) {
                                custCodeTextKeyReleased(evt);
                        }
                });

                prodCodeText.addKeyListener(new java.awt.event.KeyAdapter() {
                        public void keyReleased(java.awt.event.KeyEvent evt) {
                                prodCodeTextKeyReleased(evt);
                        }
                });

                sellButton.setFont(new java.awt.Font("Segoe UI", 1, 12));
                sellButton.setText("VENDER PRODUTO");
                sellButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                sellButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                sellButtonActionPerformed(evt);
                        }
                });

                deleteButton.setText("Excluir");
                deleteButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                deleteButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                deleteButtonActionPerformed(evt);
                        }
                });

                clearButton.setText("Limpar");
                clearButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                clearButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                clearButtonActionPerformed(evt);
                        }
                });

                addCustButton.setText("Clique para adicionar novo cliente");
                addCustButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                addCustButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                addCustButtonActionPerformed(evt);
                        }
                });

                custNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                custNameLabel.setLabelFor(custCodeText);

                prodNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                prodNameLabel.setLabelFor(prodCodeText);

                javax.swing.GroupLayout sellPanelLayout = new javax.swing.GroupLayout(sellPanel);
                sellPanel.setLayout(sellPanelLayout);
                sellPanelLayout.setHorizontalGroup(
                                sellPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(sellPanelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(sellPanelLayout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(prodNameLabel,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(custNameLabel,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(addCustButton,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(sellButton,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addGroup(sellPanelLayout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(jLabel2,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                86,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(custCodeText))
                                                                                .addGroup(sellPanelLayout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(jLabel3,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                86,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(prodCodeText))
                                                                                .addGroup(sellPanelLayout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(deleteButton,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                134,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(clearButton,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                129,
                                                                                                                Short.MAX_VALUE))
                                                                                .addGroup(sellPanelLayout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(jLabel6,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                86,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(quantityText))
                                                                                .addGroup(sellPanelLayout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(jLabel5,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                86,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(priceText))
                                                                                .addGroup(sellPanelLayout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(jLabel4,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                86,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(jDateChooser1,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                Short.MAX_VALUE)))
                                                                .addContainerGap()));
                sellPanelLayout.setVerticalGroup(
                                sellPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(sellPanelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(sellPanelLayout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jLabel2,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                24,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGroup(sellPanelLayout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(1, 1, 1)
                                                                                                .addComponent(custCodeText,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                29,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(custNameLabel,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                26,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                15,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(addCustButton)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(sellPanelLayout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                false)
                                                                                .addComponent(jLabel3,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(prodCodeText,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                24,
                                                                                                Short.MAX_VALUE))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(prodNameLabel,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                33,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                15,
                                                                                Short.MAX_VALUE)
                                                                .addGroup(sellPanelLayout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jLabel4,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                24,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jDateChooser1,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(
                                                                                sellPanelLayout.createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                .addComponent(jLabel5,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                24,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addComponent(priceText,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                24,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(sellPanelLayout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jLabel6,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                30,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(quantityText,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                24,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(sellButton,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                33,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(
                                                                                sellPanelLayout.createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                .addComponent(deleteButton)
                                                                                                .addComponent(clearButton))
                                                                .addContainerGap()));

                salesTable.setModel(new javax.swing.table.DefaultTableModel(
                                new Object[][] {
                                                { null, null, null, null },
                                                { null, null, null, null },
                                                { null, null, null, null },
                                                { null, null, null, null }
                                },
                                new String[] {
                                                "Title 1", "Title 2", "Title 3", "Title 4"
                                }));
                salesTable.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                salesTableMouseClicked(evt);
                        }
                });
                jScrollPane1.setViewportView(salesTable);

                searchText.addKeyListener(new java.awt.event.KeyAdapter() {
                        public void keyReleased(java.awt.event.KeyEvent evt) {
                                searchTextKeyReleased(evt);
                        }
                });

                jLabel7.setText("Pesquisa:");

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
                                                                                                                70,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                Short.MAX_VALUE)
                                                                                                .addComponent(jLabel7)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(searchText,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                174,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addComponent(jSeparator1)
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                layout
                                                                                                                .createSequentialGroup()
                                                                                                                .addComponent(jScrollPane1,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                457,
                                                                                                                                Short.MAX_VALUE)
                                                                                                                .addPreferredGap(
                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                .addComponent(sellPanel,
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
                                                                                .addComponent(jLabel7))
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
                                                                                .addComponent(sellPanel,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(jScrollPane1,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                0,
                                                                                                Short.MAX_VALUE))
                                                                .addContainerGap(70, Short.MAX_VALUE)));
        }

        private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {
                if (salesTable.getSelectedRow() < 0)
                        JOptionPane.showMessageDialog(this, "Selecione uma entrada da tabela que você deseja excluir.");
                else {
                        int opt = JOptionPane.showConfirmDialog(
                                        this,
                                        "Excluir essa venda?",
                                        "Confirmação",
                                        JOptionPane.YES_NO_OPTION);
                        if (opt == JOptionPane.YES_OPTION) {
                                new ProductDAO().deleteSaleDAO(Integer.parseInt(
                                                salesTable.getValueAt(salesTable.getSelectedRow(), 0).toString()));
                                new ProductDAO().editSoldStock(
                                                salesTable.getValueAt(salesTable.getSelectedRow(), 1).toString(),
                                                quantity);
                                loadDataSet();
                        }
                }
        }

        private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {
                custCodeText.setText("");
                custNameLabel.setText("");
                custNameLabel.setVisible(false);
                prodCodeText.setText("");
                prodNameLabel.setText("");
                prodNameLabel.setVisible(false);
                jDateChooser1.setDate(null);
                priceText.setText("");
                quantityText.setText("");
                loadDataSet();
        }

        private void addCustButtonActionPerformed(java.awt.event.ActionEvent evt) {
                dashboard.addCustPage();
        }

        private void sellButtonActionPerformed(java.awt.event.ActionEvent evt) {
                if (custCodeText.getText().equals("") || prodCodeText.getText().equals("")
                                || jDateChooser1.getDate() == null || quantityText.getText().equals("")
                                || priceText.getText().equals(""))
                        JOptionPane.showMessageDialog(this, "Preencha todos os campos.");
                else {
                        try {
                                ResultSet resultSet = new CustomerDAO().getCustName(custCodeText.getText());
                                if (resultSet.next()) {
                                        ProductDTO productDTO = new ProductDTO();
                                        productDTO.setCustCode(custCodeText.getText());
                                        productDTO.setDate(jDateChooser1.getDate().toString());
                                        productDTO.setProdCode(prodCodeText.getText());
                                        Double sellPrice = Double.parseDouble(priceText.getText());
                                        Double totalRevenue = sellPrice * Integer.parseInt(quantityText.getText());
                                        productDTO.setTotalRevenue(totalRevenue);
                                        productDTO.setQuantity(Integer.parseInt(quantityText.getText()));
                                        new ProductDAO().sellProductDAO(productDTO, username);
                                        loadDataSet();
                                } else
                                        JOptionPane.showMessageDialog(this, "Esse cliente não existe.\n" +
                                                        "Adicione novo cliente ou use um cliente válido.");
                        } catch (SQLException e) {
                                e.printStackTrace();
                        }
                }
        }

        private void salesTableMouseClicked(java.awt.event.MouseEvent evt) {
                int row = salesTable.getSelectedRow();
                int col = salesTable.getColumnCount();
                Object[] data = new Object[col];
                for (int i = 0; i < col; i++)
                        data[i] = salesTable.getValueAt(row, i);
                quantity = Integer.parseInt(data[3].toString());
                prodCode = data[1].toString();
        }

        private void custCodeTextKeyReleased(java.awt.event.KeyEvent evt) {
                try {
                        ResultSet resultSet = new CustomerDAO().getCustName(custCodeText.getText());
                        if (resultSet.next())
                                custNameLabel.setText("Nome: "
                                                + resultSet.getString("fullname")
                                                + " | Localização: "
                                                + resultSet.getString("location"));
                        else
                                custNameLabel.setText("||   Cliente não existe nos registros.   ||");
                        custNameLabel.setVisible(true);
                } catch (SQLException e) {
                        e.printStackTrace();
                }
        }

        private void prodCodeTextKeyReleased(java.awt.event.KeyEvent evt) {
                try {
                        ResultSet resultSet = new CustomerDAO().getProdName(prodCodeText.getText());
                        if (resultSet.next()) {
                                prodNameLabel.setText("Nome: "
                                                + resultSet.getString("productname")
                                                + " | Quantidade disponivel: "
                                                + resultSet.getString("quantity"));
                                Double sellPrice = new ProductDAO().getProdSell(prodCodeText.getText());
                                priceText.setText(sellPrice.toString());
                        } else
                                prodNameLabel.setText("||   Produto não existe no estoque.  ||");
                        prodNameLabel.setVisible(true);
                } catch (SQLException e) {
                        e.printStackTrace();
                }
        }

        private void searchTextKeyReleased(java.awt.event.KeyEvent evt) {
                loadSearchData(searchText.getText());
        }

        public void loadDataSet() {
                try {
                        ProductDAO productDAO = new ProductDAO();
                        salesTable.setModel(productDAO.buildTableModel(productDAO.getSalesInfo()));
                } catch (SQLException e) {
                        e.printStackTrace();
                }
        }

        public void loadSearchData(String text) {
                try {
                        ProductDAO productDAO = new ProductDAO();
                        salesTable.setModel(productDAO.buildTableModel(productDAO.getSalesSearch(text)));
                } catch (SQLException e) {
                        e.printStackTrace();
                }
        }

        private javax.swing.JButton addCustButton;
        private javax.swing.JButton clearButton;
        private javax.swing.JTextField custCodeText;
        private javax.swing.JLabel custNameLabel;
        private javax.swing.JButton deleteButton;
        private com.toedter.calendar.JDateChooser jDateChooser1;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JLabel jLabel6;
        private javax.swing.JLabel jLabel7;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JSeparator jSeparator1;
        private javax.swing.JTextField priceText;
        private javax.swing.JTextField prodCodeText;
        private javax.swing.JLabel prodNameLabel;
        private javax.swing.JTextField quantityText;
        private javax.swing.JTable salesTable;
        private javax.swing.JTextField searchText;
        private javax.swing.JButton sellButton;
        private javax.swing.JPanel sellPanel;

}
