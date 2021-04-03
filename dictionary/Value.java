package dictionary;

/**
 * this class is used to make values of Dictionary
 * in the form of key & value as a String
 * @author yash.porwal_metacube
 *
 */
public class Value {
	// key as key of value
		private String key;
		
		// value as value of key
		private String value;
		
		/**
		 * constructor which takes key & value and store in the object 
		 * of Value class
		 * @param key of dictionary
		 * @param value of dictionary
		 */
		public Value (String key, String value) {
			this.key = key;
			this.value = value;
		}

		/**
		 * getter of key
		 * @return key
		 */
		public String getKey() {
			return key;
		}

		/**
		 * setter of key
		 * @param key takes from user input
		 */
		public void setKey(String key) {
			this.key = key;
		}

		/**
		 * getter of value
		 * @return value
		 */
		public String getValue() {
			return value;
		}

		/**
		 * setter of value
		 * @param value
		 */
		public void setValue(String value) {
			this.value = value;
		}

}