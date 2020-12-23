# EOF 처리방법
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in);
    
    //(1)
    String input = "";
    while((input = br.readLine()) != null) {
    
    }
    
    //(2)
    while(true) {
		input = br.readLine();
		if(input == null || input.length()==0) break;
    }
