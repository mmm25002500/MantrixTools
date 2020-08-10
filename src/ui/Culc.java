package ui;
//小算盤

import java.util.Stack;
import java.util.StringTokenizer;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Insets;
import java.awt.Font;
import java.awt.geom.Point2D;
import java.awt.LinearGradientPaint;
import java.awt.RadialGradientPaint;
import java.awt.Graphics2D;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class Culc extends JFrame implements KeyEventDispatcher {                      //繼承Jframe 實作KeyEventDispatcher

    ColoredPanel background;                                                     //宣告版面顏色為background
    RoundedButton monitor;                                                       //宣告按鈕變數為monitor
    RoundedButton monitorE;                                                      //宣告按鈕變數為monitorE
    String monitorStr = "0";                                                      //宣告字串monitorStr為"0"
    String monitorExp = "";                                                      //宣告字串monitorExp為空字串
    ButtonListener blistener;                                                      //宣告按鈕監聽器為blistener
    Font font = new Font("新細明體", Font.PLAIN, 50);                            //宣告物件字體font為Consolas字形靜態常量及50pt //Consolas

    int operator = 0;// add 0, substract 1                                          //宣告整數operator為0
    long calcBuffer = 0;                                                            //宣告長整數calcBuffer為0
    boolean errorFlag = false;                                                       //宣告布林值errorFlag為0
    boolean Cpress = true;                                                          //宣告布林值Cpress為1
    int leftParenthese = 0, rightParenthese = 0; // '('
    Image icon = Toolkit.getDefaultToolkit().getImage("D:\\愛神閃靈團隊專用\\圖片\\unnamed.jpg");

    public Culc() {                                                                  //宣告類別之建構子
        this.setTitle("愛神閃靈葛格的小算盤");                                                      //設定A7的標題為"小算盤"
//        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);                        //設定關閉事件
        this.setSize(450, 650);                                                     //設定視窗大小
        this.setResizable(true);                                                     //設定是否調整大小 //false
        this.setIconImage(icon);
        this.setLocationRelativeTo(null);                                           //置中
        background = new ColoredPanel();
        background.setLayout(new GridBagLayout());
        this.add(background);

        blistener = new ButtonListener();

        monitor = new RoundedButton(5, String.format("%10s", monitorStr), this);
        monitor.setFont(font);
        monitor.setEnabled(false);
        GridBagConstraints GBC = new GridBagConstraints();
        GBC.gridx = 0;
        GBC.gridy = 0;
        GBC.gridwidth = 5;
        GBC.gridheight = 1;
        GBC.ipadx = 10;
        GBC.ipady = 0;
        GBC.weightx = 0;
        GBC.weighty = 0;
        GBC.insets = new Insets(10, 10, 10, 10);
        GBC.fill = GridBagConstraints.HORIZONTAL;
        GBC.anchor = GridBagConstraints.EAST;
        background.add(monitor, GBC);
        // <Extended>
        monitorE = new RoundedButton(5, String.format("%35s", monitorExp), this);
        monitorE.setFont(new Font("Consolas", Font.PLAIN, 20));
        monitorE.setEnabled(false);
        GBC = new GridBagConstraints();
        GBC.gridx = 0;
        GBC.gridy = 5;
        GBC.gridwidth = 5;
        GBC.gridheight = 1;
        GBC.ipadx = 10;
        GBC.ipady = 0;
        GBC.weightx = 0;
        GBC.weighty = 0;
        GBC.insets = new Insets(10, 10, 10, 10);
        GBC.fill = GridBagConstraints.NONE;
        GBC.anchor = GridBagConstraints.EAST;
        background.add(monitorE, GBC);
        // </Extended>
        String[] str = {"7", "8", "9", "-", "4", "5", "6", "+", "1", "2", "3",
            "=", "0", "C", "*", "/", "(", ")"};
        int[] px = {0, 1, 2, 3, 0, 1, 2, 3, 0, 1, 2, 3, 0, 2, 4, 4, 4, 4};
        int[] py = {1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 1, 2, 3, 4};
        int[] gw = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1};
        int[] gh = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1};

        for (int i = 0; i < 18; i++) {
            GBC = new GridBagConstraints();
            GBC.gridx = px[i];
            GBC.gridy = py[i];
            GBC.gridwidth = gw[i];
            GBC.gridheight = gh[i];
            GBC.ipadx = (gw[i] - 1) * 85 + 40;
            GBC.ipady = (gh[i] - 1) * 60;
            GBC.weightx = 0;
            GBC.weighty = 0;
            GBC.insets = new Insets(10, 10, 10, 10);
            GBC.fill = GridBagConstraints.NONE;
            GBC.anchor = GridBagConstraints.CENTER;
            RoundedButton rb = new RoundedButton(5, str[i], this);
            rb.setActionCommand(str[i]);
            rb.addActionListener(blistener);
            rb.addMouseMotionListener(new MMListener(rb));
            background.add(rb, GBC);
        }
        this.setVisible(true);
        KeyboardFocusManager.getCurrentKeyboardFocusManager()
                .addKeyEventDispatcher(this);
    }

    public boolean dispatchKeyEvent(KeyEvent e) {
        if (e.getID() == KeyEvent.KEY_RELEASED) {
            return false;
        }
        if (e.getKeyChar() == '(') {
            if (e.getExtendedKeyCode() != 0) {
                processCalculator("(");
            }
        } else if (e.getKeyChar() == ')') {
            if (e.getExtendedKeyCode() != 0) {
                processCalculator(")");
            }
        } else if (KeyEvent.VK_0 <= e.getKeyCode()
                && e.getKeyCode() <= KeyEvent.VK_9) {
            processCalculator("" + (char) e.getKeyCode()); // ASCII
        } else if (e.getKeyChar() == '+') {
            processCalculator("+");
        } else if (e.getKeyChar() == '-') {
            processCalculator("-");
        } else if (e.getKeyChar() == '*') {
            processCalculator("*");
        } else if (e.getKeyChar() == '/') {
            processCalculator("/");
        } else if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            processCalculator("=");
        } else if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
            processCalculator("C");
        } else {// right number panel
            if ('0' <= e.getKeyChar() && e.getKeyChar() <= '9'
                    && e.getExtendedKeyCode() != 0) {
                processCalculator("" + e.getKeyChar());
                return false;
            }
            // System.out.println(e.getExtendedKeyCode());
        }
        return false;
    }

    class MMListener implements MouseMotionListener {

        private RoundedButton btn;

        public MMListener(RoundedButton btn) {
            this.btn = btn;
        }

        public void mouseDragged(MouseEvent e) {

        }

        public void mouseMoved(MouseEvent e) {
            btn.touchTimes += 30;
            if (btn.touchTimes > 100) {
                btn.touchTimes = 100;
            }
            background.repaint();
            try {
                Thread.sleep(30);
            } catch (Exception ee) {
            }
        }
    }

    public void processExp(String cmd) {
        if (cmd.equals("C")) {
            leftParenthese = 0;
            rightParenthese = 0;
            monitorExp = "";
            Cpress = true;
            monitorE.setText(String.format("%35s", monitorExp));
            return;
        }
        if (cmd.equals("=")) {
            if (monitorStr.trim().length() != 0) {
                monitorExp += monitorStr.trim();
            }
            calcBuffer = calcInfix(monitorExp);
            leftParenthese = 0;
            rightParenthese = 0;
            monitorExp = "";
            monitorE.setText(String.format("%35s", monitorExp));
            // infix to prefix, and calculate result.
            return;
        }
        boolean hasPrint = false;
        if (isOperator(cmd.charAt(0)) && Cpress == false) {
            if (monitorExp.trim().length() == 0
                    && monitorStr.trim().length() == 0) {
                monitorExp = "" + calcBuffer;
                hasPrint = true;
            }
        }
        if (isOperator(cmd.charAt(0))) {
            if (!monitorStr.equals("") && !hasPrint) {
                monitorExp = monitorExp + monitorStr;
            }
        }
        if (cmd.charAt(0) == ')') {
            if (!monitorStr.equals("") && !hasPrint) {
                monitorExp = monitorExp + monitorStr;
            }
        }
        monitorE.setText(String.format("%35s", monitorExp));
    }

    boolean isOperator(char c) {
        switch (c) {
            case '+':
            case '-':
            case '*':
            case '/':
                return true;
        }
        return false;
    }

    int operatorPriority(char c) {
        switch (c) {
            case '(':
                return 1;
            case '+':
                return 2;
            case '-':
                return 2;
            case '*':
                return 3;
            case '/':
                return 3;
        }
        return -1; // error state
    }

    public int calcPostfix(String postfix) {
        Stack<Integer> stk = new Stack<Integer>();
        StringTokenizer st = new StringTokenizer(postfix, " ");
        String token;
        try {
            while (st.hasMoreTokens()) {
                token = st.nextToken();
                switch (token.charAt(0)) {
                    case '+':
                    case '-':
                    case '*':
                    case '/':
                        if (stk.size() >= 2) {
                            int a, b;
                            b = stk.pop();
                            a = stk.pop();
                            if (token.equals("+")) {
                                stk.push(a + b);
                            }
                            if (token.equals("-")) {
                                stk.push(a - b);
                            }
                            if (token.equals("*")) {
                                stk.push(a * b);
                            }
                            if (token.equals("/")) {
                                stk.push(a / b);
                            }
                        }
                        break;
                    case '(':
                    case ')':
                        break;
                    default:
                        stk.push(Integer.parseInt(token));
                }
            }
        } catch (Exception e) {
            monitorStr = "錯誤惹拉>.<";
            monitor.setText(String.format("%10s.", monitorStr));
            calcBuffer = 0;
            errorFlag = true;
            operator = -1;
        }
        if (stk.isEmpty()) {
            return 0;
        }
        return stk.pop();
    }

    public int calcInfix(String infix) {
        String postfix = "";
        int i, len = infix.length();
        Stack<Character> opStk = new Stack<Character>();
        for (i = 0; i < len; i++) {
            if (Character.isDigit(infix.charAt(i))) {
                while (i < len && Character.isDigit(infix.charAt(i))) {
                    postfix += infix.charAt(i);
                    i++;
                }
                i--;
                postfix += ' ';
            } else {
                if (infix.charAt(i) == ')') {
                    while (!opStk.isEmpty() && opStk.peek() != '(') {
                        postfix += opStk.pop();
                        postfix += ' ';
                    }
                    if (!opStk.isEmpty()) {
                        opStk.pop();
                    }
                } else {
                    while (!opStk.isEmpty() && infix.charAt(i) != '(') {
                        if (opStk.peek() != '(') {
                            if (operatorPriority(opStk.peek()) >= operatorPriority(infix
                                    .charAt(i))) {
                                postfix += opStk.pop();
                                postfix += ' ';
                            } else {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    opStk.push(infix.charAt(i));
                }
            }
        }
        while (!opStk.empty()) {
            postfix += opStk.pop();
            postfix += ' ';
        }
        System.out.println("in : " + infix + ", post : " + postfix);
        return calcPostfix(postfix);
    }

    public void processCalculator(String cmd) {
        // System.out.println(cmd);
        if (errorFlag == true) {
            monitorStr = "";
            monitorExp = "";
            Cpress = true;
            errorFlag = false;
            monitorE.setText(String.format("%35s", monitorExp));
        }
        if (cmd.matches("[0-9]")) {
            Cpress = false;
            if (monitorStr.length() < 10) {
                if (monitorStr.compareTo("0") == 0) {
                    monitorStr = "";
                }
                monitorStr = monitorStr + cmd;
                monitor.setText(String.format("%10s", monitorStr));
            }
            return;
        }
        processExp(cmd);// <here push number and operator>
        if (cmd.equals("C")) {
            monitorStr = "0";
            Cpress = true;
            monitor.setText(String.format("%10s", monitorStr));
            operator = 0;
            calcBuffer = 0;
            return;
        }
        Cpress = false;
        if (cmd.equals("=")) {
            try {
                // calculate in processExp()
                monitorStr = "" + calcBuffer;
                if (monitorStr.length() >= 10) {
                    throw new Exception("OVERFLOW");
                }
            } catch (Exception ee) {// parseInt Error
                monitorStr = "錯誤惹拉>.<";
                monitor.setText(String.format("%10s.", monitorStr));
                calcBuffer = 0;
                errorFlag = true;
                operator = -1;
                return;
            }
            if (errorFlag) {
                return;
            }
            monitor.setText(String.format("%10s.", monitorStr));
            monitorStr = "";
            return;
        }
        try {
            System.out.println(monitorExp);
            if (operator == 0) {// add
                calcBuffer += Integer.parseInt(monitorStr);
                monitorStr = "" + calcBuffer;
            }
            if (operator == 1) {// substract
                calcBuffer -= Integer.parseInt(monitorStr);
                monitorStr = "" + calcBuffer;
            }
            if (operator == 2) {// multiply
                calcBuffer = calcInfix(monitorExp);
                monitorStr = "" + calcBuffer;
                calcBuffer = 0;
            }
            if (operator == 3) {// divide
                calcBuffer = calcInfix(monitorExp);
                monitorStr = "" + calcBuffer;
                calcBuffer = 0;
            }
            System.out.println(calcInfix(monitorExp));
            if (monitorStr.length() >= 10) {
                throw new Exception("OVERFLOW");
            }
            monitor.setText(String.format("%10s.", monitorStr));
        } catch (Exception ee) {// parseInt Error
            if (ee.getMessage().equals("OVERFLOW")) {
                monitorStr = "錯誤惹拉>.<";
                monitor.setText(String.format("%10s.", monitorStr));
                calcBuffer = 0;
                errorFlag = true;
                operator = -1;
                return;
            }
        }
        monitorStr = "";
        if (isOperator(cmd.charAt(0))) {
            if (monitorExp.length() > 0
                    && isOperator(monitorExp.charAt(monitorExp.length() - 1))) {
                monitorExp = monitorExp.substring(0, monitorExp.length() - 1);
            }
            if (monitorExp.length() > 0
                    && monitorExp.charAt(monitorExp.length() - 1) == '(') {
                monitorExp += '0';
            }
            monitorExp += cmd;
            monitorE.setText(String.format("%35s", monitorExp));
        }
        if (cmd.charAt(0) == '(') {
            if (monitorExp.length() > 0
                    && monitorExp.charAt(monitorExp.length() - 1) == ')') {
                monitorExp = "";
                monitorStr = "";
            }
            leftParenthese++;
            operator = 0;
            monitorExp += '(';
            monitorE.setText(String.format("%35s", monitorExp));
        }
        if (cmd.charAt(0) == ')' && rightParenthese < leftParenthese) {
            if (monitorExp.length() > 0
                    && monitorExp.charAt(monitorExp.length() - 1) == '(') {
                monitorExp += "0";
            }
            rightParenthese++;
            operator = 0;
            monitorExp += ')';
            monitorE.setText(String.format("%35s", monitorExp));
        }
        if (cmd.equals("+")) {
            operator = 0;
        }
        if (cmd.equals("-")) {
            operator = 1;
        }
        if (cmd.equals("*")) {
            operator = 2;
        }
        if (cmd.equals("/")) {
            operator = 3;
        }
    }

    class ButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            String cmd = e.getActionCommand();
            processCalculator(cmd);
        }
    }

//    public static void main(String[] args) {
//        new Culc();
//    }
}

class ColoredPanel extends JPanel {

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Color background = new Color(102, 255, 102);
        g.setColor(background);
        g.fillRect(0, 0, getWidth(), getHeight());
    }
}

class RoundedButton extends JButton {

    private int ah;
    private JFrame frame;
    public int touchTimes;// 0-10

    class RoundedBorder implements Border {

        public Insets getBorderInsets(Component c) {
            return new Insets(ah, ah, ah, ah);
        }

        public boolean isBorderOpaque() {
            return true;
        }

        public void paintBorder(Component c, Graphics g, int x, int y,
                int width, int height) {
            Color cc = new Color(240, 249 - (int) (touchTimes * 0.5),
                    253 - (int) (touchTimes * 1.4));
            g.setColor(cc);
            g.drawRoundRect(x, y, width - 1, height - 1, ah, ah);
        }

    }

    RoundedButton(int ah, String str, JFrame frame) {
        super(str);
        this.ah = ah;
        this.frame = frame;
        this.touchTimes = 0;
        this.setBorder(new RoundedBorder());
        this.setFont(new Font("Consolas", Font.BOLD, 28));
        this.setOpaque(false);
        this.setContentAreaFilled(false);
        /*
         * GraphicsEnvironment e = GraphicsEnvironment
         * .getLocalGraphicsEnvironment(); String[] fontnames =
         * e.getAvailableFontFamilyNames(); for (int i = 0; i <
         * fontnames.length; i++) System.out.println(fontnames[i]);
         */

    }

    @Override
    protected void paintComponent(Graphics g) {
        Point2D start = new Point2D.Float(this.getWidth(), 0);
        Point2D end = new Point2D.Float(this.getWidth(), this.getHeight());
        float[] dist = {0.0f, 0.40f, 0.45f, 1.0f};
        Color c1, c2, c3;
        c1 = new Color(247, 251 - (int) (touchTimes * 0.2),
                255 - (int) (touchTimes * 0.2));
        // c1 = new Color(255, 238, 220);
        c2 = new Color(240, 249 - (int) (touchTimes * 0.5),
                253 - (int) (touchTimes * 1.4));
        // c2 = new Color(255, 207, 106);
        c3 = new Color(255, 255, 245);
        Color[] colors = {c1, c1, c2, c3};
        LinearGradientPaint p = new LinearGradientPaint(start, end, dist,
                colors);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setPaint(p);
        g2d.fillRoundRect(0, 0, getWidth(), getHeight(), ah, ah);
        touchTimes -= 12;
        if (touchTimes < 0) {
            touchTimes = 0;
        }
        /*
         * Point2D center = new Point2D.Float(getWidth() / 2, getHeight() / 2);
         * float radius = 25; float[] dist = { 0.0f, 1.0f }; Color c1, c2; c1 =
         * new Color(233, 212, 173); c2 = new Color(232, 238, 246); Color[]
         * colors = { c1, c2 }; RadialGradientPaint p = new
         * RadialGradientPaint(center, radius, dist, colors); Graphics2D g2d =
         * (Graphics2D) g; g2d.setPaint(p); g2d.fillRoundRect(0, 0, getWidth(),
         * getHeight(), ah, ah);
         */
        super.paintComponent(g);
    }
}
//(C) Aishen-Shanling Team on 2020/1/1
