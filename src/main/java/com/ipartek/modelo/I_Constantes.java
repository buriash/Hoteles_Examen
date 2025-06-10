package com.ipartek.modelo;

public interface I_Constantes {

	// constantes de la BD
	String BD = "jsp_hotel_examen";
	String DRIVER = "com.mysql.cj.jdbc.Driver";
	String CONEXION = "jdbc:mysql://localhost:3306/"+BD;
	String USUARIO = "root";
	String PASS = "1234";
	
	//constantes de los JSP
	String JSP_INDEX = "index.jsp";
	String JSP_SERVICIOS = "Servicios.jsp";
	String JSP_HABITACIONES = "Habitaciones.jsp";
	
	
	  //Constantes Tabla Habitaciones
	  String TABLA_HABITACIONES = "habitaciones";
	  String HABITACIONES_ID = "id_habitacion";
	  String HABITACIONES_NUMERO = "numero_habitacion";
	  String HABITACIONES_METROS = "metros";    
	  String HABITACIONES_PRECIO = "precio";
	  String HABITACIONES_NUMERO_CAMAS = "numero_camas";
	  String HABITACIONES_EXTERIOR = "exterior";
	  
	  
	  
	//Constantes de la mochila
	String ATR_LISTA_HABITACIONES = "lista_habitaciones";
	
	String SP_OBTENER_TODAS_HABITACIONES = "call sp_habitaciones();";
	

}
