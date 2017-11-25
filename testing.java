class testing extends Program {
	void keyTypedInConsole(char c){
		background(randomANSIColor());
		print(c);

	}

	void algorithm(){
		while(true){
			//enableKeyTypedInConsole(true);
			for(int i = 0; i<50; i++){
				background(randomANSIColor());
				print(' ');
			}
		}
	}
}