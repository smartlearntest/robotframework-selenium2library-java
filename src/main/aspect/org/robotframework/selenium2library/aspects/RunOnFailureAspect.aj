package org.robotframework.selenium2library.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;

import org.robotframework.selenium2library.Selenium2Library;

public aspect RunOnFailureAspect {

	private static ThreadLocal<Throwable> lastThrowable = new ThreadLocal<Throwable>();

	pointcut handleThrowable() : 
    execution(public * org.robotframework.selenium2library.keywords.*.*(..));

	after() throwing(Throwable t) : handleThrowable() {
		if (lastThrowable.get() == t) {
			// Already handled this Throwable
			return;
		}

		((Selenium2Library) thisJoinPoint.getTarget()).runOnFailureByAspectJ();
		lastThrowable.set(t);
	}
}
