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
		
		Empleado empleadoNetflix = new Empleado();
		Empleado empleadoAmazon = new Empleado();
		Empleado empleadoHP = new Empleado();
		Empleado empleadoOracle = new Empleado();
		Empleado empleadoDeloitte = new Empleado();
		Empleado empleadoDisney = new Empleado();
		
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
		
		empleadoNetflix.setNombre("Pedro");
		empleadoNetflix.setPrimerApellido("Vega");
		empleadoNetflix.setSegundoApellido("Galicia");
		empleadoNetflix.setPuesto("Developer Java");
		empleadoNetflix.setEstatus(true);
		
		empleadoAmazon.setNombre("Teresa");
		empleadoAmazon.setPrimerApellido("Vega");
		empleadoAmazon.setSegundoApellido("Galicia");
		empleadoAmazon.setPuesto("Developer Java");
		empleadoAmazon.setEstatus(true);
		
		empleadoHP.setNombre("Ana");
		empleadoHP.setPrimerApellido("Vega");
		empleadoHP.setSegundoApellido("Galicia");
		empleadoHP.setPuesto("Developer Java");
		empleadoHP.setEstatus(true);
		
		empleadoOracle.setNombre("Antonio");
		empleadoOracle.setPrimerApellido("Vega");
		empleadoOracle.setSegundoApellido("Galicia");
		empleadoOracle.setPuesto("Developer Java");
		empleadoOracle.setEstatus(true);
		
		empleadoDeloitte.setNombre("Angel");
		empleadoDeloitte.setPrimerApellido("Vega");
		empleadoDeloitte.setSegundoApellido("Galicia");
		empleadoDeloitte.setPuesto("Developer Java");
		empleadoDeloitte.setEstatus(true);
		
		empleadoDisney.setNombre("Jorge");
		empleadoDisney.setPrimerApellido("Vega");
		empleadoDisney.setSegundoApellido("Galicia");
		empleadoDisney.setPuesto("Developer Java");
		empleadoDisney.setEstatus(true);
		
		empleados.add(empleadoIBM);
		empleados.add(empleadoMicrosoft);
		empleados.add(empleadoApple);
		
		empleados.add(empleadoNetflix);
		empleados.add(empleadoAmazon);
		empleados.add(empleadoHP);
		empleados.add(empleadoOracle);
		empleados.add(empleadoDeloitte);
		empleados.add(empleadoDisney);
		
		return empleados;
		
	}
	

}
