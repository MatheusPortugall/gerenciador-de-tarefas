package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela TAREFA
 * @generated
 */
@Entity
@Table(name = "\"TAREFA\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Tarefa")
public class Tarefa implements Serializable {

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
  @Column(name = "nomeTarefa", nullable = false, unique = false, insertable=true, updatable=true)
  
  private java.lang.String nomeTarefa;

  /**
  * @generated
  */
  @Column(name = "descricao", nullable = false, unique = false, insertable=true, updatable=true)
  
  private java.lang.String descricao;

  /**
   * Construtor
   * @generated
   */
  public Tarefa(){
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
  public Tarefa setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém nomeTarefa
   * return nomeTarefa
   * @generated
   */
  
  public java.lang.String getNomeTarefa(){
    return this.nomeTarefa;
  }

  /**
   * Define nomeTarefa
   * @param nomeTarefa nomeTarefa
   * @generated
   */
  public Tarefa setNomeTarefa(java.lang.String nomeTarefa){
    this.nomeTarefa = nomeTarefa;
    return this;
  }

  /**
   * Obtém descricao
   * return descricao
   * @generated
   */
  
  public java.lang.String getDescricao(){
    return this.descricao;
  }

  /**
   * Define descricao
   * @param descricao descricao
   * @generated
   */
  public Tarefa setDescricao(java.lang.String descricao){
    this.descricao = descricao;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Tarefa object = (Tarefa)obj;
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
