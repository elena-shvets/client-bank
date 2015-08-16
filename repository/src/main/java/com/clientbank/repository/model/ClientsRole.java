package com.clientbank.repository.model;

/**
 * Created by elena on 12.08.15.
 */
public class ClientsRole {

    private Integer id;

    private Integer clientId;

//    @Enumerated(EnumType.STRING)
//    @Column(name="role", nullable=false)
    private Role role;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
