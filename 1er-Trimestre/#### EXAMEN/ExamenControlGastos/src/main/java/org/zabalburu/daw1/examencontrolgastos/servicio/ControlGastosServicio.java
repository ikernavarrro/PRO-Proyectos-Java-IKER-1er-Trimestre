/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.daw1.examencontrolgastos.servicio;

import java.util.Date;
import java.util.List;
import org.zabalburu.daw1.examencontrolgastos.dao.ComercialDAO;
import org.zabalburu.daw1.examencontrolgastos.dao.GastoDAO;
import org.zabalburu.daw1.examencontrolgastos.dao.TipoGastoDAO;
import org.zabalburu.daw1.examencontrolgastos.dao.impl.ComercialDAOImpl;
import org.zabalburu.daw1.examencontrolgastos.dao.impl.GastoDAOImpl;
import org.zabalburu.daw1.examencontrolgastos.dao.impl.TipoGastoDAOImpl;
import org.zabalburu.daw1.examencontrolgastos.modelo.Comercial;
import org.zabalburu.daw1.examencontrolgastos.modelo.Gasto;
import org.zabalburu.daw1.examencontrolgastos.modelo.TipoGasto;

/**
 *
 * @author Iker
 */
public class ControlGastosServicio {

    private ComercialDAO comercialDAO;
    private GastoDAO gastoDAO;
    private TipoGastoDAO tipoGastoDAO;
    
    public ControlGastosServicio() {
        this.comercialDAO = new ComercialDAOImpl();
        this.gastoDAO = new GastoDAOImpl();
        this.tipoGastoDAO = new TipoGastoDAOImpl();
        //AÑADIR AQUÍ DATOS EN MEMORIA DE PRUEBA!
    }
    
    //===================GESTIÓN-COMERCIALES==============
    public Comercial crearComercial(Integer id, String nombre, String Apellidos) {
        Comercial comercial = new Comercial(id, nombre, Apellidos);
        return comercialDAO.addComercial(comercial);
    }
    
    public Comercial obtenerComercial(Integer id) {
        return comercialDAO.getComercial(id);
    }
    
    public List<Comercial> listarComerciales() {
        return comercialDAO.getComerciales();
    }
    
    public void modificarComercial(Comercial modificar) {
        comercialDAO.modifyComercial(modificar);
    }
    
    public int eliminarComercial(Integer id) {
        return comercialDAO.removeComercial(id);
    }
    
    public void asignarGasto(Integer gastoAsignar, Integer comercialAsignar) {
        comercialDAO.assignGasto(gastoAsignar, comercialAsignar);
    }
    
    public void desAsignarGasto(Integer gastoDesAsignar, Integer comercialDesAsignar) {
        comercialDAO.unAssignGasto(gastoDesAsignar, comercialDesAsignar);
    }
    
    //===================GESTIÓN-GASTOS=====================
    public Gasto crearGasto(Integer id, TipoGasto tipoGasto, Date fechaGasto, Double importe, Comercial comercial) {
        Gasto gasto = new Gasto(id, tipoGasto, fechaGasto, importe, comercial);
        return gastoDAO.addGasto(gasto);
    }
    
    public Gasto obtenerGasto(Integer id) {
        return gastoDAO.getGasto(id);
    }
    
    public List<Gasto> listarGastos() {
        return gastoDAO.getGastos();
    }
    //===================GESTIÓN-TIPOS-DE-GASTOS============
    public TipoGasto obtenerTipoDeGasto(Integer id) {
        return tipoGastoDAO.getTipoGasto(id);
    }
    
    public List<TipoGasto> listarTiposDeGastos() {
        return tipoGastoDAO.getTiposDeGastos();
    }
}
