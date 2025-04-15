[![](https://jitpack.io/v/micycle1/processing-core-4.svg)](https://jitpack.io/#micycle1/processing-core-4)

# Processing Core (4.x)

This is a mirror of the *core* library from [Processing 4](https://github.com/processing/processing4/), with the addition of a *pom.xml*, turning it into a standalone *Maven* artifact.

It is hosted as a *Maven* dependency via [JitPack](https://jitpack.io/#micycle1/processing-core-4) (from this Github repository) so it can be referenced in your own *Maven* project (for when you want to use the Processing library outside of the Processing IDE).

This mirror is not necessarily up to date with the latest Processing 4 release; it is currently based on Processing [**4.4.2**](https://github.com/processing/processing4/releases/tag/processing-1302-4.4.2).

---

## Usage in your Maven project

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
	<version>4.3.3</version>
</dependency>
```

### **That's it!**

Now you don't have to worry about adding core.jar, the JavaFX and JOGL & Gluegen dependencies to your project — this does it all!

Note: core version 4.1.1 and onwards require Java 17+; prior versions require Java 11+.
