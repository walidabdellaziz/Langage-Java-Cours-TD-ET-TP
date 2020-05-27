package graph;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Collectionaccount {
	List<Account> Comptes=new ArrayList<Account>();   // Collection ArrayList de Account

	public List<Account> getComptes() { //getter
		return Comptes;
	}

	

	public void setComptes(List<Account> comptes) { //Setter
		Comptes = comptes;
	}
@SuppressWarnings("unchecked")
public void Ajouter(Account c) // méthode pour ajouter un nouveau compte (Account) dans la collection comptes puis la sauvegarder sur le fichier collection.txt
	{
		try {
			File myfile=new File("collection.txt");
			long t=myfile.length();
			System.out.println(+myfile.length());			
	        boolean test=true;
	        if (t>0) {
	      	System.out.println("walid");
	        	FileInputStream fi = new FileInputStream(myfile);
	        	BufferedInputStream bufferL = new BufferedInputStream(fi);
		        ObjectInputStream lecture = new ObjectInputStream(bufferL);
	        this.Comptes = (List<Account>) lecture.readObject();
	        for (Account E:Comptes)
	        	
	        {
	       
	        	if (E.getLogin().equals(c.getLogin()))
	        	{   
	        		test=false;
	        	    JOptionPane.showMessageDialog(null, "login déjà utilisé"); // si le login du compte qu'on souhaite créer existe déjà
	        		break;
	        	}
			}
	        lecture.close();
	        fi.close();
	        }
	        if (test)
	        	
	        {  
	        	FileOutputStream f = new FileOutputStream(myfile);
	        	BufferedOutputStream buffer = new BufferedOutputStream(f);
		        ObjectOutputStream o = new ObjectOutputStream(buffer);
	        	Comptes.add(c); // ajout du nouveau compte
	        	o.writeObject(Comptes); // sauvegarder à nouveau la collection pour écarser la collection antérieur
	        	JOptionPane.showMessageDialog(null, "account created");
	        	o.close();
		        f.close();
	        }

	    } catch (FileNotFoundException ee) {
	        System.out.println("File not found");
	    } catch (IOException ee) {
	        System.out.println("Error initializing stream");
	    }
	catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
@SuppressWarnings("unchecked")
public void verifyAccount(Account c)  // méthode de vérification de login et mot de passe avant d'ouvrir une session	
{
		try {
			File myfile=new File("collection.txt");
			if (myfile.length()>0) { // vérifier est ce que le fichier et vide ou non(>0)
	        FileInputStream fi = new FileInputStream(myfile);
	        BufferedInputStream buffer = new BufferedInputStream(fi);
	        ObjectInputStream lecture = new ObjectInputStream(buffer);
	        
	        boolean test=false;
	        	Comptes = (List<Account>) lecture.readObject(); // récuperer la collection de comptes
	        	if (Comptes.indexOf(c)!=-1) // chercher l'existence du compte (login,password) qu'on a utilisé pour s'authentifier dans la collection.
	        	{   test=true;
	        		JOptionPane.showMessageDialog(null, "successful login"); // authentification réussie
	        	}
	        if (!test)
			JOptionPane.showMessageDialog(null, "Invalid login or password"); // échec de l'authentification
	   
	        lecture.close();
	        fi.close();}

	    } catch (FileNotFoundException ee) {
	        System.out.println("File not found");
	    } catch (IOException ee) {
	        System.out.println("Error initializing stream");
	    } 
		catch (ClassNotFoundException ee) {
	           //TODO Auto-generated catch block
	            ee.printStackTrace();
	        }	
	}

}
