package loopcontrol;

public class LoopControlSample {

	public static void main(String[] args) {
		/*
		 * for
		 * while
		 * do-while
		 * break
		 * continue
		 * return
		 * */
		
		for(int i =0; i < 10; i++) {
			if (i % 2 == 0)
				continue;
			System.out.println(i);
		}
		
		int i = 0;
		while (i < 10) {
			System.out.println(i);
			i++;
		}
		
		int j =0;
		do {
			System.out.println(j);
			j++;
		} while (j< 10);
		
	}

}
