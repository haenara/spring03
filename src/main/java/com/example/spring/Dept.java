package com.example.spring;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
@AllArgsConstructor
//필드를 기반해서 생성자를 만든다. 디폴트는 없다.
@NoArgsConstructor
//생성자를 만드는데 디폴트 생성자이다. () 안에 내용없는것.
public class Dept {

	int deptno;
	String dname;
	String loc;
	
	public void print(){
		System.out.println("###"+toString());
	}
	public void print2(){
		System.out.println("#22##"+toString());
	}
	
}
