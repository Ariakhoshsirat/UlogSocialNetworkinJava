/*
 * FriendsPage.java
 *
 * Created on __DATE__, __TIME__
 */

package FB;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

import org.hibernate.Transaction;

/**
 *
 * @author  __USER__
 */
public class FriendsPage extends javax.swing.JFrame {
	public static int current;
	public static int frid = 0;

	/** Creates new form FriendsPage */
	public FriendsPage() {
		initComponents();
	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jButton1 = new javax.swing.JButton();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		jButton2 = new javax.swing.JButton();
		jLabel6 = new javax.swing.JLabel();
		jLabel7 = new javax.swing.JLabel();
		jButton3 = new javax.swing.JButton();
		jLabel8 = new javax.swing.JLabel();
		jLabel9 = new javax.swing.JLabel();
		jButton4 = new javax.swing.JButton();
		jLabel10 = new javax.swing.JLabel();
		jLabel11 = new javax.swing.JLabel();
		jButton5 = new javax.swing.JButton();
		jButton6 = new javax.swing.JButton();
		jButton7 = new javax.swing.JButton();

		jButton1.setText("Go to profile");
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

		jLabel3.setText("Friends:");

		jButton2.setText("Go to profile");
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

		jButton3.setText("Go to profile");
		jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseReleased(java.awt.event.MouseEvent evt) {
				try {
					jButton3MouseReleased(evt);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		jButton4.setText("Go to profile");
		jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseReleased(java.awt.event.MouseEvent evt) {
				try {
					jButton4MouseReleased(evt);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		jButton5.setText("Go to profile");
		jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseReleased(java.awt.event.MouseEvent evt) {
				try {
					jButton5MouseReleased(evt);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		jButton6.setText("Down");
		jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseReleased(java.awt.event.MouseEvent evt) {
				jButton6MouseReleased(evt);
			}
		});

		jButton7.setText("Up");
		jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseReleased(java.awt.event.MouseEvent evt) {
				jButton7MouseReleased(evt);
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
																		.addGroup(
																				layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING,
																								false)
																						.addGroup(
																								javax.swing.GroupLayout.Alignment.LEADING,
																								layout
																										.createSequentialGroup()
																										.addGap(
																												110,
																												110,
																												110)
																										.addComponent(
																												jLabel3,
																												javax.swing.GroupLayout.DEFAULT_SIZE,
																												javax.swing.GroupLayout.DEFAULT_SIZE,
																												Short.MAX_VALUE))
																						.addGroup(
																								javax.swing.GroupLayout.Alignment.LEADING,
																								layout
																										.createSequentialGroup()
																										.addContainerGap()
																										.addComponent(
																												jLabel1,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												45,
																												javax.swing.GroupLayout.PREFERRED_SIZE)
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																										.addComponent(
																												jLabel2,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												103,
																												javax.swing.GroupLayout.PREFERRED_SIZE)))
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jButton1,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE))
														.addGroup(
																javax.swing.GroupLayout.Alignment.TRAILING,
																layout
																		.createSequentialGroup()
																		.addContainerGap()
																		.addComponent(
																				jLabel4,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				45,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jLabel5,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				103,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jButton2,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE))
														.addGroup(
																javax.swing.GroupLayout.Alignment.TRAILING,
																layout
																		.createSequentialGroup()
																		.addContainerGap()
																		.addComponent(
																				jLabel6,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				45,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jLabel7,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				103,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jButton3,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE))
														.addGroup(
																javax.swing.GroupLayout.Alignment.TRAILING,
																layout
																		.createSequentialGroup()
																		.addContainerGap()
																		.addComponent(
																				jLabel8,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				45,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jLabel9,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				103,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jButton4,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE))
														.addGroup(
																layout
																		.createSequentialGroup()
																		.addContainerGap()
																		.addComponent(
																				jLabel10,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				45,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addGroup(
																				layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addGroup(
																								layout
																										.createSequentialGroup()
																										.addComponent(
																												jButton7,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												63,
																												javax.swing.GroupLayout.PREFERRED_SIZE)
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																										.addComponent(
																												jButton6))
																						.addGroup(
																								layout
																										.createSequentialGroup()
																										.addComponent(
																												jLabel11,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												103,
																												javax.swing.GroupLayout.PREFERRED_SIZE)
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																										.addComponent(
																												jButton5,
																												javax.swing.GroupLayout.DEFAULT_SIZE,
																												javax.swing.GroupLayout.DEFAULT_SIZE,
																												Short.MAX_VALUE)))))
										.addContainerGap()));
		layout
				.setVerticalGroup(layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								layout
										.createSequentialGroup()
										.addGap(13, 13, 13)
										.addComponent(jLabel3)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																jLabel1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																47,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel2)
														.addComponent(jButton1))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																jLabel4,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																47,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel5)
														.addComponent(jButton2))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																jLabel6,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																47,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel7)
														.addComponent(jButton3))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																jLabel8,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																47,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel9)
														.addComponent(jButton4))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																jLabel10,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																47,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel11)
														.addComponent(jButton5))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jButton7)
														.addComponent(jButton6))));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton7MouseReleased(java.awt.event.MouseEvent evt) {
		// TODO add your handling code here:
	}

	private void jButton6MouseReleased(java.awt.event.MouseEvent evt) {
		// TODO add your handling code here:
	}

	private void jButton5MouseReleased(java.awt.event.MouseEvent evt)
			throws IOException {
		ProfilePage fpg = new ProfilePage();
		fpg.getjButton2().setVisible(false);
		fpg.getjButton10().setVisible(false);
		fpg.getjButton13().setVisible(false);
		fpg.getjButton14().setVisible(false);
		fpg.getjButton15().setVisible(false);
		fpg.getjButton16().setVisible(false);
		fpg.getjLabel31().setVisible(false);
		fpg.getjButton11().setVisible(false);
		fpg.getjButton12().setVisible(false);
		fpg.getjTextField2().setVisible(false);
		ProfileDAO dao = new ProfileDAO();
		Transaction dx = dao.getSession().beginTransaction();
		Profile b = dao.findById(Integer.parseInt(jLabel10.getText()));
		fpg.getjLabel2().setText(b.getFirstName());
		fpg.getjLabel3().setText(b.getLastName());
		current = FirstPage.id;
		FirstPage.id = b.getId();
		dx.commit();
		dao.getSession().close();
		ShowPosts(fpg, b.getId(), 0);
		fpg.setDefaultCloseOperation(HIDE_ON_CLOSE);
		fpg.setVisible(true);
		

	}

	private void jButton4MouseReleased(java.awt.event.MouseEvent evt)
			throws IOException {
		ProfilePage fpg = new ProfilePage();
		fpg.getjButton2().setVisible(false);
		fpg.getjButton10().setVisible(false);
		fpg.getjButton11().setVisible(false);
		fpg.getjTextField2().setVisible(false);
		fpg.getjButton13().setVisible(false);
		fpg.getjButton14().setVisible(false);
		fpg.getjButton15().setVisible(false);
		fpg.getjButton16().setVisible(false);
		fpg.getjLabel31().setVisible(false);
		fpg.getjButton12().setVisible(false);
		ProfileDAO dao = new ProfileDAO();
		Transaction dx = dao.getSession().beginTransaction();
		Profile b = dao.findById(Integer.parseInt(jLabel8.getText()));
		fpg.getjLabel2().setText(b.getFirstName());
		fpg.getjLabel3().setText(b.getLastName());
		current = FirstPage.id;
		FirstPage.id = b.getId();
		dx.commit();
		dao.getSession().close();
		ShowPosts(fpg, b.getId(), 0);
		fpg.setDefaultCloseOperation(HIDE_ON_CLOSE);
		fpg.setVisible(true);

	}

	private void jButton3MouseReleased(java.awt.event.MouseEvent evt)
			throws IOException {
		ProfilePage fpg = new ProfilePage();
		fpg.getjButton2().setVisible(false);
		fpg.getjButton10().setVisible(false);
		fpg.getjButton11().setVisible(false);
		fpg.getjButton12().setVisible(false);
		fpg.getjTextField2().setVisible(false);
		fpg.getjButton13().setVisible(false);
		fpg.getjButton14().setVisible(false);
		fpg.getjButton15().setVisible(false);
		fpg.getjButton16().setVisible(false);
		fpg.getjLabel31().setVisible(false);
		ProfileDAO dao = new ProfileDAO();
		Transaction dx = dao.getSession().beginTransaction();
		Profile b = dao.findById(Integer.parseInt(jLabel6.getText()));
		fpg.getjLabel2().setText(b.getFirstName());
		fpg.getjLabel3().setText(b.getLastName());
		current = FirstPage.id;
		FirstPage.id = b.getId();
		ShowPosts(fpg, b.getId(), 0);
		fpg.setDefaultCloseOperation(HIDE_ON_CLOSE);
		fpg.setVisible(true);
		dx.commit();
		dao.getSession().close();

	}

	private void jButton2MouseReleased(java.awt.event.MouseEvent evt)
			throws IOException {
		ProfilePage fpg = new ProfilePage();
		fpg.getjButton2().setVisible(false);
		fpg.getjButton10().setVisible(false);
		fpg.getjButton11().setVisible(false);
		fpg.getjButton12().setVisible(false);
		fpg.getjButton13().setVisible(false);
		fpg.getjButton14().setVisible(false);
		fpg.getjButton15().setVisible(false);
		fpg.getjButton16().setVisible(false);
		fpg.getjLabel31().setVisible(false);
		fpg.getjTextField2().setVisible(false);
		ProfileDAO dao = new ProfileDAO();
		Transaction dx = dao.getSession().beginTransaction();
		Profile b = dao.findById(Integer.parseInt(jLabel4.getText()));
		fpg.getjLabel2().setText(b.getFirstName());
		fpg.getjLabel3().setText(b.getLastName());
		current = FirstPage.id;
		FirstPage.id = b.getId();
		dx.commit();
		dao.getSession().close();
		ShowPosts(fpg, b.getId(), 0);
		fpg.setDefaultCloseOperation(HIDE_ON_CLOSE);
		fpg.setVisible(true);
		

	}

	private void jButton1MouseReleased(java.awt.event.MouseEvent evt)
			throws IOException {
		ProfilePage fpg = new ProfilePage();
		fpg.getjButton2().setVisible(false);
		fpg.getjButton10().setVisible(false);
		fpg.getjButton12().setVisible(false);
		fpg.getjButton11().setVisible(false);
		fpg.getjButton13().setVisible(false);
		fpg.getjButton14().setVisible(false);
		fpg.getjButton15().setVisible(false);
		fpg.getjButton16().setVisible(false);
		fpg.getjLabel31().setVisible(false);
		fpg.getjTextField2().setVisible(false);
		ProfileDAO dao = new ProfileDAO();
		Transaction dx = dao.getSession().beginTransaction();
		Profile b = dao.findById(Integer.parseInt(jLabel1.getText()));
		fpg.getjLabel2().setText(b.getFirstName());
		fpg.getjLabel3().setText(b.getLastName());
		current = FirstPage.id;
		FirstPage.id = b.getId();
		dx.commit();
		dao.getSession().close();
		ShowPosts(fpg, FirstPage.id, 0);
		fpg.setDefaultCloseOperation(HIDE_ON_CLOSE);
		fpg.setVisible(true);
		

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
		ImageIcon ia = new ImageIcon();

		Image img = ImageIO.read(new File(b.getPicture()));
		Image ib = img.getScaledInstance(150, 150, 150);
		ia.setImage(ib);

		a.getjLabel1().setIcon(ia);
		dx.commit();
		dao.getSession().close();

	}

	/*
	 static void ShowPosts(ProfilePage a, Profile user, Integer id)
	 throws IOException {

	
	 ProfileDAO dao = new ProfileDAO();
	 Transaction dx = dao.getSession().beginTransaction();
	 Profile b = dao.findById(id);

	 int i;
	 int j;
	 for (i = b.getPosts().size() - 1, j = 0; i >= 0 && j < 5; i--, j++) {
	 if (j == 0) {
	 a.getjLabel4().setText(b.getPosts().get(i).getText());
	 DateFormat dateFormat = new SimpleDateFormat("yyyy/MMM/dd");
	 a.getjLabel9().setText(
	 dateFormat.format(b.getPosts().get(i).getDate()));
	 }
	 if (j == 1) {
	 a.getjLabel6().setText(b.getPosts().get(i).getText());
	 DateFormat dateFormat = new SimpleDateFormat("yyyy/MMM/dd");
	 a.getjLabel10().setText(
	 dateFormat.format(b.getPosts().get(i).getDate()));
	 }
	 if (j == 2) {
	 a.getjLabel7().setText(b.getPosts().get(i).getText());
	 DateFormat dateFormat = new SimpleDateFormat("yyyy/MMM/dd");
	 a.getjLabel11().setText(
	 dateFormat.format(b.getPosts().get(i).getDate()));
	 }
	 if (j == 3) {
	 a.getjLabel8().setText(b.getPosts().get(i).getText());
	 DateFormat dateFormat = new SimpleDateFormat("yyyy/MMM/dd");
	 a.getjLabel12().setText(
	 dateFormat.format(b.getPosts().get(i).getDate()));
	 }
	 if (j == 4) {
	 a.getjLabel13().setText(b.getPosts().get(i).getText());
	 DateFormat dateFormat = new SimpleDateFormat("yyyy/MMM/dd");
	 a.getjLabel14().setText(
	 dateFormat.format(b.getPosts().get(i).getDate()));
	 }

	

	 }
	 ImageIcon ia = new ImageIcon();

	
	 Image img = ImageIO.read(new File(b.getPicture()));
	 Image ib = img.getScaledInstance(150, 150, 150);
	 ia.setImage(ib);

	 a.getjLabel1().setIcon(ia);
	 dx.commit();
	 dao.getSession().close();

	 }
	 */
	public javax.swing.JLabel getjLabel1() {
		return jLabel1;
	}

	public void setjLabel1(javax.swing.JLabel jLabel1) {
		this.jLabel1 = jLabel1;
	}

	public javax.swing.JLabel getjLabel10() {
		return jLabel10;
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

	public javax.swing.JLabel getjLabel2() {
		return jLabel2;
	}

	public void setjLabel2(javax.swing.JLabel jLabel2) {
		this.jLabel2 = jLabel2;
	}

	public javax.swing.JLabel getjLabel4() {
		return jLabel4;
	}

	public void setjLabel4(javax.swing.JLabel jLabel4) {
		this.jLabel4 = jLabel4;
	}

	public javax.swing.JLabel getjLabel5() {
		return jLabel5;
	}

	public void setjLabel5(javax.swing.JLabel jLabel5) {
		this.jLabel5 = jLabel5;
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

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new FriendsPage().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JButton jButton4;
	private javax.swing.JButton jButton5;
	private javax.swing.JButton jButton6;
	private javax.swing.JButton jButton7;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel11;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	// End of variables declaration//GEN-END:variables

}