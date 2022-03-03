package kr.hs.study.main;

import kr.hs.study.beans.HelloWorld;
import kr.hs.study.beans.HelloWorldKr;
import kr.hs.study.beans.HelloWorldEn;

public class MainClass {

	public static void main(String[] args) {
		HelloWorld hello1 = new HelloWorldKr();
		callMethod(hello1);
		HelloWorld hello2 = new HelloWorldEn();
		callMethod(hello2);
	}

	public static void callMethod(HelloWorld hello) {
		hello.sayHello();
	}

}
