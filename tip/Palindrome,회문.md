    public static int isPalindrome(String string) {
	    	int p = 0;
	    	int q = string.length() - 1;
		    while (p < q) {
		    	if (string.charAt(p) != string.charAt(q))
			    	return 0;
			    p += 1;
			    q -= 1;
		    }
	    	return string.length();
    	}
