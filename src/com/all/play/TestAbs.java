package com.all.play;

import com.all.play.abs.FuShow;

abstract class Animal {
	abstract void eat();
}

class Cat extends Animal {
	public void eat() {
		System.out.println("吃鱼");
		
		
		
		
		
		
		//--------------------------
		
		
		
		//dhgdjjdfdfdfdfdfdfdfdfdfdfdfdfdfdfdfdf
	}

	public void catchMouse() {
		System.out.println("抓老鼠");
	}
}

class Dog extends Animal {
	public void eat() {
		System.out.println("吃骨头");
	}

	public void kanJia() {
		System.out.println("看家");
	}
}

class Pig extends Animal {
	public void eat() {
		System.out.println("饲料");
	}

	public void gongDi() {
		System.out.println("拱地");
	}
}

public class TestAbs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		// new FuShow() {
		//
		// @Override
		// public void show() {
		// // TODO Auto-generated method stub
		// System.out.println("this is a test");
		//
		// }
		// }.show();;

		Animal a = new Cat();// 类型提升。 向上转型。
		a.eat();

		// 如果想要调用猫的特有方法时，如何操作？
		// 强制将父类的引用。转成子类类型。向下转型.
		//Cat c = (Cat) a;
		//c.catchMouse();
		// 千万不要出现这样的操作，就是将父类对象转成子类类型。
		// 我们能转换的是父类应用指向了自己的子类对象时，该应用可以被提升，也可以被强制转换。
		// 多态自始至终都是子类对象在做着变化。

	}

}
