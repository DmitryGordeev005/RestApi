package com.rest.Lab_Rest.model;

import javax.persistence.*;
import java.sql.Timestamp;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "order")

public class Order {

    @Id
    @GeneratedValue
    private int idorder;
    private int client_idclient;
    private int product_idproduct;
    private Timestamp time;

    public Order(){
    }

    public Order(int idorder, int client_idclient, int product_idproduct, Timestamp time) {
        this.idorder = idorder;
        this.client_idclient = client_idclient;
        this.product_idproduct = product_idproduct;
        this.time=time;
    }

    public int getIdorder() {
        return idorder;
    }

    public void setIdorder(int idorder) {
        this.idorder = idorder;
    }

    public int getClient_idclient() {
        return client_idclient;
    }

    public void setClient_idclient(int client_idclient) {
        this.client_idclient = client_idclient;
    }

    public int getProduct_idproduct() {
        return product_idproduct;
    }

    public void setProduct_idproduct(int product_idproduct) {
        this.product_idproduct = product_idproduct;
    }

    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }
}
