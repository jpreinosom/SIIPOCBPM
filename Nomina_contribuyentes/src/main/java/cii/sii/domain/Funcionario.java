package cii.sii.domain;

/**
 * This class was automatically generated by the data modeler tool.
 * $HASH(ee91fd5c29a5f970e1da9ab5d415a814)
 */
@org.kie.api.definition.type.Label(value = "Funcionario")
public class Funcionario extends java.lang.Object implements java.io.Serializable {

    static final long serialVersionUID = 1L;
    
    @org.kie.api.definition.type.Label(value = "Email")
    @org.kie.api.definition.type.Position(value = 1)
    private java.lang.String email;
    
    @org.kie.api.definition.type.Label(value = "Usuario")
    @org.kie.api.definition.type.Position(value = 0)
    private java.lang.String usuario;

    public Funcionario() {
    }

    public Funcionario(java.lang.String usuario, java.lang.String email) {
        this.usuario = usuario;
        this.email = email;
    }


    
    public java.lang.String getEmail() {
        return this.email;
    }

    public void setEmail(java.lang.String email) {
        this.email = email;
    }
    
    public java.lang.String getUsuario() {
        return this.usuario;
    }

    public void setUsuario(java.lang.String usuario) {
        this.usuario = usuario;
    }
}