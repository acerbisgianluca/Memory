/*
 * The MIT License
 *
 * Copyright 2017 Acerbis Gianluca <acerbisgianluca.com>.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package Memory;

import com.acerbisgianluca.filemanager.FileManager;
import java.awt.Image;
import java.io.File;
//import java.io.FileOutputStream;
import java.io.IOException;
//import java.io.ObjectOutputStream;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author Gianluca
 */
public class Game extends javax.swing.JFrame {
    
    Start start;
    
    private final ImageIcon[] icons;
    private final ImageIcon winner;
    private Image logo;
    
    private final JButton[] buttons;
    
    private GameManager gm;
    
    private Points points;
    
    /**
     * Creates new form Game
     * @param gm
     * @param start
     * @param backup
     */
    public Game(GameManager gm, Start start, boolean backup) {
        initComponents();
        
        this.start = start;
        
        this.gm = gm;
        
        points = new Points(this.gm);
        
        icons = new ImageIcon[(gm.getN_CARDS() / 2) + 1];
        genIcon();
        
        winner = new ImageIcon(getClass().getResource("/Memory/img/winner.gif"));
        
        try {
            logo = ImageIO.read(getClass().getResource("/Memory/img/logo.png"));
        } catch (IOException ex) {
            Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
        }
        setIconImage(logo);
        
        buttons = new JButton[] {btnCard1, btnCard2, btnCard3, btnCard4, btnCard5, btnCard6, btnCard7, btnCard8, btnCard9, btnCard10, btnCard11, btnCard12, btnCard13, btnCard14, btnCard15, btnCard16};
        
        if(backup){
            for(int i = 0; i < gm.getN_CARDS(); i++)
                if(!gm.getDeck().findCard(i).isEnabled()){
                    buttons[i].setEnabled(false);
                    buttons[i].setIcon(icons[gm.getDeck().findCard(i).getCode()]);
                }
            points.restore();
        }
        
        gm.getDeck().debug();
        
        update();
    }
    
    private void genIcon() {
        int i;
        
        for(i = 0; i < (gm.getN_CARDS() / 2) + 1; i++)
            icons[i] = new ImageIcon(getClass().getResource("/Memory/img/" + i + ".jpg"));
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        btnCard1 = new javax.swing.JButton();
        btnCard2 = new javax.swing.JButton();
        btnCard3 = new javax.swing.JButton();
        btnCard4 = new javax.swing.JButton();
        btnCard5 = new javax.swing.JButton();
        btnCard6 = new javax.swing.JButton();
        btnCard7 = new javax.swing.JButton();
        btnCard8 = new javax.swing.JButton();
        btnCard9 = new javax.swing.JButton();
        btnCard10 = new javax.swing.JButton();
        btnCard11 = new javax.swing.JButton();
        btnCard12 = new javax.swing.JButton();
        btnCard13 = new javax.swing.JButton();
        btnCard14 = new javax.swing.JButton();
        btnCard15 = new javax.swing.JButton();
        btnCard16 = new javax.swing.JButton();
        lblPlayer1 = new javax.swing.JLabel();
        lblPlayer2 = new javax.swing.JLabel();
        lblTurno = new javax.swing.JLabel();
        lblPlayer1Round = new javax.swing.JLabel();
        lblPlayer2Round = new javax.swing.JLabel();
        lblReset = new javax.swing.JLabel();
        progressBar = new javax.swing.JProgressBar();
        menuBar = new javax.swing.JMenuBar();
        menuElement = new javax.swing.JMenu();
        menuPoints = new javax.swing.JMenuItem();
        menuReset = new javax.swing.JMenuItem();
        menuRestart = new javax.swing.JMenuItem();
        menuSave = new javax.swing.JMenuItem();
        menuExit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Memory: Overwatch Edition");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImages(null);

        panel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCard1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        btnCard1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Memory/img/8.jpg"))); // NOI18N
        btnCard1.setPreferredSize(new java.awt.Dimension(100, 100));
        btnCard1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCard1ActionPerformed(evt);
            }
        });
        panel.add(btnCard1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 99, -1, 150));

        btnCard2.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        btnCard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Memory/img/8.jpg"))); // NOI18N
        btnCard2.setPreferredSize(new java.awt.Dimension(100, 100));
        btnCard2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCard2ActionPerformed(evt);
            }
        });
        panel.add(btnCard2, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 99, -1, 150));

        btnCard3.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        btnCard3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Memory/img/8.jpg"))); // NOI18N
        btnCard3.setPreferredSize(new java.awt.Dimension(100, 100));
        btnCard3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCard3ActionPerformed(evt);
            }
        });
        panel.add(btnCard3, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 99, -1, 150));

        btnCard4.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        btnCard4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Memory/img/8.jpg"))); // NOI18N
        btnCard4.setPreferredSize(new java.awt.Dimension(100, 100));
        btnCard4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCard4ActionPerformed(evt);
            }
        });
        panel.add(btnCard4, new org.netbeans.lib.awtextra.AbsoluteConstraints(364, 99, -1, 150));

        btnCard5.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        btnCard5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Memory/img/8.jpg"))); // NOI18N
        btnCard5.setPreferredSize(new java.awt.Dimension(100, 100));
        btnCard5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCard5ActionPerformed(evt);
            }
        });
        panel.add(btnCard5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 267, -1, 150));

        btnCard6.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        btnCard6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Memory/img/8.jpg"))); // NOI18N
        btnCard6.setPreferredSize(new java.awt.Dimension(100, 100));
        btnCard6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCard6ActionPerformed(evt);
            }
        });
        panel.add(btnCard6, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 267, -1, 150));

        btnCard7.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        btnCard7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Memory/img/8.jpg"))); // NOI18N
        btnCard7.setPreferredSize(new java.awt.Dimension(100, 100));
        btnCard7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCard7ActionPerformed(evt);
            }
        });
        panel.add(btnCard7, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 267, -1, 150));

        btnCard8.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        btnCard8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Memory/img/8.jpg"))); // NOI18N
        btnCard8.setPreferredSize(new java.awt.Dimension(100, 100));
        btnCard8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCard8ActionPerformed(evt);
            }
        });
        panel.add(btnCard8, new org.netbeans.lib.awtextra.AbsoluteConstraints(364, 267, -1, 150));

        btnCard9.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        btnCard9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Memory/img/8.jpg"))); // NOI18N
        btnCard9.setPreferredSize(new java.awt.Dimension(100, 100));
        btnCard9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCard9ActionPerformed(evt);
            }
        });
        panel.add(btnCard9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 435, -1, 150));

        btnCard10.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        btnCard10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Memory/img/8.jpg"))); // NOI18N
        btnCard10.setPreferredSize(new java.awt.Dimension(100, 100));
        btnCard10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCard10ActionPerformed(evt);
            }
        });
        panel.add(btnCard10, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 435, -1, 150));

        btnCard11.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        btnCard11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Memory/img/8.jpg"))); // NOI18N
        btnCard11.setPreferredSize(new java.awt.Dimension(100, 100));
        btnCard11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCard11ActionPerformed(evt);
            }
        });
        panel.add(btnCard11, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 435, -1, 150));

        btnCard12.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        btnCard12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Memory/img/8.jpg"))); // NOI18N
        btnCard12.setPreferredSize(new java.awt.Dimension(100, 100));
        btnCard12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCard12ActionPerformed(evt);
            }
        });
        panel.add(btnCard12, new org.netbeans.lib.awtextra.AbsoluteConstraints(364, 435, -1, 150));

        btnCard13.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        btnCard13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Memory/img/8.jpg"))); // NOI18N
        btnCard13.setPreferredSize(new java.awt.Dimension(100, 100));
        btnCard13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCard13ActionPerformed(evt);
            }
        });
        panel.add(btnCard13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 603, -1, 150));

        btnCard14.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        btnCard14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Memory/img/8.jpg"))); // NOI18N
        btnCard14.setPreferredSize(new java.awt.Dimension(100, 100));
        btnCard14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCard14ActionPerformed(evt);
            }
        });
        panel.add(btnCard14, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 603, -1, 150));

        btnCard15.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        btnCard15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Memory/img/8.jpg"))); // NOI18N
        btnCard15.setPreferredSize(new java.awt.Dimension(100, 100));
        btnCard15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCard15ActionPerformed(evt);
            }
        });
        panel.add(btnCard15, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 603, -1, 150));

        btnCard16.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        btnCard16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Memory/img/8.jpg"))); // NOI18N
        btnCard16.setPreferredSize(new java.awt.Dimension(100, 100));
        btnCard16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCard16ActionPerformed(evt);
            }
        });
        panel.add(btnCard16, new org.netbeans.lib.awtextra.AbsoluteConstraints(364, 603, -1, 150));

        lblPlayer1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblPlayer1.setText("Punteggio giocatore 1:");
        panel.add(lblPlayer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 13, -1, -1));

        lblPlayer2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblPlayer2.setText("Punteggio giocatore 2:");
        panel.add(lblPlayer2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        lblTurno.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblTurno.setForeground(new java.awt.Color(255, 0, 0));
        lblTurno.setText("Turno giocatore:");
        panel.add(lblTurno, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 74, -1, -1));

        lblPlayer1Round.setText("Round vinti da 1: 0");
        panel.add(lblPlayer1Round, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 15, -1, -1));

        lblPlayer2Round.setText("Round vinti da 2: 0");
        panel.add(lblPlayer2Round, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 42, -1, -1));

        lblReset.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblReset.setForeground(new java.awt.Color(0, 0, 255));
        lblReset.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblReset.setName(""); // NOI18N
        panel.add(lblReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 74, -1, -1));

        progressBar.setMaximum(8);
        progressBar.setString("0/8");
        progressBar.setStringPainted(true);
        panel.add(progressBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 180, -1));

        menuElement.setText("Opzioni");

        menuPoints.setText("Mostra punteggi");
        menuPoints.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPointsActionPerformed(evt);
            }
        });
        menuElement.add(menuPoints);

        menuReset.setText("Ricomincia");
        menuReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuResetActionPerformed(evt);
            }
        });
        menuElement.add(menuReset);

        menuRestart.setText("Scegli giocatori");
        menuRestart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRestartActionPerformed(evt);
            }
        });
        menuElement.add(menuRestart);

        menuSave.setText("Salva la partita");
        menuSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSaveActionPerformed(evt);
            }
        });
        menuElement.add(menuSave);

        menuExit.setText("Esci");
        menuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuExitActionPerformed(evt);
            }
        });
        menuElement.add(menuExit);

        menuBar.add(menuElement);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 765, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCard1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCard1ActionPerformed
        pressButton(btnCard1, 0);
    }//GEN-LAST:event_btnCard1ActionPerformed

    private void btnCard4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCard4ActionPerformed
        pressButton(btnCard4, 3);
    }//GEN-LAST:event_btnCard4ActionPerformed

    private void btnCard11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCard11ActionPerformed
        pressButton(btnCard11, 10);
    }//GEN-LAST:event_btnCard11ActionPerformed

    private void btnCard2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCard2ActionPerformed
        pressButton(btnCard2, 1);
    }//GEN-LAST:event_btnCard2ActionPerformed

    private void btnCard3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCard3ActionPerformed
        pressButton(btnCard3, 2);
    }//GEN-LAST:event_btnCard3ActionPerformed

    private void btnCard5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCard5ActionPerformed
        pressButton(btnCard5, 4);
    }//GEN-LAST:event_btnCard5ActionPerformed

    private void btnCard6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCard6ActionPerformed
        pressButton(btnCard6, 5);
    }//GEN-LAST:event_btnCard6ActionPerformed

    private void btnCard7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCard7ActionPerformed
        pressButton(btnCard7, 6);
    }//GEN-LAST:event_btnCard7ActionPerformed

    private void btnCard8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCard8ActionPerformed
        pressButton(btnCard8, 7);
    }//GEN-LAST:event_btnCard8ActionPerformed

    private void btnCard9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCard9ActionPerformed
        pressButton(btnCard9, 8);
    }//GEN-LAST:event_btnCard9ActionPerformed

    private void btnCard10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCard10ActionPerformed
        pressButton(btnCard10, 9);
    }//GEN-LAST:event_btnCard10ActionPerformed

    private void btnCard12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCard12ActionPerformed
        pressButton(btnCard12, 11);
    }//GEN-LAST:event_btnCard12ActionPerformed

    private void btnCard13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCard13ActionPerformed
        pressButton(btnCard13, 12);
    }//GEN-LAST:event_btnCard13ActionPerformed

    private void btnCard14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCard14ActionPerformed
        pressButton(btnCard14, 13);
    }//GEN-LAST:event_btnCard14ActionPerformed

    private void btnCard15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCard15ActionPerformed
        pressButton(btnCard15, 14);
    }//GEN-LAST:event_btnCard15ActionPerformed

    private void btnCard16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCard16ActionPerformed
        pressButton(btnCard16, 15);
    }//GEN-LAST:event_btnCard16ActionPerformed

    private void menuResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuResetActionPerformed
        gm.setPlayer1Round(0);
        gm.setPlayer2Round(0);
        
        reset();
    }//GEN-LAST:event_menuResetActionPerformed

    private void menuRestartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRestartActionPerformed
        this.setVisible(false);
        if(points != null)
            points.dispose();
        dispose();
        
        start.setVisible(true);
        start.reset();
    }//GEN-LAST:event_menuRestartActionPerformed

    private void menuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuExitActionPerformed
        exit();
    }//GEN-LAST:event_menuExitActionPerformed

    private void menuSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSaveActionPerformed
        saveMatch();
    }//GEN-LAST:event_menuSaveActionPerformed

    private void menuPointsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPointsActionPerformed
        if(points.isVisible())
            points.update();
        else
            points.setVisible(true);            
    }//GEN-LAST:event_menuPointsActionPerformed

    public void pressButton(JButton button, int pos) {
        if(gm.getFirst()) {
            gm.setCard1(gm.getDeck().findCard(pos));
            button.setIcon(icons[gm.getCard1().getCode()]);
            gm.setFirst(false);
        }
        else if (gm.getUnLock() && gm.getCard1().getPos() != pos) {
            gm.setUnLock(false);
            gm.setCard2(gm.getDeck().findCard(pos));
            button.setIcon(icons[gm.getCard2().getCode()]);
            if(gm.getCard1().equals(gm.getCard2())) {
                if(gm.getPlayer1())
                    gm.setPlayer1Score(gm.getPlayer1Score() + 1);
                else
                    gm.setPlayer2Score(gm.getPlayer2Score() + 1);
                
                hideCards();
            }
            else {
                turn();
            }
        }
        
        update();
    }
    
    public void hideCards () {
        buttons[gm.getCard1().getPos()].setEnabled(false);
        buttons[gm.getCard2().getPos()].setEnabled(false);
        
        gm.getDeck().findCard(gm.getCard1().getPos()).setEnabled(false);
        gm.getDeck().findCard(gm.getCard2().getPos()).setEnabled(false);
        
        gm.setCard1(null);
        gm.setCard2(null);

        gm.setUnLock(true);
        gm.setFirst(true);
        
        if(gm.getPlayer1Score() + gm.getPlayer2Score() != 8)
            update();
    }
    
    public void turn () {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run(){
                buttons[gm.getCard1().getPos()].setIcon(icons[8]);
                buttons[gm.getCard2().getPos()].setIcon(icons[8]);
                
                gm.setCard1(null);
                gm.setCard2(null);
                gm.setPlayer1(!gm.getPlayer1());
                
                update();
                
                timer.cancel();
                
                gm.setFirst(true);
                gm.setUnLock(true);
            }
        }, 3000);
    }
    
    public void update () {
        gm.updatePoints();
        points.update();
        
        progressBar.setValue(gm.getPlayer1Score() + gm.getPlayer2Score());
        progressBar.setString(progressBar.getValue() + "/8");
        
        if(gm.getPlayer1Score() + gm.getPlayer2Score() == 8){
            if(gm.getPlayer1Score() > gm.getPlayer2Score()){
                lblPlayer1.setText("Punteggio di " + gm.getPlayer1Name() + ": " + gm.getPlayer1Score());
                gm.setPlayer1Round(gm.getPlayer1Round() + 1);
                lblPlayer1Round.setText("Round vinti da " + gm.getPlayer1Name() + ": " + gm.getPlayer1Round() + "/" + gm.getRound2win());
                if(gm.getPlayer1Round() == gm.getRound2win())
                    JOptionPane.showMessageDialog(rootPane, gm.getPlayer1Name() + " ha vinto!", "WINNER WINNER CHICKEN DINNER", JOptionPane.INFORMATION_MESSAGE, winner);
                else
                    JOptionPane.showMessageDialog(rootPane, gm.getPlayer1Name() + " ha vinto il " + (gm.getPlayer1Round() + gm.getPlayer2Round()) + "° round!", "WINNER WINNER CHICKEN DINNER", JOptionPane.INFORMATION_MESSAGE, winner);
            }
            else {
                lblPlayer2.setText("Punteggio di " + gm.getPlayer2Name() + ": " + gm.getPlayer2Score());
                gm.setPlayer2Round(gm.getPlayer2Round() + 1);
                lblPlayer2Round.setText("Round vinti da " + gm.getPlayer2Name() +": " + gm.getPlayer2Round() + "/" + gm.getRound2win());
                if(gm.getPlayer2Round() == gm.getRound2win())
                    JOptionPane.showMessageDialog(rootPane, gm.getPlayer2Name() + " ha vinto!", "WINNER WINNER CHICKEN DINNER", JOptionPane.INFORMATION_MESSAGE, winner);
                else
                    JOptionPane.showMessageDialog(rootPane, gm.getPlayer2Name() + " ha vinto il " + (gm.getPlayer1Round() + gm.getPlayer2Round()) + "° round!", "WINNER WINNER CHICKEN DINNER", JOptionPane.INFORMATION_MESSAGE, winner);
            }

            reset();
        }
        else {
            lblPlayer1.setText("Punteggio di " + gm.getPlayer1Name() + ": " + gm.getPlayer1Score());
            lblPlayer2.setText("Punteggio di " + gm.getPlayer2Name() + ": " + gm.getPlayer2Score());
            
            lblPlayer1Round.setText("Round vinti da " + gm.getPlayer1Name() +": " + gm.getPlayer1Round() + "/" + gm.getRound2win());
            lblPlayer2Round.setText("Round vinti da " + gm.getPlayer2Name() +": " + gm.getPlayer2Round() + "/" + gm.getRound2win());
            
            if(gm.getPlayer1())
                lblTurno.setText("Turno di " + gm.getPlayer1Name());
            else
                lblTurno.setText("Turno di " + gm.getPlayer2Name());
        }
    }
    
    public void reset() {
        System.out.println("");

        if(gm.getPlayer1Score() + gm.getPlayer2Score() != 8)
            points.reset();
        
        gm.getDeck().mix();
        gm.getDeck().debug();
        
        gm.setPlayer1Score(0);
        gm.setPlayer2Score(0);

        gm.setFirst(true);
        gm.setPlayer1(true);
        gm.setUnLock(true);

        gm.setCard1(null);
        gm.setCard2(null);

        if(gm.getPlayer1Round() == gm.getRound2win() || gm.getPlayer2Round() == gm.getRound2win()) {
            if(JOptionPane.showConfirmDialog(rootPane, "Vuoi ricominciare?", "PARTITA CONCLUSA", 0, 2) == 0){
                gm.setPlayer1Round(0);
                gm.setPlayer2Round(0);
            }
            else
                System.exit(0);  
            
            points.reset();
        }
        
        JOptionPane.showMessageDialog(rootPane, "Il campo è stato rigenerato!", "AVVISO", JOptionPane.INFORMATION_MESSAGE);
        
        progressBar.setValue(0);
        
        for(int i = 0; i < gm.getN_CARDS(); i++) {
            buttons[i].setEnabled(true);
            buttons[i].setIcon(icons[8]);
        }
        
        update();
    }

    public void saveMatch() {
        GameManager savedGM = new GameManager(gm);
        
        if(!savedGM.getUnLock())
            savedGM.setPlayer1(!savedGM.getPlayer1());

        savedGM.setFirst(true);
        savedGM.setUnLock(true);
        
        FileManager fm = new FileManager();
        try {
            fm.objectToFile(savedGM, "savedMatch.txt");
            JOptionPane.showMessageDialog(rootPane, "La partita è stata salvata!", "PARTITA SALVATA", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(rootPane, "C'è stato un errore durante il salvataggio della partita, riprova!", "PARTITA NON SALVATA", JOptionPane.ERROR_MESSAGE);
        }
        
        /*ObjectOutputStream stream = null;
        
        try {
            stream = new ObjectOutputStream(new FileOutputStream("savedGame.txt"));
            stream.writeObject(savedGM);
            stream.close();
            
            JOptionPane.showMessageDialog(rootPane, "La partita è stata salvata!", "PARTITA SALVATA", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(rootPane, "C'è stato un errore durante il salvataggio della partita, riprova!", "PARTITA NON SALVATA", JOptionPane.ERROR_MESSAGE);
        }*/
    }
    
    public int exit() {
        switch(JOptionPane.showConfirmDialog(rootPane, "Vuoi salvare la partita prima di uscire?", "ESCI", 1, 2)){
            case 0:
                saveMatch();
                System.exit(0);
                break;
            case 1:
                File file = new File("savedGame.txt");
                file.delete();
                System.exit(0);
                break;
        }
        
        return 0;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCard1;
    private javax.swing.JButton btnCard10;
    private javax.swing.JButton btnCard11;
    private javax.swing.JButton btnCard12;
    private javax.swing.JButton btnCard13;
    private javax.swing.JButton btnCard14;
    private javax.swing.JButton btnCard15;
    private javax.swing.JButton btnCard16;
    private javax.swing.JButton btnCard2;
    private javax.swing.JButton btnCard3;
    private javax.swing.JButton btnCard4;
    private javax.swing.JButton btnCard5;
    private javax.swing.JButton btnCard6;
    private javax.swing.JButton btnCard7;
    private javax.swing.JButton btnCard8;
    private javax.swing.JButton btnCard9;
    private javax.swing.JLabel lblPlayer1;
    private javax.swing.JLabel lblPlayer1Round;
    private javax.swing.JLabel lblPlayer2;
    private javax.swing.JLabel lblPlayer2Round;
    private javax.swing.JLabel lblReset;
    private javax.swing.JLabel lblTurno;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuElement;
    private javax.swing.JMenuItem menuExit;
    private javax.swing.JMenuItem menuPoints;
    private javax.swing.JMenuItem menuReset;
    private javax.swing.JMenuItem menuRestart;
    private javax.swing.JMenuItem menuSave;
    private javax.swing.JPanel panel;
    private javax.swing.JProgressBar progressBar;
    // End of variables declaration//GEN-END:variables
}
