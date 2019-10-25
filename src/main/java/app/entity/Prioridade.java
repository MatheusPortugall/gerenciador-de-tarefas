package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela PRIORIDADE
 * @generated
 */
@Entity
@Table(name = "\"PRIORIDADE\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Prioridade")
public class Prioridade implements Serializable {

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
  @Column(name = "prioridade", nullable = false, unique = false, insertable=true, updatable=true)
  
  private java.lang.String prioridade;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_tarefa", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private Tarefa tarefa;

  /**
   * Construtor
   * @generated
   */
  public Prioridade(){
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
  public Prioridade setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém prioridade
   * return prioridade
   * @generated
   */
  
  public java.lang.String getPrioridade(){
    return this.prioridade;
  }

  /**
   * Define prioridade
   * @param prioridade prioridade
   * @generated
   */
  public Prioridade setPrioridade(java.lang.String prioridade){
    this.prioridade = prioridade;
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
  public Prioridade setTarefa(Tarefa tarefa){
    this.tarefa = tarefa;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Prioridade object = (Prioridade)obj;
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
