/*  
 *  Copyright (c) 2009-@year@. The GUITAR group at the University of Maryland. Names of owners of this group may
 *  be obtained by sending an e-mail to atif@cs.umd.edu
 * 
 *  Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated 
 *  documentation files (the "Software"), to deal in the Software without restriction, including without 
 *  limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of
 *  the Software, and to permit persons to whom the Software is furnished to do so, subject to the following 
 *  conditions:
 * 
 *  The above copyright notice and this permission notice shall be included in all copies or substantial 
 *  portions of the Software.
 *
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT 
 *  LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO 
 *  EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER 
 *  IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR 
 *  THE USE OR OTHER DEALINGS IN THE SOFTWARE. 
 */
package edu.umd.cs.guitar.model;

import edu.umd.cs.guitar.model.data.ComponentType;
import edu.umd.cs.guitar.model.data.GUIType;
import edu.umd.cs.guitar.model.wrapper.ComponentTypeWrapper;
import edu.umd.cs.guitar.model.wrapper.GUITypeWrapper;

/**
 * @author <a href="mailto:baonn@cs.umd.edu"> Bao N. Nguyen </a>
 * 
 */
public class JFCContextHashcodeGenerator extends GHashcodeGenerator {

	/**
	 * 
	 */
	public JFCContextHashcodeGenerator() {
		// TODO Auto-generated constructor stub
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * edu.umd.cs.guitar.model.GHashcodeGenerator#getHashcodeFromData(edu.umd
	 * .cs.guitar.model.data.ComponentType,
	 * edu.umd.cs.guitar.model.data.GUIType)
	 */
	@Override
	public long getHashcodeFromData(ComponentType dComponent, GUIType dWindow) {
		ComponentType root = dWindow.getContainer();

		final int prime = 31;

		long result = 1;

		result = (result * 2) & 0xffffffffL;
		return result;
	}

	long getComponnentTreeHashcode(ComponentType component, ComponentType root) {

		ComponentTypeWrapper wRoot = new ComponentTypeWrapper(root);
		wRoot.parseData();

		ComponentTypeWrapper pointer = wRoot;

		do {
			
		} while (pointer.equals(component));

		long result = 1;
		if (component.equals(root)) {
			result = getComponnentHashcode(root);
		} else {

		}

		return result;
	}

	long getComponnentHashcode(ComponentType component) {
		return 0;
	}

	long getWindowHashcode(GUIType dWindow) {
		GUITypeWrapper wWindow = new GUITypeWrapper(dWindow);
		return wWindow.getTitle().hashCode();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * edu.umd.cs.guitar.model.GHashcodeGenerator#getHashcodeFromGUI(edu.umd
	 * .cs.guitar.model.GComponent, edu.umd.cs.guitar.model.GWindow)
	 */
	@Override
	public long getHashcodeFromGUI(GComponent gComponent, GWindow gWindow) {
		// TODO Auto-generated method stub
		return 0;
	}

}
