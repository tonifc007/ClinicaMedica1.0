/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import javax.swing.JOptionPane;

/**
 *
 * @author Anderson
 */
public class FormularioMedico extends javax.swing.JFrame {

    /**
     * Creates new form FormularioMedico
     */
    
    Medico medico = new Medico();
    DaoMedico daoMedico = new DaoMedico();
    
    public FormularioMedico() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelNome_CadMedico = new javax.swing.JLabel();
        jLabelCRMCadMedico = new javax.swing.JLabel();
        jLabelEspecialidadeCadMedico = new javax.swing.JLabel();
        jTextFieldNome_CadMedico = new javax.swing.JTextField();
        jTextFieldCRMCadMedico = new javax.swing.JTextField();
        jComboBoxEspecialidadeCadMedico = new javax.swing.JComboBox<>();
        jLabelCPF_CadMedico = new javax.swing.JLabel();
        jLabelEndereco_CadMedico = new javax.swing.JLabel();
        jTextField1CPF_CadMedico = new javax.swing.JTextField();
        jTextFieldEndereco_CadMedico = new javax.swing.JTextField();
        jLabelNumero_CadMedico = new javax.swing.JLabel();
        jTextFieldNumero_CadMedico = new javax.swing.JTextField();
        jLabelBairro_CadMedico = new javax.swing.JLabel();
        jTextFieldBairro_CadMedico = new javax.swing.JTextField();
        jLabelCEP_CadMedico = new javax.swing.JLabel();
        jTextFieldCEP_CadMedico = new javax.swing.JTextField();
        jLabelSexo_CadMedico = new javax.swing.JLabel();
        jComboBoxSexoCad_Medico = new javax.swing.JComboBox<>();
        jLabelCidade_CadMedico = new javax.swing.JLabel();
        jTextFieldCidade_CadMedico = new javax.swing.JTextField();
        jLabelNascimento_CadMedico = new javax.swing.JLabel();
        jTextFieldNascimento_CadMedico = new javax.swing.JTextField();
        jLabelEstado_CadMedico = new javax.swing.JLabel();
        jComboBoxEstado_CadMedico = new javax.swing.JComboBox<>();
        jLabelTelefone_CadMedico = new javax.swing.JLabel();
        jTextFieldTelefone_CadMedico = new javax.swing.JTextField();
        jButtonSalvar_CadMedico = new javax.swing.JButton();
        jButtonCancelar_CadMedico = new javax.swing.JButton();
        jLabelCadastroDeMedicos = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(null);

        jLabelNome_CadMedico.setText("Nome:");
        jPanel1.add(jLabelNome_CadMedico);
        jLabelNome_CadMedico.setBounds(20, 20, 50, 14);

        jLabelCRMCadMedico.setText("CRM:");
        jPanel1.add(jLabelCRMCadMedico);
        jLabelCRMCadMedico.setBounds(20, 340, 100, 14);

        jLabelEspecialidadeCadMedico.setText("Especialidade:");
        jPanel1.add(jLabelEspecialidadeCadMedico);
        jLabelEspecialidadeCadMedico.setBounds(430, 330, 110, 20);

        jTextFieldNome_CadMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNome_CadMedicoActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldNome_CadMedico);
        jTextFieldNome_CadMedico.setBounds(70, 20, 470, 30);
        jPanel1.add(jTextFieldCRMCadMedico);
        jTextFieldCRMCadMedico.setBounds(60, 330, 220, 30);

        jComboBoxEspecialidadeCadMedico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "                            ", "Cardiologia", "Geriatria", "Obstetria", "Pedriatria", "Endocrinologia", "Otorrinolaringologia", "Oftalmologia", "Angeologia", "Dermatologia", "Cirurgião Geral", "Nurologia", "Nutrologia", " ", " " }));
        jPanel1.add(jComboBoxEspecialidadeCadMedico);
        jComboBoxEspecialidadeCadMedico.setBounds(520, 320, 170, 30);

        jLabelCPF_CadMedico.setText("CPF:");
        jPanel1.add(jLabelCPF_CadMedico);
        jLabelCPF_CadMedico.setBounds(20, 80, 34, 14);

        jLabelEndereco_CadMedico.setText("Endereço:");
        jPanel1.add(jLabelEndereco_CadMedico);
        jLabelEndereco_CadMedico.setBounds(20, 120, 80, 30);
        jPanel1.add(jTextField1CPF_CadMedico);
        jTextField1CPF_CadMedico.setBounds(70, 70, 220, 30);
        jPanel1.add(jTextFieldEndereco_CadMedico);
        jTextFieldEndereco_CadMedico.setBounds(80, 120, 460, 30);

        jLabelNumero_CadMedico.setText("Nº");
        jPanel1.add(jLabelNumero_CadMedico);
        jLabelNumero_CadMedico.setBounds(590, 130, 30, 14);
        jPanel1.add(jTextFieldNumero_CadMedico);
        jTextFieldNumero_CadMedico.setBounds(610, 120, 80, 30);

        jLabelBairro_CadMedico.setText("Bairro:");
        jPanel1.add(jLabelBairro_CadMedico);
        jLabelBairro_CadMedico.setBounds(20, 180, 60, 14);
        jPanel1.add(jTextFieldBairro_CadMedico);
        jTextFieldBairro_CadMedico.setBounds(70, 170, 240, 30);

        jLabelCEP_CadMedico.setText("CEP:");
        jPanel1.add(jLabelCEP_CadMedico);
        jLabelCEP_CadMedico.setBounds(340, 180, 50, 14);
        jPanel1.add(jTextFieldCEP_CadMedico);
        jTextFieldCEP_CadMedico.setBounds(370, 170, 320, 30);

        jLabelSexo_CadMedico.setText("Sexo:");
        jPanel1.add(jLabelSexo_CadMedico);
        jLabelSexo_CadMedico.setBounds(520, 280, 50, 20);

        jComboBoxSexoCad_Medico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "             ", "Masculino", "Feminino", "Outro" }));
        jComboBoxSexoCad_Medico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxSexoCad_MedicoActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBoxSexoCad_Medico);
        jComboBoxSexoCad_Medico.setBounds(560, 270, 130, 30);

        jLabelCidade_CadMedico.setText("Cidade:");
        jPanel1.add(jLabelCidade_CadMedico);
        jLabelCidade_CadMedico.setBounds(20, 230, 70, 14);
        jPanel1.add(jTextFieldCidade_CadMedico);
        jTextFieldCidade_CadMedico.setBounds(70, 220, 240, 30);

        jLabelNascimento_CadMedico.setText("Nascimento: ");
        jPanel1.add(jLabelNascimento_CadMedico);
        jLabelNascimento_CadMedico.setBounds(340, 230, 100, 14);
        jPanel1.add(jTextFieldNascimento_CadMedico);
        jTextFieldNascimento_CadMedico.setBounds(410, 220, 280, 30);

        jLabelEstado_CadMedico.setText("Estado: ");
        jPanel1.add(jLabelEstado_CadMedico);
        jLabelEstado_CadMedico.setBounds(20, 280, 50, 14);

        jComboBoxEstado_CadMedico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "    ", "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO", " " }));
        jPanel1.add(jComboBoxEstado_CadMedico);
        jComboBoxEstado_CadMedico.setBounds(70, 270, 100, 30);

        jLabelTelefone_CadMedico.setText("Telefone:");
        jPanel1.add(jLabelTelefone_CadMedico);
        jLabelTelefone_CadMedico.setBounds(210, 280, 80, 14);
        jPanel1.add(jTextFieldTelefone_CadMedico);
        jTextFieldTelefone_CadMedico.setBounds(270, 270, 220, 30);

        jButtonSalvar_CadMedico.setText("Salvar");
        jButtonSalvar_CadMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvar_CadMedicoActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonSalvar_CadMedico);
        jButtonSalvar_CadMedico.setBounds(490, 390, 100, 30);

        jButtonCancelar_CadMedico.setText("Cancelar");
        jPanel1.add(jButtonCancelar_CadMedico);
        jButtonCancelar_CadMedico.setBounds(610, 390, 100, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 36, 730, 440);

        jLabelCadastroDeMedicos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelCadastroDeMedicos.setText("Cadastro de Médicos");
        getContentPane().add(jLabelCadastroDeMedicos);
        jLabelCadastroDeMedicos.setBounds(300, 10, 140, 14);

        setSize(new java.awt.Dimension(769, 526));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNome_CadMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNome_CadMedicoActionPerformed
        
    }//GEN-LAST:event_jTextFieldNome_CadMedicoActionPerformed

    private void jComboBoxSexoCad_MedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSexoCad_MedicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxSexoCad_MedicoActionPerformed

    private void jButtonSalvar_CadMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvar_CadMedicoActionPerformed
        if(!jTextFieldNome_CadMedico.toString().isEmpty() 
                || !jTextField1CPF_CadMedico.toString().isEmpty() 
                || !jTextFieldEndereco_CadMedico.toString().isEmpty() 
                || !jTextFieldNumero_CadMedico.toString().isEmpty() 
                || !jTextFieldBairro_CadMedico.toString().isEmpty() 
                || !jTextFieldCEP_CadMedico.toString().isEmpty() 
                || !jTextFieldCidade_CadMedico.toString().isEmpty() 
                || !jComboBoxEstado_CadMedico.toString().isEmpty() 
                || !jLabelNascimento_CadMedico.toString().isEmpty()
                || !jTextFieldTelefone_CadMedico.toString().isEmpty() 
                || !jComboBoxSexoCad_Medico.toString().isEmpty() 
                || !jTextFieldCRMCadMedico.toString().isEmpty() 
                || !jComboBoxEspecialidadeCadMedico.toString().isEmpty()) {
            
            medico.setNome(jTextFieldNome_CadMedico.toString());
            medico.setCpf(jLabelCPF_CadMedico.toString());
            medico.setRua(jLabelEndereco_CadMedico.toString());
            medico.setNumero(jLabelNumero_CadMedico.toString());
            medico.setBairro(jLabelBairro_CadMedico.toString());
            medico.setCep(jLabelCEP_CadMedico.toString());
            medico.setCidade(jLabelCidade_CadMedico.toString());
            medico.setEstado(jLabelEstado_CadMedico.toString());
            medico.setNascimento(jLabelNascimento_CadMedico.toString());
            medico.setTelefone(jLabelTelefone_CadMedico.toString());
            medico.setSexo(jLabelSexo_CadMedico.toString());
            medico.setCrm(jLabelCRMCadMedico.toString());
            medico.setEspecialidade(jLabelEspecialidadeCadMedico.toString());

            daoMedico.adicionaMedico(medico);
            
            
        FormularioMedico form_med = new FormularioMedico();
        form_med.setVisible(true);
        dispose();
        } else {
            JOptionPane.showMessageDialog(rootPane, "Preencha todos os campos");
        }
        
       
    }//GEN-LAST:event_jButtonSalvar_CadMedicoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormularioMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormularioMedico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar_CadMedico;
    private javax.swing.JButton jButtonSalvar_CadMedico;
    private javax.swing.JComboBox<String> jComboBoxEspecialidadeCadMedico;
    private javax.swing.JComboBox<String> jComboBoxEstado_CadMedico;
    private javax.swing.JComboBox<String> jComboBoxSexoCad_Medico;
    private javax.swing.JLabel jLabelBairro_CadMedico;
    private javax.swing.JLabel jLabelCEP_CadMedico;
    private javax.swing.JLabel jLabelCPF_CadMedico;
    private javax.swing.JLabel jLabelCRMCadMedico;
    private javax.swing.JLabel jLabelCadastroDeMedicos;
    private javax.swing.JLabel jLabelCidade_CadMedico;
    private javax.swing.JLabel jLabelEndereco_CadMedico;
    private javax.swing.JLabel jLabelEspecialidadeCadMedico;
    private javax.swing.JLabel jLabelEstado_CadMedico;
    private javax.swing.JLabel jLabelNascimento_CadMedico;
    private javax.swing.JLabel jLabelNome_CadMedico;
    private javax.swing.JLabel jLabelNumero_CadMedico;
    private javax.swing.JLabel jLabelSexo_CadMedico;
    private javax.swing.JLabel jLabelTelefone_CadMedico;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1CPF_CadMedico;
    private javax.swing.JTextField jTextFieldBairro_CadMedico;
    private javax.swing.JTextField jTextFieldCEP_CadMedico;
    private javax.swing.JTextField jTextFieldCRMCadMedico;
    private javax.swing.JTextField jTextFieldCidade_CadMedico;
    private javax.swing.JTextField jTextFieldEndereco_CadMedico;
    private javax.swing.JTextField jTextFieldNascimento_CadMedico;
    private javax.swing.JTextField jTextFieldNome_CadMedico;
    private javax.swing.JTextField jTextFieldNumero_CadMedico;
    private javax.swing.JTextField jTextFieldTelefone_CadMedico;
    // End of variables declaration//GEN-END:variables
}
