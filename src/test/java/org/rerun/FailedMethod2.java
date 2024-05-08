package org.rerun;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class FailedMethod2 implements IAnnotationTransformer {

	public void transform(ITestAnnotation a, Class testClass, Constructor testConstructor, Method testMethod) {
		
		a.getRetryAnalyzer();
		a.setRetryAnalyzer(FailedMethod1.class);
	}
}
