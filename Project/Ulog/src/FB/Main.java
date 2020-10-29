package FB;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.awt.*;

import org.hibernate.Transaction;
import javax.swing.JFrame;




public class Main {
	
	public static void main(String[] args) {
	//	AddPost(1,"Everything Burns");
	//	ShowPosts(1);
	//	AddComment(1,1,1,"hey");
	//	AddInterest(1,"Cinema");
		FirstPage a = new FirstPage();
		a.setVisible(true);
		a.setDefaultCloseOperation(a.EXIT_ON_CLOSE);
	
		
	/*	ProfileDAO dao = new ProfileDAO();
		  Transaction dx = dao.getSession().beginTransaction();
		  Profile b = dao.findById(4);
		  b.setPicture("C:\\Images\\default-kiwi.png");
		  dx.commit();
		  dao.getSession().close();
		*/
	}
	
	
	
	
/*	InterestDAO dao = new InterestDAO();
	  Transaction dx = dao.getSession().beginTransaction();
	  Interest a = new Interest();
	  a.setName("Games");
	  dao.save(a);
	  dx.commit();
	  dao.getSession().close(); */
	
	
	
	
	static void AddComment(Integer profileid,Integer postid,Integer commenterid, String text){
		
		  ProfileDAO dao = new ProfileDAO();
		  Transaction dx = dao.getSession().beginTransaction();
		  Profile a = dao.findById(profileid);
		  
		  
		  Post b = a.getPosts().get(postid-1);
		//  a.getPosts().remove(postid);
		  
		  List <Comment> comments = b.getComments();
		  Comment newc = new Comment();
		  Date date = new Date();
		  newc.setDate(date);
		  newc.setText(text);
		  newc.setOwnerId(commenterid);
		  comments.add(newc);
		  
		  
		  dao.attachClean(a);
		  dx.commit();
		  dao.getSession().close();
		
		
	}
	
	
	static void AddInterest(Integer profileid,String interestname){
		  ProfileDAO dao = new ProfileDAO();
		  Transaction dx = dao.getSession().beginTransaction();
		  Profile a = dao.findById(profileid);
		  
		  
		  List <Interest> newpis = a.getInterests();
		  Interest newi = new Interest();
		  newi.setName(interestname);
		  
		  
		  newpis.add(newi);
		  
		  dao.attachClean(a);
		  dx.commit();
		  dao.getSession().close();
		
		
		
	}
	
	
	static void AddPost(Integer id,String text){
		
		  ProfileDAO dao = new ProfileDAO();
		  Transaction dx = dao.getSession().beginTransaction();
		  Profile a = dao.findById(id);
		  
		  
		  List <Post> newps = a.getPosts();
		  Post newp = new Post();
		  Date date = new Date();
		  newp.setDate(date);
		  newp.setText(text);
		  
		  
		  newps.add(newp);
		  
		  dao.attachClean(a);
		  dx.commit();
		  dao.getSession().close();
		
		
	}
	
	static void ShowPosts(Integer id){
		
		
		  ProfileDAO dao = new ProfileDAO();
		  Transaction dx = dao.getSession().beginTransaction();
		  Profile a = dao.findById(id);
		  int i;
		  int j;
		  for(i=a.getPosts().size()-1;i>0;i--){  
			  
			  System.out.println(a.getPosts().get(i).getText());
			  System.out.printf("\t");
			  DateFormat dateFormat = new SimpleDateFormat("yyyy/MMM/dd");
			  System.out.println(dateFormat.format(a.getPosts().get(i).getDate()));
			  
			  
			  for(j=a.getPosts().get(i).getComments().size();j>0;j--){
				//  System.out.println("Comments: ");
				  Profile c = dao.findById(a.getPosts().get(i).getComments().get(0).getOwnerId());
				  System.out.printf("\t" +c.getFirstName()+" : ");
			     System.out.printf(a.getPosts().get(i).getComments().get(0).getText());
			     System.out.printf("\t");
			     System.out.println(dateFormat.format(a.getPosts().get(i).getComments().get(0).getDate()));
			     
			  }
			  
		  }
		  dx.commit();
		  dao.getSession().close();
		
	}
	
	
	
	
	
	static Integer Authenticate(String username, String password){
	
		  ProfileDAO dao = new ProfileDAO();
		  Transaction dx = dao.getSession().beginTransaction();
		  List<Profile> a = dao.findAll();
		  int i;
		  for(i=0;i<a.size() ;i++){ 
			  if(a.get(i).getUsername().equals(username)){
				  if(a.get(i).getPassword().equals(password)){
					  dx.commit();
					  dao.getSession().close();
					  return i+1;
					  
				  }
			  }
			  
			  
		  }
			  dx.commit();
			  dao.getSession().close();
			  return 0;
		
		
		
	}
	
	
	static void ShowFriends(Integer id){
		
		
		  ProfileDAO dao = new ProfileDAO();
		  Transaction dx = dao.getSession().beginTransaction();
		  Profile a = dao.findById(id);
		  int i;
		  for(i=0;i<a.getFriends().size() ;i++){  
			  Profile c = dao.findById(a.getFriends().get(i).getFriendId());
			  System.out.printf(c.getFirstName());
			  System.out.printf("\t");
			  System.out.println(c.getLastName());
			  
		  }
		  dx.commit();
		  dao.getSession().close();
		
	}
	
	
	
	
	
	static void AddFriend(Integer id,Integer Friendid){
		
		  ProfileDAO dao = new ProfileDAO();
		  Transaction dx = dao.getSession().beginTransaction();
		  Profile a = dao.findById(id);
		  
		  
		  List <Friend> newfs = a.getFriends();
		  Friend newf = new Friend();
		  newf.setFriendId(Friendid);
		  newfs.add(newf);
		  
		  dao.attachClean(a);
		  dx.commit();
		  dao.getSession().close();
		
		
	}
	
	
	public static void Register(String fname,String lname,String username,String password){
	//	  Scanner sc = new Scanner(System.in);
		  Profile new1 = new Profile();
		  new1.setFirstName(fname);
		//  System.out.println("Enter Last Name: ");
		  new1.setLastName(lname);
		//  System.out.println("Choose a username: ");
		  new1.setUsername(username);
		//  System.out.println("Choose a password: ");
		  new1.setPassword(password);
		  
		  

		  ProfileDAO dao = new ProfileDAO();
		  Transaction dx = dao.getSession().beginTransaction();
		  dao.save(new1);
		  dx.commit();
		  dao.getSession().close();
		  System.out.println("Registered!");
	  }
	

}

