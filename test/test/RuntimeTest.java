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
		fill(255, 0, 0);
		noLoop();
	}

	@Override
	public void draw() {
		background(255);
		fill(0);
		noStroke();
		ellipse(width / 2f, height / 2f, 200, 200);

		loadPixels();
		int x = 400, y = 400;
		int c = pixels[y * width + x]; // ARGB packed int

		System.out.println("Hello from Processing");
		System.out.printf("Pixel(%d,%d) ARGB=0x%08X  a=%d r=%d g=%d b=%d%n", x, y, c, (c >>> 24) & 0xFF, (c >>> 16) & 0xFF, (c >>> 8) & 0xFF, (c) & 0xFF);

		System.out.flush();
		exit();
		System.exit(0);
	}

}
