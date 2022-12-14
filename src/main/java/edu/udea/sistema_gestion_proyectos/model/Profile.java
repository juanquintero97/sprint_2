package edu.udea.sistema_gestion_proyectos.model;

import org.springframework.lang.NonNull;
import java.util.*;

public class Profile {
    private long id;
    private String image;
    private String phone;
    private Empleado user;
    private Date createdAt;
    private Date updatedAt;

    public Profile(@NonNull long id,
                   String image,
                   String phone,
                   Empleado user,
                   Date createdAt,
                   Date updatedAt) {
        this.id = id;
        this.image = image;
        this.phone = phone;
        this.user = user;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public long getId() {
        return id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Empleado getUser() {
        return user;
    }

    public void setUser(Empleado user) {
        this.user = user;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}
