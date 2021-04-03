package dictionary;

import java.util.*;

/**
 * this class is used to make Dictionary interface 
 * By using key value & making them pair
 * @author yash.porwal_metacube
 *
 */
public interface Dictionary {
	
	/**
	 * add key value pair to the dictionary
	 * @param key as a String
	 * @param value as a String
	 * @return boolean - true/false
	 * @throws Exception if something goes wrong
	 */
	public boolean add(String key, String value) throws Exception;

	/**
	 * delete a pair of the key value 
	 * @param key as String
	 * @return boolean - true/false
	 * @throws Exception if something goes wrong
	 */
	public boolean delete(String key) throws Exception;

	/**
	 * getter of value from key in a Dictionary
	 * it uses getValueRec method 
	 * @param key as a String
	 * @return value as a String
	 */
	public String getValue(String key);

	/**
	 * getter the list of key value pair in the dictionary
	 * @return a list of value object
	 */
	public List<Value> getAll();

	/**
	 * get list between key 1 to key 2
	 * @param key1 as String
	 * @param key2 as String
	 * @return list of value object of in between 
	 */
	public List<Value> getBetween(String key1, String key2);

}