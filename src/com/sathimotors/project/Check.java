package com.sathimotors.project;

import java.util.LinkedList;

public class Check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataBase db = new DataBase();
		LinkedList<ComplaintType> li = db.getData("ComplaintType");

	}

}
