package structures;

/**
 * A basic implementation of Associative Arrays with keys of type K
 * and values of type V.  Associative Arrays store key/value pairs
 * and permit you to look up values by key.
 *
 * @author Your Name Here
 * @author Samuel A. Rebelsky
 */
public class AssociativeArray<K,V> {

  // +---------------+-----------------------------------------------
  // | Inner Classes |
  // +---------------+

  /**
   * An easy way to store key/value pairs.  We assume that other
   * classes will access fields directly.
   */
  class KVPair<K,V> {
    // +--------+------------------------------------------------------
    // | Fields |
    // +--------+
  
    /**
     * The key.
     */
    K key;
  
    /**
     * The value.
     */
    V value;
  
    // +--------------+------------------------------------------------
    // | Constructors |
    // +--------------+
  
    /**
     * Create a new key/value pair.
     */
    public KVPair(K key, V value) {
      this.key = key;
      this.value = value;
    } // KVPair(K,V)
  } // class KVPair

  // +-----------+---------------------------------------------------
  // | Constants |
  // +-----------+

  /**
   * The default capacity of the initial array.
   */
  static final int DEFAULT_CAPACITY = 16;

  // +--------+------------------------------------------------------
  // | Fields |
  // +--------+

  /**
   * The size of the associative array (the number of key/value pairs).
   */
  int size;

  /**
   * The array of key/value pairs.
   */
  KVPair<K,V> pairs[];

  // +--------------+------------------------------------------------
  // | Constructors |
  // +--------------+

  /**
   * Create a new, empty associative array.
   */
  @SuppressWarnings({"unchecked"})
  public AssociativeArray() {
    // Creating new arrays is sometimes a PITN.
    this.pairs = (KVPair<K,V>[]) new Object[DEFAULT_CAPACITY];
    this.size = 0;
  } // AssociativeArray()

  // +------------------+--------------------------------------------
  // | Standard Methods |
  // +------------------+

  /**
   * Create a copy of this AssociativeArray.
   */
  public AssociativeArray<K,V> clone() {
    return null;        // STUB
  } // clone()

  /**
   * Convert the array to a string.
   */
  public String toString() {
    return "{}";        // STUB
  } // toString()

  // +----------------+----------------------------------------------
  // | Public Methods |
  // +----------------+

  /**
   * Set the value associated with key to value.  Future calls to
   * get(key) will return value.
   */
  public void set(K key, V value) {
    // STUB
  } // set(K,V)

  /**
   * Get the value associated with key.
   *
   * @throws KeyNotFoundException
   *   when the key does not appear in the associative array.
   */
  public V get(K key) throws KeyNotFoundException {
    return null;        // STUB
  } // get(K)

  /**
   * Determine if key appears in the associative array.
   */
  public boolean hasKey(K key) {
    return false;       // STUB
  } // hasKey(K)

  /**
   * Remove the key/value pair associated with a key.  Future calls
   * to get(key) will throw an exception.  If the key does not appear
   * in the associative array, does nothing.
   */
  public void remove(K key) {
    // STUB
  } // remove(K)

  /**
   * Determine how many values are in the associative array.
   */
  public int size() {
    return this.size;
  } // size()

  // +-----------------+---------------------------------------------
  // | Private Methods |
  // +-----------------+

  /**
   * Find the index of the first entry in `pairs` that contains key.
   * If no such entry is found, throws an exception.
   */
  public int find(K key) throws KeyNotFoundException {
    throw new KeyNotFoundException();
  } // find(K)

} // class AssociativeArray

