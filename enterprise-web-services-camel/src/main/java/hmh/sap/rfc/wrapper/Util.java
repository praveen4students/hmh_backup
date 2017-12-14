package hmh.sap.rfc.wrapper;

import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;


public class Util {

	public static <T,X> X[] copyArray(T[] v, Class<T> stype, Class<X> dtype) {
		
		@SuppressWarnings("unchecked")
		X[] ret = (X[]) Array.newInstance(dtype, v.length);
		
		try {
			Constructor<X> ct = dtype.getConstructor(stype);
			for (int i=0; i<v.length; ++i) {
				X x = ct.newInstance(v[i]);
				ret[i] = x;
			}
			return ret;
			
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
