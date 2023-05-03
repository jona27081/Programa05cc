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
        Empleado aEmp = new Empleado();
        aEmp.setNombre("Jonathan Ojeda");
        aEmp.setDireccion("Casa nueva");
        aEmp.setTelefono("2713181293");
        dao.update(1L, aEmp);
    }
}
