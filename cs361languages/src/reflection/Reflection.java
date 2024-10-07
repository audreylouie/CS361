/**
 * 
 */
package reflection;

/**
 * @author Audrey Louie
 *
 */

// Reflection: https://docs.oracle.com/javase/tutorial/reflect/class/

// Demonstration of Reflection

// Given an object o, we want to know what class corresponds to o, the inheritance chain for o
// and the list of methods of the class

// Complete the code

import circle.ColoredCircle;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class Reflection {

	/**
	 * Print the class corresponding to the object
	 * @param o the object
	 */
	public void correspondingClass(Object o) {
		if (o == null)
			throw new IllegalArgumentException("Object passesd is null");

		System.out.println("Inspecting class: " + o.getClass().getName());
	}

	/**
	 * Print the chain of super classes of the object 
	 * Format of the output:
	 * Inheritance chain:
	 * Cn inherits from Cn-1 inherits ... inherits from java.lang.Object
	 * @param o the object
	 */
	public void inheritanceChain(Object o) {
		if (o == null)
			throw new IllegalArgumentException("Object passesd is null");

		// TODO To complete
		// You need to use the EXACT format of the output
		// Hint: Use the method getSuperClass()
		System.out.println("Inheritance chain:");
		Class<?> currentClass = o.getClass();
		while (currentClass != null) {
            System.out.println(currentClass.getName());
            currentClass = currentClass.getSuperclass();
        }
		System.out.println("java.lang.Object");
	}
	
	/**
	 * Print the list of methods of the object
	 * @param o an object
	 */
	public void listMethods(Object o) {
		if (o == null)
			throw new IllegalArgumentException("Object passesd is null");

		Method[] m = o.getClass().getMethods();

		// List of methods
		// TODO To complete
		// Print each method on one line
		// Use this EXACT format
		System.out.println("\n");
		for (Method method : m) {
        // Method name
        String methodName = method.getName();

        // Parameters with types
        String paramString = "";
        Parameter[] parameters = method.getParameters();
        for (int i = 0; i < parameters.length; i++) {
            paramString += parameters[i].getName() + " : " + parameters[i].getType();
            if (i < parameters.length - 1) {
                paramString += " ";
            }
        }
        // Return type
        // Print in the required format
        System.out.println(methodName + ": " + paramString + " -> " + method.getReturnType());
    }
		System.out.println("\n");
	}

	/**
	 * Constructor
	 */
	public Reflection() {
	}

	/**
	 * Demonstration
	 * @param args
	 */
	public static void main(String[] args) {

		Reflection r = new Reflection();		
		
		// Demonstration of the methods on an objet of type String
		// TODO To complete
		String sampleString = "Louie,Audrey";
		r.correspondingClass(sampleString);
		r.inheritanceChain(sampleString);
		r.listMethods(sampleString);

		
		// Demonstration of the methods on an objet of type ColoredCircle
		// TODO To complete		
		ColoredCircle coloredCircle = new ColoredCircle(); 
        r.correspondingClass(coloredCircle);
        r.inheritanceChain(coloredCircle);
        r.listMethods(coloredCircle);
	}

}
