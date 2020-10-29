/*
 * ProfilePage.java
 *
 * Created on __DATE__, __TIME__
 */

package FB;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.filechooser.FileNameExtensionFilter;

import org.hibernate.Transaction;

/**
 *
 * @author  __USER__
 */
public class ProfilePage extends javax.swing.JFrame {
	public static int postid = 0;
	public static int pid = -1;

	/** Creates new form ProfilePage */
	public ProfilePage() {
		initComponents();
	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jSeparator1 = new javax.swing.JSeparator();
		jSeparator2 = new javax.swing.JSeparator();
		jLabel4 = new javax.swing.JLabel();
		jTextField1 = new javax.swing.JTextField();
		jButton1 = new javax.swing.JButton();
		jLabel5 = new javax.swing.JLabel();
		jButton2 = new javax.swing.JButton();
		jSeparator3 = new javax.swing.JSeparator();
		jSeparator4 = new javax.swing.JSeparator();
		jButton3 = new javax.swing.JButton();
		jSeparator5 = new javax.swing.JSeparator();
		jSeparator6 = new javax.swing.JSeparator();
		jLabel9 = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();
		jButton4 = new javax.swing.JButton();
		jSeparator7 = new javax.swing.JSeparator();
		jLabel10 = new javax.swing.JLabel();
		jLabel7 = new javax.swing.JLabel();
		jButton5 = new javax.swing.JButton();
		jSeparator8 = new javax.swing.JSeparator();
		jLabel11 = new javax.swing.JLabel();
		jSeparator9 = new javax.swing.JSeparator();
		jLabel8 = new javax.swing.JLabel();
		jButton6 = new javax.swing.JButton();
		jLabel12 = new javax.swing.JLabel();
		jLabel13 = new javax.swing.JLabel();
		jSeparator10 = new javax.swing.JSeparator();
		jButton7 = new javax.swing.JButton();
		jLabel14 = new javax.swing.JLabel();
		jButton8 = new javax.swing.JButton();
		jButton9 = new javax.swing.JButton();
		jButton10 = new javax.swing.JButton();
		jTextField2 = new javax.swing.JTextField();
		jButton11 = new javax.swing.JButton();
		jLabel15 = new javax.swing.JLabel();
		jLabel16 = new javax.swing.JLabel();
		jLabel17 = new javax.swing.JLabel();
		jLabel18 = new javax.swing.JLabel();
		jLabel19 = new javax.swing.JLabel();
		jLabel20 = new javax.swing.JLabel();
		jLabel21 = new javax.swing.JLabel();
		jLabel22 = new javax.swing.JLabel();
		jLabel23 = new javax.swing.JLabel();
		jLabel24 = new javax.swing.JLabel();
		jButton12 = new javax.swing.JButton();
		jLabel25 = new javax.swing.JLabel();
		jLabel26 = new javax.swing.JLabel();
		jButton13 = new javax.swing.JButton();
		jLabel29 = new javax.swing.JLabel();
		jLabel27 = new javax.swing.JLabel();
		jButton14 = new javax.swing.JButton();
		jLabel30 = new javax.swing.JLabel();
		jLabel28 = new javax.swing.JLabel();
		jButton15 = new javax.swing.JButton();
		jSeparator12 = new javax.swing.JSeparator();
		jLabel31 = new javax.swing.JLabel();
		jButton16 = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setBackground(new java.awt.Color(252, 207, 221));
		setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

		jLabel1.setIcon(new javax.swing.ImageIcon(
				"C:\\Users\\aria\\Desktop\\music16.jpg")); // NOI18N

		jLabel2.setFont(new java.awt.Font("Arial", 1, 18));
		jLabel2.setText("Fname");

		jLabel3.setFont(new java.awt.Font("Arial", 1, 18));
		jLabel3.setText("Lname");

		jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

		jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14));

		jTextField1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField1ActionPerformed(evt);
			}
		});

		jButton1.setText("Post");
		jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseReleased(java.awt.event.MouseEvent evt) {
				try {
					jButton1MouseReleased(evt);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		jLabel5.setText("What's Happening ?");

		jButton2.setText("Change Photo");
		jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseReleased(java.awt.event.MouseEvent evt) {
				try {
					jButton2MouseReleased(evt);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		jButton3.setText("Comments");
		jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseReleased(java.awt.event.MouseEvent evt) {
				jButton3MouseReleased(evt);
			}
		});

		jLabel9.setText("Date");

		jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14));

		jButton4.setText("Comments");
		jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseReleased(java.awt.event.MouseEvent evt) {
				jButton4MouseReleased(evt);
			}
		});

		jLabel10.setText("Date");

		jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14));

		jButton5.setText("Comments");
		jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseReleased(java.awt.event.MouseEvent evt) {
				jButton5MouseReleased(evt);
			}
		});

		jLabel11.setText("Date");

		jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14));

		jButton6.setText("Comments");
		jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseReleased(java.awt.event.MouseEvent evt) {
				jButton6MouseReleased(evt);
			}
		});

		jLabel12.setText("Date");

		jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14));

		jButton7.setText("Comments");
		jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseReleased(java.awt.event.MouseEvent evt) {
				jButton7MouseReleased(evt);
			}
		});

		jLabel14.setText("Date");

		jButton8.setText("Up");
		jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseReleased(java.awt.event.MouseEvent evt) {
				try {
					jButton8MouseReleased(evt);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		jButton9.setText("Down");
		jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseReleased(java.awt.event.MouseEvent evt) {
				try {
					jButton9MouseReleased(evt);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		jButton10.setText("Show Friends");
		jButton10.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseReleased(java.awt.event.MouseEvent evt) {
				try {
					jButton10MouseReleased(evt);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		jButton10.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton10ActionPerformed(evt);
			}
		});

		jButton11.setText("Search");
		jButton11.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseReleased(java.awt.event.MouseEvent evt) {
				try {
					jButton11MouseReleased(evt);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		jButton12.setText("Interests");
		jButton12.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseReleased(java.awt.event.MouseEvent evt) {
				jButton12MouseReleased(evt);
			}
		});

		jButton13.setText("Add As a Friend");
		jButton13.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseReleased(java.awt.event.MouseEvent evt) {
				jButton13MouseReleased(evt);
			}
		});

		jButton14.setText("Add As a Friend");
		jButton14.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseReleased(java.awt.event.MouseEvent evt) {
				jButton14MouseReleased(evt);
			}
		});

		jButton15.setText("Add As a Friend");
		jButton15.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseReleased(java.awt.event.MouseEvent evt) {
				jButton15MouseReleased(evt);
			}
		});

		jSeparator12.setOrientation(javax.swing.SwingConstants.VERTICAL);

		jLabel31.setFont(new java.awt.Font("Segoe UI", 0, 14));
		jLabel31.setForeground(new java.awt.Color(102, 51, 255));
		jLabel31.setText("People You May Know:");

		jButton16.setText("Sign Out");
		jButton16.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseReleased(java.awt.event.MouseEvent evt) {
				jButton16MouseReleased(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout
				.setHorizontalGroup(layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								layout
										.createSequentialGroup()
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																layout
																		.createSequentialGroup()
																		.addContainerGap()
																		.addGroup(
																				layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING,
																								false)
																						.addComponent(
																								jButton2,
																								javax.swing.GroupLayout.Alignment.LEADING,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								Short.MAX_VALUE)
																						.addComponent(
																								jLabel1,
																								javax.swing.GroupLayout.Alignment.LEADING,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								167,
																								Short.MAX_VALUE)))
														.addGroup(
																layout
																		.createSequentialGroup()
																		.addGap(
																				47,
																				47,
																				47)
																		.addComponent(
																				jSeparator1,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				101,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGroup(
																layout
																		.createSequentialGroup()
																		.addContainerGap()
																		.addComponent(
																				jButton10,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				167,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGroup(
																layout
																		.createSequentialGroup()
																		.addContainerGap()
																		.addComponent(
																				jButton12,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				167,
																				javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												jSeparator2,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																layout
																		.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																		.addGroup(
																				layout
																						.createSequentialGroup()
																						.addGap(
																								44,
																								44,
																								44)
																						.addComponent(
																								jSeparator4,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								326,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addContainerGap())
																		.addGroup(
																				layout
																						.createSequentialGroup()
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addGroup(
																								layout
																										.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.LEADING)
																										.addGroup(
																												layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.TRAILING)
																														.addGroup(
																																layout
																																		.createParallelGroup(
																																				javax.swing.GroupLayout.Alignment.LEADING)
																																		.addComponent(
																																				jLabel15)
																																		.addComponent(
																																				jLabel17))
																														.addComponent(
																																jLabel19)
																														.addComponent(
																																jLabel21,
																																javax.swing.GroupLayout.Alignment.LEADING))
																										.addComponent(
																												jLabel23))
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addGroup(
																								layout
																										.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.LEADING)
																										.addGroup(
																												layout
																														.createSequentialGroup()
																														.addGroup(
																																layout
																																		.createParallelGroup(
																																				javax.swing.GroupLayout.Alignment.LEADING)
																																		.addComponent(
																																				jLabel24)
																																		.addGroup(
																																				layout
																																						.createSequentialGroup()
																																						.addComponent(
																																								jSeparator6,
																																								javax.swing.GroupLayout.PREFERRED_SIZE,
																																								javax.swing.GroupLayout.DEFAULT_SIZE,
																																								javax.swing.GroupLayout.PREFERRED_SIZE)
																																						.addPreferredGap(
																																								javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																																								625,
																																								Short.MAX_VALUE)
																																						.addComponent(
																																								jButton15,
																																								javax.swing.GroupLayout.PREFERRED_SIZE,
																																								166,
																																								javax.swing.GroupLayout.PREFERRED_SIZE)
																																						.addPreferredGap(
																																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
																														.addContainerGap(
																																94,
																																javax.swing.GroupLayout.PREFERRED_SIZE))
																										.addGroup(
																												layout
																														.createSequentialGroup()
																														.addGroup(
																																layout
																																		.createParallelGroup(
																																				javax.swing.GroupLayout.Alignment.TRAILING)
																																		.addGroup(
																																				javax.swing.GroupLayout.Alignment.LEADING,
																																				layout
																																						.createSequentialGroup()
																																						.addGroup(
																																								layout
																																										.createParallelGroup(
																																												javax.swing.GroupLayout.Alignment.TRAILING,
																																												false)
																																										.addGroup(
																																												javax.swing.GroupLayout.Alignment.LEADING,
																																												layout
																																														.createSequentialGroup()
																																														.addComponent(
																																																jLabel18)
																																														.addGap(
																																																18,
																																																18,
																																																18)
																																														.addComponent(
																																																jLabel6,
																																																javax.swing.GroupLayout.DEFAULT_SIZE,
																																																javax.swing.GroupLayout.DEFAULT_SIZE,
																																																Short.MAX_VALUE))
																																										.addGroup(
																																												javax.swing.GroupLayout.Alignment.LEADING,
																																												layout
																																														.createSequentialGroup()
																																														.addComponent(
																																																jLabel16)
																																														.addGap(
																																																20,
																																																20,
																																																20)
																																														.addComponent(
																																																jLabel4,
																																																javax.swing.GroupLayout.PREFERRED_SIZE,
																																																263,
																																																javax.swing.GroupLayout.PREFERRED_SIZE)))
																																						.addPreferredGap(
																																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																																						.addGroup(
																																								layout
																																										.createParallelGroup(
																																												javax.swing.GroupLayout.Alignment.LEADING,
																																												false)
																																										.addComponent(
																																												jButton3,
																																												javax.swing.GroupLayout.DEFAULT_SIZE,
																																												javax.swing.GroupLayout.DEFAULT_SIZE,
																																												Short.MAX_VALUE)
																																										.addComponent(
																																												jLabel10,
																																												javax.swing.GroupLayout.PREFERRED_SIZE,
																																												81,
																																												javax.swing.GroupLayout.PREFERRED_SIZE)
																																										.addComponent(
																																												jLabel9,
																																												javax.swing.GroupLayout.DEFAULT_SIZE,
																																												javax.swing.GroupLayout.DEFAULT_SIZE,
																																												Short.MAX_VALUE)
																																										.addComponent(
																																												jButton4,
																																												javax.swing.GroupLayout.DEFAULT_SIZE,
																																												123,
																																												Short.MAX_VALUE))
																																						.addGap(
																																								102,
																																								102,
																																								102))
																																		.addGroup(
																																				javax.swing.GroupLayout.Alignment.LEADING,
																																				layout
																																						.createSequentialGroup()
																																						.addGroup(
																																								layout
																																										.createParallelGroup(
																																												javax.swing.GroupLayout.Alignment.LEADING)
																																										.addGroup(
																																												layout
																																														.createSequentialGroup()
																																														.addGroup(
																																																layout
																																																		.createParallelGroup(
																																																				javax.swing.GroupLayout.Alignment.LEADING)
																																																		.addComponent(
																																																				jLabel2,
																																																				javax.swing.GroupLayout.PREFERRED_SIZE,
																																																				99,
																																																				javax.swing.GroupLayout.PREFERRED_SIZE)
																																																		.addGroup(
																																																				layout
																																																						.createSequentialGroup()
																																																						.addGap(
																																																								86,
																																																								86,
																																																								86)
																																																						.addComponent(
																																																								jLabel3,
																																																								javax.swing.GroupLayout.PREFERRED_SIZE,
																																																								67,
																																																								javax.swing.GroupLayout.PREFERRED_SIZE)))
																																														.addGap(
																																																176,
																																																176,
																																																176)
																																														.addComponent(
																																																jTextField2,
																																																javax.swing.GroupLayout.DEFAULT_SIZE,
																																																183,
																																																Short.MAX_VALUE))
																																										.addComponent(
																																												jLabel5,
																																												javax.swing.GroupLayout.PREFERRED_SIZE,
																																												127,
																																												javax.swing.GroupLayout.PREFERRED_SIZE)
																																										.addGroup(
																																												javax.swing.GroupLayout.Alignment.TRAILING,
																																												layout
																																														.createSequentialGroup()
																																														.addGroup(
																																																layout
																																																		.createParallelGroup(
																																																				javax.swing.GroupLayout.Alignment.TRAILING)
																																																		.addComponent(
																																																				jSeparator3,
																																																				javax.swing.GroupLayout.Alignment.LEADING,
																																																				javax.swing.GroupLayout.DEFAULT_SIZE,
																																																				479,
																																																				Short.MAX_VALUE)
																																																		.addGroup(
																																																				javax.swing.GroupLayout.Alignment.LEADING,
																																																				layout
																																																						.createParallelGroup(
																																																								javax.swing.GroupLayout.Alignment.TRAILING)
																																																						.addComponent(
																																																								jButton1)
																																																						.addComponent(
																																																								jTextField1,
																																																								javax.swing.GroupLayout.PREFERRED_SIZE,
																																																								316,
																																																								javax.swing.GroupLayout.PREFERRED_SIZE)))
																																														.addGap(
																																																33,
																																																33,
																																																33))
																																										.addGroup(
																																												layout
																																														.createSequentialGroup()
																																														.addComponent(
																																																jSeparator5,
																																																javax.swing.GroupLayout.PREFERRED_SIZE,
																																																javax.swing.GroupLayout.DEFAULT_SIZE,
																																																javax.swing.GroupLayout.PREFERRED_SIZE)
																																														.addPreferredGap(
																																																javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																																														.addComponent(
																																																jSeparator7,
																																																javax.swing.GroupLayout.PREFERRED_SIZE,
																																																326,
																																																javax.swing.GroupLayout.PREFERRED_SIZE))
																																										.addGroup(
																																												layout
																																														.createSequentialGroup()
																																														.addPreferredGap(
																																																javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																																														.addGroup(
																																																layout
																																																		.createParallelGroup(
																																																				javax.swing.GroupLayout.Alignment.LEADING)
																																																		.addComponent(
																																																				jSeparator8,
																																																				javax.swing.GroupLayout.PREFERRED_SIZE,
																																																				326,
																																																				javax.swing.GroupLayout.PREFERRED_SIZE)
																																																		.addGroup(
																																																				layout
																																																						.createSequentialGroup()
																																																						.addGroup(
																																																								layout
																																																										.createParallelGroup(
																																																												javax.swing.GroupLayout.Alignment.TRAILING)
																																																										.addGroup(
																																																												layout
																																																														.createParallelGroup(
																																																																javax.swing.GroupLayout.Alignment.LEADING)
																																																														.addGroup(
																																																																layout
																																																																		.createSequentialGroup()
																																																																		.addComponent(
																																																																				jLabel20)
																																																																		.addGap(
																																																																				18,
																																																																				18,
																																																																				18)
																																																																		.addComponent(
																																																																				jLabel7,
																																																																				javax.swing.GroupLayout.PREFERRED_SIZE,
																																																																				270,
																																																																				javax.swing.GroupLayout.PREFERRED_SIZE))
																																																														.addGroup(
																																																																layout
																																																																		.createSequentialGroup()
																																																																		.addComponent(
																																																																				jLabel22)
																																																																		.addGap(
																																																																				18,
																																																																				18,
																																																																				18)
																																																																		.addComponent(
																																																																				jLabel8,
																																																																				javax.swing.GroupLayout.PREFERRED_SIZE,
																																																																				226,
																																																																				javax.swing.GroupLayout.PREFERRED_SIZE)))
																																																										.addComponent(
																																																												jLabel13,
																																																												javax.swing.GroupLayout.PREFERRED_SIZE,
																																																												246,
																																																												javax.swing.GroupLayout.PREFERRED_SIZE))
																																																						.addPreferredGap(
																																																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																																																						.addGroup(
																																																								layout
																																																										.createParallelGroup(
																																																												javax.swing.GroupLayout.Alignment.LEADING)
																																																										.addGroup(
																																																												layout
																																																														.createSequentialGroup()
																																																														.addGap(
																																																																10,
																																																																10,
																																																																10)
																																																														.addComponent(
																																																																jLabel14,
																																																																javax.swing.GroupLayout.DEFAULT_SIZE,
																																																																92,
																																																																Short.MAX_VALUE)
																																																														.addPreferredGap(
																																																																javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																																																																96,
																																																																Short.MAX_VALUE))
																																																										.addComponent(
																																																												jButton7,
																																																												javax.swing.GroupLayout.PREFERRED_SIZE,
																																																												115,
																																																												javax.swing.GroupLayout.PREFERRED_SIZE)
																																																										.addGroup(
																																																												layout
																																																														.createSequentialGroup()
																																																														.addGap(
																																																																10,
																																																																10,
																																																																10)
																																																														.addComponent(
																																																																jLabel11,
																																																																javax.swing.GroupLayout.DEFAULT_SIZE,
																																																																188,
																																																																Short.MAX_VALUE))
																																																										.addGroup(
																																																												layout
																																																														.createParallelGroup(
																																																																javax.swing.GroupLayout.Alignment.TRAILING,
																																																																false)
																																																														.addGroup(
																																																																javax.swing.GroupLayout.Alignment.LEADING,
																																																																layout
																																																																		.createSequentialGroup()
																																																																		.addPreferredGap(
																																																																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																																																																		.addComponent(
																																																																				jButton5,
																																																																				javax.swing.GroupLayout.DEFAULT_SIZE,
																																																																				javax.swing.GroupLayout.DEFAULT_SIZE,
																																																																				Short.MAX_VALUE))
																																																														.addGroup(
																																																																javax.swing.GroupLayout.Alignment.LEADING,
																																																																layout
																																																																		.createSequentialGroup()
																																																																		.addGap(
																																																																				5,
																																																																				5,
																																																																				5)
																																																																		.addComponent(
																																																																				jLabel12,
																																																																				javax.swing.GroupLayout.PREFERRED_SIZE,
																																																																				115,
																																																																				javax.swing.GroupLayout.PREFERRED_SIZE))
																																																														.addComponent(
																																																																jButton6,
																																																																javax.swing.GroupLayout.PREFERRED_SIZE,
																																																																117,
																																																																javax.swing.GroupLayout.PREFERRED_SIZE)))))
																																														.addGap(
																																																21,
																																																21,
																																																21))
																																										.addGroup(
																																												layout
																																														.createSequentialGroup()
																																														.addComponent(
																																																jSeparator9,
																																																javax.swing.GroupLayout.PREFERRED_SIZE,
																																																326,
																																																javax.swing.GroupLayout.PREFERRED_SIZE)
																																														.addGap(
																																																186,
																																																186,
																																																186))
																																										.addGroup(
																																												layout
																																														.createSequentialGroup()
																																														.addComponent(
																																																jSeparator10,
																																																javax.swing.GroupLayout.PREFERRED_SIZE,
																																																326,
																																																javax.swing.GroupLayout.PREFERRED_SIZE)
																																														.addGap(
																																																186,
																																																186,
																																																186)))
																																						.addPreferredGap(
																																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
																														.addGroup(
																																layout
																																		.createParallelGroup(
																																				javax.swing.GroupLayout.Alignment.LEADING)
																																		.addGroup(
																																				layout
																																						.createParallelGroup(
																																								javax.swing.GroupLayout.Alignment.LEADING)
																																						.addGroup(
																																								layout
																																										.createSequentialGroup()
																																										.addPreferredGap(
																																												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																																												102,
																																												Short.MAX_VALUE)
																																										.addGroup(
																																												layout
																																														.createParallelGroup(
																																																javax.swing.GroupLayout.Alignment.LEADING)
																																														.addGroup(
																																																javax.swing.GroupLayout.Alignment.TRAILING,
																																																layout
																																																		.createSequentialGroup()
																																																		.addComponent(
																																																				jLabel30)
																																																		.addGap(
																																																				35,
																																																				35,
																																																				35)
																																																		.addComponent(
																																																				jLabel28,
																																																				javax.swing.GroupLayout.PREFERRED_SIZE,
																																																				85,
																																																				javax.swing.GroupLayout.PREFERRED_SIZE)
																																																		.addContainerGap())
																																														.addGroup(
																																																javax.swing.GroupLayout.Alignment.TRAILING,
																																																layout
																																																		.createSequentialGroup()
																																																		.addComponent(
																																																				jLabel25)
																																																		.addGap(
																																																				18,
																																																				18,
																																																				18)
																																																		.addComponent(
																																																				jLabel26,
																																																				javax.swing.GroupLayout.PREFERRED_SIZE,
																																																				85,
																																																				javax.swing.GroupLayout.PREFERRED_SIZE)
																																																		.addGap(
																																																				32,
																																																				32,
																																																				32))
																																														.addGroup(
																																																javax.swing.GroupLayout.Alignment.TRAILING,
																																																layout
																																																		.createSequentialGroup()
																																																		.addComponent(
																																																				jLabel29)
																																																		.addGap(
																																																				28,
																																																				28,
																																																				28)
																																																		.addComponent(
																																																				jLabel27,
																																																				javax.swing.GroupLayout.PREFERRED_SIZE,
																																																				85,
																																																				javax.swing.GroupLayout.PREFERRED_SIZE)
																																																		.addGap(
																																																				20,
																																																				20,
																																																				20))
																																														.addGroup(
																																																javax.swing.GroupLayout.Alignment.TRAILING,
																																																layout
																																																		.createSequentialGroup()
																																																		.addComponent(
																																																				jButton13,
																																																				javax.swing.GroupLayout.PREFERRED_SIZE,
																																																				173,
																																																				javax.swing.GroupLayout.PREFERRED_SIZE)
																																																		.addGap(
																																																				95,
																																																				95,
																																																				95))
																																														.addGroup(
																																																javax.swing.GroupLayout.Alignment.TRAILING,
																																																layout
																																																		.createSequentialGroup()
																																																		.addComponent(
																																																				jButton14,
																																																				javax.swing.GroupLayout.PREFERRED_SIZE,
																																																				171,
																																																				javax.swing.GroupLayout.PREFERRED_SIZE)
																																																		.addGap(
																																																				93,
																																																				93,
																																																				93))))
																																						.addGroup(
																																								layout
																																										.createSequentialGroup()
																																										.addGroup(
																																												layout
																																														.createParallelGroup(
																																																javax.swing.GroupLayout.Alignment.LEADING)
																																														.addComponent(
																																																jSeparator12,
																																																javax.swing.GroupLayout.PREFERRED_SIZE,
																																																15,
																																																javax.swing.GroupLayout.PREFERRED_SIZE)
																																														.addGroup(
																																																layout
																																																		.createSequentialGroup()
																																																		.addComponent(
																																																				jButton11)
																																																		.addGap(
																																																				145,
																																																				145,
																																																				145)
																																																		.addComponent(
																																																				jButton16)))
																																										.addGap(
																																												70,
																																												70,
																																												70)))
																																		.addGroup(
																																				layout
																																						.createSequentialGroup()
																																						.addComponent(
																																								jLabel31)
																																						.addContainerGap()))))))
														.addGroup(
																layout
																		.createSequentialGroup()
																		.addGap(
																				141,
																				141,
																				141)
																		.addComponent(
																				jButton8,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				56,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addGap(
																				53,
																				53,
																				53)
																		.addComponent(
																				jButton9)
																		.addGap(
																				422,
																				422,
																				422)))));
		layout
				.setVerticalGroup(layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								layout
										.createSequentialGroup()
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																jSeparator2,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																669,
																Short.MAX_VALUE)
														.addGroup(
																javax.swing.GroupLayout.Alignment.TRAILING,
																layout
																		.createSequentialGroup()
																		.addGroup(
																				layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addGroup(
																								layout
																										.createSequentialGroup()
																										.addContainerGap()
																										.addGroup(
																												layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.LEADING)
																														.addGroup(
																																layout
																																		.createSequentialGroup()
																																		.addComponent(
																																				jLabel1,
																																				javax.swing.GroupLayout.PREFERRED_SIZE,
																																				147,
																																				javax.swing.GroupLayout.PREFERRED_SIZE)
																																		.addGap(
																																				2,
																																				2,
																																				2)
																																		.addComponent(
																																				jButton2,
																																				javax.swing.GroupLayout.PREFERRED_SIZE,
																																				25,
																																				javax.swing.GroupLayout.PREFERRED_SIZE)
																																		.addPreferredGap(
																																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																																		.addComponent(
																																				jSeparator1,
																																				javax.swing.GroupLayout.PREFERRED_SIZE,
																																				javax.swing.GroupLayout.DEFAULT_SIZE,
																																				javax.swing.GroupLayout.PREFERRED_SIZE))
																														.addGroup(
																																layout
																																		.createSequentialGroup()
																																		.addGroup(
																																				layout
																																						.createParallelGroup(
																																								javax.swing.GroupLayout.Alignment.BASELINE)
																																						.addComponent(
																																								jLabel2,
																																								javax.swing.GroupLayout.PREFERRED_SIZE,
																																								35,
																																								javax.swing.GroupLayout.PREFERRED_SIZE)
																																						.addComponent(
																																								jLabel3)
																																						.addComponent(
																																								jTextField2,
																																								javax.swing.GroupLayout.PREFERRED_SIZE,
																																								javax.swing.GroupLayout.DEFAULT_SIZE,
																																								javax.swing.GroupLayout.PREFERRED_SIZE)
																																						.addComponent(
																																								jButton11)
																																						.addComponent(
																																								jButton16))
																																		.addGap(
																																				12,
																																				12,
																																				12)
																																		.addComponent(
																																				jLabel5)
																																		.addPreferredGap(
																																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																																		.addComponent(
																																				jTextField1,
																																				javax.swing.GroupLayout.PREFERRED_SIZE,
																																				33,
																																				javax.swing.GroupLayout.PREFERRED_SIZE)
																																		.addGap(
																																				1,
																																				1,
																																				1)
																																		.addComponent(
																																				jButton1)
																																		.addPreferredGap(
																																				javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																																		.addGroup(
																																				layout
																																						.createParallelGroup(
																																								javax.swing.GroupLayout.Alignment.LEADING)
																																						.addGroup(
																																								layout
																																										.createSequentialGroup()
																																										.addComponent(
																																												jSeparator3,
																																												javax.swing.GroupLayout.PREFERRED_SIZE,
																																												10,
																																												javax.swing.GroupLayout.PREFERRED_SIZE)
																																										.addPreferredGap(
																																												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																																										.addComponent(
																																												jLabel9))
																																						.addComponent(
																																								jLabel31))))
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																										.addComponent(
																												jButton3))
																						.addGroup(
																								layout
																										.createSequentialGroup()
																										.addGap(
																												172,
																												172,
																												172)
																										.addGroup(
																												layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.BASELINE)
																														.addComponent(
																																jLabel15,
																																javax.swing.GroupLayout.PREFERRED_SIZE,
																																43,
																																javax.swing.GroupLayout.PREFERRED_SIZE)
																														.addComponent(
																																jLabel16)
																														.addComponent(
																																jLabel4,
																																javax.swing.GroupLayout.PREFERRED_SIZE,
																																28,
																																javax.swing.GroupLayout.PREFERRED_SIZE))))
																		.addGap(
																				13,
																				13,
																				13)
																		.addGroup(
																				layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addGroup(
																								layout
																										.createSequentialGroup()
																										.addGap(
																												36,
																												36,
																												36)
																										.addComponent(
																												jButton10,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												70,
																												javax.swing.GroupLayout.PREFERRED_SIZE)
																										.addGap(
																												88,
																												88,
																												88)
																										.addComponent(
																												jButton12,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												74,
																												javax.swing.GroupLayout.PREFERRED_SIZE))
																						.addGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING,
																								layout
																										.createSequentialGroup()
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																										.addComponent(
																												jSeparator12,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												422,
																												javax.swing.GroupLayout.PREFERRED_SIZE))
																						.addGroup(
																								layout
																										.createSequentialGroup()
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																										.addComponent(
																												jSeparator4,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												10,
																												javax.swing.GroupLayout.PREFERRED_SIZE)
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																										.addGroup(
																												layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.TRAILING)
																														.addGroup(
																																layout
																																		.createSequentialGroup()
																																		.addComponent(
																																				jLabel10)
																																		.addPreferredGap(
																																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																																		.addComponent(
																																				jButton4)
																																		.addGap(
																																				18,
																																				18,
																																				18))
																														.addGroup(
																																layout
																																		.createSequentialGroup()
																																		.addGroup(
																																				layout
																																						.createParallelGroup(
																																								javax.swing.GroupLayout.Alignment.LEADING)
																																						.addComponent(
																																								jButton13)
																																						.addGroup(
																																								layout
																																										.createParallelGroup(
																																												javax.swing.GroupLayout.Alignment.BASELINE)
																																										.addComponent(
																																												jLabel17,
																																												javax.swing.GroupLayout.PREFERRED_SIZE,
																																												43,
																																												javax.swing.GroupLayout.PREFERRED_SIZE)
																																										.addComponent(
																																												jLabel18)
																																										.addComponent(
																																												jLabel6,
																																												javax.swing.GroupLayout.PREFERRED_SIZE,
																																												28,
																																												javax.swing.GroupLayout.PREFERRED_SIZE)))
																																		.addGap(
																																				21,
																																				21,
																																				21)))
																										.addGroup(
																												layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.LEADING)
																														.addGroup(
																																layout
																																		.createSequentialGroup()
																																		.addComponent(
																																				jSeparator7,
																																				javax.swing.GroupLayout.PREFERRED_SIZE,
																																				javax.swing.GroupLayout.DEFAULT_SIZE,
																																				javax.swing.GroupLayout.PREFERRED_SIZE)
																																		.addGroup(
																																				layout
																																						.createParallelGroup(
																																								javax.swing.GroupLayout.Alignment.LEADING)
																																						.addGroup(
																																								layout
																																										.createSequentialGroup()
																																										.addGap(
																																												31,
																																												31,
																																												31)
																																										.addGroup(
																																												layout
																																														.createParallelGroup(
																																																javax.swing.GroupLayout.Alignment.BASELINE)
																																														.addComponent(
																																																jLabel20)
																																														.addComponent(
																																																jLabel19,
																																																javax.swing.GroupLayout.PREFERRED_SIZE,
																																																43,
																																																javax.swing.GroupLayout.PREFERRED_SIZE)
																																														.addComponent(
																																																jLabel7))
																																										.addPreferredGap(
																																												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																																										.addComponent(
																																												jSeparator8,
																																												javax.swing.GroupLayout.PREFERRED_SIZE,
																																												18,
																																												javax.swing.GroupLayout.PREFERRED_SIZE))
																																						.addGroup(
																																								layout
																																										.createSequentialGroup()
																																										.addGap(
																																												8,
																																												8,
																																												8)
																																										.addGroup(
																																												layout
																																														.createParallelGroup(
																																																javax.swing.GroupLayout.Alignment.LEADING)
																																														.addGroup(
																																																layout
																																																		.createParallelGroup(
																																																				javax.swing.GroupLayout.Alignment.BASELINE)
																																																		.addComponent(
																																																				jLabel27)
																																																		.addComponent(
																																																				jLabel29,
																																																				javax.swing.GroupLayout.PREFERRED_SIZE,
																																																				43,
																																																				javax.swing.GroupLayout.PREFERRED_SIZE))
																																														.addGroup(
																																																layout
																																																		.createSequentialGroup()
																																																		.addPreferredGap(
																																																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																																																		.addComponent(
																																																				jLabel11)
																																																		.addPreferredGap(
																																																				javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																																																		.addComponent(
																																																				jButton5)))
																																										.addGap(
																																												1,
																																												1,
																																												1)
																																										.addComponent(
																																												jButton14))))
																														.addGroup(
																																javax.swing.GroupLayout.Alignment.TRAILING,
																																layout
																																		.createSequentialGroup()
																																		.addComponent(
																																				jSeparator5,
																																				javax.swing.GroupLayout.PREFERRED_SIZE,
																																				10,
																																				javax.swing.GroupLayout.PREFERRED_SIZE)
																																		.addGap(
																																				82,
																																				82,
																																				82)
																																		.addComponent(
																																				jLabel12)
																																		.addPreferredGap(
																																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
																										.addGroup(
																												layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.LEADING)
																														.addGroup(
																																layout
																																		.createSequentialGroup()
																																		.addGap(
																																				16,
																																				16,
																																				16)
																																		.addGroup(
																																				layout
																																						.createParallelGroup(
																																								javax.swing.GroupLayout.Alignment.BASELINE)
																																						.addComponent(
																																								jLabel21,
																																								javax.swing.GroupLayout.PREFERRED_SIZE,
																																								43,
																																								javax.swing.GroupLayout.PREFERRED_SIZE)
																																						.addComponent(
																																								jLabel22)
																																						.addComponent(
																																								jLabel8)))
																														.addGroup(
																																layout
																																		.createSequentialGroup()
																																		.addGap(
																																				18,
																																				18,
																																				18)
																																		.addComponent(
																																				jButton6)))
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																										.addGroup(
																												layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.LEADING)
																														.addGroup(
																																layout
																																		.createSequentialGroup()
																																		.addGroup(
																																				layout
																																						.createParallelGroup(
																																								javax.swing.GroupLayout.Alignment.BASELINE)
																																						.addComponent(
																																								jLabel28)
																																						.addComponent(
																																								jLabel30,
																																								javax.swing.GroupLayout.PREFERRED_SIZE,
																																								43,
																																								javax.swing.GroupLayout.PREFERRED_SIZE))
																																		.addPreferredGap(
																																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																																		.addComponent(
																																				jButton15))
																														.addGroup(
																																layout
																																		.createSequentialGroup()
																																		.addGroup(
																																				layout
																																						.createParallelGroup(
																																								javax.swing.GroupLayout.Alignment.LEADING)
																																						.addComponent(
																																								jSeparator9,
																																								javax.swing.GroupLayout.PREFERRED_SIZE,
																																								javax.swing.GroupLayout.DEFAULT_SIZE,
																																								javax.swing.GroupLayout.PREFERRED_SIZE)
																																						.addGroup(
																																								layout
																																										.createSequentialGroup()
																																										.addGap(
																																												12,
																																												12,
																																												12)
																																										.addComponent(
																																												jLabel14)))
																																		.addPreferredGap(
																																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																																		.addGroup(
																																				layout
																																						.createParallelGroup(
																																								javax.swing.GroupLayout.Alignment.LEADING)
																																						.addComponent(
																																								jSeparator6,
																																								javax.swing.GroupLayout.PREFERRED_SIZE,
																																								10,
																																								javax.swing.GroupLayout.PREFERRED_SIZE)
																																						.addGroup(
																																								layout
																																										.createSequentialGroup()
																																										.addPreferredGap(
																																												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																																										.addGroup(
																																												layout
																																														.createParallelGroup(
																																																javax.swing.GroupLayout.Alignment.BASELINE)
																																														.addComponent(
																																																jLabel23,
																																																javax.swing.GroupLayout.PREFERRED_SIZE,
																																																43,
																																																javax.swing.GroupLayout.PREFERRED_SIZE)
																																														.addComponent(
																																																jLabel24)))
																																						.addComponent(
																																								jLabel13,
																																								javax.swing.GroupLayout.PREFERRED_SIZE,
																																								25,
																																								javax.swing.GroupLayout.PREFERRED_SIZE)
																																						.addComponent(
																																								jButton7))
																																		.addPreferredGap(
																																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																																		.addComponent(
																																				jSeparator10,
																																				javax.swing.GroupLayout.PREFERRED_SIZE,
																																				22,
																																				javax.swing.GroupLayout.PREFERRED_SIZE)
																																		.addPreferredGap(
																																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																																		.addGroup(
																																				layout
																																						.createParallelGroup(
																																								javax.swing.GroupLayout.Alignment.LEADING)
																																						.addComponent(
																																								jButton9)
																																						.addComponent(
																																								jButton8))))))))
										.addContainerGap())
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								layout
										.createSequentialGroup()
										.addContainerGap(220, Short.MAX_VALUE)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																jLabel25,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																43,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel26))
										.addGap(419, 419, 419)));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	public javax.swing.JButton getjButton13() {
		return jButton13;
	}

	public void setjButton13(javax.swing.JButton jButton13) {
		this.jButton13 = jButton13;
	}

	public javax.swing.JButton getjButton14() {
		return jButton14;
	}

	public void setjButton14(javax.swing.JButton jButton14) {
		this.jButton14 = jButton14;
	}

	public javax.swing.JButton getjButton15() {
		return jButton15;
	}

	public void setjButton15(javax.swing.JButton jButton15) {
		this.jButton15 = jButton15;
	}

	public javax.swing.JButton getjButton16() {
		return jButton16;
	}

	public void setjButton16(javax.swing.JButton jButton16) {
		this.jButton16 = jButton16;
	}

	private void jButton16MouseReleased(java.awt.event.MouseEvent evt) {
		this.setVisible(false);
		FirstPage a = new FirstPage();
		a.setVisible(true);
	}

	private void jButton15MouseReleased(java.awt.event.MouseEvent evt) {
		ProfilePage fpg = new ProfilePage();
		//	fpg.getjButton2().setVisible(false);
		ProfileDAO dao = new ProfileDAO();
		Transaction dx = dao.getSession().beginTransaction();
		//	Profile b = dao.findById(Integer.parseInt(jLabel1.getText()));
		AddFriend(FirstPage.id, Integer.parseInt(jLabel30.getText()));
		this.jLabel30.setText("Added!");
		this.jButton15.setVisible(false);
		//	System.out.println("Added!");
	}

	static void AddFriend(Integer id, Integer Friendid) {

		ProfileDAO dao = new ProfileDAO();
		Transaction dx = dao.getSession().beginTransaction();
		Profile a = dao.findById(id);

		List<Friend> newfs = a.getFriends();
		Friend newf = new Friend();
		newf.setFriendId(Friendid);
		newfs.add(newf);

		dao.attachClean(a);
		dx.commit();
		dao.getSession().close();

	}

	private void jButton14MouseReleased(java.awt.event.MouseEvent evt) {
		//		ProfilePage fpg = new ProfilePage();
		//	fpg.getjButton2().setVisible(false);
		ProfileDAO dao = new ProfileDAO();
		Transaction dx = dao.getSession().beginTransaction();
		//	Profile b = dao.findById(Integer.parseInt(jLabel1.getText()));
		AddFriend(FirstPage.id, Integer.parseInt(jLabel29.getText()));
		this.jLabel29.setText("Added!");
		this.jButton14.setVisible(false);
		//	System.out.println("Added!");
	}

	private void jButton13MouseReleased(java.awt.event.MouseEvent evt) {
		//	ProfilePage fpg = new ProfilePage();
		//	fpg.getjButton2().setVisible(false);
		ProfileDAO dao = new ProfileDAO();
		Transaction dx = dao.getSession().beginTransaction();
		//	Profile b = dao.findById(Integer.parseInt(jLabel1.getText()));
		AddFriend(FirstPage.id, Integer.parseInt(jLabel25.getText()));
		this.jLabel25.setText("Added!");
		this.jButton13.setVisible(false);
		//	System.out.println("Added!");
	}

	public javax.swing.JLabel getjLabel25() {
		return jLabel25;
	}

	public void setjLabel25(javax.swing.JLabel jLabel25) {
		this.jLabel25 = jLabel25;
	}

	public javax.swing.JLabel getjLabel26() {
		return jLabel26;
	}

	public void setjLabel26(javax.swing.JLabel jLabel26) {
		this.jLabel26 = jLabel26;
	}

	public javax.swing.JLabel getjLabel27() {
		return jLabel27;
	}

	public void setjLabel27(javax.swing.JLabel jLabel27) {
		this.jLabel27 = jLabel27;
	}

	public javax.swing.JLabel getjLabel28() {
		return jLabel28;
	}

	public void setjLabel28(javax.swing.JLabel jLabel28) {
		this.jLabel28 = jLabel28;
	}

	public javax.swing.JLabel getjLabel29() {
		return jLabel29;
	}

	public void setjLabel29(javax.swing.JLabel jLabel29) {
		this.jLabel29 = jLabel29;
	}

	public javax.swing.JLabel getjLabel30() {
		return jLabel30;
	}

	public void setjLabel30(javax.swing.JLabel jLabel30) {
		this.jLabel30 = jLabel30;
	}

	public javax.swing.JLabel getjLabel31() {
		return jLabel31;
	}

	public void setjLabel31(javax.swing.JLabel jLabel31) {
		this.jLabel31 = jLabel31;
	}

	private void jButton12MouseReleased(java.awt.event.MouseEvent evt) {
		Interests newi = new Interests();
		ProfileDAO dao = new ProfileDAO();
		Transaction dx = dao.getSession().beginTransaction();
		Profile ma = dao.findById(FirstPage.id);
		int i;
		for (i = 0; i < ma.getInterests().size(); i++) {
			if (ma.getInterests().get(i).getName().equals(
					newi.getjCheckBox1().getText()))
				newi.getjCheckBox1().doClick();
			if (ma.getInterests().get(i).getName().equals(
					newi.getjCheckBox2().getText()))
				newi.getjCheckBox2().doClick();
			if (ma.getInterests().get(i).getName().equals(
					newi.getjCheckBox3().getText()))
				newi.getjCheckBox3().doClick();
			if (ma.getInterests().get(i).getName().equals(
					newi.getjCheckBox4().getText()))
				newi.getjCheckBox4().doClick();
			if (ma.getInterests().get(i).getName().equals(
					newi.getjCheckBox5().getText()))
				newi.getjCheckBox5().doClick();
			if (ma.getInterests().get(i).getName().equals(
					newi.getjCheckBox6().getText()))
				newi.getjCheckBox6().doClick();
			if (ma.getInterests().get(i).getName().equals(
					newi.getjCheckBox7().getText()))
				newi.getjCheckBox7().doClick();
			if (ma.getInterests().get(i).getName().equals(
					newi.getjCheckBox8().getText()))
				newi.getjCheckBox8().doClick();
			if (ma.getInterests().get(i).getName().equals(
					newi.getjCheckBox9().getText()))
				newi.getjCheckBox9().doClick();

		}
		newi.setVisible(true);
	}

	public javax.swing.JButton getjButton12() {
		return jButton12;
	}

	public void setjButton12(javax.swing.JButton jButton12) {
		this.jButton12 = jButton12;
	}

	private void jButton11MouseReleased(java.awt.event.MouseEvent evt)
			throws IOException {
		ProfileDAO dao = new ProfileDAO();
		Transaction dx = dao.getSession().beginTransaction();
		Profile ma = dao.findById(FirstPage.id);
		List<Profile> foundf = dao.findByFirstName(jTextField2.getText());
		int i;

		List<Profile> foundl = dao.findByLastName(jTextField2.getText());
		if (foundf.size() == 0) {
			if (foundl.size() == 0) {
				NotFound nf = new NotFound();
				nf.setVisible(true);

			} else {
				int j;
				int y;
				//for(j=0;j<foundf.size();j++)
				for (i = 0; i < ma.getFriends().size(); i++) {
					if ((j = foundl.indexOf(dao.findById(ma.getFriends().get(i)
							.getFriendId()))) != -1) {

						foundl.remove(j);
					}
					if ((y = foundl.indexOf(ma)) != -1)
						foundl.remove(y);
				}

				ShowPoeple foundp = new ShowPoeple();

				ShowPeople(foundl, foundp, 0);
				foundp.setVisible(true);

			}

		} else {
			int j;
			int y;
			//for(j=0;j<foundf.size();j++)
			for (i = 0; i < ma.getFriends().size(); i++) {
				System.out.println("Hi");
				if ((j = foundf.indexOf(dao.findById(ma.getFriends().get(i)
						.getFriendId()))) != -1) {
					foundf.remove(j);
				}
			}
			if ((y = foundf.indexOf(ma)) != -1)
				foundf.remove(foundf.indexOf(ma));
			ShowPoeple foundp = new ShowPoeple();

			ShowPeople(foundf, foundp, 0);
			foundp.setVisible(true);
		}

	}

	public javax.swing.JButton getjButton10() {
		return jButton10;
	}

	public void setjButton10(javax.swing.JButton jButton10) {
		this.jButton10 = jButton10;
	}

	public javax.swing.JButton getjButton11() {
		return jButton11;
	}

	public void setjButton11(javax.swing.JButton jButton11) {
		this.jButton11 = jButton11;
	}

	public javax.swing.JTextField getjTextField2() {
		return jTextField2;
	}

	public void setjTextField2(javax.swing.JTextField jTextField2) {
		this.jTextField2 = jTextField2;
	}

	static void ShowPeople(List<Profile> foundf, ShowPoeple fp, Integer frid)
			throws IOException {

		int i;
		int j;
		for (i = foundf.size() - 1 - frid, j = 0; i >= 0 && j < 5; i--, j++) {
			if (j == 0) {
				Profile c = foundf.get(i);//dao.findById(a.getFriends().get(i).getFriendId());
				fp.getjLabel2().setText(
						c.getFirstName() + " " + c.getLastName());
				fp.getjLabel1().setText(c.getId().toString());
				ImageIcon ia = new ImageIcon();
				Image img = ImageIO.read(new File(c.getPicture()));
				Image ib = img.getScaledInstance(50, 50, 50);
				ia.setImage(ib);
				fp.getjLabel1().setIcon(ia);

			}
			if (j == 1) {
				Profile c = foundf.get(i);// dao.findById(a.getFriends().get(i).getFriendId());
				fp.getjLabel5().setText(
						c.getFirstName() + " " + c.getLastName());
				fp.getjLabel4().setText(c.getId().toString());
				ImageIcon ia = new ImageIcon();
				Image img = ImageIO.read(new File(c.getPicture()));
				Image ib = img.getScaledInstance(50, 50, 50);
				ia.setImage(ib);
				fp.getjLabel4().setIcon(ia);
			}
			if (j == 2) {
				Profile c = foundf.get(i);//dao.findById(a.getFriends().get(i).getFriendId());
				fp.getjLabel7().setText(
						c.getFirstName() + " " + c.getLastName());
				fp.getjLabel6().setText(c.getId().toString());
				ImageIcon ia = new ImageIcon();
				Image img = ImageIO.read(new File(c.getPicture()));
				Image ib = img.getScaledInstance(50, 50, 50);
				ia.setImage(ib);
				fp.getjLabel6().setIcon(ia);
			}
			if (j == 3) {
				Profile c = foundf.get(i);//dao.findById(a.getFriends().get(i).getFriendId());
				fp.getjLabel9().setText(
						c.getFirstName() + " " + c.getLastName());
				fp.getjLabel8().setText(c.getId().toString());
				ImageIcon ia = new ImageIcon();
				Image img = ImageIO.read(new File(c.getPicture()));
				Image ib = img.getScaledInstance(50, 50, 50);
				ia.setImage(ib);
				fp.getjLabel8().setIcon(ia);
			}
			if (j == 4) {
				Profile c = foundf.get(i);//dao.findById(a.getFriends().get(i).getFriendId());
				fp.getjLabel11().setText(
						c.getFirstName() + " " + c.getLastName());
				fp.getjLabel10().setText(c.getId().toString());
				ImageIcon ia = new ImageIcon();
				Image img = ImageIO.read(new File(c.getPicture()));
				Image ib = img.getScaledInstance(50, 50, 50);
				ia.setImage(ib);
				fp.getjLabel10().setIcon(ia);
			}

		}

	}

	private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jButton10MouseReleased(java.awt.event.MouseEvent evt)
			throws IOException {

		FriendsPage a = new FriendsPage();
		/*	ProfileDAO dao = new ProfileDAO();
			Transaction dx = dao.getSession().beginTransaction();
			Profile profile = dao.findById(FirstPage.id); */
		ShowFriends(FirstPage.id, a, 0);
		a.setVisible(true);

	}

	static void ShowFriends(Integer id, FriendsPage fp, Integer frid)
			throws IOException {

		ProfileDAO dao = new ProfileDAO();
		Transaction dx = dao.getSession().beginTransaction();
		Profile a = dao.findById(id);
		int i;
		int j;
		for (i = a.getFriends().size() - 1 - frid, j = 0; i >= 0 && j < 5; i--, j++) {
			if (j == 0) {
				Profile c = dao.findById(a.getFriends().get(i).getFriendId());
				fp.getjLabel2().setText(
						c.getFirstName() + " " + c.getLastName());
				fp.getjLabel1().setText(c.getId().toString());
				ImageIcon ia = new ImageIcon();
				Image img = ImageIO.read(new File(c.getPicture()));
				Image ib = img.getScaledInstance(50, 50, 50);
				ia.setImage(ib);
				fp.getjLabel1().setIcon(ia);

			}
			if (j == 1) {
				Profile c = dao.findById(a.getFriends().get(i).getFriendId());
				fp.getjLabel5().setText(
						c.getFirstName() + " " + c.getLastName());
				fp.getjLabel4().setText(c.getId().toString());
				ImageIcon ia = new ImageIcon();
				Image img = ImageIO.read(new File(c.getPicture()));
				Image ib = img.getScaledInstance(50, 50, 50);
				ia.setImage(ib);
				fp.getjLabel4().setIcon(ia);
			}
			if (j == 2) {
				Profile c = dao.findById(a.getFriends().get(i).getFriendId());
				fp.getjLabel7().setText(
						c.getFirstName() + " " + c.getLastName());
				fp.getjLabel6().setText(c.getId().toString());
				ImageIcon ia = new ImageIcon();
				Image img = ImageIO.read(new File(c.getPicture()));
				Image ib = img.getScaledInstance(50, 50, 50);
				ia.setImage(ib);
				fp.getjLabel6().setIcon(ia);
			}
			if (j == 3) {
				Profile c = dao.findById(a.getFriends().get(i).getFriendId());
				fp.getjLabel9().setText(
						c.getFirstName() + " " + c.getLastName());
				fp.getjLabel8().setText(c.getId().toString());
				ImageIcon ia = new ImageIcon();
				Image img = ImageIO.read(new File(c.getPicture()));
				Image ib = img.getScaledInstance(50, 50, 50);
				ia.setImage(ib);
				fp.getjLabel8().setIcon(ia);
			}
			if (j == 4) {
				Profile c = dao.findById(a.getFriends().get(i).getFriendId());
				fp.getjLabel11().setText(
						c.getFirstName() + " " + c.getLastName());
				fp.getjLabel10().setText(c.getId().toString());
				ImageIcon ia = new ImageIcon();
				Image img = ImageIO.read(new File(c.getPicture()));
				Image ib = img.getScaledInstance(50, 50, 50);
				ia.setImage(ib);
				fp.getjLabel10().setIcon(ia);
			}

		}
		dx.commit();
		dao.getSession().close();

	}

	public javax.swing.JButton getjButton2() {
		return jButton2;
	}

	public void setjButton2(javax.swing.JButton jButton2) {
		this.jButton2 = jButton2;
	}

	private void jButton7MouseReleased(java.awt.event.MouseEvent evt) {
		CommentPage a = new CommentPage();
		ProfileDAO dao = new ProfileDAO();
		Transaction dx = dao.getSession().beginTransaction();
		Profile profile = dao.findById(FirstPage.id);
		int i;
		pid = -1;
		for (i = 0; i < profile.getPosts().size(); i++) {
			if (profile.getPosts().get(i).getText().equals(jLabel13.getText())) {
				pid = i + 1; //profile.getPosts().get(i).getPid();
				break;
			}
		}

		dx.commit();
		dao.getSession().close();

		ShowComments(a, FirstPage.id, pid - 1);
		a.setVisible(true);
	}

	private void jButton6MouseReleased(java.awt.event.MouseEvent evt) {
		CommentPage a = new CommentPage();
		ProfileDAO dao = new ProfileDAO();
		Transaction dx = dao.getSession().beginTransaction();
		Profile profile = dao.findById(FirstPage.id);
		int i;
		pid = -1;
		for (i = 0; i < profile.getPosts().size(); i++) {
			if (profile.getPosts().get(i).getText().equals(jLabel8.getText())) {
				pid = i + 1; //profile.getPosts().get(i).getPid();
				break;
			}
		}

		dx.commit();
		dao.getSession().close();

		ShowComments(a, FirstPage.id, pid - 1);
		a.setVisible(true);
	}

	private void jButton5MouseReleased(java.awt.event.MouseEvent evt) {
		CommentPage a = new CommentPage();
		ProfileDAO dao = new ProfileDAO();
		Transaction dx = dao.getSession().beginTransaction();
		Profile profile = dao.findById(FirstPage.id);
		int i;
		pid = -1;
		for (i = 0; i < profile.getPosts().size(); i++) {
			if (profile.getPosts().get(i).getText().equals(jLabel7.getText())) {
				pid = i + 1;// profile.getPosts().get(i).getPid();
				break;
			}
		}

		dx.commit();
		dao.getSession().close();

		ShowComments(a, FirstPage.id, pid - 1);
		a.setVisible(true);
	}

	private void jButton4MouseReleased(java.awt.event.MouseEvent evt) {
		CommentPage a = new CommentPage();
		ProfileDAO dao = new ProfileDAO();
		Transaction dx = dao.getSession().beginTransaction();
		Profile profile = dao.findById(FirstPage.id);
		int i;
		pid = -1;
		for (i = 0; i < profile.getPosts().size(); i++) {
			if (profile.getPosts().get(i).getText().equals(jLabel6.getText())) {
				pid = i + 1;//profile.getPosts().get(i).getPid();
				break;
			}
		}

		dx.commit();
		dao.getSession().close();

		ShowComments(a, FirstPage.id, pid - 1);
		a.setVisible(true);

		a.setVisible(true);
	}

	private void jButton3MouseReleased(java.awt.event.MouseEvent evt) {
		CommentPage a = new CommentPage();
		ProfileDAO dao = new ProfileDAO();
		Transaction dx = dao.getSession().beginTransaction();
		Profile profile = dao.findById(FirstPage.id);
		int i;
		pid = -1;
		System.out.println(profile.getPosts().size());
		for (i = 0; i < profile.getPosts().size(); i++) {
			System.out.println(i);
			if (profile.getPosts().get(i).getText().equals(jLabel4.getText())) {
				pid = i + 1;
				break;

			}
		}

		//	System.out.println(pid);	
		dx.commit();
		dao.getSession().close();

		ShowComments(a, FirstPage.id, pid - 1);

		a.setVisible(true);
	}

	/*	
	for(j=a.getPosts().get(i).getComments().size();j>0;j--){
		//  System.out.println("Comments: ");
		  Profile c = dao.findById(a.getPosts().get(i).getComments().get(0).getOwnerId());
		  System.out.printf("\t" +c.getFirstName()+" : ");
	     System.out.printf(a.getPosts().get(i).getComments().get(0).getText());
	     System.out.printf("\t");
	     System.out.println(dateFormat.format(a.getPosts().get(i).getComments().get(0).getDate()));
	     
	  }
	 */

	static void ShowComments(CommentPage cpage, Integer id, Integer pid) {
		ProfileDAO dao = new ProfileDAO();
		Transaction dx = dao.getSession().beginTransaction();
		Profile a = dao.findById(id);
		int i;
		int j;
		System.out.println(id);
		System.out.println(pid);
		for (j = a.getPosts().get(pid).getComments().size(), i = 0; j > 0
				&& i <= 3; j--, i++) {
			System.out.println(j);
			if (i == 0) {
				Profile c = dao.findById(a.getPosts().get(pid).getComments()
						.get(j - 1).getOwnerId());
				cpage.getjLabel2().setText(
						c.getFirstName()
								+ " : "
								+ a.getPosts().get(pid).getComments()
										.get(j - 1).getText());
				DateFormat dateFormat = new SimpleDateFormat("yyyy/MMM/dd");
				cpage.getjLabel3().setText(
						dateFormat.format(a.getPosts().get(pid).getComments()
								.get(j - 1).getDate()));
			}
			if (i == 1) {
				Profile c = dao.findById(a.getPosts().get(pid).getComments()
						.get(j - 1).getOwnerId());
				cpage.getjLabel5().setText(
						c.getFirstName()
								+ " : "
								+ a.getPosts().get(pid).getComments()
										.get(j - 1).getText());
				DateFormat dateFormat = new SimpleDateFormat("yyyy/MMM/dd");
				cpage.getjLabel4().setText(
						dateFormat.format(a.getPosts().get(pid).getComments()
								.get(j - 1).getDate()));
			}
			if (i == 2) {
				Profile c = dao.findById(a.getPosts().get(pid).getComments()
						.get(j - 1).getOwnerId());
				cpage.getjLabel6().setText(
						c.getFirstName()
								+ " : "
								+ a.getPosts().get(pid).getComments()
										.get(j - 1).getText());
				DateFormat dateFormat = new SimpleDateFormat("yyyy/MMM/dd");
				cpage.getjLabel7().setText(
						dateFormat.format(a.getPosts().get(pid).getComments()
								.get(j - 1).getDate()));
			}

			/*	 Profile c = dao.findById(a.getPosts().get(pid).getComments().get(j).getOwnerId());
				 System.out.printf("\t" +c.getFirstName()+" : ");
			     System.out.printf(a.getPosts().get(pid).getComments().get(j).getText());
			     System.out.printf("\t");
			     System.out.println(dateFormat.format(a.getPosts().get(pid).getComments().get(j).getDate()));
			 */
		}
		dx.commit();
		dao.getSession().close();

	}

	private void jButton8MouseReleased(java.awt.event.MouseEvent evt)
			throws IOException {
		/*	ProfileDAO dao = new ProfileDAO();
			Transaction dx = dao.getSession().beginTransaction();
			Profile b = dao.findById(FirstPage.id);*/
		if (postid > 0) {
			postid--;
			ShowPosts(this, FirstPage.id, postid);
		}
	}

	private void jButton9MouseReleased(java.awt.event.MouseEvent evt)
			throws IOException {
		ProfileDAO dao = new ProfileDAO();
		Transaction dx = dao.getSession().beginTransaction();
		Profile b = dao.findById(FirstPage.id);

		if (postid <= b.getPosts().size() - 6) {
			dx.commit();
			dao.getSession().close();
			postid++;
			ShowPosts(this, FirstPage.id, postid);
		} else {
			//	System.out.println(postid);
			dx.commit();
			dao.getSession().close();
		}
	}

	private void jButton1MouseReleased(java.awt.event.MouseEvent evt)
			throws IOException {
		AddPost(jTextField1.getText());
		jTextField1.setText("");
		ShowPosts(this, FirstPage.id, 0);
		System.out.println(FirstPage.id);
	}

	static void ShowPosts(ProfilePage a, Integer id, int from)
			throws IOException {

		/*	  ProfileDAO dao = new ProfileDAO();
			  Transaction dx = dao.getSession().beginTransaction();*/
		ProfileDAO dao = new ProfileDAO();
		Transaction dx = dao.getSession().beginTransaction();
		Profile b = dao.findById(id);

		int i;
		int j;

		for (i = (b.getPosts().size() - 1) - from, j = 0; i >= 0 && j < 5; i--, j++) {
			if (j == 0) {

				Profile poster = dao
						.findById(b.getPosts().get(i).getPosterid());
				ImageIcon ia = new ImageIcon();

				Image img = ImageIO.read(new File(poster.getPicture()));
				Image ib = img.getScaledInstance(50, 50, 50);
				ia.setImage(ib);

				a.getjLabel15().setIcon(ia);
				a.getjLabel16().setText(poster.getFirstName() + ": ");
				a.getjLabel4().setText(

				b.getPosts().get(i).getText());
				DateFormat dateFormat = new SimpleDateFormat("yyyy/MMM/dd");
				a.getjLabel9().setText(
						dateFormat.format(b.getPosts().get(i).getDate()));
			}
			if (j == 1) {
				Profile poster = dao
						.findById(b.getPosts().get(i).getPosterid());
				ImageIcon ia = new ImageIcon();

				Image img = ImageIO.read(new File(poster.getPicture()));
				Image ib = img.getScaledInstance(50, 50, 50);
				ia.setImage(ib);

				a.getjLabel17().setIcon(ia);
				a.getjLabel18().setText(poster.getFirstName() + ": ");
				a.getjLabel6().setText(b.getPosts().get(i).getText());
				DateFormat dateFormat = new SimpleDateFormat("yyyy/MMM/dd");
				a.getjLabel10().setText(
						dateFormat.format(b.getPosts().get(i).getDate()));
			}
			if (j == 2) {
				Profile poster = dao
						.findById(b.getPosts().get(i).getPosterid());
				ImageIcon ia = new ImageIcon();

				Image img = ImageIO.read(new File(poster.getPicture()));
				Image ib = img.getScaledInstance(50, 50, 50);
				ia.setImage(ib);

				a.getjLabel19().setIcon(ia);
				a.getjLabel20().setText(poster.getFirstName() + ": ");
				a.getjLabel7().setText(b.getPosts().get(i).getText());
				DateFormat dateFormat = new SimpleDateFormat("yyyy/MMM/dd");
				a.getjLabel11().setText(
						dateFormat.format(b.getPosts().get(i).getDate()));
			}
			if (j == 3) {
				Profile poster = dao
						.findById(b.getPosts().get(i).getPosterid());
				ImageIcon ia = new ImageIcon();

				Image img = ImageIO.read(new File(poster.getPicture()));
				Image ib = img.getScaledInstance(50, 50, 50);
				ia.setImage(ib);

				a.getjLabel21().setIcon(ia);
				a.getjLabel22().setText(poster.getFirstName() + ": ");
				a.getjLabel8().setText(b.getPosts().get(i).getText());
				DateFormat dateFormat = new SimpleDateFormat("yyyy/MMM/dd");
				a.getjLabel12().setText(
						dateFormat.format(b.getPosts().get(i).getDate()));
			}
			if (j == 4) {
				Profile poster = dao
						.findById(b.getPosts().get(i).getPosterid());
				ImageIcon ia = new ImageIcon();

				Image img = ImageIO.read(new File(poster.getPicture()));
				Image ib = img.getScaledInstance(50, 50, 50);
				ia.setImage(ib);

				a.getjLabel23().setIcon(ia);
				a.getjLabel24().setText(poster.getFirstName() + ": ");
				a.getjLabel13().setText(b.getPosts().get(i).getText());
				DateFormat dateFormat = new SimpleDateFormat("yyyy/MMM/dd");
				a.getjLabel14().setText(
						dateFormat.format(b.getPosts().get(i).getDate()));
			}
		}
		dx.commit();
		dao.getSession().close();
	}

	public javax.swing.JLabel getjLabel15() {
		return jLabel15;
	}

	public void setjLabel15(javax.swing.JLabel jLabel15) {
		this.jLabel15 = jLabel15;
	}

	public javax.swing.JLabel getjLabel16() {
		return jLabel16;
	}

	public void setjLabel16(javax.swing.JLabel jLabel16) {
		this.jLabel16 = jLabel16;
	}

	public javax.swing.JLabel getjLabel17() {
		return jLabel17;
	}

	public void setjLabel17(javax.swing.JLabel jLabel17) {
		this.jLabel17 = jLabel17;
	}

	public javax.swing.JLabel getjLabel18() {
		return jLabel18;
	}

	public void setjLabel18(javax.swing.JLabel jLabel18) {
		this.jLabel18 = jLabel18;
	}

	public javax.swing.JLabel getjLabel19() {
		return jLabel19;
	}

	public void setjLabel19(javax.swing.JLabel jLabel19) {
		this.jLabel19 = jLabel19;
	}

	public javax.swing.JLabel getjLabel20() {
		return jLabel20;
	}

	public void setjLabel20(javax.swing.JLabel jLabel20) {
		this.jLabel20 = jLabel20;
	}

	public javax.swing.JLabel getjLabel21() {
		return jLabel21;
	}

	public void setjLabel21(javax.swing.JLabel jLabel21) {
		this.jLabel21 = jLabel21;
	}

	public javax.swing.JLabel getjLabel22() {
		return jLabel22;
	}

	public void setjLabel22(javax.swing.JLabel jLabel22) {
		this.jLabel22 = jLabel22;
	}

	public javax.swing.JLabel getjLabel23() {
		return jLabel23;
	}

	public void setjLabel23(javax.swing.JLabel jLabel23) {
		this.jLabel23 = jLabel23;
	}

	public javax.swing.JLabel getjLabel24() {
		return jLabel24;
	}

	public void setjLabel24(javax.swing.JLabel jLabel24) {
		this.jLabel24 = jLabel24;
	}

	static void AddPost(String text) {

		ProfileDAO dao = new ProfileDAO();
		Transaction dx = dao.getSession().beginTransaction();
		Profile a = dao.findById(FirstPage.id);

		List<Post> newps = a.getPosts();
		Post newp = new Post();
		newp.setPosterid(FriendsPage.current);
		Date date = new Date();
		newp.setDate(date);
		newp.setText(text);

		newps.add(newp);

		dao.attachClean(a);
		dx.commit();
		dao.getSession().close();

	}

	private void jButton2MouseReleased(java.awt.event.MouseEvent evt)
			throws IOException {

		ProfileDAO dao = new ProfileDAO();
		Transaction dx = dao.getSession().beginTransaction();
		Profile b = dao.findById(FirstPage.id);

		ImageIcon ia = new ImageIcon();

		JFrame f = new JFrame();
		JFileChooser chooser = new JFileChooser();
		FileNameExtensionFilter filter = new FileNameExtensionFilter(
				"JPG & GIF Images", "jpg", "gif");
		chooser.setFileFilter(filter);

		chooser.showOpenDialog(f);
		b.setPicture(chooser.getSelectedFile().getPath());
		Image img = ImageIO.read(new File(chooser.getSelectedFile().getPath()));
		Image ib = img.getScaledInstance(150, 150, 150);
		ia.setImage(ib);

		this.getjLabel1().setIcon(ia);
		dx.commit();
		dao.getSession().close();

	}

	public javax.swing.JLabel getjLabel1() {
		return jLabel1;
	}

	public void setjLabel1(javax.swing.JLabel jLabel1) {
		this.jLabel1 = jLabel1;
	}

	public javax.swing.JLabel getjLabel10() {
		return jLabel10;
	}

	public javax.swing.JLabel getjLabel2() {
		return jLabel2;
	}

	public void setjLabel2(javax.swing.JLabel jLabel2) {
		this.jLabel2 = jLabel2;
	}

	public void setjLabel10(javax.swing.JLabel jLabel10) {
		this.jLabel10 = jLabel10;
	}

	public javax.swing.JLabel getjLabel11() {
		return jLabel11;
	}

	public void setjLabel11(javax.swing.JLabel jLabel11) {
		this.jLabel11 = jLabel11;
	}

	public javax.swing.JLabel getjLabel12() {
		return jLabel12;
	}

	public void setjLabel12(javax.swing.JLabel jLabel12) {
		this.jLabel12 = jLabel12;
	}

	public javax.swing.JLabel getjLabel13() {
		return jLabel13;
	}

	public void setjLabel13(javax.swing.JLabel jLabel13) {
		this.jLabel13 = jLabel13;
	}

	public javax.swing.JLabel getjLabel14() {
		return jLabel14;
	}

	public void setjLabel14(javax.swing.JLabel jLabel14) {
		this.jLabel14 = jLabel14;
	}

	public javax.swing.JLabel getjLabel3() {
		return jLabel3;
	}

	public void setjLabel3(javax.swing.JLabel jLabel3) {
		this.jLabel3 = jLabel3;
	}

	public javax.swing.JLabel getjLabel4() {
		return jLabel4;
	}

	public void setjLabel4(javax.swing.JLabel jLabel4) {
		this.jLabel4 = jLabel4;
	}

	public javax.swing.JLabel getjLabel6() {
		return jLabel6;
	}

	public void setjLabel6(javax.swing.JLabel jLabel6) {
		this.jLabel6 = jLabel6;
	}

	public javax.swing.JLabel getjLabel7() {
		return jLabel7;
	}

	public void setjLabel7(javax.swing.JLabel jLabel7) {
		this.jLabel7 = jLabel7;
	}

	public javax.swing.JLabel getjLabel8() {
		return jLabel8;
	}

	public void setjLabel8(javax.swing.JLabel jLabel8) {
		this.jLabel8 = jLabel8;
	}

	public javax.swing.JLabel getjLabel9() {
		return jLabel9;
	}

	public void setjLabel9(javax.swing.JLabel jLabel9) {
		this.jLabel9 = jLabel9;
	}

	private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new ProfilePage().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton10;
	private javax.swing.JButton jButton11;
	private javax.swing.JButton jButton12;
	private javax.swing.JButton jButton13;
	private javax.swing.JButton jButton14;
	private javax.swing.JButton jButton15;
	private javax.swing.JButton jButton16;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JButton jButton4;
	private javax.swing.JButton jButton5;
	private javax.swing.JButton jButton6;
	private javax.swing.JButton jButton7;
	private javax.swing.JButton jButton8;
	private javax.swing.JButton jButton9;
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
	private javax.swing.JLabel jLabel31;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JSeparator jSeparator1;
	private javax.swing.JSeparator jSeparator10;
	private javax.swing.JSeparator jSeparator12;
	private javax.swing.JSeparator jSeparator2;
	private javax.swing.JSeparator jSeparator3;
	private javax.swing.JSeparator jSeparator4;
	private javax.swing.JSeparator jSeparator5;
	private javax.swing.JSeparator jSeparator6;
	private javax.swing.JSeparator jSeparator7;
	private javax.swing.JSeparator jSeparator8;
	private javax.swing.JSeparator jSeparator9;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField2;
	// End of variables declaration//GEN-END:variables

}