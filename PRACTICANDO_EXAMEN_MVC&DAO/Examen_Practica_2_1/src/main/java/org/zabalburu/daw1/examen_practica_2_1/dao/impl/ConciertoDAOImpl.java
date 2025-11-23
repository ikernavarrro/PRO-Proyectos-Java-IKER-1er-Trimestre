/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.daw1.examen_practica_2_1.dao.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.NoSuchElementException;
import org.zabalburu.daw1.examen_practica_2_1.dao.ConciertoDAO;
import org.zabalburu.daw1.examen_practica_2_1.modelo.Concierto;

/**
 *
 * @author Iker Navarro Pérez
 */
public class ConciertoDAOImpl implements ConciertoDAO {

    private List<Concierto> conciertos;

    public ConciertoDAOImpl() {
        this.conciertos = new ArrayList<>();
    }

    @Override
    public void addConcierto(Concierto añadir) {
        conciertos.add(añadir);
    }

    @Override
    public Concierto getConcierto(int id) {
        int i;
        //For tradicional: Se repite mientras i sea MENOR(<) a la lista Y(&&) El id sea DISNTINTO(!=) al id que buscamos.
        for (i = 0; i < conciertos.size() && conciertos.get(i).getId() != id; i++);
        if (i < conciertos.size()) {
            return conciertos.get(i);
        } else {
            return null;
        }
    }

    @Override
    public List<Concierto> getConciertos() {
        return conciertos;
    }

    @Override
    public void modifyConcierto(Concierto modificar) {
        int pos = conciertos.indexOf(modificar);
        if (pos != -1) {
            conciertos.set(pos, modificar);
        } else {
            throw new NoSuchElementException("NO se ha encontrado el CONCIERTO");
        }
    }

    @Override
    public void removeConcierto(int id) {
        Concierto eliminar = getConcierto(id);
        if (eliminar != null) {
            conciertos.remove(eliminar);
        } else {
            throw new IllegalArgumentException("ID_CONCIERTO NO Encontrado " + "(" + id + ")");
        }
    }

    @Override
    public void assignBanda(int idConcierto, int idBanda) {
        Concierto cn = getConcierto(idConcierto);
        // EN NUESTRO CASO ASUMIMOS QUE EL USUARIO NO ES TONTO Y ASIGNA UN ID DE BANDA EXISTENTE
        if (cn != null) {
            cn.setIdBanda(idBanda);
        } else {
            throw new IllegalArgumentException("ID_CONCIERTO NO Encontrado " + "(" + idConcierto + ")");
        }
    }

    /*
        SI QUISIERAMOS VERIFICAR SI LA BANDA EXISTE TENDRÍAMOS QUE IMPLEMENTAR BandaDAO en el constructor.
        Algo así:
        
        private List<Concierto> conciertos;
        private BandaDAO bandaDAO;
    
        public ConciertoDAOImpl(BandaDAO bandaDAO) {
            this.conciertos = new ArrayList<>();
            this.bandaDAO = bandaDAO;
        }
        
        Y después validar:
        
        @Override
            public void assignBanda(int idConcierto, int idBanda) {
                Concierto cn = getConcierto(idConcierto);
                if (cn != null) {
                // Verificamos que la banda existe
                    if (bandaDAO.getBanda(idBanda) != null) {
                        cn.setIdBanda(idBanda);
                    } else {
                        throw new IllegalArgumentException("Banda con ID " + idBanda + " no existe");
                    }
                } else {
                    throw new IllegalArgumentException("Concierto con ID " + idConcierto + " no existe");
                }
            }
        }
        
     */
    @Override
    public void unAssignBanda(int idConcierto) {
        Concierto cn = getConcierto(idConcierto);
        if (cn != null) {
            cn.setIdBanda(null);
        } else {
            throw new IllegalArgumentException("ID_CONCIERTO NO Encontrado " + "(" + idConcierto + ")");
        }
    }

    

}
