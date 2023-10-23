## Associative Arrays
An expandable array of key-value pairs, intended to support looking up values by key.

## Authors
Samuel Rebelsky and Albert-Kenneth Okine

## Description
    void set(K key, V value)
Set the value associated with a given key. If there is already another value
associated with the given key, this new value replaces that value.

    V get(K key)
Get the value associated with a given key. If there is no such key, throws an exception.

    boolean hasKey(K key)
Determines if the given key appears in the associative array.

    void remove(K key)  
Remove the key/value pair associated with the given key. If the key does not appear in
the associative array does nothing.

    int size()
Determine how many key/value pairs are currently stored in the associative array.

    String toString()
Return a string of the form `"{ key0: value0, key1: value1, ... keyn: valuen }"`
If the array is empty, returns "{}".

## Resources
- Project page https://rebelsky.cs.grinnell.edu/Courses/CSC207/2023Fa/mps/mp04.html
