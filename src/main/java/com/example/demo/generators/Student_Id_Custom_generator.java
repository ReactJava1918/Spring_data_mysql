package com.example.demo.generators;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class Student_Id_Custom_generator implements IdentifierGenerator {

	@Override
	public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException  {
		// TODO Auto-generated method stub
		Integer seq_sufix=null;
		String  prefix="stu";
		Connection con=null;
		Statement stmt=null;
		PreparedStatement pstmt=null;
		
		try {
		 con=session.connection();
		 stmt=con.createStatement();
		 ResultSet rs=stmt.executeQuery(" select max(student_id) from student_sequence");
		if(rs.next())
		{
			seq_sufix=	rs.getInt(1)+1;
			 pstmt=con.prepareStatement("insert into student_sequence  values(?)");
			 pstmt.setInt(1,seq_sufix);
			 pstmt.executeUpdate();
			
		}
		else
		{
			
			seq_sufix=1;
			 pstmt=con.prepareStatement("insert into student_sequence  values(?)");
			 pstmt.setInt(1,seq_sufix);
			 pstmt.executeUpdate();
		}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return prefix+seq_sufix;
	}

}
