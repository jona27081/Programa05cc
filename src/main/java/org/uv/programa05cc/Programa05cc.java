/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package org.uv.programa05cc;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.List;



/**
 *
 * @author zS20006736
 */
public class Programa05cc {

    public static void main(String[] args) {
        DAOEmpleado dao = new DAOEmpleado();
        
        /*Empleado emp = new Empleado();
        emp.setNombre("Ojeda");
        emp.setDireccion("Mi casa");
        emp.setTelefono("2312368217");
        dao.create(emp);*/
        
        /*Empleado empEncontrado = dao.findById(1L);
        System.out.println("Empleado: " +empEncontrado.getNombre());*/
        
        //dao.delete(2L);
        Empleado aEmp = new Empleado();
        aEmp.setNombre("Jonathan Ojeda");
        aEmp.setDireccion("Casa nueva");
        aEmp.setTelefono("2713181293");
        dao.update(1L, aEmp);
        
        /*Empleado emp = new Empleado();
        emp.setNombre("Nuevo Ojeda");
        emp.setDireccion("Mi casa");
        emp.setTelefono("2312368217");
        dao.update(1L,emp);*/
        
        /*List<Empleado> lemp = dao.findAll();
        for (Empleado emp : lemp) {
            String msg=String.valueOf(emp.getClave()+" "+emp.getNombre()+" "+emp.getDireccion()+" "+emp.getTelefono());
            Logger.getLogger(Programa05cc.class.getName()).log(Level.INFO, msg);
        }*/
        
    }
}
