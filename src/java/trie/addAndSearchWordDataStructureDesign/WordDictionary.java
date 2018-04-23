package java.trie.addAndSearchWordDataStructureDesign;

public class WordDictionary {
	public class TriTreeNode {
		TriTreeNode[] children = new TriTreeNode[26];
		boolean isLeaf;
	}

	/** Initialize your data structure here. */
	TriTreeNode root = new TriTreeNode();

	public WordDictionary() {
		root.isLeaf = false;
	}

	/** Adds a word into the data structure. */
	public void addWord(String word) {
		if (word.length() == 0)
			return;
		addWord(word, root, 0);
	}

	public void addWord(String word, TriTreeNode parent, int start) {
		if (start == word.length())
			return;
		if (parent.children[word.charAt(start) - 'a'] == null) {
			parent.children[word.charAt(start) - 'a'] = new TriTreeNode();
		}
		if (start == word.length() - 1)
			parent.children[word.charAt(start) - 'a'].isLeaf = true;
		addWord(word, parent.children[word.charAt(start) - 'a'], start + 1);

	}

	/**
	 * Returns if the word is in the data structure. A word could contain the
	 * dot character '.' to represent any one letter.
	 */
	public boolean search(String word) {
		if (search(word, root, 0))
			return true;

		return false;
	}

	public boolean search(String word, TriTreeNode parent, int i) {
		if (i >= word.length())
			return true;
		if (word.charAt(i) != '.' && parent.children[word.charAt(i) - 'a'] == null)
			return false;
		if (i == word.length() - 1 && word.charAt(i) == '.') {
			boolean temp = false;
			for (TriTreeNode n : parent.children) {
				if (n != null)
					temp = temp || n.isLeaf;
			}
			return temp;
		}
		if (i == word.length() - 1 && word.charAt(i) != '.' && parent.children[word.charAt(i) - 'a'].isLeaf == false)
			return false;
		boolean exist = false;
		if (word.charAt(i) == '.') {
			for (TriTreeNode n : parent.children) {
				if (n != null)
					exist = exist || search(word, n, i + 1);
			}
		} else if (parent.children[word.charAt(i) - 'a'] != null) {
			return search(word, parent.children[word.charAt(i) - 'a'], i + 1);
		} else {
			return false;
		}

		return exist;
	}
}
