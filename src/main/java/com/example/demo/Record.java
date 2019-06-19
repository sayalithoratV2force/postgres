package com.example.demo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table(name = "product")
public class Record {

  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column(name="id_product")
  private Long id;
  
  @Column(name="product_name")
  private String name;

  protected Record() {}

  public Record(String name) {
    this.name = name;
  }

  public Long getId() {
    return this.id;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return String.format("Task[id=%d, name='%s']", this.id, this.name);
  }

}
