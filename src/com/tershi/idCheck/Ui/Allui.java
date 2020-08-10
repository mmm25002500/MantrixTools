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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import javax.swing.ImageIcon;
import java.awt.*;
import java.io.*;
import java.awt.Color.*;
import java.awt.event.*;

public class Allui extends javax.swing.JFrame {

    static char[] characterArray = new char[26];//A-Z
    static int[] numberArray = {10, 11, 12, 13, 14, 15, 16, 17, 34, 18, 19, 20, 21, 22, 35, 23, 24, 25, 26, 27, 28, 29, 32, 30, 31, 32};//A-Z對應的數字
    static int[] stringToIntArray = new int[26];//放輸入的字串
    static String AllID;
    static String[] All;
    static String finalAll;
    static String inputString;
    static boolean output;

    public Allui() {
        ImageIcon img = new ImageIcon("bin\\unnamed.png");
        setIconImage(img.getImage());
        initComponents();
        setTitle("身分證破解並檢查 By 夏特稀");
        setBackground(Color.RED);
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    static String getInput() {
        String idArray = inputString.toUpperCase();//無論如何轉大寫

        return idArray;//回傳字串
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ab = new javax.swing.JFrame();
        saw = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        Exit = new javax.swing.JDialog();
        jTextField1 = new javax.swing.JTextField();
        YESExit = new javax.swing.JButton();
        NoExit = new javax.swing.JButton();
        FileChooseFrame = new javax.swing.JFrame();
        jFileChooser2 = new javax.swing.JFileChooser();
        SureExit = new javax.swing.JDialog();
        jTextField2 = new javax.swing.JTextField();
        GoodBye = new javax.swing.JButton();
        NotExit = new javax.swing.JDialog();
        jTextField3 = new javax.swing.JTextField();
        GoodBye2 = new javax.swing.JButton();
        jFileChooser1 = new javax.swing.JFileChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        CleanIt = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        Open = new javax.swing.JMenuItem();
        Save = new javax.swing.JMenuItem();
        Clean = new javax.swing.JMenuItem();
        goAway = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        Paste = new javax.swing.JMenuItem();
        Copy = new javax.swing.JMenuItem();
        Cut = new javax.swing.JMenuItem();
        Back = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        aboutme = new javax.swing.JMenuItem();

        ab.setBackground(new java.awt.Color(255, 0, 51));

        saw.setText("看完了ㄎㄎ");
        saw.setMaximumSize(new java.awt.Dimension(5000, 5000));
        saw.setMinimumSize(new java.awt.Dimension(500, 500));
        saw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sawActionPerformed(evt);
            }
        });

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jTextArea3.setText("這是由夏特稀製作的身分證破解器並檢查可用\n版本:v2.3\n本次更新:\n1.將全版面置中\n2.新增清除版面功能");
        jScrollPane3.setViewportView(jTextArea3);

        jLabel4.setText("Copyright (C) TerShi  版權所有 保留一切權利");

        javax.swing.GroupLayout abLayout = new javax.swing.GroupLayout(ab.getContentPane());
        ab.getContentPane().setLayout(abLayout);
        abLayout.setHorizontalGroup(
            abLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3)
            .addGroup(abLayout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addGroup(abLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(saw, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(142, Short.MAX_VALUE))
        );
        abLayout.setVerticalGroup(
            abLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, abLayout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(saw, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jLabel4)
                .addContainerGap())
        );

        Exit.setMinimumSize(new java.awt.Dimension(400, 100));

        jTextField1.setText("感謝使用 但我討厭你離開 哼哼     未知今日之別尚有會期否?");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        YESExit.setText("是");
        YESExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YESExitActionPerformed(evt);
            }
        });

        NoExit.setText("否");
        NoExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ExitLayout = new javax.swing.GroupLayout(Exit.getContentPane());
        Exit.getContentPane().setLayout(ExitLayout);
        ExitLayout.setHorizontalGroup(
            ExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField1)
            .addGroup(ExitLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(YESExit, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(NoExit, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        ExitLayout.setVerticalGroup(
            ExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ExitLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(YESExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NoExit))
                .addContainerGap())
        );

        jFileChooser2.setMinimumSize(new java.awt.Dimension(613, 397));
        jFileChooser2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFileChooser2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FileChooseFrameLayout = new javax.swing.GroupLayout(FileChooseFrame.getContentPane());
        FileChooseFrame.getContentPane().setLayout(FileChooseFrameLayout);
        FileChooseFrameLayout.setHorizontalGroup(
            FileChooseFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jFileChooser2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        FileChooseFrameLayout.setVerticalGroup(
            FileChooseFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jFileChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        SureExit.setMinimumSize(new java.awt.Dimension(400, 100));

        jTextField2.setText("後會有期");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        GoodBye.setText("886");
        GoodBye.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GoodByeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SureExitLayout = new javax.swing.GroupLayout(SureExit.getContentPane());
        SureExit.getContentPane().setLayout(SureExitLayout);
        SureExitLayout.setHorizontalGroup(
            SureExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addGroup(SureExitLayout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(GoodBye, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SureExitLayout.setVerticalGroup(
            SureExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SureExitLayout.createSequentialGroup()
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(GoodBye)
                .addContainerGap())
        );

        NotExit.setMinimumSize(new java.awt.Dimension(400, 100));

        jTextField3.setText("滾");
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        GoodBye2.setText("886");
        GoodBye2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GoodBye2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout NotExitLayout = new javax.swing.GroupLayout(NotExit.getContentPane());
        NotExit.getContentPane().setLayout(NotExitLayout);
        NotExitLayout.setHorizontalGroup(
            NotExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addGroup(NotExitLayout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(GoodBye2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(NotExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(NotExitLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jFileChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        NotExitLayout.setVerticalGroup(
            NotExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NotExitLayout.createSequentialGroup()
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(GoodBye2)
                .addContainerGap())
            .addGroup(NotExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(NotExitLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jFileChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 0, 255));

        jTextArea1.setColumns(20);
        jTextArea1.setForeground(new java.awt.Color(204, 0, 204));
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setText("Example:A123006789");
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

        jLabel2.setText("版權所有 (C) Aishen-Shanling Team made on 2020/2/28 Version: 2.3 請勿修改 販售 僅供私人使用 勿侵犯程式著作權 否則自行負責");

        CleanIt.setText("丟掉");
        CleanIt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CleanItActionPerformed(evt);
            }
        });

        jLabel3.setText("輸入身分證字號:");

        jMenu2.setText("檔案");

        Open.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        Open.setText("打開");
        Open.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpenActionPerformed(evt);
            }
        });
        jMenu2.add(Open);

        Save.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        Save.setText("儲存");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });
        jMenu2.add(Save);

        Clean.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.SHIFT_MASK));
        Clean.setText("丟掉");
        Clean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CleanActionPerformed(evt);
            }
        });
        jMenu2.add(Clean);

        goAway.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        goAway.setText("走開");
        goAway.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goAwayActionPerformed(evt);
            }
        });
        jMenu2.add(goAway);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("編輯");

        Paste.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        Paste.setText("貼上");
        Paste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasteActionPerformed(evt);
            }
        });
        jMenu3.add(Paste);

        Copy.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        Copy.setText("複製");
        Copy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CopyActionPerformed(evt);
            }
        });
        jMenu3.add(Copy);

        Cut.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        Cut.setText("剪下");
        Cut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CutActionPerformed(evt);
            }
        });
        jMenu3.add(Cut);

        Back.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_MASK));
        Back.setText("回去");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        jMenu3.add(Back);

        jMenuBar1.add(jMenu3);

        jMenu1.setText("更多");

        aboutme.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        aboutme.setText("關於我ㄛ");
        aboutme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutmeActionPerformed(evt);
            }
        });
        jMenu1.add(aboutme);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(106, 106, 106))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(64, 64, 64)
                                .addComponent(CleanIt)))
                        .addGap(308, 308, 308)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 944, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4)
                            .addComponent(jButton3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel3)
                        .addGap(44, 44, 44)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CleanIt))
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        insertCharacter();//插入英文字母
        ArrayList<Integer> arrList = new ArrayList<>(Arrays.asList());
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
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        output = true;
        jLabel1.setText(jLabel1.getText() + " 是");
//        jLabel1.setEnabled(false);
        jButton4.setVisible(false);
        jButton3.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        output = false;
        jLabel1.setText(jLabel1.getText() + " 否");
//        jLabel1.setEnabled(false);
        jButton3.setVisible(false);
        jButton4.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void PasteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasteActionPerformed

    private void CopyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CopyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CopyActionPerformed

    private void CutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CutActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BackActionPerformed

    private void aboutmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutmeActionPerformed
        ab.setVisible(true);
        ab.setSize(500, 500);
        ab.setTitle("關於我喔喔喔喔");
        ab.setLocationRelativeTo(null);
    }//GEN-LAST:event_aboutmeActionPerformed

    private void sawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sawActionPerformed
        ab.setVisible(false);
    }//GEN-LAST:event_sawActionPerformed

    private void goAwayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goAwayActionPerformed
        Exit.setVisible(true);
        Exit.setSize(400, 150);
        Exit.setTitle("你怎捨得離開夫君?");
        Exit.setLocationRelativeTo(null);
    }//GEN-LAST:event_goAwayActionPerformed

    private void YESExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YESExitActionPerformed
        SureExit.setVisible(true);
        SureExit.setSize(400,150);
        SureExit.setLocationRelativeTo(null);
    }//GEN-LAST:event_YESExitActionPerformed

    private void CleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CleanActionPerformed
        jTextArea1.setText("");
    }//GEN-LAST:event_CleanActionPerformed

    private void CleanItActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CleanItActionPerformed
        jTextArea1.setText("");
    }//GEN-LAST:event_CleanItActionPerformed

    private void OpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpenActionPerformed
        FileChooseFrame.setVisible(true);
        FileChooseFrame.setSize(700, 400);
        FileChooseFrame.setTitle("打開文件");
        FileChooseFrame.setLocationRelativeTo(null);
    }//GEN-LAST:event_OpenActionPerformed

    private void jFileChooser2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFileChooser2ActionPerformed

    }//GEN-LAST:event_jFileChooser2ActionPerformed

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
        FileChooseFrame.setVisible(true);
        FileChooseFrame.setSize(700, 400);
        FileChooseFrame.setTitle("儲存文件");
        FileChooseFrame.setLocationRelativeTo(null);
    }//GEN-LAST:event_SaveActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void NoExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoExitActionPerformed
        NotExit.setVisible(true);
        NotExit.setSize(400,150);
        NotExit.setLocationRelativeTo(null);
    }//GEN-LAST:event_NoExitActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void GoodByeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GoodByeActionPerformed
        System.exit(0);
    }//GEN-LAST:event_GoodByeActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void GoodBye2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GoodBye2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_GoodBye2ActionPerformed

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Back;
    private javax.swing.JMenuItem Clean;
    private javax.swing.JButton CleanIt;
    private javax.swing.JMenuItem Copy;
    private javax.swing.JMenuItem Cut;
    private javax.swing.JDialog Exit;
    private javax.swing.JFrame FileChooseFrame;
    private javax.swing.JButton GoodBye;
    private javax.swing.JButton GoodBye2;
    private javax.swing.JButton NoExit;
    private javax.swing.JDialog NotExit;
    private javax.swing.JMenuItem Open;
    private javax.swing.JMenuItem Paste;
    private javax.swing.JMenuItem Save;
    private javax.swing.JDialog SureExit;
    private javax.swing.JButton YESExit;
    private javax.swing.JFrame ab;
    private javax.swing.JMenuItem aboutme;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JMenuItem goAway;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JFileChooser jFileChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JButton saw;
    // End of variables declaration//GEN-END:variables
}
//(C)Aishen-Shanling Team Update on 2020/2/28 2:00 AM
