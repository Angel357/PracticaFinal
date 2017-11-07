/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicafinal;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.LinkedList;
import java.util.Stack;
import javax.swing.JOptionPane;
import javax.swing.text.Utilities;

/**
 *
 * @author Angel
 */
public class Principal extends javax.swing.JFrame {

    Stack<String> pila=new Stack<String>();
    LinkedList<String> cola=new LinkedList<String>();
    LinkedList<String> cola2=new LinkedList<String>();
    int cont=0;
    int cont2=0;
    int cont3=0;
    String[] h;
    
    
    public Principal() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setBounds(0,0,700,485);
        Extraido();
        llenadoCola();
        txtPila2.setEditable(false);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtPila = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtPila2 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtcola = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtcola2 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt1pila = new javax.swing.JTextField();
        txt2pila = new javax.swing.JTextField();
        btnReemplazar = new javax.swing.JButton();
        txtdesencolar = new javax.swing.JTextField();
        btnDesencolar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        txtPila.setColumns(20);
        txtPila.setRows(5);
        jScrollPane1.setViewportView(txtPila);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(38, 53, 166, 143);

        txtPila2.setColumns(20);
        txtPila2.setRows(5);
        jScrollPane2.setViewportView(txtPila2);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(38, 235, 166, 151);

        txtcola.setColumns(20);
        txtcola.setRows(5);
        jScrollPane3.setViewportView(txtcola);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(468, 53, 166, 143);

        txtcola2.setColumns(20);
        txtcola2.setRows(5);
        jScrollPane4.setViewportView(txtcola2);

        getContentPane().add(jScrollPane4);
        jScrollPane4.setBounds(468, 235, 166, 151);

        jLabel1.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Pila");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(100, 20, 40, 20);

        jLabel2.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel2.setForeground(java.awt.Color.white);
        jLabel2.setText("Cola");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(533, 21, 50, 20);
        getContentPane().add(txt1pila);
        txt1pila.setBounds(10, 422, 60, 20);
        getContentPane().add(txt2pila);
        txt2pila.setBounds(96, 422, 60, 20);

        btnReemplazar.setBackground(new java.awt.Color(153, 153, 153));
        btnReemplazar.setForeground(new java.awt.Color(255, 255, 255));
        btnReemplazar.setText("Reemplazar");
        btnReemplazar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReemplazarActionPerformed(evt);
            }
        });
        getContentPane().add(btnReemplazar);
        btnReemplazar.setBounds(182, 421, 110, 23);
        getContentPane().add(txtdesencolar);
        txtdesencolar.setBounds(480, 420, 50, 20);

        btnDesencolar.setBackground(new java.awt.Color(153, 153, 153));
        btnDesencolar.setForeground(new java.awt.Color(255, 255, 255));
        btnDesencolar.setText("Desencolar");
        btnDesencolar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesencolarActionPerformed(evt);
            }
        });
        getContentPane().add(btnDesencolar);
        btnDesencolar.setBounds(561, 421, 110, 23);

        jLabel4.setFont(new java.awt.Font("Myriad Hebrew", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Salida");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(100, 210, 40, 15);

        jLabel5.setFont(new java.awt.Font("Myriad Hebrew", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Salida");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(540, 210, 40, 15);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.jpg"))); // NOI18N
        jLabel3.setRequestFocusEnabled(false);
        jLabel3.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 700, 460);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnReemplazarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReemplazarActionPerformed
       //Pila();
       condiciones();
    }//GEN-LAST:event_btnReemplazarActionPerformed

    private void btnDesencolarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesencolarActionPerformed
       condicionesCola();
    }//GEN-LAST:event_btnDesencolarActionPerformed

    /**
     * @param args the command line arguments
     */
    
    public void Extraido(){
        //llenado de la pila 
       txtPila.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {   
            }
            @Override
            public void keyPressed(KeyEvent e) {
               if(e.getKeyCode() == KeyEvent.VK_ENTER){
                   int incio, fin;
                   try{
                        incio = txtPila.getDocument().getLength();
                        fin = Utilities.getRowStart(txtPila, incio);  
                        pila.push(txtPila.getText(fin,incio-fin));
                        txtPila2.setText("");
                        txt1pila.setText("");
                        txt2pila.setText("");
                   }catch(Exception ex){}
                }   
            }

            @Override
            public void keyReleased(KeyEvent e) {
                
            }
        });
    }
    public void condiciones(){
      if(txt1pila.getText().equals("")||txt1pila.getText().equals("")){
          JOptionPane.showMessageDialog(null, "no ha indicado que datos cambiara hagalo");
      }else{
        llenado();
    }
    }
    public void llenado(){
      try{
            String n = pila.pop();
            if(n.equals(txt1pila.getText())){
                n=txt2pila.getText();
                txtPila2.setText(txtPila2.getText()+n+"\n");
                cont++;
            }else{
                    txtPila2.setText(txtPila2.getText()+n+"\n");
            }
            llenado();
      }catch(Exception e){
          if (cont==0){
              txtPila2.setText("");
              JOptionPane.showMessageDialog(null, "No existe ningun "+txt1pila.getText()+" dentro de la pila");
              txtPila.setText("");
          }
          cont=0;
      }
    }
    
    public void llenadoCola(){
        txtcola.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {   
            }
            @Override
            public void keyPressed(KeyEvent e) {
               if(e.getKeyCode() == KeyEvent.VK_ENTER){
                   int incio, fin;
                   try{
                        incio = txtcola.getDocument().getLength();
                        fin = Utilities.getRowStart(txtcola, incio);  
                        cola.offer(txtcola.getText(fin,incio-fin));
                        txtcola2.setText("");
                        txtdesencolar.setText("");
                        cont2++;
                   }catch(Exception ex){}
                }   
            }

            @Override
            public void keyReleased(KeyEvent e) {
                
            }
        });
    }
    public void condicionesCola(){
        if(txtdesencolar.getText().equals("")){
          JOptionPane.showMessageDialog(null, "no ha ingresado el digito que desea des encolar");
      }else{
        h=new String[cont2];    
        cola();
    }
    }
    public void cola(){
        try{
            String t=cola.peek();
            if(t.equals(txtdesencolar.getText())){
                cola.poll();
                txtcola2.setText(txtcola2.getText()+txtdesencolar.getText()+" Salio de la cola\n");
                cont3++;
            }else{
                cola2.offer(cola.poll());
            }
            cola();
        }catch(Exception e2){
            desencolarCola2(); 
            
        }    
    }
    public void desencolarCola2(){
        try{
        txtcola2.setText(txtcola2.getText()+cola2.peek()+" Salio de la cola\n");
        cola2.poll();
        if(cola2.peek().isEmpty()){
        }else{
        desencolarCola2();
        }
        }catch(Exception e4){
            if (cont3==0){
              txtcola2.setText("");
              JOptionPane.showMessageDialog(null, "No existe ningun "+txtdesencolar.getText()+" dentro de la cola");
              txtcola.setText("");
              txtdesencolar.setText("");
              //regenerarCola();
          }
          cont3=0;
        }  
    }
    public void regenerarCola(){
        for(int y=0;y<h.length;y++){
            cola.offer(h[y-1]);
        }
        cont2=0;
    }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDesencolar;
    private javax.swing.JButton btnReemplazar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField txt1pila;
    private javax.swing.JTextField txt2pila;
    private javax.swing.JTextArea txtPila;
    private javax.swing.JTextArea txtPila2;
    private javax.swing.JTextArea txtcola;
    private javax.swing.JTextArea txtcola2;
    private javax.swing.JTextField txtdesencolar;
    // End of variables declaration//GEN-END:variables
}
