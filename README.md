# Processing Core (4.x)

This is a mirror of the *core* library from [Processing 4](https://github.com/processing/processing4/tree/master/core), with the addition of a *pom.xml*, turning it into a standalone *Maven* project.

It is hosted as a *Maven* dependency via [JitPack](https://jitpack.io/#micycle1/processing-core-4) (from this Github repository) so it can be referenced in your own *Maven* project (for when you want to use the Processing library outside of the Processing IDE).

---

## How to use in your Maven project

### Step 1. Add the *JitPack* repository to your pom.xml

```
<repositories>
	<repository>
		<id>jitpack.io</id>
		<url>https://jitpack.io</url>
	</repository>
</repositories>
  ```
  ### Step 2. Add the processing-core dependency

  ```
  <dependency>
	  <groupId>com.github.micycle1</groupId>
	  <artifactId>processing-core-4</artifactId>
	  <version>4.0.3</version>
</dependency>
  ```

### **That's it!**

Now you don't have to worry about adding core.jar, the JavaFX and JOGL & Gluegen dependencies to your project — this does it all! Compatible with any Java project version 11+.