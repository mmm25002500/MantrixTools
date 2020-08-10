package com.tershi.idCheck.Ui;

/*
 (C)Aishen-Shanling Team
 You are not licensed to edit the code or sell the application
 please respect the coder and do not share it for all user
 It will not be upload on github or social media
 */
//import static Ui.mainUI.AllID;
//import static Ui.mainUI.characterArray;
//import static Ui.mainUI.check;
//import static Ui.mainUI.stringToIntArray;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import javax.swing.ImageIcon;

public class idCheck extends javax.swing.JFrame {

    static char[] characterArray = new char[26];//A-Z
    static int[] numberArray = {10, 11, 12, 13, 14, 15, 16, 17, 34, 18, 19, 20, 21, 22, 35, 23, 24, 25, 26, 27, 28, 29, 32, 30, 31, 32};//A-Z對應的數字
    static int[] stringToIntArray = new int[26];//放輸入的字串
    static String AllID;
    static String[] All;
    static String finalAll;
    static String inputString;
    static boolean output;

    public idCheck() {
        ImageIcon img = new ImageIcon("bin\\unnamed.png");
        setIconImage(img.getImage());
        initComponents();
        setTitle("這是身分證檢查4-5碼");
        setBackground(Color.RED);
    }

    @SuppressWarnings("unchecked")
    static String getInput() {
        String idArray = inputString.toUpperCase();//無論如何轉大寫

        return idArray;//回傳字串
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 0, 255));

        jTextArea1.setColumns(20);
        jTextArea1.setForeground(new java.awt.Color(204, 0, 204));
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jButton1.setText("確定檢查");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("輸出錯誤?");

        jButton3.setText("否");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("是");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel2.setText("版權所有 (C) Aishen-Shanling Team made on 2020/2/28 Version: 2.0 請勿修改 販售 僅供私人使用 勿侵犯程式著作權 否則自行負責");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1)
                .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(260, 260, 260)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                        .addComponent(jLabel1)
                                                        .addGap(40, 40, 40))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                        .addComponent(jButton4)
                                                        .addGap(57, 57, 57)
                                                        .addComponent(jButton3))))
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(146, 146, 146)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(221, 221, 221)
                                        .addComponent(jLabel2)))
                        .addContainerGap(142, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 602, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(21, 21, 21)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jButton3)
                                                .addComponent(jButton4))))
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        insertCharacter();//插入英文字母
        ArrayList<Integer> arrList = new ArrayList<>(Arrays.asList());
        jTextArea1.setText(null);
        inputString = jTextArea2.getText();
        check(inputString);//開始檢查
        StringBuilder builder = new StringBuilder(AllID);
        builder.delete(0, 5);
        String s = builder.toString();
        jTextArea1.append(s);
        output = true;
        jLabel1.setText("輸出錯誤?");
//        jLabel1.setEnabled(false);
        jButton3.setVisible(true);
        jButton4.setVisible(true);
    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
        output = true;
        jLabel1.setText(jLabel1.getText() + " 是");
//        jLabel1.setEnabled(false);
        jButton4.setVisible(false);
        jButton3.setVisible(false);
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        output = false;
        jLabel1.setText(jLabel1.getText() + " 否");
//        jLabel1.setEnabled(false);
        jButton3.setVisible(false);
        jButton4.setVisible(false);
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Allui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Allui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Allui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Allui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Allui().setVisible(true);
            }
        });
    }

    static void check(String a) {

        int index = 0;
        String inputString = a;//丟進來的身分證字串
        Character firstLetter = inputString.charAt(0);//抓出字串第一個英文
        for (int i = 1; i <= inputString.length() - 1; i++) {
            stringToIntArray[i] = (int) (inputString.charAt(i)) - 48;//把身分證字號放入stringToIntArray[]，inputString.charAt(i)裡面的是字元1->49所以減48int 1

            System.out.println(stringToIntArray[i]);//偷偷檢查自己有沒有抓到
        }
        index = Arrays.binarySearch(characterArray, firstLetter);//輸入的第一個英文字母判斷她是在characterArray中的第幾個index
        int d0 = numberArray[index];//對應到的數字抓出來放入d0
        int x2 = (d0) % 10;//d0的個位數
        int x1 = (int) Math.floor((d0) / 10);//d0的十位數
        int result;
        int checkCode;

        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                result = x1 + (9 * x2) + (8 * stringToIntArray[1]) + (7 * stringToIntArray[2]) + (6 * stringToIntArray[3]) + (5 * i) + (4 * j) + (3 * stringToIntArray[6]) + (2 * stringToIntArray[7]) + (stringToIntArray[8]);
                checkCode = 10 - (result % 10);
                if (stringToIntArray[9] == checkCode) {
                    String correct = "身分證正確";
                    String h = correct + "\n" + firstLetter + String.valueOf(stringToIntArray[1]) + String.valueOf(stringToIntArray[2]) + String.valueOf(stringToIntArray[3]) + String.valueOf(i) + String.valueOf(j) + String.valueOf(stringToIntArray[6]) + String.valueOf(stringToIntArray[7]) + String.valueOf(stringToIntArray[8]) + String.valueOf(stringToIntArray[9]);
                    System.out.println(h);
                    AllID = AllID + "," + h;
                } else {
                    String incorrect = "身分證錯誤";
                    String h = incorrect + "\n" + firstLetter + String.valueOf(stringToIntArray[1]) + String.valueOf(stringToIntArray[2]) + String.valueOf(stringToIntArray[3]) + String.valueOf(i) + String.valueOf(j) + String.valueOf(stringToIntArray[6]) + String.valueOf(stringToIntArray[7]) + String.valueOf(stringToIntArray[8]) + String.valueOf(stringToIntArray[9]);
                    if (output == true) {
                        AllID = AllID + "," + h;
                    }
                }
            }
        }

    }

    static void insertCharacter() {

        for (int i = 0; i <= 25; i++) {
            characterArray[i] = (char) (65 + i);//把英文字母放入字元陣列，強制轉型A->65	
        }

    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;

    // End of variables declaration                 
    public class mainUI {

        public char[] characterArray = new char[26];//A-Z
        public int[] numberArray = {10, 11, 12, 13, 14, 15, 16, 17, 34, 18, 19, 20, 21, 22, 35, 23, 24, 25, 26, 27, 28, 29, 32, 30, 31, 32};//A-Z對應的數字
        public int[] stringToIntArray = new int[26];//放輸入的字串
        public String AllID;
        public String[] All;
        public String finalAll;

        public String getInput() {
            System.out.println("請輸入身分證字號(4,5碼為00)");
            Scanner sc = new Scanner(System.in);
            String idArray = sc.nextLine().toUpperCase();//無論如何轉大寫

            return idArray;//回傳字串
        }

        void check(String a) {

            int index = 0;
            String inputString = a;//丟進來的身分證字串
            Character firstLetter = inputString.charAt(0);//抓出字串第一個英文
            for (int i = 1; i <= inputString.length() - 1; i++) {
                stringToIntArray[i] = (int) (inputString.charAt(i)) - 48;//把身分證字號放入stringToIntArray[]，inputString.charAt(i)裡面的是字元1->49所以減48int 1

                System.out.println(stringToIntArray[i]);//偷偷檢查自己有沒有抓到
            }
            index = Arrays.binarySearch(characterArray, firstLetter);//輸入的第一個英文字母判斷她是在characterArray中的第幾個index
            int d0 = numberArray[index];//對應到的數字抓出來放入d0
            int x2 = (d0) % 10;//d0的個位數
            int x1 = (int) Math.floor((d0) / 10);//d0的十位數
            int result;
            int checkCode;

            for (int i = 0; i <= 9; i++) {
                for (int j = 0; j <= 9; j++) {
                    result = x1 + (9 * x2) + (8 * stringToIntArray[1]) + (7 * stringToIntArray[2]) + (6 * stringToIntArray[3]) + (5 * i) + (4 * j) + (3 * stringToIntArray[6]) + (2 * stringToIntArray[7]) + (stringToIntArray[8]);
                    checkCode = 10 - (result % 10);
                    if (stringToIntArray[9] == checkCode) {
                        System.out.println("身分證正確");
                        String h = firstLetter + String.valueOf(stringToIntArray[1]) + String.valueOf(stringToIntArray[2]) + String.valueOf(stringToIntArray[3]) + String.valueOf(i) + String.valueOf(j) + String.valueOf(stringToIntArray[6]) + String.valueOf(stringToIntArray[7]) + String.valueOf(stringToIntArray[8]) + String.valueOf(stringToIntArray[9]);
                        System.out.println(h);
                        AllID = AllID + "," + h;
                    } else {
                        System.out.println("身分證錯誤");
                    }
                }
            }

        }

        void insertCharacter() {

            for (int i = 0; i <= 25; i++) {
                characterArray[i] = (char) (65 + i);//把英文字母放入字元陣列，強制轉型A->65	
            }

        }
    }
}

//(C)愛神閃靈團隊 Update on 2020/2/28 2:00 AM