package modelo;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.imageio.ImageReadParam;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;
import javax.swing.ImageIcon;

public class ModeloMedicamento extends Medicamento {

    ConectPG conpg = new ConectPG();

    public ModeloMedicamento() {
    }

    public ModeloMedicamento(int codigo, String nomcomercial, String nomgenerico, Date elaboracion, Date expiracion, double costo, double pvp, String receta, FileInputStream foto, int longitud, Image imagen) {
        super(codigo, nomcomercial, nomgenerico, elaboracion, expiracion, costo, pvp, receta, foto, longitud, imagen);
    }
    
    public boolean crearMedicamentoSinFoto() {
        String sql = "INSERT INTO medicamento(nomcomercial,nomgenerico ,elaboracion,expiracion,costo, pvp, foto, receta) VALUES ('" + getNomcomercial() + "','" + getNomgenerico() + "', '" + getElaboracion() + "','" + getExpiracion() + "'," + getCosto() + "," + getPvp() + ",'null','" + getReceta() + "');";
        return conpg.accion(sql);
    }

    public boolean crearMedicamentoFoto() {
        try {
            String sql;
            sql = "INSERT INTO medicamento (nomcomercial,nomgenerico ,elaboracion,expiracion,costo, pvp, foto, receta)";
            sql += "VALUES(?,?,?,?,?,?,?,?)";
            PreparedStatement ps = conpg.getCon().prepareStatement(sql);
            ps.setString(1, getNomcomercial());
            ps.setString(2, getNomgenerico());
            ps.setDate(3, getElaboracion());
            ps.setDate(4, getExpiracion());
            ps.setDouble(5, getCosto());
            ps.setDouble(6, getPvp());
            ps.setString(7, getReceta());
            ps.setBinaryStream(8, getFoto(), getLongitud());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloMedicamento.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean modificarMedicamentoSinFoto() {
        String sql = "UPDATE medicamento SET nomcomercial='" + getNomcomercial() + "',nomgenerico='" + getNomgenerico() + "', '" + getElaboracion() + "','" + getExpiracion() + "', costo=" + getCosto() + ", pvp=" + getPvp() + ", receta='" + getReceta() + "'";
        return conpg.accion(sql);
    }

    public boolean modificarMedicamentoFoto() {
        try {
            String sql;
            sql = "UPDATE medicamento SET nomcomercial=?,nomgenerico=? ,elaboracion=?,expiracion=?,costo=?, pvp=?, foto=?, receta Where codigo=?";
            PreparedStatement ps = conpg.getCon().prepareStatement(sql);
            ps.setString(1, getNomcomercial());
            ps.setString(2, getNomgenerico());
            ps.setDate(3, getElaboracion());
            ps.setDate(4, getExpiracion());
            ps.setDouble(5, getCosto());
            ps.setDouble(6, getPvp());
            ps.setString(7, getReceta());
            ps.setBinaryStream(8, getFoto(), getLongitud());
            ps.setInt(9, getCodigo());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloMedicamento.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean eliminarMedicamento(int codigo) {
        String sql = "DELETE FROM medicamento WHERE codigo = " + codigo + ";";
        return conpg.accion(sql);
    }
    public List<Medicamento> buscarMedicamento(String nombre) {
        try {
            List<Medicamento> lista = new ArrayList<>();
            String sql = "Select * from medicamento where nomcomercial like '" + nombre + "%'";
            ResultSet rs = conpg.consulta(sql); 
            byte[] bytea;
            while (rs.next()) {
                Medicamento medicamento = new Medicamento();
                medicamento.setCodigo(rs.getInt("codigo"));
                medicamento.setNomcomercial(rs.getString("nomcomercial"));
                medicamento.setNomgenerico(rs.getString("nomgenerico"));
                medicamento.setElaboracion(rs.getDate("elaboracion"));
                medicamento.setExpiracion(rs.getDate("expiracion"));
                medicamento.setCosto(rs.getDouble("costo"));
                medicamento.setPvp(rs.getDouble("pvp"));
                medicamento.setReceta(rs.getString("receta"));
                bytea = rs.getBytes("foto");
                if (bytea != null) {
                    try {
                        medicamento.setImagen(obtenerImagen(bytea));
                    } catch (IOException ex) {
                        Logger.getLogger(ModeloMedicamento.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                lista.add(medicamento); 
            }
            rs.close();
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloMedicamento.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public List<Medicamento> listaMedicamentosTabla() {
        try {
            List<Medicamento> lista = new ArrayList<>();
            String sql = "select * from medicamento";
            ResultSet rs = conpg.consulta(sql); 
            byte[] bytea;
            while (rs.next()) {
                Medicamento medicamento = new Medicamento();
                medicamento.setCodigo(rs.getInt("codigo"));
                medicamento.setNomcomercial(rs.getString("nomcomercial"));
                medicamento.setNomgenerico(rs.getString("nomgenerico"));
                medicamento.setElaboracion(rs.getDate("elaboracion"));
                medicamento.setExpiracion(rs.getDate("expiracion"));
                medicamento.setCosto(rs.getDouble("costo"));
                medicamento.setPvp(rs.getDouble("pvp"));
                medicamento.setReceta(rs.getString("receta"));
                bytea = rs.getBytes("foto");
                if (bytea != null) {
                    try {
                        medicamento.setImagen(obtenerImagen(bytea));
                    } catch (IOException ex) {
                        Logger.getLogger(ModeloMedicamento.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                lista.add(medicamento);
            }
            rs.close();
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloMedicamento.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public List<Medicamento> listaProductoJDialog() {
        try {
            List<Medicamento> lista = new ArrayList<>();
            String sql = "select codigo,nomcomercial,nomgenerico, costo,pvp, elaboracion, expiracion, receta from medicamento";
            ResultSet rs = conpg.consulta(sql); 
            while (rs.next()) {
                Medicamento medicamento = new Medicamento();
                medicamento.setCodigo(rs.getInt("codigo"));
                medicamento.setNomcomercial(rs.getString("nomcomercial"));
                medicamento.setNomgenerico(rs.getString("nomgenerico"));
                medicamento.setElaboracion(rs.getDate("elaboracion"));
                medicamento.setExpiracion(rs.getDate("expiracion"));
                medicamento.setCosto(rs.getDouble("costo"));
                medicamento.setPvp(rs.getDouble("pvp"));
                medicamento.setReceta(rs.getString("receta"));
                lista.add(medicamento); 
            }
            rs.close();
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloMedicamento.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    private Image obtenerImagen(byte[] bytes) throws IOException {
        ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
        Iterator it = ImageIO.getImageReadersByFormatName("png");
        ImageReader reader = (ImageReader) it.next();
        Object source = bis;
        ImageInputStream iis = ImageIO.createImageInputStream(source);
        reader.setInput(iis, true);
        ImageReadParam param = reader.getDefaultReadParam();
        param.setSourceSubsampling(1, 1, 0, 0);
        return reader.read(0, param);
    }

    public ImageIcon ConsultarFotoJDialog(int codigo) {
        conpg.getCon();
        String sql = "select foto from \"medicamento\" where codigo = " + codigo + ";";
        ImageIcon foto;
        InputStream is;
        try {
            ResultSet rs = conpg.consulta(sql);
            while (rs.next()) {
                is = rs.getBinaryStream(1);
                BufferedImage bi = ImageIO.read(is);
                foto = new ImageIcon(bi);
                Image img = foto.getImage();
                Image newimg = img.getScaledInstance(118, 139, java.awt.Image.SCALE_SMOOTH);
                ImageIcon newicon = new ImageIcon(newimg);
                return newicon;
            }
        } catch (Exception ex) {
            return null;
        }
        return null;
    }
}
