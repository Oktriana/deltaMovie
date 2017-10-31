/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediaplayertest;

import java.awt.List;
import java.awt.image.BufferedImage; //colormode
import java.io.File; //upload file
import java.io.IOException; //untuk penentuan jenis data seperti jpg
import java.sql.Blob; //untuk mengambil type data blob pada database
import java.util.ArrayList;
import java.util.logging.Level; //jenis user
import java.util.logging.Logger; //pencatatan waktu
import static javax.swing.JOptionPane.showMessageDialog; //error
/**
 *
 * @author A
 */
public class FormAdmin extends javax.swing.JFrame {
    
    Blob blob;
    BufferedImage img;
    
    Koneksi konek = new Koneksi();
    
    /**
     * Creates new form formAdmin1
     */
    public FormAdmin() {
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jTextField3 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel18 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        label3 = new java.awt.Label();
        jLabel9 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btn_choose = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        title = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        jCheckBox9 = new javax.swing.JCheckBox();
        jCheckBox10 = new javax.swing.JCheckBox();
        jCheckBox11 = new javax.swing.JCheckBox();
        jCheckBox12 = new javax.swing.JCheckBox();
        jCheckBox13 = new javax.swing.JCheckBox();
        jCheckBox14 = new javax.swing.JCheckBox();
        jCheckBox15 = new javax.swing.JCheckBox();
        jCheckBox16 = new javax.swing.JCheckBox();
        jCheckBox17 = new javax.swing.JCheckBox();
        jCheckBox18 = new javax.swing.JCheckBox();
        jCheckBox19 = new javax.swing.JCheckBox();
        jCheckBox20 = new javax.swing.JCheckBox();
        jLabel21 = new javax.swing.JLabel();
        director = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        actor = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        country = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        synopsis = new javax.swing.JTextArea();
        btn_upload = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        year = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField3.setText("search");
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 130, 30));

        jButton3.setBackground(new java.awt.Color(204, 204, 255));
        jButton3.setText("search");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 70, 30));

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Action", "Animation", "Family", "Fantasy", "Film-noir", "Music", "Musical", "Romance", "Western", "War", " " }));
        jPanel1.add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 70, 123, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Genre");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 70, 60, 30));

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title", "Year", "Actor/Actress"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jTable4);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 630, 190));

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel26.setText("Movies");
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, -1, 30));

        jLabel27.setFont(new java.awt.Font("Felix Titling", 1, 28)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("HOME");
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 130, 60));

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background/movie icon.png"))); // NOI18N
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, 50));

        jButton4.setText("LOGOUT");
        jButton4.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 102, 0), null));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, 90, 40));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background/siapatauperlu22.jpg"))); // NOI18N
        jLabel11.setText("jLabel11");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 640, 530));

        jTabbedPane1.addTab("Home", jPanel1);

        jPanel4.setLayout(null);

        jLabel3.setBackground(new java.awt.Color(204, 204, 255));
        jLabel3.setFont(new java.awt.Font("Felix Titling", 1, 28)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("WATCH LATER");
        jPanel4.add(jLabel3);
        jLabel3.setBounds(40, 10, 260, 50);

        jTextField2.setText("search");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel4.add(jTextField2);
        jTextField2.setBounds(0, 70, 130, 30);

        jButton2.setBackground(new java.awt.Color(204, 204, 255));
        jButton2.setText("search");
        jPanel4.add(jButton2);
        jButton2.setBounds(140, 70, 70, 30);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Date", "Title A-Z" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel4.add(jComboBox2);
        jComboBox2.setBounds(520, 70, 110, 30);

        jLabel4.setFont(jLabel4.getFont().deriveFont(jLabel4.getFont().getStyle() | java.awt.Font.BOLD, jLabel4.getFont().getSize()+6));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Movies");
        jPanel4.add(jLabel4);
        jLabel4.setBounds(0, 110, 640, 30);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title", "Year", "Actor/Actress"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jPanel4.add(jScrollPane2);
        jScrollPane2.setBounds(0, 160, 630, 190);

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Sort by");
        jPanel4.add(jLabel16);
        jLabel16.setBounds(460, 70, 70, 30);

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background/movie icon.png"))); // NOI18N
        jPanel4.add(jLabel29);
        jLabel29.setBounds(0, 10, 42, 42);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background/siapatauperlu22.jpg"))); // NOI18N
        jLabel10.setText("jLabel10");
        jPanel4.add(jLabel10);
        jLabel10.setBounds(0, -80, 640, 640);

        jTabbedPane1.addTab("Watch Later", jPanel4);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(204, 204, 255));
        jLabel1.setFont(new java.awt.Font("Felix Titling", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("HISTORY");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 220, 50));

        jTextField1.setText("search");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 130, 30));

        jButton1.setBackground(new java.awt.Color(204, 204, 255));
        jButton1.setText("search");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 70, 30));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Date", "Title A-Z" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel3.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 70, 110, 30));

        jLabel2.setBackground(new java.awt.Color(204, 255, 204));
        jLabel2.setFont(jLabel2.getFont().deriveFont(jLabel2.getFont().getStyle() | java.awt.Font.BOLD, jLabel2.getFont().getSize()+6));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Movies");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 640, -1));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title", "Year", "Actor/Actress"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable3);

        jPanel3.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 630, 190));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("Sort by");
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 70, 60, 30));

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background/movie icon.png"))); // NOI18N
        jPanel3.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, 50));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background/siapatauperlu22.jpg"))); // NOI18N
        jLabel12.setText("jLabel12");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 640, 500));

        jTabbedPane1.addTab("History", jPanel3);

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label3.setAlignment(java.awt.Label.CENTER);
        label3.setBackground(new java.awt.Color(255, 255, 255));
        label3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        label3.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        label3.setPreferredSize(new java.awt.Dimension(100, 24));
        label3.setText("Pertanyaan yang sering diajukan");
        jPanel5.add(label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 270, 30));

        jLabel9.setBackground(new java.awt.Color(153, 51, 0));
        jLabel9.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Saya mengalami masalah masuk ke situs dengan username / password");
        jLabel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 560, 60));

        jLabel14.setBackground(new java.awt.Color(204, 51, 0));
        jLabel14.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Siapa yang bisa menambahkan data ke judul?");
        jLabel14.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 560, 60));

        jLabel15.setBackground(new java.awt.Color(204, 51, 0));
        jLabel15.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Bagaimana menghitung rating untuk sebuah film?");
        jLabel15.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel5.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 560, 60));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background/siapatauperlu22.jpg"))); // NOI18N
        jLabel13.setText("jLabel13");
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 640, 520));

        jTabbedPane1.addTab("Help", jPanel5);

        jPanel2.setLayout(null);

        btn_choose.setText("Choose");
        btn_choose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_chooseActionPerformed(evt);
            }
        });
        jPanel2.add(btn_choose);
        btn_choose.setBounds(70, 10, 90, 20);

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Cover :");
        jPanel2.add(jLabel17);
        jLabel17.setBounds(10, 10, 60, 20);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Title :");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(10, 40, 40, 15);

        title.setText("...");
        jPanel2.add(title);
        title.setBounds(70, 40, 190, 20);

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Year :");
        jPanel2.add(jLabel19);
        jLabel19.setBounds(10, 70, 40, 15);

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Genre :");
        jPanel2.add(jLabel20);
        jLabel20.setBounds(10, 100, 50, 15);

        jCheckBox1.setBackground(new java.awt.Color(153, 51, 0));
        jCheckBox1.setText("Action");
        jCheckBox1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(255, 255, 255), null, null));
        jCheckBox1.setName(""); // NOI18N
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel2.add(jCheckBox1);
        jCheckBox1.setBounds(70, 100, 90, 19);

        jCheckBox2.setBackground(new java.awt.Color(153, 51, 0));
        jCheckBox2.setText("Horror");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });
        jPanel2.add(jCheckBox2);
        jCheckBox2.setBounds(70, 160, 90, 23);

        jCheckBox3.setBackground(new java.awt.Color(153, 51, 0));
        jCheckBox3.setText("Advanture");
        jPanel2.add(jCheckBox3);
        jCheckBox3.setBounds(180, 100, 90, 23);

        jCheckBox4.setBackground(new java.awt.Color(153, 51, 0));
        jCheckBox4.setText("Animation");
        jPanel2.add(jCheckBox4);
        jCheckBox4.setBounds(300, 100, 90, 23);

        jCheckBox5.setBackground(new java.awt.Color(153, 51, 0));
        jCheckBox5.setText("Comedy");
        jPanel2.add(jCheckBox5);
        jCheckBox5.setBounds(70, 130, 90, 23);

        jCheckBox6.setBackground(new java.awt.Color(153, 51, 0));
        jCheckBox6.setText("Crime");
        jPanel2.add(jCheckBox6);
        jCheckBox6.setBounds(520, 100, 90, 23);

        jCheckBox7.setBackground(new java.awt.Color(153, 51, 0));
        jCheckBox7.setText("Documantary");
        jPanel2.add(jCheckBox7);
        jCheckBox7.setBounds(180, 130, 89, 23);

        jCheckBox8.setBackground(new java.awt.Color(153, 51, 0));
        jCheckBox8.setText("Family");
        jPanel2.add(jCheckBox8);
        jCheckBox8.setBounds(300, 130, 90, 23);

        jCheckBox9.setBackground(new java.awt.Color(153, 51, 0));
        jCheckBox9.setText("Biography");
        jPanel2.add(jCheckBox9);
        jCheckBox9.setBounds(400, 100, 90, 23);

        jCheckBox10.setBackground(new java.awt.Color(153, 51, 0));
        jCheckBox10.setText("Thriller");
        jCheckBox10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox10ActionPerformed(evt);
            }
        });
        jPanel2.add(jCheckBox10);
        jCheckBox10.setBounds(300, 190, 90, 23);

        jCheckBox11.setBackground(new java.awt.Color(153, 51, 0));
        jCheckBox11.setText("Fantasy");
        jPanel2.add(jCheckBox11);
        jCheckBox11.setBounds(400, 130, 90, 23);

        jCheckBox12.setBackground(new java.awt.Color(153, 51, 0));
        jCheckBox12.setText("Music");
        jPanel2.add(jCheckBox12);
        jCheckBox12.setBounds(180, 160, 90, 23);

        jCheckBox13.setBackground(new java.awt.Color(153, 51, 0));
        jCheckBox13.setText("War");
        jCheckBox13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox13ActionPerformed(evt);
            }
        });
        jPanel2.add(jCheckBox13);
        jCheckBox13.setBounds(400, 190, 90, 23);

        jCheckBox14.setBackground(new java.awt.Color(153, 51, 0));
        jCheckBox14.setText("Sport");
        jPanel2.add(jCheckBox14);
        jCheckBox14.setBounds(180, 190, 90, 23);

        jCheckBox15.setBackground(new java.awt.Color(153, 51, 0));
        jCheckBox15.setText("Sci-fi");
        jCheckBox15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox15ActionPerformed(evt);
            }
        });
        jPanel2.add(jCheckBox15);
        jCheckBox15.setBounds(70, 190, 90, 23);

        jCheckBox16.setBackground(new java.awt.Color(153, 51, 0));
        jCheckBox16.setText("History");
        jPanel2.add(jCheckBox16);
        jCheckBox16.setBounds(520, 130, 90, 23);

        jCheckBox17.setBackground(new java.awt.Color(153, 51, 0));
        jCheckBox17.setText("Musical");
        jPanel2.add(jCheckBox17);
        jCheckBox17.setBounds(300, 160, 90, 23);

        jCheckBox18.setBackground(new java.awt.Color(153, 51, 0));
        jCheckBox18.setText("Mistery");
        jPanel2.add(jCheckBox18);
        jCheckBox18.setBounds(400, 160, 90, 23);

        jCheckBox19.setBackground(new java.awt.Color(153, 51, 0));
        jCheckBox19.setText("Romance");
        jPanel2.add(jCheckBox19);
        jCheckBox19.setBounds(520, 160, 90, 23);

        jCheckBox20.setBackground(new java.awt.Color(153, 51, 0));
        jCheckBox20.setText("Westren");
        jCheckBox20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox20ActionPerformed(evt);
            }
        });
        jPanel2.add(jCheckBox20);
        jCheckBox20.setBounds(520, 190, 90, 23);

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Director :");
        jPanel2.add(jLabel21);
        jLabel21.setBounds(10, 230, 60, 15);

        director.setText("...");
        jPanel2.add(director);
        director.setBounds(70, 230, 200, 20);

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Actor :");
        jPanel2.add(jLabel22);
        jLabel22.setBounds(10, 270, 50, 15);

        actor.setText("...");
        jPanel2.add(actor);
        actor.setBounds(70, 270, 200, 20);

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Country :");
        jPanel2.add(jLabel23);
        jLabel23.setBounds(10, 310, 60, 15);

        country.setText("...");
        jPanel2.add(country);
        country.setBounds(70, 310, 200, 20);

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Synopsis :");
        jPanel2.add(jLabel24);
        jLabel24.setBounds(10, 350, 60, 15);

        synopsis.setColumns(20);
        synopsis.setRows(5);
        jScrollPane1.setViewportView(synopsis);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(70, 350, 330, 70);

        btn_upload.setText("Upload");
        btn_upload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_uploadActionPerformed(evt);
            }
        });
        jPanel2.add(btn_upload);
        btn_upload.setBounds(70, 440, 70, 30);

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText(".jpg");
        jPanel2.add(jLabel25);
        jLabel25.setBounds(160, 10, 40, 20);

        year.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2014", "2015", "2016", "2017" }));
        jPanel2.add(year);
        year.setBounds(70, 70, 90, 20);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background/siapatauperlu22.jpg"))); // NOI18N
        jPanel2.add(jLabel7);
        jLabel7.setBounds(0, -170, 650, 810);

        jTabbedPane1.addTab("Upload", jPanel2);

        getContentPane().add(jTabbedPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jCheckBox13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox13ActionPerformed

    private void jCheckBox10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox10ActionPerformed

    private void jCheckBox20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox20ActionPerformed

    private void jCheckBox15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox15ActionPerformed

    private void btn_chooseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_chooseActionPerformed
        
    }//GEN-LAST:event_btn_chooseActionPerformed

    private void btn_uploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_uploadActionPerformed
        // TODO add your handling code here:
        String jdl = title.getText();
        int thn = year.getSelectedIndex();
        
        String drctr = director.getText();
        String actr = actor.getText();
        String cntry = country.getText();
        String snpss = synopsis.getText();
        String temp = "";
        
        
        if (jCheckBox1.isSelected()) {temp += jCheckBox1.getText();temp+= ", ";}
        if (jCheckBox2.isSelected()) {temp += jCheckBox2.getText();temp+= ", ";}
        if (jCheckBox3.isSelected()) {temp += jCheckBox3.getText();temp+= ", ";}
        if (jCheckBox4.isSelected()) {temp += jCheckBox4.getText();temp+= ", ";}
        if (jCheckBox5.isSelected()) {temp += jCheckBox5.getText();temp+= ", ";}
        if (jCheckBox6.isSelected()) {temp += jCheckBox6.getText();temp+= ", ";}
        if (jCheckBox7.isSelected()) {temp += jCheckBox7.getText();temp+= ", ";}
        if (jCheckBox8.isSelected()) {temp += jCheckBox8.getText();temp+= ", ";}
        if (jCheckBox9.isSelected()) {temp += jCheckBox9.getText();temp+= ", ";}
        if (jCheckBox10.isSelected()) {temp += jCheckBox10.getText();temp+= ", ";}
        if (jCheckBox11.isSelected()) {temp += jCheckBox11.getText();temp+= ", ";}
        if (jCheckBox12.isSelected()) {temp += jCheckBox12.getText();temp+= ", ";}
        if (jCheckBox13.isSelected()) {temp += jCheckBox13.getText();temp+= ", ";}
        if (jCheckBox14.isSelected()) {temp += jCheckBox14.getText();temp+= ", ";}
        if (jCheckBox15.isSelected()) {temp += jCheckBox15.getText();temp+= ", ";}
        if (jCheckBox16.isSelected()) {temp += jCheckBox16.getText();temp+= ", ";}
        if (jCheckBox17.isSelected()) {temp += jCheckBox17.getText();temp+= ", ";}
        if (jCheckBox18.isSelected()) {temp += jCheckBox18.getText();temp+= ", ";}
        if (jCheckBox19.isSelected()) {temp += jCheckBox19.getText();temp+= ", ";}
        if (jCheckBox20.isSelected()) {temp += jCheckBox20.getText();temp+= ", ";}
        
        showMessageDialog(null, temp);
//        if (jCheckBox1.isSelected()) {
//         showMessageDialog(null, "cobadulu");   
//        }
//        List<String> infos = new ArrayList<String>();
//        for (JCheckBox checkBox : JCheckBox) {
//            if (checkBox.isSelected()) {
//                infos.add(checkBox.getText());
//            }
//        }
        
        
    }//GEN-LAST:event_btn_uploadActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        new LogIn().setVisible(true);
        this.setVisible(false);
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
            java.util.logging.Logger.getLogger(FormAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField actor;
    private javax.swing.JButton btn_choose;
    private javax.swing.JButton btn_upload;
    private javax.swing.JTextField country;
    private javax.swing.JTextField director;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox10;
    private javax.swing.JCheckBox jCheckBox11;
    private javax.swing.JCheckBox jCheckBox12;
    private javax.swing.JCheckBox jCheckBox13;
    private javax.swing.JCheckBox jCheckBox14;
    private javax.swing.JCheckBox jCheckBox15;
    private javax.swing.JCheckBox jCheckBox16;
    private javax.swing.JCheckBox jCheckBox17;
    private javax.swing.JCheckBox jCheckBox18;
    private javax.swing.JCheckBox jCheckBox19;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox20;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private java.awt.Label label3;
    private javax.swing.JTextArea synopsis;
    private javax.swing.JTextField title;
    private javax.swing.JComboBox<String> year;
    // End of variables declaration//GEN-END:variables
}
