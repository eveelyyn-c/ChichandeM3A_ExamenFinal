package modelo;

import java.awt.Image;
import java.io.FileInputStream;
import java.sql.Date;

public class Medicamento {

    private int codigo;
    private String nomcomercial, nomgenerico;
    private Date elaboracion, expiracion;
    private double costo, pvp;
    private String receta;
    //Guardar foto
    private FileInputStream foto;
    private int longitud;
    //Recuperar imagen
    private Image imagen;

    public Medicamento() {
    }

    public Medicamento(int codigo, String nomcomercial, String nomgenerico, Date elaboracion, Date expiracion, double costo, double pvp, String receta, FileInputStream foto, int longitud, Image imagen) {
        this.codigo = codigo;
        this.nomcomercial = nomcomercial;
        this.nomgenerico = nomgenerico;
        this.elaboracion = elaboracion;
        this.expiracion = expiracion;
        this.costo = costo;
        this.pvp = pvp;
        this.receta = receta;
        this.foto = foto;
        this.longitud = longitud;
        this.imagen = imagen;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNomcomercial() {
        return nomcomercial;
    }

    public void setNomcomercial(String nomcomercial) {
        this.nomcomercial = nomcomercial;
    }

    public String getNomgenerico() {
        return nomgenerico;
    }

    public void setNomgenerico(String nomgenerico) {
        this.nomgenerico = nomgenerico;
    }

    public Date getElaboracion() {
        return elaboracion;
    }

    public void setElaboracion(Date elaboracion) {
        this.elaboracion = elaboracion;
    }

    public Date getExpiracion() {
        return expiracion;
    }

    public void setExpiracion(Date expiracion) {
        this.expiracion = expiracion;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public double getPvp() {
        return pvp;
    }

    public void setPvp(double pvp) {
        this.pvp = pvp;
    }

    public String getReceta() {
        return receta;
    }

    public void setReceta(String receta) {
        this.receta = receta;
    }

    public FileInputStream getFoto() {
        return foto;
    }

    public void setFoto(FileInputStream foto) {
        this.foto = foto;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public Image getImagen() {
        return imagen;
    }

    public void setImagen(Image imagen) {
        this.imagen = imagen;
    }

    
}
