package ksnu.juhyun.grading;

public class Print99 {
	void run99() {
		for (int i=1;i<10;i++,System.out.println()) {
			for (int j=1;j<10;j++,System.out.print('\t')) {
				System.out.print(i+"*"+j+"="+i*j);
			}
		}
	}
}
