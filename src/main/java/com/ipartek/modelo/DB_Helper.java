package com.ipartek.modelo;


import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class DB_Helper implements I_Constantes
{
	
	
	public Connection conectar() {
		Connection con = null;

		try {
			Class.forName(DRIVER);
			con = DriverManager.getConnection(CONEXION, USUARIO, PASS);
			System.out.println("BASE DE DATOS CONECTADA");
		} catch (ClassNotFoundException e) {
			System.out.println("NO SE ENCONTRO EL DRIVER");
		} catch (SQLException e) {
			System.out.println("ERROR AL CONECTAR A LA BD");
		}
		
		return con;
	}

	public void desconectar(Connection con) {
		try {
			con.close();
			System.out.println("BASE DE DATOS DESCONECTADA");
		} catch (SQLException e) {
			System.out.println("NO SE PUDO DESCONECTAR");
		}
	}
	
	
	
	
	public List<Habitacion> obtenerTodasHabitaciones(Connection con) {
	    try {
	        List<Habitacion> lista = new ArrayList<>();

	        CallableStatement cstmt = con.prepareCall(SP_OBTENER_TODAS_HABITACIONES);

	        cstmt.execute();

	        ResultSet rs = cstmt.getResultSet();

	        while (rs.next()) {
	            Habitacion hab = new Habitacion();

	            hab.setIdHabitacion(rs.getInt(I_Constantes.HABITACIONES_ID));
	            hab.setNumeroHabitacion(rs.getInt(I_Constantes.HABITACIONES_NUMERO));
	            hab.setMetros(rs.getDouble(I_Constantes.HABITACIONES_METROS));
	            hab.setPrecio(rs.getDouble(I_Constantes.HABITACIONES_PRECIO));
	            hab.setNumeroCamas(rs.getInt(I_Constantes.HABITACIONES_NUMERO_CAMAS));
	            hab.setExterior(rs.getBoolean(I_Constantes.HABITACIONES_EXTERIOR));

	            lista.add(hab);
	        }

	        System.out.println("Lista de todas las habitaciones: " + lista);
	        return lista;

	    } catch (SQLException e) {
	        e.printStackTrace();
	        return null;
	    }
	}
	
	
	
}
