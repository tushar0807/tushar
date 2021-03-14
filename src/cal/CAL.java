
/*
 * CAL.java
 *F
 * Created on May 17, 2011, 9:41:02 AM
 */
package cal;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author R2
 */
public class CAL extends javax.swing.JFrame {

    public CAL() {

        initComponents();
        jPanel9.setBackground(new Color(255, 255, 255, 200));
        pMainNum.setBackground(new Color(255, 255, 255, 0));
        pSub.setBackground(new Color(255, 255, 255, 0));
        pRadian.setBackground(new Color(255, 255, 255, 0));
        setListners();
        jLabel2.setVisible(false);



    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel9 = new javax.swing.JPanel();
        pRadian = new javax.swing.JPanel();
        rDegree = new javax.swing.JRadioButton();
        rRadian = new javax.swing.JRadioButton();
        rGrad = new javax.swing.JRadioButton();
        pText = new javax.swing.JPanel();
        tMain = new javax.swing.JTextField();
        tSub = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        pSub = new javax.swing.JPanel();
        bNone = new javax.swing.JButton();
        bLn = new javax.swing.JButton();
        bBracOpen = new javax.swing.JButton();
        bBracClose = new javax.swing.JButton();
        bXsq = new javax.swing.JButton();
        bSin = new javax.swing.JButton();
        bSinh = new javax.swing.JButton();
        bNfac = new javax.swing.JButton();
        bInt = new javax.swing.JButton();
        bXpwry = new javax.swing.JButton();
        bCos = new javax.swing.JButton();
        bCosh = new javax.swing.JButton();
        bXy = new javax.swing.JButton();
        bDms = new javax.swing.JButton();
        bXthree = new javax.swing.JButton();
        bTan = new javax.swing.JButton();
        bTanh = new javax.swing.JButton();
        bThree = new javax.swing.JButton();
        bFi = new javax.swing.JButton();
        bLog = new javax.swing.JButton();
        bMod = new javax.swing.JButton();
        bExp = new javax.swing.JButton();
        bTenx = new javax.swing.JButton();
        tbInv = new javax.swing.JToggleButton();
        bIln = new javax.swing.JButton();
        bIsin = new javax.swing.JButton();
        bIsinh = new javax.swing.JButton();
        bIint = new javax.swing.JButton();
        bIdms = new javax.swing.JButton();
        bIcosh = new javax.swing.JButton();
        bIcos = new javax.swing.JButton();
        bItan = new javax.swing.JButton();
        bItanh = new javax.swing.JButton();
        bIfi = new javax.swing.JButton();
        bFe = new javax.swing.JToggleButton();
        pExtra = new javax.swing.JPanel();
        bMc = new javax.swing.JButton();
        bMmin = new javax.swing.JButton();
        bMr = new javax.swing.JButton();
        bMs = new javax.swing.JButton();
        bMplus = new javax.swing.JButton();
        pMainNum = new javax.swing.JPanel();
        bBack = new javax.swing.JButton();
        bCe = new javax.swing.JButton();
        bC = new javax.swing.JButton();
        bSign = new javax.swing.JButton();
        bFrac = new javax.swing.JButton();
        bSev = new javax.swing.JButton();
        bEight = new javax.swing.JButton();
        bNine = new javax.swing.JButton();
        bDiv = new javax.swing.JButton();
        bPerc = new javax.swing.JButton();
        bFive = new javax.swing.JButton();
        bFour = new javax.swing.JButton();
        bEq = new javax.swing.JButton();
        bMin = new javax.swing.JButton();
        bTree = new javax.swing.JButton();
        bMul = new javax.swing.JButton();
        bUnder = new javax.swing.JButton();
        bOne = new javax.swing.JButton();
        bTwo = new javax.swing.JButton();
        bSix = new javax.swing.JButton();
        bZero = new javax.swing.JButton();
        bDot = new javax.swing.JButton();
        bPlus = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pRadian.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pRadian.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonGroup1.add(rDegree);
        rDegree.setSelected(true);
        rDegree.setText("Degrees");
        rDegree.setMargin(new java.awt.Insets(0, 0, 0, 0));
        rDegree.setOpaque(false);
        pRadian.add(rDegree, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, -1, 20));

        buttonGroup1.add(rRadian);
        rRadian.setText("Radians");
        rRadian.setMargin(new java.awt.Insets(0, 0, 0, 0));
        rRadian.setOpaque(false);
        pRadian.add(rRadian, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, -1, 20));

        buttonGroup1.add(rGrad);
        rGrad.setText("Grads");
        rGrad.setMargin(new java.awt.Insets(0, 0, 0, 0));
        rGrad.setOpaque(false);
        pRadian.add(rGrad, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 60, 20));

        jPanel9.add(pRadian, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 223, 20));

        pText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pText.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tMain.setEditable(false);
        tMain.setFont(new java.awt.Font("Times New Roman", 0, 24));
        tMain.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tMain.setText("0");
        tMain.setBorder(null);
        tMain.setOpaque(false);
        tMain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tMainActionPerformed(evt);
            }
        });
        pText.add(tMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 450, 30));

        tSub.setEditable(false);
        tSub.setFont(new java.awt.Font("Tahoma", 0, 10));
        tSub.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tSub.setAutoscrolls(false);
        tSub.setBorder(null);
        tSub.setOpaque(false);
        pText.add(tSub, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 0, 450, 20));

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 18));
        jLabel2.setText("M");
        pText.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, -1));

        jPanel9.add(pText, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, 450, 50));

        pSub.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bNone.setEnabled(false);
        bNone.setIconTextGap(0);
        bNone.setMargin(new java.awt.Insets(0, 0, 0, 0));
        pSub.add(bNone, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 27));

        bLn.setText("ln");
        bLn.setIconTextGap(0);
        bLn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        bLn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLnActionPerformed(evt);
            }
        });
        pSub.add(bLn, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 0, 40, 27));

        bBracOpen.setText("(");
        bBracOpen.setToolTipText("Not supported in selected profile.");
        bBracOpen.setEnabled(false);
        bBracOpen.setIconTextGap(0);
        bBracOpen.setMargin(new java.awt.Insets(0, 0, 0, 0));
        pSub.add(bBracOpen, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 0, 40, 27));

        bBracClose.setText(")");
        bBracClose.setToolTipText("Not supported in selected profile.");
        bBracClose.setEnabled(false);
        bBracClose.setIconTextGap(0);
        bBracClose.setMargin(new java.awt.Insets(0, 0, 0, 0));
        pSub.add(bBracClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 0, 40, 27));

        bXsq.setText("<html><body>x<sup>2</sup></body></html>");
        bXsq.setIconTextGap(0);
        bXsq.setMargin(new java.awt.Insets(0, 0, 0, 0));
        bXsq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bXsqActionPerformed(evt);
            }
        });
        pSub.add(bXsq, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 33, 40, 27));

        bSin.setText("sin");
        bSin.setIconTextGap(0);
        bSin.setMargin(new java.awt.Insets(0, 0, 0, 0));
        bSin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSinActionPerformed(evt);
            }
        });
        pSub.add(bSin, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 33, 40, 27));

        bSinh.setText("sinh");
        bSinh.setIconTextGap(0);
        bSinh.setMargin(new java.awt.Insets(0, 0, 0, 0));
        bSinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSinhActionPerformed(evt);
            }
        });
        pSub.add(bSinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 33, 40, 27));

        bNfac.setText("n!");
        bNfac.setToolTipText("Find the factorial. Exact only for one precision input");
        bNfac.setIconTextGap(0);
        bNfac.setMargin(new java.awt.Insets(0, 0, 0, 0));
        bNfac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bNfacActionPerformed(evt);
            }
        });
        pSub.add(bNfac, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 33, 40, 27));

        bInt.setText("Int");
        bInt.setIconTextGap(0);
        bInt.setMargin(new java.awt.Insets(0, 0, 0, 0));
        bInt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bIntActionPerformed(evt);
            }
        });
        pSub.add(bInt, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 33, 40, 27));

        bXpwry.setText("<html><body>x<sup>y</sup></body></html>");
        bXpwry.setIconTextGap(0);
        bXpwry.setMargin(new java.awt.Insets(0, 0, 0, 0));
        bXpwry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bXpwryActionPerformed(evt);
            }
        });
        pSub.add(bXpwry, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 66, 40, 27));

        bCos.setText("cos");
        bCos.setIconTextGap(0);
        bCos.setMargin(new java.awt.Insets(0, 0, 0, 0));
        bCos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCosActionPerformed(evt);
            }
        });
        pSub.add(bCos, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 66, 40, 27));

        bCosh.setText("cosh");
        bCosh.setIconTextGap(0);
        bCosh.setMargin(new java.awt.Insets(0, 0, 0, 0));
        bCosh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCoshActionPerformed(evt);
            }
        });
        pSub.add(bCosh, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 66, 40, 27));

        bXy.setText("<html><body><sup>y</sup>&#8730;x</body></html>");
        bXy.setIconTextGap(0);
        bXy.setMargin(new java.awt.Insets(0, 0, 0, 0));
        bXy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bXyActionPerformed(evt);
            }
        });
        pSub.add(bXy, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 66, 40, 27));

        bDms.setText("dms");
        bDms.setIconTextGap(0);
        bDms.setMargin(new java.awt.Insets(0, 0, 0, 0));
        bDms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDmsActionPerformed(evt);
            }
        });
        pSub.add(bDms, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 66, 40, 27));

        bXthree.setText("<html><body>x<sup>3</sup></body></html>");
        bXthree.setIconTextGap(0);
        bXthree.setMargin(new java.awt.Insets(0, 0, 0, 0));
        bXthree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bXthreeActionPerformed(evt);
            }
        });
        pSub.add(bXthree, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 99, 40, 27));

        bTan.setText("tan");
        bTan.setIconTextGap(0);
        bTan.setMargin(new java.awt.Insets(0, 0, 0, 0));
        bTan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bTanActionPerformed(evt);
            }
        });
        pSub.add(bTan, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 99, 40, 27));

        bTanh.setText("tanh");
        bTanh.setIconTextGap(0);
        bTanh.setMargin(new java.awt.Insets(0, 0, 0, 0));
        bTanh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bTanhActionPerformed(evt);
            }
        });
        pSub.add(bTanh, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 99, 40, 27));

        bThree.setText("<html><body><sup>3</sup>&#8730;x</body></html>");
        bThree.setIconTextGap(0);
        bThree.setMargin(new java.awt.Insets(0, 0, 0, 0));
        bThree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bThreeActionPerformed(evt);
            }
        });
        pSub.add(bThree, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 99, 40, 27));

        bFi.setText("<html><body>&#8719;</body></html>");
        bFi.setIconTextGap(0);
        bFi.setMargin(new java.awt.Insets(0, 0, 0, 0));
        bFi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bFiActionPerformed(evt);
            }
        });
        pSub.add(bFi, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 99, 40, 27));

        bLog.setText("log");
        bLog.setIconTextGap(0);
        bLog.setMargin(new java.awt.Insets(0, 0, 0, 0));
        bLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLogActionPerformed(evt);
            }
        });
        pSub.add(bLog, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 132, 40, 27));

        bMod.setText("Mod");
        bMod.setIconTextGap(0);
        bMod.setMargin(new java.awt.Insets(0, 0, 0, 0));
        pSub.add(bMod, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 132, 40, 27));

        bExp.setText("Exp");
        bExp.setIconTextGap(0);
        bExp.setMargin(new java.awt.Insets(0, 0, 0, 0));
        bExp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bExpActionPerformed(evt);
            }
        });
        pSub.add(bExp, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 132, 40, 27));

        bTenx.setText("<html><body>10<sup>x</sup></body></html>");
        bTenx.setIconTextGap(0);
        bTenx.setMargin(new java.awt.Insets(0, 0, 0, 0));
        bTenx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bTenxActionPerformed(evt);
            }
        });
        pSub.add(bTenx, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 132, 40, 27));

        tbInv.setText("Inv");
        tbInv.setMargin(new java.awt.Insets(0, 0, 0, 0));
        tbInv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbInvActionPerformed(evt);
            }
        });
        pSub.add(tbInv, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 0, 40, 27));

        bIln.setFont(new java.awt.Font("Tahoma", 0, 10));
        bIln.setText("<html><body>e<sup>x</sup></body></html>");
        bIln.setIconTextGap(0);
        bIln.setMargin(new java.awt.Insets(0, 0, 0, 0));
        bIln.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bIlnActionPerformed(evt);
            }
        });
        pSub.add(bIln, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 0, 40, 27));

        bIsin.setFont(new java.awt.Font("Tahoma", 0, 10));
        bIsin.setText("<html><body>sin<sup>-1</sup></body></html>");
        bIsin.setIconTextGap(0);
        bIsin.setMargin(new java.awt.Insets(0, 0, 0, 0));
        bIsin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bIsinActionPerformed(evt);
            }
        });
        pSub.add(bIsin, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 33, 40, 27));

        bIsinh.setFont(new java.awt.Font("Tahoma", 0, 10));
        bIsinh.setText("<html><body>sinh<sup>-1</sup></body></html>");
        bIsinh.setIconTextGap(0);
        bIsinh.setMargin(new java.awt.Insets(0, 0, 0, 0));
        bIsinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bIsinhActionPerformed(evt);
            }
        });
        pSub.add(bIsinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 33, 40, 27));

        bIint.setFont(new java.awt.Font("Tahoma", 0, 10));
        bIint.setText("Frac");
        bIint.setIconTextGap(0);
        bIint.setMargin(new java.awt.Insets(0, 0, 0, 0));
        bIint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bIintActionPerformed(evt);
            }
        });
        pSub.add(bIint, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 33, 40, 27));

        bIdms.setFont(new java.awt.Font("Tahoma", 0, 10));
        bIdms.setText("deg");
        bIdms.setIconTextGap(0);
        bIdms.setMargin(new java.awt.Insets(0, 0, 0, 0));
        bIdms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bIdmsActionPerformed(evt);
            }
        });
        pSub.add(bIdms, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 66, 40, 27));

        bIcosh.setFont(new java.awt.Font("Tahoma", 0, 10));
        bIcosh.setText("<html><body>cosh<sup>-1</sup></body></html>");
        bIcosh.setIconTextGap(0);
        bIcosh.setMargin(new java.awt.Insets(0, 0, 0, 0));
        bIcosh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bIcoshActionPerformed(evt);
            }
        });
        pSub.add(bIcosh, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 66, 40, 27));

        bIcos.setFont(new java.awt.Font("Tahoma", 0, 10));
        bIcos.setText("<html><body>cos<sup>-1</sup></body></html>");
        bIcos.setIconTextGap(0);
        bIcos.setMargin(new java.awt.Insets(0, 0, 0, 0));
        bIcos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bIcosActionPerformed(evt);
            }
        });
        pSub.add(bIcos, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 66, 40, 27));

        bItan.setFont(new java.awt.Font("Tahoma", 0, 10));
        bItan.setText("<html><body>tan<sup>-1</sup></body></html>");
        bItan.setIconTextGap(0);
        bItan.setMargin(new java.awt.Insets(0, 0, 0, 0));
        bItan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bItanActionPerformed(evt);
            }
        });
        pSub.add(bItan, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 99, 40, 27));

        bItanh.setFont(new java.awt.Font("Tahoma", 0, 10));
        bItanh.setText("<html><body>tanh<sup>-1</sup></body></html>");
        bItanh.setIconTextGap(0);
        bItanh.setMargin(new java.awt.Insets(0, 0, 0, 0));
        bItanh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bItanhActionPerformed(evt);
            }
        });
        pSub.add(bItanh, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 99, 40, 27));

        bIfi.setFont(new java.awt.Font("Tahoma", 0, 10));
        bIfi.setText("<html><body>2*&#8719;</body></html>");
        bIfi.setIconTextGap(0);
        bIfi.setMargin(new java.awt.Insets(0, 0, 0, 0));
        bIfi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bIfiActionPerformed(evt);
            }
        });
        pSub.add(bIfi, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 99, 40, 27));

        bFe.setText("F-E");
        bFe.setMargin(new java.awt.Insets(0, 0, 0, 0));
        bFe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bFeActionPerformed(evt);
            }
        });
        pSub.add(bFe, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 132, 40, 27));

        jPanel9.add(pSub, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 226, -1));

        bMc.setText("MC");
        bMc.setToolTipText("");
        bMc.setIconTextGap(0);
        bMc.setMargin(new java.awt.Insets(0, 0, 0, 0));
        bMc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMcActionPerformed(evt);
            }
        });

        bMmin.setText("M-");
        bMmin.setToolTipText("");
        bMmin.setIconTextGap(0);
        bMmin.setMargin(new java.awt.Insets(0, 0, 0, 0));
        bMmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMminActionPerformed(evt);
            }
        });

        bMr.setText("MR");
        bMr.setToolTipText("");
        bMr.setIconTextGap(0);
        bMr.setMargin(new java.awt.Insets(0, 0, 0, 0));
        bMr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMrActionPerformed(evt);
            }
        });

        bMs.setText("MS");
        bMs.setToolTipText("");
        bMs.setIconTextGap(0);
        bMs.setMargin(new java.awt.Insets(0, 0, 0, 0));
        bMs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMsActionPerformed(evt);
            }
        });

        bMplus.setText("M+");
        bMplus.setToolTipText("");
        bMplus.setIconTextGap(0);
        bMplus.setMargin(new java.awt.Insets(0, 0, 0, 0));
        bMplus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMplusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pExtraLayout = new javax.swing.GroupLayout(pExtra);
        pExtra.setLayout(pExtraLayout);
        pExtraLayout.setHorizontalGroup(
            pExtraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pExtraLayout.createSequentialGroup()
                .addComponent(bMc, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bMr, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bMs, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bMplus, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bMmin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pExtraLayout.setVerticalGroup(
            pExtraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pExtraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(bMc, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(bMr, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(bMs, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(bMplus, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(bMmin, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel9.add(pExtra, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, -1, -1));

        pMainNum.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bBack.setText("<html><body>&#8592;</body></html>");
        bBack.setIconTextGap(0);
        bBack.setMargin(new java.awt.Insets(0, 0, 0, 0));
        bBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBackActionPerformed(evt);
            }
        });
        pMainNum.add(bBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 27));

        bCe.setText("CE");
        bCe.setIconTextGap(0);
        bCe.setMargin(new java.awt.Insets(0, 0, 0, 0));
        bCe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCeActionPerformed(evt);
            }
        });
        pMainNum.add(bCe, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 0, 40, 27));

        bC.setText("C");
        bC.setIconTextGap(0);
        bC.setMargin(new java.awt.Insets(0, 0, 0, 0));
        bC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCActionPerformed(evt);
            }
        });
        pMainNum.add(bC, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 0, 40, 27));

        bSign.setText("<html><body>&#177</body></html>");
        bSign.setIconTextGap(0);
        bSign.setMargin(new java.awt.Insets(0, 0, 0, 0));
        bSign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSignActionPerformed(evt);
            }
        });
        pMainNum.add(bSign, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 0, 40, 27));

        bFrac.setText("<html><body>&#8730</body></html>");
        bFrac.setIconTextGap(0);
        bFrac.setMargin(new java.awt.Insets(0, 0, 0, 0));
        bFrac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bFracActionPerformed(evt);
            }
        });
        pMainNum.add(bFrac, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 0, 40, 27));

        bSev.setText("7");
        bSev.setIconTextGap(0);
        bSev.setMargin(new java.awt.Insets(0, 0, 0, 0));
        pMainNum.add(bSev, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 33, 40, 27));

        bEight.setText("8");
        bEight.setIconTextGap(0);
        bEight.setMargin(new java.awt.Insets(0, 0, 0, 0));
        pMainNum.add(bEight, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 33, 40, 27));

        bNine.setText("9");
        bNine.setIconTextGap(0);
        bNine.setMargin(new java.awt.Insets(0, 0, 0, 0));
        pMainNum.add(bNine, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 33, 40, 27));

        bDiv.setText("/");
        bDiv.setIconTextGap(0);
        bDiv.setMargin(new java.awt.Insets(0, 0, 0, 0));
        pMainNum.add(bDiv, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 33, 40, 27));

        bPerc.setText("%");
        bPerc.setToolTipText("");
        bPerc.setIconTextGap(0);
        bPerc.setMargin(new java.awt.Insets(0, 0, 0, 0));
        bPerc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPercActionPerformed(evt);
            }
        });
        pMainNum.add(bPerc, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 33, 40, 27));

        bFive.setText("5");
        bFive.setIconTextGap(0);
        bFive.setMargin(new java.awt.Insets(0, 0, 0, 0));
        pMainNum.add(bFive, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 66, 40, 27));

        bFour.setText("4");
        bFour.setIconTextGap(0);
        bFour.setMargin(new java.awt.Insets(0, 0, 0, 0));
        pMainNum.add(bFour, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 66, 40, 27));

        bEq.setFont(new java.awt.Font("Tahoma", 1, 24));
        bEq.setText("=");
        bEq.setMargin(new java.awt.Insets(0, 0, 0, 0));
        bEq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEqActionPerformed(evt);
            }
        });
        pMainNum.add(bEq, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 99, 40, 60));

        bMin.setText("-");
        bMin.setIconTextGap(0);
        bMin.setMargin(new java.awt.Insets(0, 0, 0, 0));
        pMainNum.add(bMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 99, 40, 27));

        bTree.setText("3");
        bTree.setIconTextGap(0);
        bTree.setMargin(new java.awt.Insets(0, 0, 0, 0));
        pMainNum.add(bTree, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 99, 40, 27));

        bMul.setText("*");
        bMul.setIconTextGap(0);
        bMul.setMargin(new java.awt.Insets(0, 0, 0, 0));
        bMul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMulActionPerformed(evt);
            }
        });
        pMainNum.add(bMul, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 66, 40, 27));

        bUnder.setText("1/x");
        bUnder.setIconTextGap(0);
        bUnder.setMargin(new java.awt.Insets(0, 0, 0, 0));
        bUnder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bUnderActionPerformed(evt);
            }
        });
        pMainNum.add(bUnder, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 66, 40, 27));

        bOne.setText("1");
        bOne.setIconTextGap(0);
        bOne.setMargin(new java.awt.Insets(0, 0, 0, 0));
        bOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bOneActionPerformed(evt);
            }
        });
        pMainNum.add(bOne, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 99, 40, 27));

        bTwo.setText("2");
        bTwo.setIconTextGap(0);
        bTwo.setMargin(new java.awt.Insets(0, 0, 0, 0));
        pMainNum.add(bTwo, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 99, 40, 27));

        bSix.setText("6");
        bSix.setIconTextGap(0);
        bSix.setMargin(new java.awt.Insets(0, 0, 0, 0));
        pMainNum.add(bSix, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 66, 40, 27));

        bZero.setText("0");
        bZero.setIconTextGap(0);
        bZero.setMargin(new java.awt.Insets(0, 0, 0, 0));
        bZero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bZeroActionPerformed(evt);
            }
        });
        pMainNum.add(bZero, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 132, 86, 27));

        bDot.setText(".");
        bDot.setIconTextGap(0);
        bDot.setMargin(new java.awt.Insets(0, 0, 0, 0));
        bDot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDotActionPerformed(evt);
            }
        });
        pMainNum.add(bDot, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 132, 40, 27));

        bPlus.setText("+");
        bPlus.setIconTextGap(0);
        bPlus.setMargin(new java.awt.Insets(0, 0, 0, 0));
        bPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPlusActionPerformed(evt);
            }
        });
        pMainNum.add(bPlus, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 132, 40, 27));

        jPanel9.add(pMainNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, -1, -1));

        getContentPane().add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 480, 287));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cal/WM (1).jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 310));

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-516)/2, (screenSize.height-347)/2, 516, 347);
    }// </editor-fold>//GEN-END:initComponents
    private void bCosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCosActionPerformed
        if (!tMain.getText().isEmpty()) {
            double rad_value = checkRad(tMain.getText());



            tMain.setText(String.valueOf(Math.cos(rad_value)));

            oprtr = false;
            clrScrn();
        }
    }//GEN-LAST:event_bCosActionPerformed

    private void bMminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMminActionPerformed
        if (!tMain.getText().isEmpty()) {
            memory = "-" + tMain.getText();
            jLabel2.setVisible(true);
            oprtr = true;
        }
    }//GEN-LAST:event_bMminActionPerformed

    private void bFracActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bFracActionPerformed
        if (!tMain.getText().isEmpty()) {
            tMain.setText(String.valueOf(Math.sqrt(Double.parseDouble(tMain.getText()))));
        }
    }//GEN-LAST:event_bFracActionPerformed

    private void bPercActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPercActionPerformed
        if (tot != 0.0 && !tMain.getText().isEmpty()) {
            tMain.setText(String.valueOf(tot * Double.parseDouble(tMain.getText()) / 100));
            clrScrn();
        }
    }//GEN-LAST:event_bPercActionPerformed

    private void bEqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEqActionPerformed
        setNormalOp(bEq);
        tSub.setText(null);
        oper = null;
        tot = 0.0;
        oprtr = false;
        clrScrn();
        exp = false;
    }//GEN-LAST:event_bEqActionPerformed

    private void bUnderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bUnderActionPerformed
        if (!tMain.getText().isEmpty()) {
            tMain.setText(String.valueOf(1 / (Double.parseDouble(tMain.getText()))));
        }
    }//GEN-LAST:event_bUnderActionPerformed

    private void bMulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMulActionPerformed
    }//GEN-LAST:event_bMulActionPerformed

    private void tbInvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbInvActionPerformed
        if (tbInv.isSelected()) {
            setInverse();
        } else {
            setDeinverse();
        }
    }//GEN-LAST:event_tbInvActionPerformed

    private void bIcosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bIcosActionPerformed
        if (!tMain.getText().isEmpty()) {
            double rad_value = Double.parseDouble(tMain.getText());
            double converted = convertToRad(Math.acos(rad_value));


            tMain.setText(String.valueOf(converted));

            oprtr = false;
            clrScrn();
        }
    }//GEN-LAST:event_bIcosActionPerformed

    private void bOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bOneActionPerformed
    }//GEN-LAST:event_bOneActionPerformed

    private void bPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPlusActionPerformed
    }//GEN-LAST:event_bPlusActionPerformed

    private void bZeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bZeroActionPerformed
    }//GEN-LAST:event_bZeroActionPerformed

    private void bSignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSignActionPerformed
        if (!tMain.getText().equals("0")) {
            String text = String.valueOf(Double.parseDouble(tMain.getText()) * -1);
            while (true) {
                if (text.charAt(text.length() - 1) == '0' || text.charAt(text.length() - 1) == '.') {
                    text = text.substring(0, text.length() - 1);
                    continue;
                } else {
                    break;
                }
            }
            tMain.setText(text);
        }
    }//GEN-LAST:event_bSignActionPerformed

    private void bCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCActionPerformed
        tMain.setText("0");
        tSub.setText(null);
        tot = 0.0;
        ev = false;
        yroot = 0.0;
        oper = null;
        oprtr = false;
        exp = false;
    }//GEN-LAST:event_bCActionPerformed

    private void bCeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCeActionPerformed
        tMain.setText("0");
    }//GEN-LAST:event_bCeActionPerformed

    private void bDotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDotActionPerformed
        if (oprtr) {
            tMain.setText("0.");
            oprtr = false;
        } else if (tMain.getText().contains(".")) {
            JOptionPane.showMessageDialog(null, "Error..Cannot add decimal point to a fractional value.");
        } else {
            tMain.setText(tMain.getText() + ".");
            oprtr = false;
        }
    }//GEN-LAST:event_bDotActionPerformed

    private void bLnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLnActionPerformed
        if (!tMain.getText().isEmpty()) {
            if (Double.parseDouble(tMain.getText()) <= 0) {
                JOptionPane.showMessageDialog(null, "Invalid argument passed through ln.");
            } else {
                tMain.setText(String.valueOf(Math.log(Double.parseDouble(tMain.getText()))));
                oprtr = false;
                clrScrn();
            }
        }
    }//GEN-LAST:event_bLnActionPerformed

    private void bIlnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bIlnActionPerformed
        if (!tMain.getText().isEmpty()) {

            tMain.setText(String.valueOf(Math.exp(Double.parseDouble(tMain.getText()))));
            oprtr = false;
            clrScrn();
        }
    }//GEN-LAST:event_bIlnActionPerformed

    private void bIntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bIntActionPerformed
        if (!tMain.getText().isEmpty()) {

            tMain.setText(String.valueOf((long) (Double.parseDouble(tMain.getText()))));
            oprtr = false;
            clrScrn();
        }
    }//GEN-LAST:event_bIntActionPerformed

    private void bSinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSinhActionPerformed
        if (!tMain.getText().isEmpty()) {

            tMain.setText(String.valueOf(Math.sinh(Double.parseDouble(tMain.getText()))));
            oprtr = false;
            clrScrn();
        }
    }//GEN-LAST:event_bSinhActionPerformed

    private void bSinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSinActionPerformed
        if (!tMain.getText().isEmpty()) {
            double rad_value = checkRad(tMain.getText());



            tMain.setText(String.valueOf(Math.sin(rad_value)));

            oprtr = false;
            clrScrn();
        }
    }//GEN-LAST:event_bSinActionPerformed

    private void bXsqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bXsqActionPerformed
        if (!tMain.getText().isEmpty()) {

            tMain.setText(String.valueOf(Math.pow(Double.parseDouble(tMain.getText()), 2.0)));
            oprtr = false;
            clrScrn();
        }
    }//GEN-LAST:event_bXsqActionPerformed

    private void bNfacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bNfacActionPerformed
        /***********************************************************
         *FINDING FACTORIAL IS EXACT ONLY FOR ONE PRECISION VALUE.**
         *TRY TO IMPROVE THIS CODE SEGMENT & INFORM THE AUTHOR.   **
         *          r2rusiru@gmail.com or +94783885152            **
         * ********************************************************/
        if (!tMain.getText().isEmpty()) {
            double val = Double.parseDouble(tMain.getText());
            double sum = 1;
            if (tMain.getText().lastIndexOf(".") != -1) {
                String c = String.valueOf(tMain.getText().charAt(tMain.getText().lastIndexOf(".") + 1));
                int k = Integer.parseInt(c);
                if (k != 0) {
                    double FACT_9 = 0.96176583190738741940757480212503;
                    double FACT_8 = 0.93138377098024269890905675061477;
                    double FACT_7 = 0.90863873285329044997681982540697;
                    double FACT_6 = 0.89351534928769026143660003299281;
                    double FACT_5 = 0.88622692545275801364908374167057;
                    double FACT_4 = 0.88726381750307528922362160876307;
                    double FACT_3 = 0.89747069630627718849375495477148;
                    double FACT_2 = 0.91816874239976061064095165518583;
                    double FACT_1 = 0.95135076986687318362924871772654;

                    switch (k) {
                        case 1:
                            sum *= FACT_1;
                            break;
                        case 2:
                            sum *= FACT_2;
                            break;
                        case 3:
                            sum *= FACT_3;
                            break;
                        case 4:
                            sum *= FACT_4;
                            break;
                        case 5:
                            sum *= FACT_5;
                            break;
                        case 6:
                            sum *= FACT_6;
                            break;
                        case 7:
                            sum *= FACT_7;
                            break;
                        case 8:
                            sum *= FACT_8;
                            break;
                        case 9:
                            sum *= FACT_9;
                            break;
                        default:
                            System.out.println("error");

                    }
                }
            }
            for (double i = val; i > 1; i--) {
                sum *= i;
                System.out.println("i=" + i + "-sum=" + sum);
            }



            tMain.setText(String.valueOf(sum));
            oprtr = false;
            clrScrn();
        }
    }//GEN-LAST:event_bNfacActionPerformed
    double yroot;
    boolean ev;
    private void bXyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bXyActionPerformed
        if (!tMain.getText().isEmpty()) {
            yroot = Double.parseDouble(tMain.getText());
            if (evt == null) {
                ev = false;
                tSub.setText(tSub.getText() + " " + tMain.getText() + " " + "^");
            } else {
                ev = true;
                tSub.setText(tSub.getText() + " " + tMain.getText() + " " + "yroot");
            }
            oprtr = true;
        }
    }//GEN-LAST:event_bXyActionPerformed

    private void bXpwryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bXpwryActionPerformed
        bXyActionPerformed(null);
    }//GEN-LAST:event_bXpwryActionPerformed

    private void bCoshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCoshActionPerformed
        if (!tMain.getText().isEmpty()) {

            tMain.setText(String.valueOf(Math.cosh(Double.parseDouble(tMain.getText()))));
            oprtr = false;
            clrScrn();
        }

    }//GEN-LAST:event_bCoshActionPerformed

    private void bFiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bFiActionPerformed
        tMain.setText(String.valueOf(Math.PI));
        oprtr = false;
    }//GEN-LAST:event_bFiActionPerformed

    private void bFeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bFeActionPerformed
        if (bFe.isSelected()) {
            tMain.setText(convertStandard(tMain.getText()));
        } else {
            convertNormal(tMain.getText());
        }
    }//GEN-LAST:event_bFeActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
    }//GEN-LAST:event_formMouseClicked

    private void bTanhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTanhActionPerformed
        if (!tMain.getText().isEmpty()) {

            tMain.setText(String.valueOf(Math.tanh(Double.parseDouble(tMain.getText()))));
            oprtr = false;
            clrScrn();
        }
    }//GEN-LAST:event_bTanhActionPerformed

    private void bTanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTanActionPerformed
        if (!tMain.getText().isEmpty()) {
            double rad_value = checkRad(tMain.getText());



            tMain.setText(String.valueOf(Math.tan(rad_value)));

            oprtr = false;
            clrScrn();
        }
    }//GEN-LAST:event_bTanActionPerformed

    private void bXthreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bXthreeActionPerformed
        if (!tMain.getText().isEmpty()) {

            tMain.setText(String.valueOf(Math.pow(Double.parseDouble(tMain.getText()), 3.0)));
            oprtr = false;
            clrScrn();
        }
    }//GEN-LAST:event_bXthreeActionPerformed

    private void bThreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bThreeActionPerformed
        if (!tMain.getText().isEmpty()) {

            tMain.setText(String.valueOf(Math.pow(Double.parseDouble(tMain.getText()), 1 / 3.0)));
            oprtr = false;
            clrScrn();
        }
    }//GEN-LAST:event_bThreeActionPerformed

    private void bItanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bItanActionPerformed
        if (!tMain.getText().isEmpty()) {
            double rad_value = Double.parseDouble(tMain.getText());
            double converted = convertToRad(Math.atan(rad_value));


            tMain.setText(String.valueOf(converted));

            oprtr = false;
            clrScrn();
        }
    }//GEN-LAST:event_bItanActionPerformed

    private void bIcoshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bIcoshActionPerformed
        if (!tMain.getText().isEmpty()) {
            double rad_value = Double.parseDouble(tMain.getText());
            rad_value = Math.log(rad_value + Math.sqrt(Math.pow(rad_value, 2) - 1));


            tMain.setText(String.valueOf(rad_value));

            oprtr = false;
            clrScrn();
        }
    }//GEN-LAST:event_bIcoshActionPerformed

    private void bIsinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bIsinhActionPerformed
        if (!tMain.getText().isEmpty()) {
            double rad_value = Double.parseDouble(tMain.getText());
            rad_value = Math.log(rad_value + Math.sqrt(Math.pow(rad_value, 2) + 1));


            tMain.setText(String.valueOf(rad_value));

            oprtr = false;
            clrScrn();
        }
    }//GEN-LAST:event_bIsinhActionPerformed

    private void bIsinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bIsinActionPerformed
        if (!tMain.getText().isEmpty()) {
            double rad_value = Double.parseDouble(tMain.getText());
            double converted = convertToRad(Math.asin(rad_value));


            tMain.setText(String.valueOf(converted));

            oprtr = false;
            clrScrn();
        }
    }//GEN-LAST:event_bIsinActionPerformed

    private void bDmsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDmsActionPerformed
        if (!tMain.getText().isEmpty()) {
            double val = Double.parseDouble(tMain.getText());
            long in = (long) val;
            double part = val % 1;
            val = (in * 100 + part * 60) / 100;
            tMain.setText(String.valueOf(val));
            clrScrn();
        }
    }//GEN-LAST:event_bDmsActionPerformed

    private void bIdmsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bIdmsActionPerformed
        if (!tMain.getText().isEmpty()) {
            double val = Double.parseDouble(tMain.getText());
            long in = (long) val;
            double part = val % 1;
            val = (in * 60 + part * 100) / 60;
            tMain.setText(String.valueOf(val));
            clrScrn();
        }
    }//GEN-LAST:event_bIdmsActionPerformed

    private void bIintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bIintActionPerformed
        if (!tMain.getText().isEmpty()) {
            double val = Double.parseDouble(tMain.getText());

            tMain.setText(String.valueOf(val % 1));
            clrScrn();
        }
    }//GEN-LAST:event_bIintActionPerformed

    private void bIfiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bIfiActionPerformed
        tMain.setText(String.valueOf(2 * Math.PI));
        oprtr = false;
    }//GEN-LAST:event_bIfiActionPerformed

    private void bLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLogActionPerformed
        if (!tMain.getText().isEmpty()) {
            if (Double.parseDouble(tMain.getText()) <= 0) {
                JOptionPane.showMessageDialog(null, "Invalid argument passed through ln.");
            } else {
                tMain.setText(String.valueOf(Math.log10(Double.parseDouble(tMain.getText()))));
                oprtr = false;
                clrScrn();
            }
        }
    }//GEN-LAST:event_bLogActionPerformed

    private void bTenxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTenxActionPerformed
        if (!tMain.getText().isEmpty()) {

            tMain.setText(String.valueOf(Math.pow(10.0, Double.parseDouble(tMain.getText()))));
            oprtr = false;
            clrScrn();
        }
    }//GEN-LAST:event_bTenxActionPerformed

    private void bItanhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bItanhActionPerformed
        if (!tMain.getText().isEmpty()) {
            double val = Double.parseDouble(tMain.getText());
            val = Math.log((val + 1) / (1 - val)) / 2;
            tMain.setText(String.valueOf(val));
            oprtr = false;
            clrScrn();
        }
    }//GEN-LAST:event_bItanhActionPerformed
    boolean exp;
    private void bExpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bExpActionPerformed
        exp = true;
        if (tMain.getText().contains(".")) {
            tMain.setText(tMain.getText() + "E+0");
        } else {
            tMain.setText(tMain.getText() + ".E+0");
        }
    }//GEN-LAST:event_bExpActionPerformed

    private void bBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBackActionPerformed
        if (!tMain.getText().isEmpty() && tMain.getText().length() > 1) {

            tMain.setText(tMain.getText().substring(0, tMain.getText().length() - 1));
        } else if (tMain.getText().length() == 1) {
            tMain.setText("0");
        } else {
            tMain.setText("0");
        }
    }//GEN-LAST:event_bBackActionPerformed

    private void bMcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMcActionPerformed
        memory = null;
        jLabel2.setVisible(false);
    }//GEN-LAST:event_bMcActionPerformed

    private void bMrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMrActionPerformed
        if (memory != null) {
            tMain.setText(memory);
            oprtr = true;
        }
    }//GEN-LAST:event_bMrActionPerformed

    private void bMsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMsActionPerformed
        if (!tMain.getText().isEmpty()) {
            memory = tMain.getText();
            jLabel2.setVisible(true);
            oprtr = true;
        }
    }//GEN-LAST:event_bMsActionPerformed

    private void tMainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tMainActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tMainActionPerformed

    private void bMplusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMplusActionPerformed
        if (!tMain.getText().isEmpty()) {
            memory = tMain.getText();
            jLabel2.setVisible(true);
            oprtr = true;
        }
    }//GEN-LAST:event_bMplusActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new CAL().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bBack;
    private javax.swing.JButton bBracClose;
    private javax.swing.JButton bBracOpen;
    private javax.swing.JButton bC;
    private javax.swing.JButton bCe;
    private javax.swing.JButton bCos;
    private javax.swing.JButton bCosh;
    private javax.swing.JButton bDiv;
    private javax.swing.JButton bDms;
    private javax.swing.JButton bDot;
    private javax.swing.JButton bEight;
    private javax.swing.JButton bEq;
    private javax.swing.JButton bExp;
    private javax.swing.JToggleButton bFe;
    private javax.swing.JButton bFi;
    private javax.swing.JButton bFive;
    private javax.swing.JButton bFour;
    private javax.swing.JButton bFrac;
    private javax.swing.JButton bIcos;
    private javax.swing.JButton bIcosh;
    private javax.swing.JButton bIdms;
    private javax.swing.JButton bIfi;
    private javax.swing.JButton bIint;
    private javax.swing.JButton bIln;
    private javax.swing.JButton bInt;
    private javax.swing.JButton bIsin;
    private javax.swing.JButton bIsinh;
    private javax.swing.JButton bItan;
    private javax.swing.JButton bItanh;
    private javax.swing.JButton bLn;
    private javax.swing.JButton bLog;
    private javax.swing.JButton bMc;
    private javax.swing.JButton bMin;
    private javax.swing.JButton bMmin;
    private javax.swing.JButton bMod;
    private javax.swing.JButton bMplus;
    private javax.swing.JButton bMr;
    private javax.swing.JButton bMs;
    private javax.swing.JButton bMul;
    private javax.swing.JButton bNfac;
    private javax.swing.JButton bNine;
    private javax.swing.JButton bNone;
    private javax.swing.JButton bOne;
    private javax.swing.JButton bPerc;
    private javax.swing.JButton bPlus;
    private javax.swing.JButton bSev;
    private javax.swing.JButton bSign;
    private javax.swing.JButton bSin;
    private javax.swing.JButton bSinh;
    private javax.swing.JButton bSix;
    private javax.swing.JButton bTan;
    private javax.swing.JButton bTanh;
    private javax.swing.JButton bTenx;
    private javax.swing.JButton bThree;
    private javax.swing.JButton bTree;
    private javax.swing.JButton bTwo;
    private javax.swing.JButton bUnder;
    private javax.swing.JButton bXpwry;
    private javax.swing.JButton bXsq;
    private javax.swing.JButton bXthree;
    private javax.swing.JButton bXy;
    private javax.swing.JButton bZero;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel pExtra;
    private javax.swing.JPanel pMainNum;
    private javax.swing.JPanel pRadian;
    private javax.swing.JPanel pSub;
    private javax.swing.JPanel pText;
    private javax.swing.JRadioButton rDegree;
    private javax.swing.JRadioButton rGrad;
    private javax.swing.JRadioButton rRadian;
    private javax.swing.JTextField tMain;
    private javax.swing.JTextField tSub;
    private javax.swing.JToggleButton tbInv;
    // End of variables declaration//GEN-END:variables
    private ActionListener normalOpPress = new ActionListener() {

        public void actionPerformed(ActionEvent e) {
            setNormalOp(e.getSource());
        }
    };
    private ActionListener numButPress = new ActionListener() {

        public void actionPerformed(ActionEvent e) {
            setNumber(e.getSource());
        }
    };
    private boolean oprtr;
    private double tot;
    private String oper;
    private String opernd1;
    private String memory;

    private void setInverse() {
        bLn.setVisible(false);
        bSin.setVisible(false);
        bSinh.setVisible(false);
        bInt.setVisible(false);
        bDms.setVisible(false);
        bCosh.setVisible(false);
        bCos.setVisible(false);
        bTan.setVisible(false);
        bTanh.setVisible(false);
        bFi.setVisible(false);

        bIln.setVisible(true);
        bIsin.setVisible(true);
        bIsinh.setVisible(true);
        bIint.setVisible(true);
        bIdms.setVisible(true);
        bIcosh.setVisible(true);
        bIcos.setVisible(true);
        bItan.setVisible(true);
        bItanh.setVisible(true);
        bIfi.setVisible(true);
    }

    private void setDeinverse() {
        bLn.setVisible(true);
        bSin.setVisible(true);
        bSinh.setVisible(true);
        bInt.setVisible(true);
        bDms.setVisible(true);
        bCosh.setVisible(true);
        bCos.setVisible(true);
        bTan.setVisible(true);
        bTanh.setVisible(true);
        bFi.setVisible(true);

        bIln.setVisible(false);
        bIsin.setVisible(false);
        bIsinh.setVisible(false);
        bIint.setVisible(false);
        bIdms.setVisible(false);
        bIcosh.setVisible(false);
        bIcos.setVisible(false);
        bItan.setVisible(false);
        bItanh.setVisible(false);
        bIfi.setVisible(false);
    }

    private void setNormalOp(Object source) {
        exp = false;
        if (!oprtr || memory != null) {
            JButton but = (JButton) source;
            if (yroot != 0.0) {
                double new_val;
                if (ev) {
                    new_val = Math.pow(yroot, 1 / Double.parseDouble(tMain.getText()));
                } else {
                    new_val = Math.pow(yroot, Double.parseDouble(tMain.getText()));
                }
                calculate(oper, String.valueOf(new_val));
                opernd1 = String.valueOf(tot);
                ev = false;
                yroot = 0.0;

            } else {
                opernd1 = tMain.getText();
                if (oper != null) {
                    calculate(oper, opernd1);
                } else {
                    tot = Double.parseDouble(opernd1);
                }
            }



            oper = but.getText();
            tSub.setText(tSub.getText() + " " + tMain.getText() + " " + oper);
            tMain.setText(String.valueOf(tot));
            clrScrn();

            oprtr = true;
        } else if (source.equals(bEq)) {
            calculate(oper, tMain.getText());
        } else {
            oper = ((JButton) source).getText();
            tSub.setText(tSub.getText().substring(0, tSub.getText().length() - 1) + oper);
        }
    }

    private void clrScrn() {

        Double tt = Double.parseDouble(tMain.getText());
        double ext = tt % 1;

        if (ext == 0.0) {
            tMain.setText(String.valueOf(tt.longValue()));
        } else {

            tMain.setText(String.valueOf(tt));
            if (tMain.getText().charAt(tMain.getText().length() - 1) == '0') {
                tMain.setText(tMain.getText().substring(0, tMain.getText().length() - 1));
            }
        }
        if (bFe.isSelected()) {
            tMain.setText(convertStandard(tMain.getText()));
        } else {
            convertNormal(tMain.getText());
        }

    }

    private void setNumber(Object source) {
        JButton button = (JButton) source;
        if (button != null) {
            if (exp) {
                if (tMain.getText().charAt(tMain.getText().length() - 1) == '0') {
                    tMain.setText(tMain.getText().substring(0, tMain.getText().length() - 1) + button.getText());
                } else {
                    tMain.setText(tMain.getText() + button.getText());
                }
            } else if (tMain.getText().equals("0") || oprtr) {
                tMain.setText(button.getText());
                oprtr = false;
            } else {
                tMain.setText(tMain.getText() + button.getText());
            }


        }
    }

    private void setListners() {
        bOne.addActionListener(numButPress);
        bTwo.addActionListener(numButPress);

        bTree.addActionListener(numButPress);
        bFour.addActionListener(numButPress);
        bFive.addActionListener(numButPress);
        bSix.addActionListener(numButPress);
        bSev.addActionListener(numButPress);
        bEight.addActionListener(numButPress);
        bNine.addActionListener(numButPress);
        bZero.addActionListener(numButPress);

        bPlus.addActionListener(normalOpPress);
        bMin.addActionListener(normalOpPress);
        bMul.addActionListener(normalOpPress);
        bDiv.addActionListener(normalOpPress);
        bMod.addActionListener(normalOpPress);
    }

    private void calculate(String oper, String opernd1) {
        if (oper != null && opernd1 != null) {

            char op = oper.charAt(0);
            switch (op) {
                case '+':

                    tot += Double.parseDouble(opernd1);
                    break;
                case '-':
                    tot -= Double.parseDouble(opernd1);
                    break;
                case '*':
                    tot *= Double.parseDouble(opernd1);
                    break;
                case '/':
                    tot /= Double.parseDouble(opernd1);
                    break;
                case 'M':
                    tot %= Double.parseDouble(opernd1);
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Error occured.");
                    System.exit(1);

            }
            oper = null;
        } else {

            tot = Double.parseDouble(opernd1);

        }
    }

    private String convertStandard(String text) {
        double val = Double.parseDouble(text);
        int i;
        if (val < 0.001) {
            text = String.valueOf(val);
        } else if (val >= 0.001 && val < 1) {
            for (i = 0; val < 1; i++) {
                val *= 10;
            }
            text = String.valueOf(val) + "E-" + String.valueOf(i);
        } else {
            for (i = 0; val > 10; i++) {
                val /= 10;
            }
            text = String.valueOf(val) + "E+" + String.valueOf(i);
        }
        return text;
    }

    private void convertNormal(String text) {
        tMain.setText(String.valueOf(Double.parseDouble(text)));
        Double tt = Double.parseDouble(tMain.getText());
        double ext = tt % 1;
        if (ext == 0.0) {
            tMain.setText(String.valueOf(tt.longValue()));
        } else {

            tMain.setText(String.valueOf(tt));
            if (tMain.getText().charAt(tMain.getText().length() - 1) == '0') {
                tMain.setText(tMain.getText().substring(0, tMain.getText().length() - 1));
            }
        }
    }

    private double checkRad(String text) {
        double rad_value = 0.0;
        if (rRadian.isSelected()) {
            rad_value = Double.parseDouble(text);
        } else if (rDegree.isSelected()) {
            rad_value = Math.toRadians(Double.parseDouble(text));
        } else {
            rad_value = (Math.PI / 200) * (Double.parseDouble(text));
        }
        return rad_value;

    }

    private double convertToRad(double asin) {
        double rad_value = 0.0;
        if (rRadian.isSelected()) {
            rad_value = asin;
        } else if (rDegree.isSelected()) {
            rad_value = Math.toDegrees(asin);
        } else {
            rad_value = asin * (200 / Math.PI);
        }
        return rad_value;
    }
}
