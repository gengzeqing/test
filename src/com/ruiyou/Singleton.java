package com.ruiyou;
/**
 *  单利 双重判定
 * @author Gzq
 *
 */
public class Singleton {
	private static Singleton singleton;
	private Singleton (){};
	
	public static Singleton singleton() {
		if (singleton == null){
			synchronized(Singleton.class){
				if (singleton == null){
					singleton = new Singleton();
				}
			}
		}
		return singleton;
	}

}
