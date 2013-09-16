package com.github.markusbernhardt.selenium2library;

import com.github.markusbernhardt.selenium2library.keywords.Selenium2LibraryEnhancement;

/**
 * Robotframework Library. All public methods are keywords.
 */
public class Selenium2Library extends Selenium2LibraryEnhancement {

	/**
	 * Default constructor
	 */
	public Selenium2Library() {
		this(5.0);
	}

	/**
	 * Constructor
	 * 
	 * @param timeout
	 *            Default timeout in seconds for all wait methods
	 */
	public Selenium2Library(double timeout) {
		this(timeout, 0.0);
	}

	/**
	 * Constructor
	 * 
	 * @param timeout
	 *            Default timeout in seconds for all wait methods
	 * @param implicitWait
	 *            Selenium implicit wait time in seconds
	 */
	public Selenium2Library(double timeout, double implicitWait) {
		this(timeout, implicitWait, "Capture Page Screenshot");
	}

	/**
	 * Constructor
	 * 
	 * @param timeout
	 *            Default timeout in seconds for all wait methods
	 * @param implicitWait
	 *            Selenium implicit wait time in seconds
	 * @param runOnFailureKeyword
	 *            Keyword to run opn failure
	 */
	public Selenium2Library(double timeout, double implicitWait,
			String runOnFailureKeyword) {
		this.timeout = timeout;
		this.implicitWait = implicitWait;
		this.runOnFailureKeyword = runOnFailureKeyword;
	}

	/**
	 * This method is called by the
	 * com.github.markusbernhardt.selenium2library.aspects.RunOnFailureAspect in
	 * case a exception is thrown in one of the public methods of a keyword
	 * class.
	 */
	public void runOnFailureByAspectJ() {
		runOnFailure();
	}

}
