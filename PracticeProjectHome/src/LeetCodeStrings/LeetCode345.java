package LeetCodeStrings;

public class LeetCode345 {

	public static void main(String[] args) {
		String s="u'o;B,vKO\\\"?,.;?fGI 9;`9T`Z,;iqsn4A.:;'H3s8E9. B4TxfOiB'wvM?q'k:Q`J\\\"E1T7lo e7c!?glI66?JZh\\\"6 !C,aK! 1J?f9'`SX4Q!Q4XS`'9f?J1 !Ka,C! 6\\\"hZJ?66Ilg?!c7e ol7T1E\\\"J`Q:k'q?Mvw'BiOfxT4B .9E8s3H';:.A4nsqi;,Z`To`;o IGf?;.,?\\\"OKv,B;o'u";
		System.out.println(reverseVowels(s));

	}
	public static String reverseVowels(String s) {
		String a="";
		char[] ch=s.toCharArray();
		int j=ch.length-1;
		
		for (int i = 0; i <= j; i++) {
			if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u' ||ch[i]=='A' || ch[i]=='E' || ch[i]=='I' || ch[i]=='O' || ch[i]=='U' ) {
				while(j>=i) {
					if(ch[j]=='a' || ch[j]=='e' || ch[j]=='i' || ch[j]=='o' || ch[j]=='u' ||ch[j]=='A' || ch[j]=='E' || ch[j]=='I' || ch[j]=='O' || ch[j]=='U' ) {
						swap(ch, i, j);
						j--;
						break;	
					}
					else {j--;
					}
				}

			}

		}
		for (int k = 0; k< ch.length; k++) {
			a+=ch[k];

		}

		return a;
	}
	private static void swap(char[] ch, int i, int j) {
		char temp=ch[i];
		ch[i]=ch[j];
		ch[j]=temp;

	}


}
