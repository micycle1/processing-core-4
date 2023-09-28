package test;

import processing.core.PApplet;

/**
 * A Processing sketch to be executed by github actions against the core.jar
 * built from the repository. This tests the .jar for runtime issues (such as
 * missing JOGL files, etc.). Github actions should run this against windows,
 * linux and mac.
 * 
 * @author Michael Carleton
 *
 */
public class RuntimeTest extends PApplet {

	public static void main(String[] args) {
		PApplet.main(RuntimeTest.class);
	}

	@Override
	public void settings() {
		size(800, 800, P3D);
	}

	@Override
	public void setup() {
		background(255);
	}

	@Override
	public void draw() {
		ellipse(0, 0, width, height);
	}

}
