package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
 
public class Baekjoon {
    public static void main(String[] args) throws IOException {
        
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	int count = Integer.parseInt(br.readLine());
    	int arr[] = new int[count];
    	int countArr[] = new int[10001];
    	int cnt = 0;
    	for(int i=0; i<count; i++) {
    		arr[i] = Integer.parseInt(br.readLine());
    	}
    	for(int i:arr) {
    		countArr[i]++;
    	}
    	for(int i:countArr) {
    		if(i!=0) {
    			for(int j=0; j<i; j++) {
    				bw.write(cnt + "\n");
    			}
    			
    		}
    		cnt++;
    	}
    	br.close();
    	bw.close();
    	
    }
}