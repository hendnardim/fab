/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package view;

import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author Hendrew
 */
public class tela_cadastro_vendedor extends javax.swing.JInternalFrame {

        
    /**
     * Creates new form tela_cadastro_vendedor
     */
    public tela_cadastro_vendedor() {
        initComponents();
        
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI bui= (BasicInternalFrameUI) this.getUI();
        bui.setNorthPane(null);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtCadastroUsuario1 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel29 = new javax.swing.JLabel();
        txtCadastroEmail = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        txtCadastroSenha = new javax.swing.JPasswordField();
        txtCadastroCPF = new javax.swing.JFormattedTextField();
        txtCadastroData = new javax.swing.JFormattedTextField();
        txtCadastroCelular = new javax.swing.JFormattedTextField();
        jLabel14 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();

        setBorder(null);
        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1070, 850));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Nunito SemiBold", 1, 48)); // NOI18N
        jLabel1.setText("Cadastrar funcionário");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(310, 60, 570, 50);

        txtCadastroUsuario1.setFont(new java.awt.Font("Nunito SemiBold", 1, 18)); // NOI18N
        txtCadastroUsuario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCadastroUsuario1ActionPerformed(evt);
            }
        });
        getContentPane().add(txtCadastroUsuario1);
        txtCadastroUsuario1.setBounds(120, 200, 660, 30);

        jLabel28.setFont(new java.awt.Font("Nunito SemiBold", 1, 19)); // NOI18N
        jLabel28.setText("Nome");
        getContentPane().add(jLabel28);
        jLabel28.setBounds(120, 170, 80, 40);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(100, 160, 790, 10);

        jLabel29.setFont(new java.awt.Font("Nunito SemiBold", 1, 19)); // NOI18N
        jLabel29.setText("E-mail");
        getContentPane().add(jLabel29);
        jLabel29.setBounds(120, 230, 80, 40);

        txtCadastroEmail.setFont(new java.awt.Font("Nunito SemiBold", 1, 18)); // NOI18N
        txtCadastroEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCadastroEmailActionPerformed(evt);
            }
        });
        getContentPane().add(txtCadastroEmail);
        txtCadastroEmail.setBounds(120, 260, 400, 30);

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/person.png"))); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(170, 170, 60, 40);

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/email.png"))); // NOI18N
        getContentPane().add(jLabel11);
        jLabel11.setBounds(180, 230, 50, 40);

        jLabel31.setFont(new java.awt.Font("Nunito SemiBold", 1, 19)); // NOI18N
        jLabel31.setText("Celular");
        getContentPane().add(jLabel31);
        jLabel31.setBounds(540, 230, 80, 40);

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cell.png"))); // NOI18N
        getContentPane().add(jLabel15);
        jLabel15.setBounds(590, 220, 80, 50);

        jLabel32.setFont(new java.awt.Font("Nunito SemiBold", 1, 19)); // NOI18N
        jLabel32.setText("Data de nascimento");
        getContentPane().add(jLabel32);
        jLabel32.setBounds(120, 290, 200, 40);

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/calendario.png"))); // NOI18N
        getContentPane().add(jLabel10);
        jLabel10.setBounds(300, 270, 50, 70);

        jLabel30.setFont(new java.awt.Font("Nunito SemiBold", 1, 19)); // NOI18N
        jLabel30.setText("CPF");
        getContentPane().add(jLabel30);
        jLabel30.setBounds(380, 290, 50, 40);

        jLabel33.setFont(new java.awt.Font("Nunito SemiBold", 1, 19)); // NOI18N
        jLabel33.setText("Departamento / Setor");
        getContentPane().add(jLabel33);
        jLabel33.setBounds(120, 350, 200, 40);

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/departament_icon.png"))); // NOI18N
        getContentPane().add(jLabel22);
        jLabel22.setBounds(330, 350, 30, 40);

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Profile.png"))); // NOI18N
        getContentPane().add(jLabel13);
        jLabel13.setBounds(410, 280, 60, 50);

        jLabel34.setFont(new java.awt.Font("Nunito SemiBold", 1, 19)); // NOI18N
        jLabel34.setText("Senha");
        getContentPane().add(jLabel34);
        jLabel34.setBounds(420, 350, 60, 40);

        jCheckBox1.setFont(new java.awt.Font("Nunito SemiBold", 1, 19)); // NOI18N
        jCheckBox1.setText("Usuário com privilégios admin");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox1);
        jCheckBox1.setBounds(120, 420, 330, 31);

        jComboBox2.setFont(new java.awt.Font("Nunito SemiBold", 1, 18)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Administrativo", "Comercial", "Financeiro", "Recursos humanos", "Vendedor" }));
        getContentPane().add(jComboBox2);
        jComboBox2.setBounds(120, 380, 280, 30);

        jButton3.setFont(new java.awt.Font("Nunito SemiBold", 1, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 25, 37));
        jButton3.setText("Cadastrar ");
        jButton3.setBorder(null);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jButton3);
        jButton3.setBounds(570, 590, 200, 60);

        txtCadastroSenha.setFont(new java.awt.Font("Nunito SemiBold", 1, 14)); // NOI18N
        txtCadastroSenha.setToolTipText("");
        getContentPane().add(txtCadastroSenha);
        txtCadastroSenha.setBounds(420, 380, 360, 30);

        try {
            txtCadastroCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCadastroCPF.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtCadastroCPF.setFont(new java.awt.Font("Nunito SemiBold", 1, 18)); // NOI18N
        getContentPane().add(txtCadastroCPF);
        txtCadastroCPF.setBounds(380, 320, 400, 30);

        try {
            txtCadastroData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCadastroData.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCadastroData.setFont(new java.awt.Font("Nunito SemiBold", 1, 18)); // NOI18N
        getContentPane().add(txtCadastroData);
        txtCadastroData.setBounds(120, 320, 240, 30);

        try {
            txtCadastroCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCadastroCelular.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtCadastroCelular.setFont(new java.awt.Font("Nunito SemiBold", 1, 18)); // NOI18N
        getContentPane().add(txtCadastroCelular);
        txtCadastroCelular.setBounds(540, 260, 240, 30);

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Password.png"))); // NOI18N
        getContentPane().add(jLabel14);
        jLabel14.setBounds(470, 350, 60, 40);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setPreferredSize(new java.awt.Dimension(1280, 850));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1100, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 850, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel7);
        jPanel7.setBounds(0, -20, 1100, 850);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void txtCadastroEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCadastroEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCadastroEmailActionPerformed

    private void txtCadastroUsuario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCadastroUsuario1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCadastroUsuario1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JFormattedTextField txtCadastroCPF;
    private javax.swing.JFormattedTextField txtCadastroCelular;
    private javax.swing.JFormattedTextField txtCadastroData;
    private javax.swing.JTextField txtCadastroEmail;
    private javax.swing.JPasswordField txtCadastroSenha;
    private javax.swing.JTextField txtCadastroUsuario1;
    // End of variables declaration//GEN-END:variables
}
