package com.example.demo.entity;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Configuration
@Entity
@Table(name = "engate")
@ComponentScan(basePackages = "com.example.demo.entity")
public class Engate {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer a;  
    private String b;   
    private Double c;  
    private Integer d; 
    private Integer e; 
    private Integer f; 
    private Integer g; 
    private Integer h; 
    private Integer i; 
    private Integer j; 
    private String k;  
    private String l;
    
	public Integer getA() {
		return a;
	}
	public void setA(Integer a) {
		this.a = a;
	}
	public String getB() {
		return b;
	}
	public void setB(String b) {
		this.b = b;
	}
	public Double getC() {
		return c;
	}
	public void setC(Double c) {
		this.c = c;
	}
	public Integer getD() {
		return d;
	}
	public void setD(Integer d) {
		this.d = d;
	}
	public Integer getE() {
		return e;
	}
	public void setE(Integer e) {
		this.e = e;
	}
	public Integer getF() {
		return f;
	}
	public void setF(Integer f) {
		this.f = f;
	}
	public Integer getG() {
		return g;
	}
	public void setG(Integer g) {
		this.g = g;
	}
	public Integer getH() {
		return h;
	}
	public void setH(Integer h) {
		this.h = h;
	}
	public Integer getI() {
		return i;
	}
	public void setI(Integer i) {
		this.i = i;
	}
	public Integer getJ() {
		return j;
	}
	public void setJ(Integer j) {
		this.j = j;
	}
	public String getK() {
		return k;
	}
	public void setK(String k) {
		this.k = k;
	}
	public String getL() {
		return l;
	}
	public void setL(String l) {
		this.l = l;
	}
	public void setColumn1(String stringCellValue) {
		// TODO 自動生成されたメソッド・スタブ
		
	}
	public void setColumn2(Double numericCellValue) {
		// TODO 自動生成されたメソッド・スタブ
		
	}  

}
