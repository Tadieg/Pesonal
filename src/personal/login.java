package personal;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class login extends javax.swing.JFrame{
    public login() {
        initComponents();
        Toolkit toolkit=getToolkit();
        Dimension size=toolkit.getScreenSize();
        setLocation(size.width/2-getWidth()/2,size.height/2-getHeight()/2);
    }

   public  String getid(){
       String userid =text1.getText();
       return userid;
   }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        empity = new javax.swing.JTextField();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        text1 = new javax.swing.JTextField();
        login = new javax.swing.JButton();
        account = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jMenu1.setText("jMenu1");

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("User Name");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Password");

        text1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text1ActionPerformed(evt);
            }
        });

        login.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        login.setText("login");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        login.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                loginKeyPressed(evt);
            }
        });

        account.setBackground(new java.awt.Color(255, 255, 255));
        account.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        account.setText("create account");
        account.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountActionPerformed(evt);
            }
        });

        reset.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        reset.setText("reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("Personal Record Management System");

        jLabel4.setIcon(new javax.swing.ImageIcon("E:\\icons\\login.png")); // NOI18N

        jButton1.setBackground(new java.awt.Color(255, 51, 51));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("cancel");
        jButton1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jButton1MouseDragged(evt);
            }
        });
        jButton1.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                jButton1MouseWheelMoved(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(354, 354, 354)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel4)))
                                .addGap(70, 70, 70)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(text1, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                                    .addComponent(jPasswordField1)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(account)
                                .addGap(111, 111, 111)
                                .addComponent(login)))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(reset, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 935, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(335, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(text1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reset))
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addComponent(jLabel4))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(login)
                    .addComponent(account)
                    .addComponent(jButton1))
                .addContainerGap(902, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(238, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        text1.setText("");
        jPasswordField1.setText("");
    }//GEN-LAST:event_resetActionPerformed

    private void accountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountActionPerformed

        access p=new access();
        p.setVisible(true);// for the creating page
        setVisible(false);//for this login page
    }//GEN-LAST:event_accountActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        //mit/ur/10126/10
        
        try{
            DBcon db=new DBcon();
            String user,pass;
            user=text1.getText();
            pass=jPasswordField1.getText();
            ResultSet rs=db.searchQuery("select*from createaccount where username='"+user+"' "
                + "and password='"+pass+"'");
            if(rs.isBeforeFirst()){
                while(rs.next()){
                    if(text1.getText().trim().isEmpty()&&jPasswordField1.getText().trim().isEmpty()){
                        JOptionPane.showMessageDialog(null,"username and passowrd are empty");
                    }
                    else if(text1.getText().trim().isEmpty()){
                        JOptionPane.showMessageDialog(null,"username  is empty");
                    }
                    else if(jPasswordField1.getText().trim().isEmpty()){
                        JOptionPane.showMessageDialog(null," passowrd  is empty");
                    }
                    else{  if(rs.getString(1).equalsIgnoreCase(user)&&rs.getString(5).equalsIgnoreCase(pass)){
                        userinfo pr=new userinfo();
                        pr.setVisible(true);
                        setVisible(false);
                        rs.close();}

                    }
                }
            }
         else{
                JOptionPane.showMessageDialog(this, "invalid info");
            }
           

        }catch(Exception ex){
             System.out.println("error"+ex.getMessage());
        }
    }//GEN-LAST:event_loginActionPerformed

    private void text1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text1ActionPerformed

    private void loginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_loginKeyPressed
     try{
            DBcon db=new DBcon();
            String user,pass;
            user=text1.getText();
            pass=jPasswordField1.getText();
            ResultSet rs=db.searchQuery("select*from createaccount where username='"+user+"' "
                + "and password='"+pass+"'");
            if(rs.isBeforeFirst()){
                while(rs.next()){
                    if(text1.getText().trim().isEmpty()&&jPasswordField1.getText().trim().isEmpty()){
                        JOptionPane.showMessageDialog(null,"username and passowrd are empty");
                    }
                    else if(text1.getText().trim().isEmpty()){
                        JOptionPane.showMessageDialog(null,"username  is empty");
                    }
                    else if(jPasswordField1.getText().trim().isEmpty()){
                        JOptionPane.showMessageDialog(null," passowrd  is empty");
                    }
                    else{  if(rs.getString(1).equalsIgnoreCase(user)&&rs.getString(5).equalsIgnoreCase(pass)){
                        userinfo pr=new userinfo();
                        pr.setVisible(true);
                        setVisible(false);
                        rs.close();}

                    }
                }
            }
         else{
                JOptionPane.showMessageDialog(this, "invalid info");
            }
           

        }catch(Exception ex){
             System.out.println("error"+ex.getMessage());
        }   
    }//GEN-LAST:event_loginKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_jButton1MouseWheelMoved
      
    }//GEN-LAST:event_jButton1MouseWheelMoved

    private void jButton1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseDragged
            jButton1.setBackground(Color.ORANGE);
    }//GEN-LAST:event_jButton1MouseDragged

    
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton account;
    private javax.swing.JTextField empity;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JButton login;
    private javax.swing.JButton reset;
    private javax.swing.JTextField text1;
    // End of variables declaration//GEN-END:variables
}
