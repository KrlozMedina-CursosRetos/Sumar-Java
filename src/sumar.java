public class sumar extends javax.swing.JFrame {

    String x;
    int l,ce=0,pe=0,st=0,nt=1,p=0,sp=0,pa=0;
    char q;

    public sumar() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        caja1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        caja2 = new javax.swing.JTextField();
        caja3 = new javax.swing.JTextField();
        caja4 = new javax.swing.JTextField();
        caja5 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        getContentPane().add(caja1);
        caja1.setBounds(80, 30, 220, 30);

        jButton1.setText("Sumar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(120, 80, 130, 40);
        getContentPane().add(caja2);
        caja2.setBounds(180, 140, 170, 30);
        getContentPane().add(caja3);
        caja3.setBounds(180, 180, 170, 30);
        getContentPane().add(caja4);
        caja4.setBounds(180, 220, 170, 30);
        getContentPane().add(caja5);
        caja5.setBounds(180, 260, 170, 30);

        jLabel1.setText("Total de numeros");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 150, 130, 14);

        jLabel2.setText("Suma de numeros pares");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 190, 140, 14);

        jLabel3.setText("Suma de numeros impares");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 230, 180, 14);

        jLabel4.setText("Suma total");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 270, 140, 14);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-390)/2, (screenSize.height-353)/2, 390, 353);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    x=caja1.getText();
    l=x.length();
    for(int i=0;i<l;i++)
    {
        q=x.charAt(i);
        if(q==' ')
        {
            ce=ce+1;
        }
    }
    while(ce>0)
    {
        l=x.length();
        for(int i=0;i<l;i++)
        {
            q=x.charAt(i);
            if(q==' ')
            {
                pe=i;
                nt=nt+1;
                sp=0;
                break;
            }
        }
        st=st+Integer.parseInt(x.substring(0,pe));
        p=p+Integer.parseInt(x.substring(0,pe));
        if(p%2==0)
        {
                pa=pa+p;
                x=x.substring(pe+1);
                ce=ce-1;
        }
        x=x.substring(pe+1);
        ce=ce-1;
    }
    st=st+Integer.parseInt(x);
    sp=pa+Integer.parseInt(x);
    if(sp%2==0)
    {
        caja3.setText(String.valueOf(sp));
    }
    caja2.setText(String.valueOf(nt));
    //caja3.setText(String.valueOf(sp));
    caja5.setText(String.valueOf(st));
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sumar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField caja1;
    private javax.swing.JTextField caja2;
    private javax.swing.JTextField caja3;
    private javax.swing.JTextField caja4;
    private javax.swing.JTextField caja5;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables

}
