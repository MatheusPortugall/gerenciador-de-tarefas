package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela USERTAREFA
 * @generated
 */
@Entity
@Table(name = "\"USERTAREFA\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.UserTarefa")
public class UserTarefa implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "id", nullable = false, insertable=true, updatable=true)
  private java.lang.String id = UUID.randomUUID().toString().toUpperCase();

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_user", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private User user;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_tarefa", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private Tarefa tarefa;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_prioridade", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private Prioridade prioridade;

  /**
   * Construtor
   * @generated
   */
  public UserTarefa(){
  }


  /**
   * Obtém id
   * return id
   * @generated
   */
  
  public java.lang.String getId(){
    return this.id;
  }

  /**
   * Define id
   * @param id id
   * @generated
   */
  public UserTarefa setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém user
   * return user
   * @generated
   */
  
  public User getUser(){
    return this.user;
  }

  /**
   * Define user
   * @param user user
   * @generated
   */
  public UserTarefa setUser(User user){
    this.user = user;
    return this;
  }

  /**
   * Obtém tarefa
   * return tarefa
   * @generated
   */
  
  public Tarefa getTarefa(){
    return this.tarefa;
  }

  /**
   * Define tarefa
   * @param tarefa tarefa
   * @generated
   */
  public UserTarefa setTarefa(Tarefa tarefa){
    this.tarefa = tarefa;
    return this;
  }

  /**
   * Obtém prioridade
   * return prioridade
   * @generated
   */
  
  public Prioridade getPrioridade(){
    return this.prioridade;
  }

  /**
   * Define prioridade
   * @param prioridade prioridade
   * @generated
   */
  public UserTarefa setPrioridade(Prioridade prioridade){
    this.prioridade = prioridade;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    UserTarefa object = (UserTarefa)obj;
    if (id != null ? !id.equals(object.id) : object.id != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }

}
