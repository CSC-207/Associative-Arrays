package structures;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.PrintWriter;
import java.math.BigInteger;

//import structures.AssociativeArray;
//import structures.KeyNotFoundException;

/**
 * Experiments with our AssociativeArray class.
 *
 * @author Albert-Kenneth Okine
 * @author Samuel A. Rebelsky
 */
public class AssociativeArrayExperiments {

  // +------+--------------------------------------------------------
  // | Main |
  // +------+-----------------------------------------------------------

  /**
   * Run the experiments.
   */
  public static void main(String[] args) {
    PrintWriter pen = new PrintWriter(System.out, true);

    divider(pen);
    expreimentStringsToStrings(pen);
    divider(pen);
    experimentBigIntToBigInt(pen);
    divider(pen);
  } // main(String[])

  // +-------------+-------------------------------------------------
  // | Experiments |
  // +-------------+

  /**
   * Our first experiment: Associative arrays with strings as both keys 
   * and values.
   */
  public static void expreimentStringsToStrings(PrintWriter pen) {
    AssociativeArray<String,String> s2s = 
      new ReportingAssociativeArray<String,String>("s2s", pen);
    s2s.size();
    s2s.set("a", "apple");
    s2s.set("A", "aardvark");
    s2s.size();
    s2s.hasKey("a");
    s2s.hasKey("A");
    try { s2s.get("a"); } catch (Exception e) { }
    try { s2s.get("A"); } catch (Exception e) { }
    s2s.remove("a");
    s2s.size();
    try { s2s.get("a"); } catch (Exception e) { }
    try { s2s.get("A"); } catch (Exception e) { }
    s2s.remove("aardvark");
    s2s.size();
    try { s2s.get("a"); } catch (Exception e) { }
    try { s2s.get("A"); } catch (Exception e) { }

    s2s.remove("A");
    s2s.size();

    AssociativeArray<String,String> s2s2 = s2s.clone();
    System.out.println(s2s == s2s2);

    System.out.println(s2s);
  } // expreimentStringsToStrings

  /**
   * Our second experiment: Associative arrays with big integers as
   * keys and values.
   */
  public static void experimentBigIntToBigInt(PrintWriter pen) {
    AssociativeArray<BigInteger,BigInteger> b2b =
      new ReportingAssociativeArray<BigInteger,BigInteger>("b2b", pen);

    // Set some values
    for (int i = 0; i < 11; i++) {
      b2b.set(BigInteger.valueOf(i), BigInteger.valueOf(i*i));
    } // for

    // Then get them
    for (int i = 0; i < 11; i++) {
      try { b2b.get(BigInteger.valueOf(i)); } catch (Exception e) { }
    } // for

    // Then remove some of them
    for (int i = 1; i < 11; i += 2) {
      b2b.remove(BigInteger.valueOf(i));
    }

    // Then see what happens when we get them
    for (int i = 0; i < 11; i++) {
      try { b2b.get(BigInteger.valueOf(i)); } catch (Exception e) { }
    } // for

    // Then reset or set some values
    for (int i = 0; i < 11; i += 3) {
      b2b.set(BigInteger.valueOf(i), BigInteger.valueOf(i + 10));
    } // for

    // Then see what happens when we get them
    for (int i = 0; i < 11; i++) {
      try { b2b.get(BigInteger.valueOf(i)); } catch (Exception e) { }
    } // for

    System.out.println(b2b);

    AssociativeArray<BigInteger, BigInteger> copy = b2b.clone();
    System.out.println(copy);

    // Then see what happens when we get them
    for (int i = 0; i < 11; i++) {
      try { System.out.println(copy.get(BigInteger.valueOf(i))); } catch (Exception e) { }
    } // for


    AssociativeArray<Double, String> floatTest = new ReportingAssociativeArray<Double, String>("floatTest", pen);
      floatTest.set(0.1, "a");
    floatTest.hasKey(0.1);
    floatTest.set(0.1, "b");
    floatTest.hasKey(0.1);

    System.out.println(floatTest.size());

    System.out.println(floatTest);



    AssociativeArray<String, String> arr = new AssociativeArray<String, String>();

    // empty array should have size 0
    System.out.println(arr.size());

    // array with one element should have size 1
    arr.set("0", "value");
    assertEquals(1, arr.size());

    // the default size is 16, so a full array should have size 16
    for(int i = 0; i < 16; i++){
    arr.set("" + i, "value");
    } // for
    System.out.println(arr.size());
    System.out.println(arr);

    arr.remove("2");
      arr.remove("4");

    System.out.println(arr);

    try {
      arr.get(null);
    } catch (Exception e) {
      System.out.println("uhoh");
    }

  } // experimentBigIntToBigInt

  // +---------+-----------------------------------------------------
  // | Helpers |
  // +---------+

  /**
   * Print a divider.
   */
  public static void divider(PrintWriter pen) {
    pen.println();
    pen.println("------------------------------------------------");
    pen.println();
  } // divider(PrintWriter)



} // AssociativeArrayExperiments