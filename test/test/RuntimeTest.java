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
		try {
			PApplet.main(RuntimeTest.class);
		} catch (Throwable t) {
			t.printStackTrace();
			System.err.flush();
			System.exit(1);
		}
	}

	@Override
	public void settings() {
		size(800, 800, JAVA2D);
	}

	@Override
	public void setup() {
		background(255);
		noLoop();
	}

	@Override
	public void draw() {
		ellipse(0, 0, width, height);
		System.out.println("Hello from Processing");
		System.exit(0);
	}

}
