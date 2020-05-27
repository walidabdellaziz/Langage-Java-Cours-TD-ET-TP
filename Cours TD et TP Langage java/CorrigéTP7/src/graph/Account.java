package graph;
import java.util.Objects;
import java.io.Serializable;


public class Account implements Serializable{ // pour pouvoir instancier des objets sérialisables
private String login ; //l'attribut qui représente le login du compte (Account)
private String password ; //l'attribut qui représente le password du compte (Account)

public Account(String login, String password) { //constructeur
	this.login = login;
	this.password = password;
}

public void setLogin(String login) {
	this.login = login;
}
public void setPassword(String password) {
	this.password = password;
}
public String getLogin() {
	return login;
}
public String getPassword() {
	return password;
}
@Override
public String toString() {
    return "login:" + login + "password" + password;
}
@Override // redéfinir la méthode equals(de la classe Object) pour l'adapter aux objets de la classe Account.
public boolean equals(Object o) { 

    // If the object is compared with itself then return true   
    if (o == this) { 
        return true; 
    } 

    /* Check if o is an instance of Complex or not 
      "null instanceof [type]" also returns false */
    if (!(o instanceof Account)) { 
        return false; 
    } 
      
    // typecast o to Complex so that we can compare data members  
    Account c = (Account) o; 
      
    // Compare the data members and return accordingly  
    return Objects.equals(login,c.login) &&
    Objects.equals(password,c.password);

} 
//Redéfinir la méthode hashcode(de la classe Object) pour l'adapter aux objets de la classe Account.
public int hashCode() {
    return Objects.hash(login,password);
}
}
