/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import mx.com.gm.dao.PersonaDAO;
import mx.com.gm.domain.Persona;

/**
 *
 * @author jpenalvs
 */
public class OperacionesHibernateJPA {

    public static void main(String[] args) {
        PersonaDAO personaDao = new PersonaDAO();
//        personaDao.listar();

        /*Creamo el obj que vamos a insertar */
        Persona persona = new Persona();
        persona.setIdPersona(2);
        persona = personaDao.buscarPersona(persona);
//        persona.setNombre("Carlos");
//        persona.setApellido("Lor");
//        persona.setEmail("lere@gmail.com");
//        persona.setTelefono("666778833");

//        personaDao.insertar(persona);
//        personaDao.modificar(persona);
//        personaDao.eliminar(persona);
        personaDao.listar();

    }
}
