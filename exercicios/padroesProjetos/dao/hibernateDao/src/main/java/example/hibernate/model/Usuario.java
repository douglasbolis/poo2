package example.hibernate.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author douglas
 */

@Entity
@Table(name = "usuario")
public class Usuario {
  @Id
  @GeneratedValue(generator = "increment")    
  @GenericGenerator(name = "increment", strategy = "increment")
  private int id;

  private String nome;
  private String email;
  private String login;
  private String senha;

  public int getId () {
    return id;
  }

  public void setId (int id) {
    this.id = id;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getLogin() {
    return login;
  }

  public void setLogin(String login) {
    this.login = login;
  }

  public String getSenha() {
    return senha;
  }

  public void setSenha(String senha) {
    this.senha = senha;
  }
}
