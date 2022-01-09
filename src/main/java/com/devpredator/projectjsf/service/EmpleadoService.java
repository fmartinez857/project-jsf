/**
 * 
 */
package com.devpredator.projectjsf.service;

import java.util.ArrayList;
import java.util.List;

import com.devpredator.projectjsf.entity.Empleado;

/**
 * @author Fernando Martinez Z
 *
 */
public class EmpleadoService {
	/**
	 * Metodo que permite consultar la lista de empleados de empresas de TI
	 * @return ({@link Empleado} lista de empleados.
	 */
	public List<Empleado> consultarEmpleados()
	{
		//Generar la lista de empleados a consultar
		List<Empleado> empleados = new ArrayList<Empleado>();
		
		Empleado empleadoIBM = new Empleado();
		Empleado empleadoMicrosoft = new Empleado();
		Empleado empleadoApple = new Empleado();
		
		empleadoIBM.setNombre("Diego");
		empleadoIBM.setPrimerApellido("Paniagua");
		empleadoIBM.setSegundoApellido("Lopez");
		empleadoIBM.setPuesto("Senior Developer Java");
		empleadoIBM.setEstatus(true);
		
		empleadoMicrosoft.setNombre("Fernando");
		empleadoMicrosoft.setPrimerApellido("Martinez");
		empleadoMicrosoft.setSegundoApellido("Zarate");
		empleadoMicrosoft.setPuesto("Senior Developer Java");
		empleadoMicrosoft.setEstatus(true);
		
		empleadoApple.setNombre("Jorge");
		empleadoApple.setPrimerApellido("Vega");
		empleadoApple.setSegundoApellido("Galicia");
		empleadoApple.setPuesto("Developer Java");
		empleadoApple.setEstatus(true);
		
		empleados.add(empleadoIBM);
		empleados.add(empleadoMicrosoft);
		empleados.add(empleadoApple);
		
		return empleados;
		
	}
	

}
