/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetog;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author ALUNO
 */
public class telaProfessor extends javax.swing.JFrame {

    /**
     * Creates new form telaProfessor
     */
    public telaProfessor() {
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

        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jTabbedPane26 = new javax.swing.JTabbedPane();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTabbedPane27 = new javax.swing.JTabbedPane();
        jTextField1 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jTabbedPane28 = new javax.swing.JTabbedPane();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jTabbedPane29 = new javax.swing.JTabbedPane();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jRadioButtonMenuItem2 = new javax.swing.JRadioButtonMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        jTextField2.setToolTipText("Digite Aqui");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Inserir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Consultar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Excluir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Atualizar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTabbedPane3.addTab("CNP", jTextField13);
        jTabbedPane3.addTab("Currículo", jTextField14);
        jTabbedPane3.addTab("ID", jTextField16);

        jTabbedPane2.addTab("Professor", jTabbedPane3);

        jTabbedPane26.addTab("Email", jTextField11);
        jTabbedPane26.addTab("Celular", jTextField12);
        jTabbedPane26.addTab("ID", jTextField15);

        jTabbedPane2.addTab("Contato", jTabbedPane26);

        jTabbedPane27.addTab("RG", jTextField1);
        jTabbedPane27.addTab("Nome", jTextField3);
        jTabbedPane27.addTab("Idade", jTextField4);
        jTabbedPane27.addTab("Sexo", jTextField5);
        jTabbedPane27.addTab("ID", jTextField17);

        jTabbedPane2.addTab("Informações Pessoais", jTabbedPane27);

        jTabbedPane28.addTab("Rua", jTextField6);
        jTabbedPane28.addTab("Bairro", jTextField7);
        jTabbedPane28.addTab("Cidade", jTextField8);
        jTabbedPane28.addTab("ID", jTextField18);

        jTabbedPane2.addTab("Endereço", jTabbedPane28);

        jTabbedPane29.addTab("Data", jTextField9);
        jTabbedPane29.addTab("Valor", jTextField10);
        jTabbedPane29.addTab("ID", jTextField19);

        jTabbedPane2.addTab("Salário", jTabbedPane29);

        jMenu1.setText("Professor ");

        jRadioButtonMenuItem2.setSelected(true);
        jRadioButtonMenuItem2.setText("Aluno");
        jRadioButtonMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jRadioButtonMenuItem2);

        jMenuItem1.setText("Turma ");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem3.setText("Responsável");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton4))
                .addContainerGap(150, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jRadioButtonMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItem2ActionPerformed
new telaAluno().setVisible(true); 
 this.setVisible(false);      
    }//GEN-LAST:event_jRadioButtonMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
new telaTurma().setVisible(true); // mostra o formulário
 this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
new Responsavel().setVisible(true); // mostra o formulário
 this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
try{
            Conectar bd= new Conectar();
            bd.getConnection();
            Statement stmt = bd.conn.createStatement();
            
            String sql = "SELECT * FROM Professor;";
            ResultSet rs = stmt.executeQuery(sql);
            
            
            while(rs.next()){
                System.out.println(rs.getInt("id_professor"));
                System.out.println(rs.getString("curriculo"));            
                System.out.println(rs.getString("CNP"));
                System.out.println(rs.getInt("fk_salario"));
                System.out.println(rs.getInt("fk_informacoespessoais"));            
                System.out.println(rs.getInt("fk_endereco"));
                System.out.println(rs.getInt("fk_contato"));
                              
                System.out.println("=====================");
            }
            bd.close();
            
        }catch(SQLException ex){
            System.out.println("Problema com SQL");
            ex.printStackTrace();
            
            
        }         // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 
        
        try{
            Conectar bd = new Conectar();
            bd.getConnection();
            Statement stmt = bd.conn.createStatement();
            
            String sqlinsert = "insert into Contato  (id_contato, email , celular) values (" +
                    jTextField15.getText() + ",'" + 
                    jTextField11.getText() + "','" +
                    jTextField12.getText() + "'); ";
                    
            
            String sqlinsert1 = "insert into Endereco ( id_endereco, rua, bairro, cidade) values (" +
                    jTextField18.getText() + ",'" + 
                    jTextField6.getText() + "','" +
                    jTextField7.getText() + "','" +
                    jTextField8.getText() + "') ";
            
            String sqlinsert2 = "insert into  informacoes_pessoais (id_informacao, rg, idade, nome, sexo) values ( "+
                    jTextField17.getText() + ",'" +
                    jTextField1.getText() + "'," + 
                    jTextField4.getText() + ",'" +
                    jTextField3.getText() + "','" +
                    jTextField5.getText() + "'); ";
            
             String sqlinsert3 = "insert into  Professor (id_professor, curriculo, CNP,  fk_salario , fk_informacoespessoais, fk_endereco, fk_contato) values ( "+
                    jTextField16.getText() + ",'" +
                    jTextField14.getText() + "','" + 
                    jTextField13.getText() + "','" +
                    jTextField19.getText() + "'," +
                     jTextField17.getText() + "," +
                     jTextField18.getText() + "," +
                    jTextField15.getText() + "'); ";
             
              String sqlinsert4 = "insert into  Salario (id_salario, data, valor) values ( "+
                    jTextField19.getText() + ",'" +
                      jTextField9.getText() + "'," + 
                    jTextField10.getText() + "'); ";
            
            
            
            stmt.executeUpdate(sqlinsert);
            stmt.executeUpdate(sqlinsert1);
            stmt.executeUpdate(sqlinsert2);
            stmt.executeUpdate(sqlinsert3);
            stmt.executeUpdate(sqlinsert4);
            
            JOptionPane.showMessageDialog(null, "Gravação realizado com sucesso!");
            bd.close();   
        }catch(SQLException ex){
            System.out.println("Problema com SQL");
            ex.printStackTrace();
        }
        
            // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
  try{
                Conectar bd = new Conectar();
                bd.getConnection();
                Statement stmt = bd.conn.createStatement();
                String sqlinsert = "delete from Professor where id_professor = " + jTextField1.getText();
                stmt.executeUpdate(sqlinsert);
                JOptionPane.showMessageDialog(null, "Exclusão realizada com sucesso");
                
            }catch(SQLException ex){
                System.out.println("Problema com o SQL");
                ex.printStackTrace();
            }
                // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try{
    Conectar bd = new Conectar();
    bd.getConnection();
    Statement stmt = bd.conn.createStatement();

//codigo pra atualizar os registros atraes dos valores existentes
String sql = "update alunos set fk_informacoespessoais = " + jTextField17.getText() +
         ", fk_contato= " + jTextField15.getText()+
         ", fk_salario " + jTextField19.getText()+ 
", cnp= '" + jTextField13.getText()+
         "', curriculo=' " + jTextField14.getText()+        
        "' where id_professor = " + jTextField16.getText();

stmt.executeUpdate(sql);
stmt.close();   
    
    
} catch(SQLException ex){
    System.err.println("SQLException: " + ex.getMessage());
}

//tela de confirmação dos dados atualizados
JOptionPane.showMessageDialog(null, "Registros atualizados com sucesso!");

        
        
        
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(telaProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaProfessor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem2;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane26;
    private javax.swing.JTabbedPane jTabbedPane27;
    private javax.swing.JTabbedPane jTabbedPane28;
    private javax.swing.JTabbedPane jTabbedPane29;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}